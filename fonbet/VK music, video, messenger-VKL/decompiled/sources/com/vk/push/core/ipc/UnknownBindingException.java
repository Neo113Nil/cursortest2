package com.vk.push.core.ipc;

/* compiled from: NoHostsToBindException.kt */
/* loaded from: classes5.dex */
public final class UnknownBindingException extends NoHostsToBindException {
    private final Exception cause;

    public UnknownBindingException(Exception exc) {
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public Exception getCause() {
        return this.cause;
    }
}
