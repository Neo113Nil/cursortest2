package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;

/* loaded from: classes13.dex */
public final class Mf implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        C4629x2.a().b(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        C4629x2.a().f(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo) {
        C4629x2.a().c(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        C4629x2.a().a(C4249bg.a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        C4629x2.a().d(C4249bg.a.a(levelPlayAdInfo));
    }
}
