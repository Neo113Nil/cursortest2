package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3742s3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3653i3 f41050a;

    public C3742s3(C3608d3 c3608d3, C3653i3 c3653i3) {
        this.f41050a = c3653i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3734r4 oAuthRedirectUriStore = (C3734r4) this.f41050a.get();
        Intrinsics.checkNotNullParameter(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (y8) Gg.d.d(oAuthRedirectUriStore);
    }
}
