package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3572c2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f39846a;

    public C3572c2(I1 i12, J1 j12) {
        this.f39846a = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C channelInfoStore = (C) this.f39846a.get();
        Intrinsics.checkNotNullParameter(channelInfoStore, "channelInfoStore");
        return (x8) Gg.d.d(channelInfoStore);
    }
}
