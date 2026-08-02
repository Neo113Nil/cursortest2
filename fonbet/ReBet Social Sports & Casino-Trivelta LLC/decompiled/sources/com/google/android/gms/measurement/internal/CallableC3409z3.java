package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3409z3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34414b;

    public CallableC3409z3(N3 n32, zzr zzrVar) {
        this.f34413a = zzrVar;
        Objects.requireNonNull(n32);
        this.f34414b = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34414b;
        n32.O0().E();
        return new zzao(n32.O0().S0(this.f34413a.f34462a));
    }
}
