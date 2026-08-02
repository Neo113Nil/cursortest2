package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class L1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G2> f39337a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z2> f39338b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Y2> f39339c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<y8> f39340d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C8> f39341e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<x8> f39342f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<B8> f39343g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<A8> f39344h;

    /* renamed from: i, reason: collision with root package name */
    public final C0 f39345i;

    public L1(I1 i12, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, C0 c02) {
        this.f39337a = provider;
        this.f39338b = provider2;
        this.f39339c = provider3;
        this.f39340d = provider4;
        this.f39341e = provider5;
        this.f39342f = provider6;
        this.f39343g = provider7;
        this.f39344h = provider8;
        this.f39345i = c02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G2 navigator = this.f39337a.get();
        Z2 linkStateStore = this.f39338b.get();
        Y2 reducer = this.f39339c.get();
        y8 writeOAuthRedirectUri = this.f39340d.get();
        C8 writeWebviewFallbackUri = this.f39341e.get();
        x8 writeChannelInfo = this.f39342f.get();
        B8 writeWebviewFallbackId = this.f39343g.get();
        A8 writeWebviewBackgroundTransparencyState = this.f39344h.get();
        A0 destinationFactory = (A0) this.f39345i.get();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        Intrinsics.checkNotNullParameter(writeChannelInfo, "writeChannelInfo");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackId, "writeWebviewFallbackId");
        Intrinsics.checkNotNullParameter(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        Intrinsics.checkNotNullParameter(destinationFactory, "destinationFactory");
        return (InterfaceC3759u2) Gg.d.d(new C3750t2(navigator, linkStateStore, reducer, writeOAuthRedirectUri, writeWebviewFallbackUri, writeChannelInfo, writeWebviewFallbackId, writeWebviewBackgroundTransparencyState, destinationFactory));
    }
}
