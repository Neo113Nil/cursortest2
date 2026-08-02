package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f39498a;

    public P1(I1 i12, J1 j12) {
        this.f39498a = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C channelInfoStore = (C) this.f39498a.get();
        Intrinsics.checkNotNullParameter(channelInfoStore, "channelInfoStore");
        return (InterfaceC3781w6) Gg.d.d(channelInfoStore);
    }
}
