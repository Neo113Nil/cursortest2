package com.vk.superapp.core.errors;

/* compiled from: WebViewException.kt */
/* loaded from: classes6.dex */
public final class WebViewException extends RuntimeException {
    private final String description;
    private final int errorCode;

    public WebViewException(int i, String str) {
        super(str);
        this.errorCode = i;
        this.description = str;
    }

    public final boolean d() {
        int i = this.errorCode;
        return i == -2 || i == -6 || i == -7;
    }
}
