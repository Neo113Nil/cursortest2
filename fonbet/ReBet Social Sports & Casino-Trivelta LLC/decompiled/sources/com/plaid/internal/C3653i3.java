package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3653i3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3608d3 f40671a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T3> f40672b;

    public C3653i3(C3608d3 c3608d3, Provider<T3> provider) {
        this.f40671a = c3608d3;
        this.f40672b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3608d3 c3608d3 = this.f40671a;
        T3 localPaneStateStore = this.f40672b.get();
        c3608d3.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C3734r4) Gg.d.d(new C3734r4(localPaneStateStore));
    }
}
