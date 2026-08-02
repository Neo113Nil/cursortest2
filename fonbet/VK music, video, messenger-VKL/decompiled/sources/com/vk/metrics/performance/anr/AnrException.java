package com.vk.metrics.performance.anr;

import java.util.UUID;

/* compiled from: AnrException.kt */
/* loaded from: classes3.dex */
public final class AnrException extends RuntimeException {
    private final String id;

    public AnrException() {
        this(null);
    }

    public final String d() {
        return this.id;
    }

    public AnrException(Throwable th) {
        super(th);
        this.id = UUID.randomUUID().toString();
    }
}
