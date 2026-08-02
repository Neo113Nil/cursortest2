package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pyk implements MediationInterstitialAd, InterstitialAdListener {
    public final MediationAdLoadCallback a;
    public final myk b;
    public InterstitialAd c;
    public MediationInterstitialAdCallback d;

    public pyk(MediationAdLoadCallback mediationAdLoadCallback, myk mykVar) {
        mediationAdLoadCallback.getClass();
        mykVar.getClass();
        this.a = mediationAdLoadCallback;
        this.b = mykVar;
    }

    public abstract String a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    public abstract void b(AdConfig adConfig, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    public final void c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        mediationInterstitialAdConfiguration.getClass();
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        mediationExtras.getClass();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load interstitial ad from Liftoff Monetize. Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationInterstitialAdConfiguration.getContext();
            context.getClass();
            oyk.c.a(string, context, new jyk(this, mediationExtras, mediationInterstitialAdConfiguration, context, string2, 2));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
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
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdFailedToShow(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        baseAd.getClass();
        this.d = (MediationInterstitialAdCallback) this.a.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback == null || mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        context.getClass();
        InterstitialAd interstitialAd = this.c;
        if (interstitialAd == null) {
            Intrinsics.i("interstitialAd");
            throw null;
        }
        if (interstitialAd != null) {
            interstitialAd.play(context);
        } else {
            Intrinsics.i("interstitialAd");
            throw null;
        }
    }
}
