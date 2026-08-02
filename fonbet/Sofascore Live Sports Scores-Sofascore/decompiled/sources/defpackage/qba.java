package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qba implements MediationBannerAd, BannerAdLoaderListener, BannerAdViewListener {
    public MediationBannerAdCallback a;
    public final MediationAdLoadCallback b;
    public FrameLayout c;

    public qba(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.c;
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public final void onBannerAdClicked(BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.a;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        this.a.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback == null) {
            return;
        }
        mediationAdLoadCallback.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public final void onBannerAdLoaded(BannerAdView bannerAdView) {
        MediationAdLoadCallback mediationAdLoadCallback;
        if (this.c == null || (mediationAdLoadCallback = this.b) == null) {
            return;
        }
        bannerAdView.setListener(this);
        this.c.addView(bannerAdView);
        this.a = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public final void onBannerAdShown(BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.a;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
