package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import defpackage.s5l;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zd implements V<RewardedAd> {

    @NotNull
    private final InterfaceC4080fg a;

    @NotNull
    private final RewardedAdLoaderListener b;

    public Zd(@NotNull InterfaceC4080fg interfaceC4080fg, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener) {
        interfaceC4080fg.getClass();
        rewardedAdLoaderListener.getClass();
        this.a = interfaceC4080fg;
        this.b = rewardedAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd rewardedAd, Zd zd) {
        rewardedAd.getClass();
        zd.getClass();
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + rewardedAd.getAdInfo());
        zd.b.onRewardedAdLoaded(rewardedAd);
    }

    @Override // com.ironsource.V
    public void a(@NotNull RewardedAd rewardedAd) {
        rewardedAd.getClass();
        this.a.a(new s5l(11, rewardedAd, this));
    }

    @Override // com.ironsource.V
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + ironSourceError);
        this.a.a(new s5l(10, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Zd zd, IronSourceError ironSourceError) {
        zd.getClass();
        ironSourceError.getClass();
        zd.b.onRewardedAdLoadFailed(ironSourceError);
    }
}
