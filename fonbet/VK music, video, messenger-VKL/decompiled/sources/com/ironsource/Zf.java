package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* loaded from: classes13.dex */
public final class Zf implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        Md.a().a(new C4336gd(0, levelPlayAdInfo.getPlacementName(), false, "", 0, null), C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        Md.a().b(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        Md a = Md.a();
        C4249bg c4249bg = C4249bg.a;
        a.a(c4249bg.a(levelPlayAdError), c4249bg.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        Md.a().c(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        Md.a().a(C4249bg.a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        Md.a().d(C4249bg.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
        Md.a().b(new C4336gd(0, levelPlayAdInfo.getPlacementName(), false, levelPlayReward.getName(), levelPlayReward.getAmount(), null), C4249bg.a.a(levelPlayAdInfo));
    }
}
