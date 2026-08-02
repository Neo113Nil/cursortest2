package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3671k3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3608d3 f40727a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<I5> f40728b;

    public C3671k3(C3608d3 c3608d3, Provider<I5> provider) {
        this.f40727a = c3608d3;
        this.f40728b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3608d3 c3608d3 = this.f40727a;
        I5 sdkVersionDetails = this.f40728b.get();
        c3608d3.getClass();
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        return (I) Gg.d.d(new I(sdkVersionDetails));
    }
}
