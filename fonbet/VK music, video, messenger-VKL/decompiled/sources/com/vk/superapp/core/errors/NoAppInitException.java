package com.vk.superapp.core.errors;

/* compiled from: NoAppInitException.kt */
/* loaded from: classes6.dex */
public final class NoAppInitException extends RuntimeException {
    public NoAppInitException() {
        this(0);
    }

    public NoAppInitException(int i) {
        super("App has not called AppInit");
    }
}
