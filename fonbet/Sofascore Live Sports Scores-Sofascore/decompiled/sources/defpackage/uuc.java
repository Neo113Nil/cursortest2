package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uuc implements MediationRewardedAd, AdLoad.Listener, RewardedInterstitialAdShowListener {
    public final MediationAdLoadCallback a;
    public final String b;
    public final String c;
    public final String d;
    public RewardedInterstitialAd e;
    public MediationRewardedAdCallback f;

    public uuc(MediationAdLoadCallback mediationAdLoadCallback, String str, String str2, String str3) {
        this.a = mediationAdLoadCallback;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onFailure(new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.f = (MediationRewardedAdCallback) this.a.onSuccess(this);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        AdError adError = new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        context.getClass();
        RewardedInterstitialAd rewardedInterstitialAd = this.e;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.show(this);
        } else {
            Intrinsics.i("molocoAd");
            throw null;
        }
    }
}
