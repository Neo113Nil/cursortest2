package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class km6 implements MediationRewardedAd, RewardedVideoAdExtendedListener {
    public final MediationAdLoadCallback a;
    public RewardedVideoAd b;
    public MediationRewardedAdCallback d;
    public final k03 f;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    public km6(MediationAdLoadCallback mediationAdLoadCallback, k03 k03Var) {
        this.a = mediationAdLoadCallback;
        this.f = k03Var;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public final void b(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementId = FacebookMediationAdapter.getPlacementId(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementId)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            this.a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
        this.f.getClass();
        this.b = new RewardedVideoAd(context, placementId);
        if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
            this.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
        }
        RewardedVideoAd rewardedVideoAd = this.b;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(a()).build());
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (mediationAdLoadCallback != null) {
            this.d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        if (this.c.get()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            MediationAdLoadCallback mediationAdLoadCallback = this.a;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.b.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.e.getAndSet(true) && (mediationRewardedAdCallback = this.d) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.e.getAndSet(true) && (mediationRewardedAdCallback = this.d) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.d.onVideoComplete();
        this.d.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.c.set(true);
        if (this.b.show()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
                this.d.onAdOpened();
                return;
            }
            return;
        }
        AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        adError.getMessage();
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.d;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adError);
        }
        this.b.destroy();
    }
}
