package com.zheng.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorizationController {
	@RequestMapping(value="/unauthorized", method=RequestMethod.GET)
	public String unauthorizedPage() {
		return "unauthorized";
	}
	
	@RequestMapping(value="/authorized", method=RequestMethod.GET)
	public String authorizedPage() {
		return "authorized";
	}
	
}
