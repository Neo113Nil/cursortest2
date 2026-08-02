package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3369u3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N3 f34319d;

    public CallableC3369u3(N3 n32, String str, String str2, String str3) {
        this.f34316a = str;
        this.f34317b = str2;
        this.f34318c = str3;
        Objects.requireNonNull(n32);
        this.f34319d = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34319d;
        n32.O0().E();
        return n32.O0().F0().H0(this.f34316a, this.f34317b, this.f34318c);
    }
}
