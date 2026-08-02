package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements RewardedInterstitialAdShowListener, AdShowListener {
    public final /* synthetic */ com.facebook.c0 a;
    public final RewardedInterstitialAdShowListener b;
    public final e c;
    public final com.moloco.sdk.internal.m0 d;

    public h(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, e eVar, com.moloco.sdk.internal.m0 m0Var) {
        m0Var.getClass();
        this.a = new com.facebook.c0(rewardedInterstitialAdShowListener, 7);
        this.b = rewardedInterstitialAdShowListener;
        this.c = eVar;
        this.d = m0Var;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        String str;
        molocoAd.getClass();
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.c.invoke();
        if (hVar != null && (str = hVar.j) != null) {
            this.d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        String str;
        molocoAd.getClass();
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.c.invoke();
        if (hVar != null && (str = hVar.i) != null) {
            this.d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        String str;
        molocoAd.getClass();
        com.moloco.sdk.internal.ortb.model.h hVar = (com.moloco.sdk.internal.ortb.model.h) this.c.invoke();
        if (hVar != null && (str = hVar.h) != null) {
            this.d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
