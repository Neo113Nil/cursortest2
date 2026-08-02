package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4319t5 implements InterfaceC4433zb {

    @NotNull
    private final InterstitialAdRequest a;

    @NotNull
    private final C4431z9 b;

    @NotNull
    private final InterfaceC4262q1 c;

    @NotNull
    private final IronSourceError d;

    public C4319t5(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull C4431z9 c4431z9, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull IronSourceError ironSourceError) {
        interstitialAdRequest.getClass();
        c4431z9.getClass();
        interfaceC4262q1.getClass();
        ironSourceError.getClass();
        this.a = interstitialAdRequest;
        this.b = c4431z9;
        this.c = interfaceC4262q1;
        this.d = ironSourceError;
    }

    @NotNull
    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4433zb
    public void start() {
        C4248p5 c4248p5 = new C4248p5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c4248p5.a();
        c4248p5.a(this.d);
        this.b.a(this.d);
    }
}
