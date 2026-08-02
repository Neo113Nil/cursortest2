package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4298eb {

    /* renamed from: com.ironsource.eb$a */
    public static final class a implements Za {
        final /* synthetic */ LevelPlayInterstitialAdListener a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.Za
        public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.Za
        public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.Za
        public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.Za
        public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + levelPlayAdError);
            this.a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.Za
        public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.a.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Za b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
