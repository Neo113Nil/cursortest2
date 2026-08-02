package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ay9 extends InterstitialAdEventListener implements MediationInterstitialAd {
    public by9 a;
    public final MediationAdLoadCallback b;
    public final zx9 c;
    public MediationInterstitialAdCallback d;
    public final sx9 e;

    public ay9(MediationAdLoadCallback mediationAdLoadCallback, zx9 zx9Var, sx9 sx9Var) {
        this.b = mediationAdLoadCallback;
        this.c = zx9Var;
        this.e = sx9Var;
    }

    public final void a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        long d = ux9.d(mediationInterstitialAdConfiguration.getServerParameters());
        this.e.getClass();
        this.a = new by9(new InMobiInterstitial(context, d, this));
        ux9.e();
        ux9.a(mediationInterstitialAdConfiguration.getMediationExtras());
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            by9 by9Var = this.a;
            ((InMobiInterstitial) by9Var.a).setWatermarkData(new WatermarkData(watermark, 0.3f));
        }
        b(this.a, mediationInterstitialAdConfiguration);
    }

    public abstract void b(by9 by9Var, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError u = yso.u(106, "InMobi SDK failed to display an interstitial ad.");
        u.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(u);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adError = new AdError(ux9.c(inMobiAdRequestStatus), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), "com.inmobi.sdk");
        adError.toString();
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            this.d = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        if (((InMobiInterstitial) this.a.a).isReady()) {
            ((InMobiInterstitial) this.a.a).show();
            return;
        }
        AdError u = yso.u(105, "InMobi interstitial ad is not yet ready to be shown.");
        u.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(u);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map map) {
    }
}
