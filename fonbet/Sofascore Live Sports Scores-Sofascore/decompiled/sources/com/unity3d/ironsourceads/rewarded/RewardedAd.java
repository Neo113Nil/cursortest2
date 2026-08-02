package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.Vd;
import com.ironsource.Wd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class RewardedAd implements Wd {

    @NotNull
    private final Vd a;

    @Nullable
    private RewardedAdListener b;

    public RewardedAd(@NotNull Vd vd) {
        vd.getClass();
        this.a = vd;
        vd.a(this);
    }

    @NotNull
    public final RewardedAdInfo getAdInfo() {
        return this.a.b();
    }

    @Nullable
    public final RewardedAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.a.d();
    }

    @Override // com.ironsource.Wd
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Wd
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Wd
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Wd
    public void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + ironSourceError + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.Wd
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Wd
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.b = rewardedAdListener;
    }

    public final void show(@NotNull Activity activity) {
        activity.getClass();
        IronLog.API.info();
        this.a.a(activity);
    }
}
