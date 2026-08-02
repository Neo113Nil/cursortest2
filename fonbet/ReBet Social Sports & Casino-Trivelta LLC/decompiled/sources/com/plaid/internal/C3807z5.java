package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3807z5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3727q5 f41248a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H5> f41249b;

    public C3807z5(C3727q5 c3727q5, Provider<H5> provider) {
        this.f41248a = c3727q5;
        this.f41249b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3727q5 c3727q5 = this.f41248a;
        H5 storage = this.f41249b.get();
        c3727q5.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return (W4) Gg.d.d(new W4(storage));
    }
}
