package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3353s3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N3 f34280d;

    public CallableC3353s3(N3 n32, String str, String str2, String str3) {
        this.f34277a = str;
        this.f34278b = str2;
        this.f34279c = str3;
        Objects.requireNonNull(n32);
        this.f34280d = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34280d;
        n32.O0().E();
        return n32.O0().F0().D0(this.f34277a, this.f34278b, this.f34279c);
    }
}
