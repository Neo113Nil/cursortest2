package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.a8e;
import defpackage.b8e;
import defpackage.e3c;
import defpackage.jaa;
import defpackage.l7e;
import defpackage.m7e;
import defpackage.o7e;
import defpackage.p7e;
import defpackage.q7e;
import defpackage.s7e;
import defpackage.u7e;
import defpackage.v7e;
import defpackage.y7e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";
    public final s7e a;
    public final b8e b;
    public final q7e c;

    public PangleMediationAdapter() {
        s7e s7eVar = s7e.d;
        if (s7eVar == null) {
            s7eVar = new s7e();
            s7e.d = s7eVar;
        }
        this.a = s7eVar;
        this.b = new b8e();
        this.c = new q7e();
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (i == 1 || i == 0) {
            PAGConfig.setPAConsent(i);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        if (jaa.G()) {
            signalCallbacks.onFailure(jaa.z());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        b8e b8eVar = this.b;
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            String string = networkExtras.getString("user_data", "");
            b8eVar.getClass();
            PAGConfig.setUserData(string);
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        Context context = rtbSignalData.getContext();
        e3c e3cVar = new e3c(signalCallbacks, 6);
        b8eVar.getClass();
        PAGSdk.getBiddingToken(context, pAGBiddingRequest, e3cVar);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.b.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length < 3) {
            StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
            sb.append(sDKVersion);
            sb.append(". Returning 0.0.0 for SDK version.");
            return new VersionInfo(0, 0, 0);
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[2]);
        if (split.length >= 4) {
            parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[3]);
        }
        return new VersionInfo(parseInt, parseInt2, parseInt3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "8.1.0.5.0".split("\\.");
        if (split.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100);
        if (split.length >= 5) {
            parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
        }
        return new VersionInfo(parseInt, parseInt2, parseInt3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (jaa.G()) {
            initializationCompleteCallback.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError y = jaa.y(101, "Missing or invalid App ID.");
            y.toString();
            initializationCompleteCallback.onInitializationFailed(y.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str);
            }
            this.a.a(context, str, new v7e(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (jaa.G()) {
            mediationAdLoadCallback.onFailure(jaa.z());
            return;
        }
        q7e q7eVar = this.c;
        q7eVar.getClass();
        s7e s7eVar = this.a;
        m7e m7eVar = new m7e(mediationAdLoadCallback, s7eVar, this.b, q7eVar);
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            s7eVar.a(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new l7e(m7eVar, mediationAppOpenAdConfiguration.getBidResponse(), mediationAppOpenAdConfiguration, string, 0));
        } else {
            AdError y = jaa.y(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            y.toString();
            mediationAdLoadCallback.onFailure(y);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (jaa.G()) {
            mediationAdLoadCallback.onFailure(jaa.z());
            return;
        }
        q7e q7eVar = this.c;
        q7eVar.getClass();
        s7e s7eVar = this.a;
        p7e p7eVar = new p7e(mediationAdLoadCallback, s7eVar, this.b, q7eVar);
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError y = jaa.y(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            y.toString();
            mediationAdLoadCallback.onFailure(y);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            s7eVar.a(context, serverParameters.getString("appid"), new o7e(p7eVar, mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (jaa.G()) {
            mediationAdLoadCallback.onFailure(jaa.z());
            return;
        }
        q7e q7eVar = this.c;
        q7eVar.getClass();
        s7e s7eVar = this.a;
        u7e u7eVar = new u7e(mediationAdLoadCallback, s7eVar, this.b, q7eVar);
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            s7eVar.a(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new l7e(u7eVar, mediationInterstitialAdConfiguration.getBidResponse(), mediationInterstitialAdConfiguration, string, 1));
        } else {
            AdError y = jaa.y(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            y.toString();
            mediationAdLoadCallback.onFailure(y);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (jaa.G()) {
            mediationAdLoadCallback.onFailure(jaa.z());
            return;
        }
        q7e q7eVar = this.c;
        q7eVar.getClass();
        y7e y7eVar = new y7e(mediationAdLoadCallback, this.a, this.b, q7eVar);
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError y = jaa.y(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            y.toString();
            y7eVar.s.onFailure(y);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            y7eVar.t.a(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new l7e(y7eVar, bidResponse, mediationNativeAdConfiguration, string, 2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (jaa.G()) {
            mediationAdLoadCallback.onFailure(jaa.z());
            return;
        }
        q7e q7eVar = this.c;
        q7eVar.getClass();
        s7e s7eVar = this.a;
        a8e a8eVar = new a8e(mediationAdLoadCallback, s7eVar, this.b, q7eVar);
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (!TextUtils.isEmpty(string)) {
            s7eVar.a(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new l7e(a8eVar, mediationRewardedAdConfiguration.getBidResponse(), mediationRewardedAdConfiguration, string, 3));
        } else {
            AdError y = jaa.y(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            y.toString();
            mediationAdLoadCallback.onFailure(y);
        }
    }
}
