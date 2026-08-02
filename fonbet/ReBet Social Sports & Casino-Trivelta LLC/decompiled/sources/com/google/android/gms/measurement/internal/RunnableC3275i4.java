package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3275i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f34046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34047b;

    public RunnableC3275i4(W4 w42, boolean z10) {
        this.f34046a = z10;
        Objects.requireNonNull(w42);
        this.f34047b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f34047b;
        C3298l3 c3298l3 = w42.f33578a;
        boolean g10 = c3298l3.g();
        boolean f10 = c3298l3.f();
        boolean z10 = this.f34046a;
        c3298l3.P(z10);
        if (f10 == z10) {
            c3298l3.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (c3298l3.g() == g10 || c3298l3.g() != c3298l3.f()) {
            c3298l3.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(g10));
        }
        w42.Y();
    }
}
