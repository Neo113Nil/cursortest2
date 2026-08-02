package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class lyk implements MediationBannerAd, BannerAdListener {
    public final MediationAdLoadCallback a;
    public MediationBannerAdCallback b;
    public VungleBannerView c;
    public final myk d;

    public lyk(MediationAdLoadCallback mediationAdLoadCallback, myk mykVar) {
        this.a = mediationAdLoadCallback;
        this.d = mykVar;
    }

    public abstract void a(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    public final void b(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            AdSize adSize = mediationBannerAdConfiguration.getAdSize();
            VungleAdSize validAdSizeFromSize = VungleAdSize.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), string2);
            adSize.toString();
            Objects.toString(validAdSizeFromSize);
            oyk.c.a(string, context, new jyk(this, context, string2, validAdSizeFromSize, mediationBannerAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.c;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.b.onAdOpened();
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
        VungleMediationAdapter.getAdError(vungleError).toString();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        this.b = (MediationBannerAdCallback) this.a.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }
}
