package io.opentelemetry.internal.shaded.jctools.queues;

import xh.AbstractC6827b;

/* loaded from: classes3.dex */
public abstract class f extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final long f49548g = AbstractC6827b.a(f.class, "consumerIndex");

    /* renamed from: f, reason: collision with root package name */
    public volatile long f49549f;

    public f(int i10) {
        super(i10);
    }

    @Override // io.opentelemetry.internal.shaded.jctools.queues.c.a
    public final long c() {
        return this.f49549f;
    }

    public final long i() {
        return AbstractC6827b.f68164c.getLong(this, f49548g);
    }

    public final void j(long j10) {
        AbstractC6827b.f68164c.putOrderedLong(this, f49548g, j10);
    }
}
