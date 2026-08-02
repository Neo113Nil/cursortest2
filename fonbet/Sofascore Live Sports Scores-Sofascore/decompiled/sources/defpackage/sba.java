package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sba implements MediationRewardedAd, RewardedAdLoaderListener, RewardedAdListener {
    public MediationRewardedAdCallback a;
    public final MediationAdLoadCallback b;
    public RewardedAd c = null;

    public sba(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdClicked(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdDismissed(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdFailedToShow(RewardedAd rewardedAd, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public final void onRewardedAdLoadFailed(IronSourceError ironSourceError) {
        this.b.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public final void onRewardedAdLoaded(RewardedAd rewardedAd) {
        this.c = rewardedAd;
        this.a = (MediationRewardedAdCallback) this.b.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdShown(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.a.onVideoStart();
        this.a.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onUserEarnedReward(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        this.a.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        RewardedAd rewardedAd = this.c;
        if (rewardedAd == null) {
            AdError u = nq8.u(107, "ad is null");
            u.toString();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(u);
                return;
            }
            return;
        }
        try {
            rewardedAd.setListener(this);
            this.c.show((Activity) context);
        } catch (ClassCastException unused) {
            AdError u2 = nq8.u(102, "IronSource requires an Activity context to load ads.");
            u2.toString();
            MediationRewardedAdCallback mediationRewardedAdCallback2 = this.a;
            if (mediationRewardedAdCallback2 != null) {
                mediationRewardedAdCallback2.onAdFailedToShow(u2);
            }
        }
    }
}
