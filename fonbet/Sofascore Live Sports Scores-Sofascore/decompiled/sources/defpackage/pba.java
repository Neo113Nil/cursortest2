package defpackage;

import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pba implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClicked(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        new StringBuilder("IronSource rewarded ad clicked for instance ID: ").append(str);
        oba a = oba.a(str);
        if (a == null || (mediationRewardedAdCallback = a.a) == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClosed(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        oba a = oba.a(str);
        if (a != null && (mediationRewardedAdCallback = a.a) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        oba.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        oba a = oba.a(str);
        if (a != null && (mediationAdLoadCallback = a.b) != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        oba.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadSuccess(String str) {
        MediationAdLoadCallback mediationAdLoadCallback;
        new StringBuilder("IronSource rewarded ad loaded for instance ID: ").append(str);
        oba a = oba.a(str);
        if (a == null || (mediationAdLoadCallback = a.b) == null) {
            return;
        }
        a.a = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(a);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdOpened(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        new StringBuilder("IronSource rewarded ad opened for instance ID: ").append(str);
        oba a = oba.a(str);
        if (a == null || (mediationRewardedAdCallback = a.a) == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        mediationRewardedAdCallback.onVideoStart();
        mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        new StringBuilder("IronSource rewarded ad received reward for instance ID: ").append(str);
        oba a = oba.a(str);
        if (a == null || (mediationRewardedAdCallback = a.a) == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        mediationRewardedAdCallback.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        oba a = oba.a(str);
        if (a != null && (mediationRewardedAdCallback = a.a) != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
        oba.d.remove(str);
    }
}
