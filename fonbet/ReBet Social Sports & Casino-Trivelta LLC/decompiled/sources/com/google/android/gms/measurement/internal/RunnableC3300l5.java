package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3300l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3332p5 f34153b;

    public RunnableC3300l5(C3332p5 c3332p5, long j10) {
        this.f34152a = j10;
        Objects.requireNonNull(c3332p5);
        this.f34153b = c3332p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3332p5 c3332p5 = this.f34153b;
        c3332p5.f33578a.M().k(this.f34152a);
        c3332p5.f34224e = null;
    }
}
