package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Z1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f39800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T3> f39801b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C3561b1> f39802c;

    public Z1(I1 i12, Provider<T3> provider, Provider<C3561b1> provider2) {
        this.f39800a = i12;
        this.f39801b = provider;
        this.f39802c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = this.f39800a;
        T3 localPaneStateStore = this.f39801b.get();
        C3561b1 featureManager = this.f39802c.get();
        i12.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        return (E7) Gg.d.d(new E7(localPaneStateStore, featureManager));
    }
}
