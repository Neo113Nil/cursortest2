package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zyk implements MediationRewardedAd, RewardedAdListener {
    public final MediationAdLoadCallback a;
    public MediationRewardedAdCallback b;
    public RewardedAd c;
    public final myk d;

    public zyk(MediationAdLoadCallback mediationAdLoadCallback, myk mykVar) {
        this.a = mediationAdLoadCallback;
        this.d = mykVar;
    }

    public final void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        this.d.getClass();
        AdConfig adConfig = new AdConfig();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfig.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        oyk.c.a(string2, context, new yyk(this, context, string3, adConfig, string, bidResponse));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        this.a.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.b.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        this.b = (MediationRewardedAdCallback) this.a.onSuccess(this);
    }

    @Override // com.vungle.ads.RewardedAdListener
    public final void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.b.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        RewardedAd rewardedAd = this.c;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.b != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            this.b.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }
}
