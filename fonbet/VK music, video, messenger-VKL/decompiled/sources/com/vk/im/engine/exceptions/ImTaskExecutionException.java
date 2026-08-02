package com.vk.im.engine.exceptions;

import java.util.concurrent.ExecutionException;

/* compiled from: ImTaskExecutionException.kt */
/* loaded from: classes.dex */
public final class ImTaskExecutionException extends ExecutionException {
    private final Throwable cause;

    public ImTaskExecutionException(Throwable th) {
        super(th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
