package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Jf implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2733x2.a().b(Yf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2733x2.a().f(Yf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2733x2.a().c(Yf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C2733x2.a().a(Yf.a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2733x2.a().d(Yf.a.a(adInfo));
    }
}
