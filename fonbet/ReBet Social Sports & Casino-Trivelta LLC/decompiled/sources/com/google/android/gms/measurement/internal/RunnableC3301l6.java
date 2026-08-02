package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3301l6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f34154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3309m6 f34156c;

    public RunnableC3301l6(C3309m6 c3309m6, long j10, long j11) {
        Objects.requireNonNull(c3309m6);
        this.f34156c = c3309m6;
        this.f34154a = j10;
        this.f34155b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34156c.f34168b.f33578a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.k6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC3301l6 runnableC3301l6 = RunnableC3301l6.this;
                C3348r6 c3348r6 = runnableC3301l6.f34156c.f34168b;
                c3348r6.h();
                C3298l3 c3298l3 = c3348r6.f33578a;
                c3298l3.a().v().a("Application going to the background");
                c3298l3.x().f33530t.b(true);
                c3348r6.o(true);
                if (!c3298l3.w().N()) {
                    long j10 = runnableC3301l6.f34155b;
                    C3333p6 c3333p6 = c3348r6.f34270f;
                    c3333p6.d(false, false, j10);
                    c3333p6.b(j10);
                }
                c3298l3.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(runnableC3301l6.f34154a));
                C3298l3 c3298l32 = c3348r6.f33578a;
                W4 B10 = c3298l32.B();
                B10.h();
                C3298l3 c3298l33 = B10.f33578a;
                B10.j();
                Z5 J10 = c3298l33.J();
                J10.h();
                J10.j();
                if (!J10.y() || J10.f33578a.C().W() >= 242600) {
                    c3298l33.J().t();
                }
                if (c3298l3.w().H(null, AbstractC3209a2.f33829O0)) {
                    long D10 = c3298l3.C().P(c3298l3.d().getPackageName(), c3298l3.w().R()) ? 1000L : c3298l3.w().D(c3298l3.d().getPackageName(), AbstractC3209a2.f33808E);
                    c3298l3.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(D10));
                    c3298l32.N().o(D10);
                }
            }
        });
    }
}
