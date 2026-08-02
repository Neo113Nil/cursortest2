package io.opentelemetry.internal.shaded.jctools.queues;

import xh.AbstractC6827b;

/* loaded from: classes3.dex */
public abstract class k extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final long f49550c = AbstractC6827b.a(k.class, "producerIndex");

    /* renamed from: b, reason: collision with root package name */
    public volatile long f49551b;

    public k(int i10) {
        super(i10);
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.c.a
    public final long b() {
        return this.f49551b;
    }

    public final boolean f(long j10, long j11) {
        return AbstractC6827b.f68164c.compareAndSwapLong(this, f49550c, j10, j11);
    }
}
