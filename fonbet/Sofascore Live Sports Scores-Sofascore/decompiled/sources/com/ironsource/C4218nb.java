package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4218nb {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.nb$a */
    public static final class a implements Wa {
        final /* synthetic */ LevelPlayRewardedAdListener a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.Wa
        public void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdError.getClass();
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
            levelPlayAdError.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + levelPlayAdError);
            this.a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.Wa
        public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.a.onAdLoaded(levelPlayAdInfo);
        }

        @Override // com.ironsource.Wa
        public void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayReward.getClass();
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + levelPlayReward + " adInfo: " + levelPlayAdInfo);
            this.a.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wa b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
