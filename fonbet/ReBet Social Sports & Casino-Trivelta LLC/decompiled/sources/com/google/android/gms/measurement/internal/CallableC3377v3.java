package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3377v3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N3 f34338d;

    public CallableC3377v3(N3 n32, String str, String str2, String str3) {
        this.f34335a = str;
        this.f34336b = str2;
        this.f34337c = str3;
        Objects.requireNonNull(n32);
        this.f34338d = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        N3 n32 = this.f34338d;
        n32.O0().E();
        return n32.O0().F0().H0(this.f34335a, this.f34336b, this.f34337c);
    }
}
