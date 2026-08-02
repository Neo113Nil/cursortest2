package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3361t3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N3 f34297d;

    public CallableC3361t3(N3 n32, String str, String str2, String str3) {
        this.f34294a = str;
        this.f34295b = str2;
        this.f34296c = str3;
        Objects.requireNonNull(n32);
        this.f34297d = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34297d;
        n32.O0().E();
        return n32.O0().F0().D0(this.f34294a, this.f34295b, this.f34296c);
    }
}
