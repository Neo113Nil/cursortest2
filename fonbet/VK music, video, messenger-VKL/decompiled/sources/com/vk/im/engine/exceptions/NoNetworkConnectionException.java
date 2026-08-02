package com.vk.im.engine.exceptions;

/* compiled from: NoNetworkConnectionException.kt */
/* loaded from: classes2.dex */
public final class NoNetworkConnectionException extends ImEngineException {
    private final Throwable cause;

    public NoNetworkConnectionException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public NoNetworkConnectionException(int i) {
        super(null);
        this.cause = null;
    }
}
