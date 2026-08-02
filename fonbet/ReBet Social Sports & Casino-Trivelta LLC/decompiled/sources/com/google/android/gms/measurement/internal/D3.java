package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class D3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpl f33369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f33370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f33371c;

    public D3(N3 n32, zzpl zzplVar, zzr zzrVar) {
        this.f33369a = zzplVar;
        this.f33370b = zzrVar;
        Objects.requireNonNull(n32);
        this.f33371c = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f33371c;
        n32.O0().E();
        zzpl zzplVar = this.f33369a;
        if (zzplVar.g() != null) {
            n32.O0().c0(zzplVar, this.f33370b);
        } else {
            zzr zzrVar = this.f33370b;
            n32.O0().d0(zzplVar.f34451b, zzrVar);
        }
    }
}
