package com.vk.auth.oauth.di;

import com.vk.auth.oauth.VkOAuthService;

/* compiled from: OAuthImplementationNotFound.kt */
/* loaded from: classes15.dex */
public final class OAuthImplementationNotFound extends IllegalStateException {
    public OAuthImplementationNotFound(VkOAuthService vkOAuthService) {
        super("Implementation of " + vkOAuthService.name() + " OAuth not found. Please check dependencies of application.");
    }
}
