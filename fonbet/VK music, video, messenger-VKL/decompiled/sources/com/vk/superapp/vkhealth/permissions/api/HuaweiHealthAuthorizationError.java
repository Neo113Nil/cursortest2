package com.vk.superapp.vkhealth.permissions.api;

/* compiled from: HuaweiHealthAuthorizationError.kt */
/* loaded from: classes6.dex */
public final class HuaweiHealthAuthorizationError extends Exception {
    private final String message;

    public HuaweiHealthAuthorizationError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
