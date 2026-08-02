package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3725q3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C3561b1> f40998a;

    public C3725q3(C3608d3 c3608d3, Provider<C3561b1> provider) {
        this.f40998a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3561b1 featureManager = this.f40998a.get();
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        return (L7) Gg.d.d(new L7(new C3573c3(featureManager)));
    }
}
