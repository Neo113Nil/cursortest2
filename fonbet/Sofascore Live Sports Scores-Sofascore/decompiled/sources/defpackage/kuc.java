package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kuc implements MediationInterstitialAd, AdLoad.Listener, InterstitialAdShowListener {
    public final MediationAdLoadCallback a;
    public final String b;
    public final String c;
    public final String d;
    public InterstitialAd e;
    public MediationInterstitialAdCallback f;

    public kuc(MediationAdLoadCallback mediationAdLoadCallback, String str, String str2, String str3) {
        this.a = mediationAdLoadCallback;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
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
        this.f = (MediationInterstitialAdCallback) this.a.onSuccess(this);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        AdError adError = new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        context.getClass();
        InterstitialAd interstitialAd = this.e;
        if (interstitialAd != null) {
            interstitialAd.show(this);
        } else {
            Intrinsics.i("molocoAd");
            throw null;
        }
    }
}
