package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4337u5 implements InterfaceC4433zb {

    @NotNull
    private final RewardedAdRequest a;

    @NotNull
    private final Zd b;

    @NotNull
    private final InterfaceC4262q1 c;

    @NotNull
    private final IronSourceError d;

    public C4337u5(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull Zd zd, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull IronSourceError ironSourceError) {
        rewardedAdRequest.getClass();
        zd.getClass();
        interfaceC4262q1.getClass();
        ironSourceError.getClass();
        this.a = rewardedAdRequest;
        this.b = zd;
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
