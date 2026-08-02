package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class kyk implements MediationAppOpenAd, InterstitialAdListener {
    public final MediationAdLoadCallback a;
    public final myk b;
    public InterstitialAd c;
    public MediationAppOpenAdCallback d;

    public kyk(MediationAdLoadCallback mediationAdLoadCallback, myk mykVar) {
        mykVar.getClass();
        this.a = mediationAdLoadCallback;
        this.b = mykVar;
    }

    public abstract String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void b(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void c(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        mediationAppOpenAdConfiguration.getClass();
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        mediationExtras.getClass();
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            context.getClass();
            oyk.c.a(string, context, new jyk(this, mediationExtras, mediationAppOpenAdConfiguration, context, string2, 0));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        baseAd.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        baseAd.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        baseAd.getClass();
        vungleError.getClass();
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.getClass();
        adError.toString();
        this.a.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        baseAd.getClass();
        vungleError.getClass();
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.getClass();
        adError.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        baseAd.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        baseAd.getClass();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        baseAd.getClass();
        this.d = (MediationAppOpenAdCallback) this.a.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        baseAd.getClass();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        context.getClass();
        InterstitialAd interstitialAd = this.c;
        if (interstitialAd == null) {
            Intrinsics.i("appOpenAd");
            throw null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            InterstitialAd interstitialAd2 = this.c;
            if (interstitialAd2 != null) {
                interstitialAd2.play(context);
                return;
            } else {
                Intrinsics.i("appOpenAd");
                throw null;
            }
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        adError.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
