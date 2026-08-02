package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3322o3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34197b;

    public RunnableC3322o3(N3 n32, zzr zzrVar) {
        this.f34196a = zzrVar;
        Objects.requireNonNull(n32);
        this.f34197b = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34197b;
        n32.O0().E();
        n32.O0().i0(this.f34196a);
    }
}
