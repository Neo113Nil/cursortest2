package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3308m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f34164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3332p5 f34166c;

    public RunnableC3308m5(C3332p5 c3332p5, C3268h5 c3268h5, long j10) {
        this.f34164a = c3268h5;
        this.f34165b = j10;
        Objects.requireNonNull(c3332p5);
        this.f34166c = c3332p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3332p5 c3332p5 = this.f34166c;
        c3332p5.C(this.f34164a, false, this.f34165b);
        c3332p5.f34224e = null;
        c3332p5.f33578a.J().u(null);
    }
}
