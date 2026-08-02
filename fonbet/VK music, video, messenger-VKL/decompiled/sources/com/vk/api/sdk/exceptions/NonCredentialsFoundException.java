package com.vk.api.sdk.exceptions;

/* compiled from: NonCredentialsFoundException.kt */
/* loaded from: classes15.dex */
public final class NonCredentialsFoundException extends IllegalStateException {
    private final String message;

    public NonCredentialsFoundException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
