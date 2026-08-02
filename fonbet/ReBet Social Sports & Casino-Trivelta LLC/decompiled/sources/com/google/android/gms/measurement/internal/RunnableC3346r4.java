package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3346r4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34265b;

    public RunnableC3346r4(W4 w42, long j10) {
        this.f34264a = j10;
        Objects.requireNonNull(w42);
        this.f34265b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f34265b;
        w42.h();
        w42.j();
        C3298l3 c3298l3 = w42.f33578a;
        c3298l3.a().v().a("Resetting analytics data (FE)");
        C3298l3 c3298l32 = w42.f33578a;
        C3348r6 z10 = c3298l32.z();
        z10.h();
        z10.f34270f.c();
        c3298l32.L().p();
        boolean z11 = !w42.f33578a.g();
        L2 x10 = c3298l3.x();
        x10.f33516f.b(this.f34264a);
        C3298l3 c3298l33 = x10.f33578a;
        if (!TextUtils.isEmpty(c3298l33.x().f33533w.a())) {
            x10.f33533w.b(null);
        }
        x10.f33527q.b(0L);
        x10.f33528r.b(0L);
        if (!c3298l33.w().L()) {
            x10.y(z11);
        }
        x10.f33534x.b(null);
        x10.f33535y.b(0L);
        x10.f33536z.b(null);
        c3298l32.J().p();
        c3298l32.z().f34269e.a();
        w42.f33736s = z11;
        c3298l32.J().q(new AtomicReference());
    }
}
