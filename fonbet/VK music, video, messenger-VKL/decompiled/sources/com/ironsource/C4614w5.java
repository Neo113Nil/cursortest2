package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4614w5 implements Bb {
    private final RewardedAdRequest a;
    private final C4229ae b;
    private final InterfaceC4538s1 c;
    private final IronSourceError d;

    public C4614w5(RewardedAdRequest rewardedAdRequest, C4229ae c4229ae, InterfaceC4538s1 interfaceC4538s1, IronSourceError ironSourceError) {
        this.a = rewardedAdRequest;
        this.b = c4229ae;
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
