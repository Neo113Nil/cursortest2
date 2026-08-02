package defpackage;

import android.widget.FrameLayout;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lba implements ISDemandOnlyBannerListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdClicked(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        new StringBuilder("IronSource banner ad clicked for instance ID: ").append(str);
        kba a = kba.a(str);
        if (a == null || (mediationBannerAdCallback = a.a) == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        mediationBannerAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLeftApplication(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        new StringBuilder("IronSource banner ad has caused user to leave the application for instance ID: ").append(str);
        kba a = kba.a(str);
        if (a == null || (mediationBannerAdCallback = a.a) == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        adError.toString();
        kba a = kba.a(str);
        if (a == null) {
            return;
        }
        MediationAdLoadCallback mediationAdLoadCallback = a.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        kba.f.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLoaded(String str) {
        FrameLayout frameLayout;
        new StringBuilder("IronSource banner ad loaded for instance ID: ").append(str);
        kba a = kba.a(str);
        if (a == null || (frameLayout = a.c) == null) {
            return;
        }
        frameLayout.addView(a.d);
        MediationAdLoadCallback mediationAdLoadCallback = a.b;
        if (mediationAdLoadCallback != null) {
            a.a = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(a);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdShown(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        kba a = kba.a(str);
        if (a != null && (mediationBannerAdCallback = a.a) != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
        for (String str2 : kba.f.keySet()) {
            if (!str2.equals(str)) {
                "IronSource Banner Destroy ad with instance ID: ".concat(str2);
                IronSource.destroyISDemandOnlyBanner(str2);
                kba.f.remove(str2);
            }
        }
    }
}
