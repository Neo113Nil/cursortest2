package com.vk.api.sdk.exceptions;

/* compiled from: VKAuthException.kt */
/* loaded from: classes15.dex */
public final class VKAuthException extends Exception {
    private final String authError;
    private final int webViewError;

    public VKAuthException() {
        super("Auth canceled");
        this.webViewError = 0;
        this.authError = null;
    }
}
