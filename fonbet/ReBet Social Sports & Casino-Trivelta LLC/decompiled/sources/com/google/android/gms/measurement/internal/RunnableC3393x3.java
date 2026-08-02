package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3393x3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34384b;

    public RunnableC3393x3(N3 n32, zzr zzrVar) {
        this.f34383a = zzrVar;
        Objects.requireNonNull(n32);
        this.f34384b = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34384b;
        n32.O0().E();
        n32.O0().b0(this.f34383a);
    }
}
