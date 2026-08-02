package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3306m3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34162b;

    public CallableC3306m3(N3 n32, String str) {
        this.f34161a = str;
        Objects.requireNonNull(n32);
        this.f34162b = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34162b;
        n32.O0().E();
        return n32.O0().F0().C0(this.f34161a);
    }
}
