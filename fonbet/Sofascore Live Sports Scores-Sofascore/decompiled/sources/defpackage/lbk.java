package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lbk implements MediationInterstitialAd, IUnityAdsLoadListener, IUnityAdsShowListener {
    public String a;
    public final MediationAdLoadCallback b;
    public final jbk c;
    public final fbk d;
    public MediationInterstitialAdCallback e;
    public String f;
    public final String g;

    public lbk(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, jbk jbkVar, fbk fbkVar) {
        this.g = mediationInterstitialAdConfiguration.getWatermark();
        this.b = mediationAdLoadCallback;
        this.c = jbkVar;
        this.d = fbkVar;
    }

    public final void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        this.f = string2;
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            this.b.onFailure(new AdError(101, "Missing or invalid server parameters.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            this.c.a(context, string, new kbk(this, string, context, mediationInterstitialAdConfiguration.getBidResponse()));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        new StringBuilder("Unity Ads interstitial ad successfully loaded for placement ID: ").append(str);
        this.f = str;
        this.e = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f = str;
        AdError b = ebk.b(unityAdsLoadError, str2);
        b.toString();
        this.b.onFailure(b);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        new StringBuilder("Unity Ads interstitial ad was clicked for placement ID: ").append(str);
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.e;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
        this.e.onAdLeftApplication();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        new StringBuilder("Unity Ads interstitial ad finished playing for placement ID: ").append(str);
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        AdError c = ebk.c(unityAdsShowError, str2);
        c.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(c);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        new StringBuilder("Unity Ads interstitial ad started for placement ID: ").append(str);
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        String str = this.a;
        this.d.getClass();
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(str);
        unityAdsShowOptions.set(MBridgeConstans.EXTRA_KEY_WM, this.g);
        UnityAds.show((Activity) context, this.f, unityAdsShowOptions, this);
    }
}
