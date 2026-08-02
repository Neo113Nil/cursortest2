package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xf implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        Ld.a().a(new C4077fd(0, levelPlayAdInfo.getPlacementName(), false, "", 0, null), Zf.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        Ld.a().b(Zf.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdError.getClass();
        levelPlayAdInfo.getClass();
        Ld a = Ld.a();
        Zf zf = Zf.a;
        a.a(zf.a(levelPlayAdError), zf.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        Ld.a().c(Zf.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        Ld.a().a(Zf.a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        Ld.a().d(Zf.a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayReward.getClass();
        levelPlayAdInfo.getClass();
        Ld.a().b(new C4077fd(0, levelPlayAdInfo.getPlacementName(), false, levelPlayReward.getName(), levelPlayReward.getAmount(), null), Zf.a.a(levelPlayAdInfo));
    }
}
