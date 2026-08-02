package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3401y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34399b;

    public RunnableC3401y3(N3 n32, zzr zzrVar) {
        this.f34398a = zzrVar;
        Objects.requireNonNull(n32);
        this.f34399b = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34399b;
        n32.O0().E();
        S6 O02 = n32.O0();
        O02.b().h();
        O02.O0();
        zzr zzrVar = this.f34398a;
        AbstractC3191o.g(zzrVar.f34462a);
        O02.P0(zzrVar);
        O02.Q0(zzrVar);
    }
}
