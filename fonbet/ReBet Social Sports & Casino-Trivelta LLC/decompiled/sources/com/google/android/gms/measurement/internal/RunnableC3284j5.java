package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3284j5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f34059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3268h5 f34060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f34061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3332p5 f34063e;

    public RunnableC3284j5(C3332p5 c3332p5, C3268h5 c3268h5, C3268h5 c3268h52, long j10, boolean z10) {
        this.f34059a = c3268h5;
        this.f34060b = c3268h52;
        this.f34061c = j10;
        this.f34062d = z10;
        Objects.requireNonNull(c3332p5);
        this.f34063e = c3332p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34063e.B(this.f34059a, this.f34060b, this.f34061c, this.f34062d, null);
    }
}
