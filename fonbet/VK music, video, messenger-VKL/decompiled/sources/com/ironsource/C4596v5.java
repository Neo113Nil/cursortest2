package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4596v5 implements Bb {
    private final InterstitialAdRequest a;
    private final A9 b;
    private final InterfaceC4538s1 c;
    private final IronSourceError d;

    public C4596v5(InterstitialAdRequest interstitialAdRequest, A9 a9, InterfaceC4538s1 interfaceC4538s1, IronSourceError ironSourceError) {
        this.a = interstitialAdRequest;
        this.b = a9;
        this.c = interfaceC4538s1;
        this.d = ironSourceError;
    }

    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.Bb
    public void start() {
        C4524r5 c4524r5 = new C4524r5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c4524r5.a();
        c4524r5.a(this.d);
        this.b.b(this.d);
    }
}
