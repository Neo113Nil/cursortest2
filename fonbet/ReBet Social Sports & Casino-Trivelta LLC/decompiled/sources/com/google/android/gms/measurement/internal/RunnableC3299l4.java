package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3299l4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34151b;

    public RunnableC3299l4(W4 w42, long j10) {
        this.f34150a = j10;
        Objects.requireNonNull(w42);
        this.f34151b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3298l3 c3298l3 = this.f34151b.f33578a;
        I2 i22 = c3298l3.x().f33522l;
        long j10 = this.f34150a;
        i22.b(j10);
        c3298l3.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}
