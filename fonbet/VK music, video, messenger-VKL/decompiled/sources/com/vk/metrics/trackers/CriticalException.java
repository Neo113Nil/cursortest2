package com.vk.metrics.trackers;

/* compiled from: CriticalException.kt */
/* loaded from: classes3.dex */
public class CriticalException extends Exception {
    public CriticalException() {
    }

    public CriticalException(IllegalArgumentException illegalArgumentException) {
        super(illegalArgumentException);
    }

    public CriticalException(String str, Throwable th) {
        super(str, th);
    }
}
