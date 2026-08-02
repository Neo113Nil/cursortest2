package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC3773v7> f39762a;

    /* renamed from: b, reason: collision with root package name */
    public final W1 f39763b;

    public X1(I1 i12, Provider provider, W1 w12) {
        this.f39762a = provider;
        this.f39763b = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC3773v7 twilioVerifySna = this.f39762a.get();
        InterfaceC3639g7 snaApi = (InterfaceC3639g7) this.f39763b.get();
        Intrinsics.checkNotNullParameter(twilioVerifySna, "twilioVerifySna");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        return (C3755t7) Gg.d.d(new C3755t7(twilioVerifySna, snaApi));
    }
}
