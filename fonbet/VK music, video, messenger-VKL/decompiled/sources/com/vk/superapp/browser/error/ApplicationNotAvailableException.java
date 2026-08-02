package com.vk.superapp.browser.error;

import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;

/* compiled from: ApplicationNotAvailableException.kt */
/* loaded from: classes6.dex */
public final class ApplicationNotAvailableException extends RuntimeException {
    private final WebAppPlaceholderInfo placeholderInfo;

    public ApplicationNotAvailableException(WebAppPlaceholderInfo webAppPlaceholderInfo) {
        this.placeholderInfo = webAppPlaceholderInfo;
    }

    public final WebAppPlaceholderInfo d() {
        return this.placeholderInfo;
    }
}
