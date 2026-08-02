package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
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
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleMediationLogger;
import defpackage.azk;
import defpackage.by9;
import defpackage.bzk;
import defpackage.czk;
import defpackage.myk;
import defpackage.oyk;
import defpackage.qyk;
import defpackage.ryk;
import defpackage.syk;
import defpackage.tyk;
import defpackage.uyk;
import defpackage.xyk;
import defpackage.zyk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, RewardedAdListener {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private AdConfig adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private RewardedAd rewardedAd;
    private syk rtbAppOpenAd;
    private tyk rtbBannerAd;
    private uyk rtbInterstitialAd;
    private xyk rtbNativeAd;
    private zyk rtbRewardedAd;
    private zyk rtbRewardedInterstitialAd;
    private String userId;
    private final myk vungleFactory = new myk();
    private azk waterfallAppOpenAd;
    private czk waterfallInterstitialAd;

    public static boolean g(VersionInfo versionInfo, VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() > versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() != versionInfo2.getMajorVersion()) {
            return false;
        }
        if (versionInfo.getMinorVersion() > versionInfo2.getMinorVersion()) {
            return true;
        }
        return versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() >= versionInfo2.getMicroVersion();
    }

    @NonNull
    public static AdError getAdError(@NonNull VungleError vungleError) {
        return new AdError(vungleError.getCode(), vungleError.getErrorMessage(), "com.vungle.ads");
    }

    public static String getAdapterVersion() {
        return "7.7.4.2";
    }

    public static boolean runtimeGmaSdkListensToAdapterReportedImpressions() {
        VersionInfo version = MobileAds.getVersion();
        VersionInfo versionInfo = new VersionInfo(6, 5, 0);
        if ((version.getMajorVersion() >= versionInfo.getMajorVersion() && (version.getMajorVersion() != versionInfo.getMajorVersion() || (version.getMinorVersion() >= versionInfo.getMinorVersion() && (version.getMinorVersion() != versionInfo.getMinorVersion() || version.getMicroVersion() >= versionInfo.getMicroVersion())))) || !g(version, new VersionInfo(0, 18, 0))) {
            return g(version, new VersionInfo(24, 4, 0));
        }
        return true;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Context context = rtbSignalData.getContext();
        by9 by9Var = new by9(signalCallbacks);
        context.getClass();
        VungleAds.INSTANCE.getBiddingToken(context, by9Var);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = VungleAds.INSTANCE.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(sdkVersion);
        sb.append(". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String adapterVersion = getAdapterVersion();
        String[] split = adapterVersion.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        StringBuilder sb = new StringBuilder("Unexpected adapter version format: ");
        sb.append(adapterVersion);
        sb.append(". Returning 0.0.0 for adapter version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (VungleAds.INSTANCE.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
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
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                VungleMediationLogger.logError(null, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str));
            }
            oyk.c.a(str, context, new qyk(initializationCompleteCallback));
            return;
        }
        if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            adError.toString();
            initializationCompleteCallback.onInitializationFailed(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        myk mykVar = this.vungleFactory;
        mediationAdLoadCallback.getClass();
        mykVar.getClass();
        azk azkVar = new azk(mediationAdLoadCallback, mykVar);
        this.waterfallAppOpenAd = azkVar;
        azkVar.c(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        myk mykVar = this.vungleFactory;
        mediationAdLoadCallback.getClass();
        mykVar.getClass();
        new bzk(mediationAdLoadCallback, mykVar).b(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        myk mykVar = this.vungleFactory;
        mediationAdLoadCallback.getClass();
        mykVar.getClass();
        czk czkVar = new czk(mediationAdLoadCallback, mykVar);
        this.waterfallInterstitialAd = czkVar;
        czkVar.c(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        xyk xykVar = new xyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = xykVar;
        xykVar.a(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.vungleFactory.getClass();
        this.adConfig = new AdConfig();
        if (mediationExtras != null && mediationExtras.containsKey("adOrientation")) {
            this.adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        Context context = mediationRewardedAdConfiguration.getContext();
        oykVar.a(string, context, new ryk(this, context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        myk mykVar = this.vungleFactory;
        mediationAdLoadCallback.getClass();
        mykVar.getClass();
        syk sykVar = new syk(mediationAdLoadCallback, mykVar);
        this.rtbAppOpenAd = sykVar;
        sykVar.c(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        tyk tykVar = new tyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = tykVar;
        tykVar.b(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        uyk uykVar = new uyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbInterstitialAd = uykVar;
        uykVar.c(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        xyk xykVar = new xyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = xykVar;
        xykVar.a(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        zyk zykVar = new zyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = zykVar;
        zykVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        oyk oykVar = oyk.c;
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        oykVar.getClass();
        oyk.b(requestConfiguration);
        zyk zykVar = new zyk(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = zykVar;
        zykVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            adError.toString();
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
    }
}
