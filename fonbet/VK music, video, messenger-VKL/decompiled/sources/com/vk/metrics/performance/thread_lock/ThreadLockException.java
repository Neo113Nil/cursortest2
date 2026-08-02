package com.vk.metrics.performance.thread_lock;

/* compiled from: ThreadLockException.kt */
/* loaded from: classes3.dex */
public final class ThreadLockException extends RuntimeException {
    private final Throwable cause;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
