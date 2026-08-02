package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I5> f39179a;

    public B5(C3727q5 c3727q5, Provider<I5> provider) {
        this.f39179a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I5 sdkVersionDetails = this.f39179a.get();
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        return (E5) Gg.d.d(E5.f39229c.a(sdkVersionDetails.a()));
    }
}
