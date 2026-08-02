package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3309m6 {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC3301l6 f34167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3348r6 f34168b;

    public C3309m6(C3348r6 c3348r6) {
        Objects.requireNonNull(c3348r6);
        this.f34168b = c3348r6;
    }

    public final void a() {
        C3348r6 c3348r6 = this.f34168b;
        c3348r6.h();
        RunnableC3301l6 runnableC3301l6 = this.f34167a;
        if (runnableC3301l6 != null) {
            c3348r6.t().removeCallbacks(runnableC3301l6);
        }
        C3298l3 c3298l3 = c3348r6.f33578a;
        c3298l3.x().f33530t.b(false);
        c3348r6.o(false);
        if (c3298l3.w().H(null, AbstractC3209a2.f33841U0)) {
            C3298l3 c3298l32 = c3348r6.f33578a;
            if (c3298l32.B().v0()) {
                c3298l3.a().w().a("Retrying trigger URI registration in foreground");
                c3298l32.B().x0();
            }
        }
    }

    public final void b(long j10) {
        C3348r6 c3348r6 = this.f34168b;
        this.f34167a = new RunnableC3301l6(this, c3348r6.f33578a.e().a(), j10);
        c3348r6.t().postDelayed(this.f34167a, 2000L);
    }
}
