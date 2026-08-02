package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class K6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f33508b;

    public K6(S6 s62, zzr zzrVar) {
        this.f33507a = zzrVar;
        Objects.requireNonNull(s62);
        this.f33508b = s62;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzr zzrVar = this.f33507a;
        String str = (String) AbstractC3191o.m(zzrVar.f34462a);
        S6 s62 = this.f33508b;
        V3 g10 = s62.g(str);
        U3 u32 = U3.ANALYTICS_STORAGE;
        if (g10.o(u32) && V3.f(zzrVar.f34480s, 100).o(u32)) {
            return s62.o0(zzrVar).p0();
        }
        s62.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
