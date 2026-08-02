package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3762u5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3727q5 f41119a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC3606d1> f41120b;

    public C3762u5(C3727q5 c3727q5, Provider<AbstractC3606d1> provider) {
        this.f41119a = c3727q5;
        this.f41120b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3727q5 c3727q5 = this.f41119a;
        AbstractC3606d1 featureStore = this.f41120b.get();
        c3727q5.getClass();
        Intrinsics.checkNotNullParameter(featureStore, "featureStore");
        return (C3561b1) Gg.d.d(new C3561b1(featureStore));
    }
}
