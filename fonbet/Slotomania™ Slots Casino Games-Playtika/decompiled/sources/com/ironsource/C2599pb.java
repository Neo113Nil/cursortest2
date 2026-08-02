package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2599pb {

    /* renamed from: com.ironsource.pb$a */
    public static final class a implements Ya {
        final /* synthetic */ LevelPlayRewardedAdListener a;

        a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.Ya
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdLoadFailed(LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Ya
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ya b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
