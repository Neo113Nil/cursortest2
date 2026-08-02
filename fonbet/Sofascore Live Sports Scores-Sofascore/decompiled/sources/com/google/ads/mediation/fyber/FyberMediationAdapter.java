package com.google.ads.mediation.fyber;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
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
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.ac4;
import defpackage.bc4;
import defpackage.kik;
import defpackage.n9e;
import defpackage.sb4;
import defpackage.tb4;
import defpackage.tt8;
import defpackage.ub4;
import defpackage.ut8;
import defpackage.vb4;
import defpackage.vt8;
import defpackage.wb4;
import defpackage.xb4;
import defpackage.yb4;
import defpackage.zb4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class FyberMediationAdapter extends RtbAdapter {
    public static final String KEY_MUTE_VIDEO = "muteVideo";
    public static final InneractiveMediationName c = InneractiveMediationName.ADMOB;
    public vt8 a;
    public vb4 b;

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String version = InneractiveAdManager.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(version);
        sb.append(". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "8.4.5.1".split("\\.");
        if (split.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (InneractiveAdManager.wasInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            adError.getMessage();
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", "applicationId", hashSet, str);
        }
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        boolean z = n9e.I() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            InneractiveAdManager.currentAudienceAppliesToCoppa();
        }
        InneractiveAdManager.initialize(context, str, new ut8(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        zb4 zb4Var = new zb4(mediationAdLoadCallback);
        mediationBannerAdConfiguration.getClass();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("spotId");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationBannerAdConfiguration.getContext(), string, new yb4(zb4Var, mediationBannerAdConfiguration, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        bc4 bc4Var = new bc4();
        mediationInterstitialAdConfiguration.getClass();
        mediationAdLoadCallback.getClass();
        bc4Var.a = mediationAdLoadCallback;
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
        if (TextUtils.isEmpty(string)) {
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("spotId");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationInterstitialAdConfiguration.getContext(), string, new ac4(mediationAdLoadCallback, bc4Var, mediationInterstitialAdConfiguration, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new tt8(this, mediationAdLoadCallback, mediationRewardedAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        wb4 wb4Var = new wb4(mediationAdLoadCallback);
        mediationBannerAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        bidResponse.getClass();
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.getClass();
        wb4Var.b = createSpot;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = wb4Var.b;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        adSize.getClass();
        Context context = mediationBannerAdConfiguration.getContext();
        context.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        wb4Var.c = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        InneractiveAdSpot inneractiveAdSpot2 = wb4Var.b;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(wb4Var);
        inneractiveAdViewUnitController.setEventsListener(wb4Var);
        kik.h0(mediationBannerAdConfiguration.getMediationExtras());
        String watermark = mediationBannerAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot inneractiveAdSpot3 = wb4Var.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.loadAd(bidResponse, watermark);
        } else {
            Intrinsics.i("adSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        xb4 xb4Var = new xb4(mediationAdLoadCallback);
        mediationInterstitialAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        bidResponse.getClass();
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.getClass();
        xb4Var.b = createSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        InneractiveAdSpot inneractiveAdSpot = xb4Var.b;
        if (inneractiveAdSpot == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdSpot inneractiveAdSpot2 = xb4Var.b;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("adSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(xb4Var);
        inneractiveFullscreenUnitController.setEventsListener(xb4Var);
        kik.h0(mediationInterstitialAdConfiguration.getMediationExtras());
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot inneractiveAdSpot3 = xb4Var.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.loadAd(bidResponse, watermark);
        } else {
            Intrinsics.i("adSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        vb4 vb4Var = this.b;
        if (vb4Var != null) {
            vb4Var.destroy();
            this.b = null;
        }
        vb4 vb4Var2 = new vb4(mediationAdLoadCallback);
        this.b = vb4Var2;
        mediationNativeAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        bidResponse.getClass();
        String watermark = mediationNativeAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitController = new NativeAdUnitController();
        NativeAdVideoContentController nativeAdVideoContentController = new NativeAdVideoContentController();
        nativeAdVideoContentController.setEventsListener(new sb4(vb4Var2));
        nativeAdUnitController.addContentController(nativeAdVideoContentController);
        nativeAdUnitController.setEventsListener(new tb4(vb4Var2));
        createSpot.addUnitController(nativeAdUnitController);
        createSpot.setRequestListener(new ub4(vb4Var2, mediationNativeAdConfiguration));
        kik.h0(mediationNativeAdConfiguration.getMediationExtras());
        createSpot.loadAd(bidResponse, watermark);
        vb4Var2.s = createSpot;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.a = new vt8(mediationAdLoadCallback);
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        vt8 vt8Var = this.a;
        vt8Var.getClass();
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        vt8Var.a(mediationRewardedAdConfiguration);
        vt8Var.c.loadAd(bidResponse, mediationRewardedAdConfiguration.getWatermark());
    }
}
