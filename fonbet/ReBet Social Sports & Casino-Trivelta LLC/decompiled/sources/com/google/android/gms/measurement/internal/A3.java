package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class A3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f33274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f33275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f33276c;

    public A3(N3 n32, zzbg zzbgVar, zzr zzrVar) {
        this.f33274a = zzbgVar;
        this.f33275b = zzrVar;
        Objects.requireNonNull(n32);
        this.f33276c = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar = this.f33274a;
        zzr zzrVar = this.f33275b;
        N3 n32 = this.f33276c;
        n32.S0(n32.T0(zzbgVar, zzrVar), zzrVar);
    }
}
