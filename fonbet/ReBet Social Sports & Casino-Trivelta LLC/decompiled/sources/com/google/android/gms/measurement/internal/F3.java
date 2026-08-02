package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class F3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f33399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f33400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f33401c;

    public F3(N3 n32, zzr zzrVar, Bundle bundle) {
        this.f33399a = zzrVar;
        this.f33400b = bundle;
        Objects.requireNonNull(n32);
        this.f33401c = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f33401c;
        n32.O0().E();
        return n32.O0().q0(this.f33399a, this.f33400b);
    }
}
