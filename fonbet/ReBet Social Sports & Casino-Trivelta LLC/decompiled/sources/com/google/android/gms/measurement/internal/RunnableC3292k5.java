package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3292k5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3332p5 f34085a;

    public RunnableC3292k5(C3332p5 c3332p5) {
        Objects.requireNonNull(c3332p5);
        this.f34085a = c3332p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3332p5 c3332p5 = this.f34085a;
        c3332p5.f34224e = c3332p5.D();
    }
}
