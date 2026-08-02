package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3653i3 f39607a;

    public S1(I1 i12, C3653i3 c3653i3) {
        this.f39607a = c3653i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3734r4 oAuthRedirectUriStore = (C3734r4) this.f39607a.get();
        Intrinsics.checkNotNullParameter(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (InterfaceC3790x6) Gg.d.d(oAuthRedirectUriStore);
    }
}
