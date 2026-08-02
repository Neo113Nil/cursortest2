package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import xsna.ch5;
import xsna.ger;

/* renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4229ae implements V<RewardedAd> {
    private final InterfaceC4357hg a;
    private final RewardedAdLoaderListener b;

    public C4229ae(InterfaceC4357hg interfaceC4357hg, RewardedAdLoaderListener rewardedAdLoaderListener) {
        this.a = interfaceC4357hg;
        this.b = rewardedAdLoaderListener;
    }

    @Override // com.ironsource.V
    public void a(RewardedAd rewardedAd) {
        this.a.a(new ch5(3, rewardedAd, this));
    }

    @Override // com.ironsource.V
    public void b(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + ironSourceError);
        this.a.a(new ger(4, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd rewardedAd, C4229ae c4229ae) {
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + rewardedAd.getAdInfo());
        c4229ae.b.onRewardedAdLoaded(rewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4229ae c4229ae, IronSourceError ironSourceError) {
        c4229ae.b.onRewardedAdLoadFailed(ironSourceError);
    }
}
