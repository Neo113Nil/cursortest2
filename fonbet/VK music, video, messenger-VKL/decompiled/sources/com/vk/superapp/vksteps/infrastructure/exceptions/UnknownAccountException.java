package com.vk.superapp.vksteps.infrastructure.exceptions;

/* compiled from: UnknownAccountException.kt */
/* loaded from: classes6.dex */
public final class UnknownAccountException extends Exception {
    private final String message;

    public UnknownAccountException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public UnknownAccountException(int i) {
        this.message = "Attempt to update steps from an unknown account";
    }
}
