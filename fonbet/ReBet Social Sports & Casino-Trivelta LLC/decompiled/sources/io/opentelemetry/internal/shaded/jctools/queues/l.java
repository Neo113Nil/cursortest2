package io.opentelemetry.internal.shaded.jctools.queues;

import xh.AbstractC6827b;

/* loaded from: classes3.dex */
public abstract class l extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final long f49552e = AbstractC6827b.a(l.class, "producerLimit");

    /* renamed from: d, reason: collision with root package name */
    public volatile long f49553d;

    public l(int i10) {
        super(i10);
        this.f49553d = i10;
    }

    public final long g() {
        return this.f49553d;
    }

    public final void h(long j10) {
        AbstractC6827b.f68164c.putOrderedLong(this, f49552e, j10);
    }
}
