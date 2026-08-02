package com.vk.movika.sdk.base.model.exception;

/* loaded from: classes3.dex */
public class AssetsLoadException extends Exception {
    private final Throwable cause;

    public AssetsLoadException() {
        super((Throwable) null);
        this.cause = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
