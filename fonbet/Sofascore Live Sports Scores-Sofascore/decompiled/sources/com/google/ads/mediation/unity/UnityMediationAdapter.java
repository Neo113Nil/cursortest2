package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import defpackage.fbk;
import defpackage.gbk;
import defpackage.hbk;
import defpackage.iec;
import defpackage.jbk;
import defpackage.lbk;
import defpackage.luc;
import defpackage.mbk;
import defpackage.rbk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UnityMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    static final int ERROR_AD_NOT_READY = 106;
    static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    static final int ERROR_FINISH = 109;
    static final int ERROR_INITIALIZATION_FAILURE = 111;
    static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    static final String ERROR_MSG_CONTEXT_NULL = "Activity context is null.";
    static final String ERROR_MSG_INITIALIZATION_FAILURE = "Unity Ads initialization failed: [%s] %s";
    static final String ERROR_MSG_MISSING_PARAMETERS = "Missing or invalid server parameters.";
    static final String ERROR_MSG_NON_ACTIVITY = "Unity Ads requires an Activity context to load ads.";
    static final int ERROR_NULL_CONTEXT = 104;
    static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    static final String KEY_GAME_ID = "gameId";
    static final String KEY_PLACEMENT_ID = "zoneId";
    static final String KEY_WATERMARK = "watermark";
    public static final String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    static final String TAG = "UnityMediationAdapter";
    private UnityMediationBannerAd bannerAd;
    private UnityMediationBannerAd bannerRtbAd;
    private lbk interstitialAd;
    private lbk interstitialRtbAd;
    private iec mediationUtils;
    private rbk rewardedAd;
    private rbk rewardedRtbAd;
    private final fbk unityAdsLoader;
    private final gbk unityAdsWrapper;
    private final hbk unityBannerViewFactory;
    private final jbk unityInitializer;

    public UnityMediationAdapter() {
        jbk jbkVar;
        synchronized (jbk.class) {
            jbkVar = jbk.a;
            if (jbkVar == null) {
                jbkVar = new jbk();
                jbk.a = jbkVar;
            }
        }
        this.unityInitializer = jbkVar;
        this.unityAdsWrapper = new gbk();
        this.unityBannerViewFactory = new hbk();
        this.unityAdsLoader = new fbk();
        this.mediationUtils = new iec();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Iterator<MediationConfiguration> it = rtbSignalData.getConfigurations().iterator();
        AdFormat adFormat = null;
        com.google.android.gms.ads.AdFormat format = it.hasNext() ? it.next().getFormat() : null;
        com.google.android.gms.ads.AdFormat adFormat2 = com.google.android.gms.ads.AdFormat.BANNER;
        if (format == adFormat2 && !(rtbSignalData.getContext() instanceof Activity)) {
            signalCallbacks.onFailure(new AdError(105, "Unity Ads RTB Banner ads require activity context", ADAPTER_ERROR_DOMAIN));
            return;
        }
        if (format == adFormat2) {
            adFormat = AdFormat.BANNER;
        } else if (format == com.google.android.gms.ads.AdFormat.REWARDED || format == com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL) {
            adFormat = AdFormat.REWARDED;
        } else if (format == com.google.android.gms.ads.AdFormat.INTERSTITIAL) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            Objects.toString(format);
        }
        if (adFormat == null) {
            gbk gbkVar = this.unityAdsWrapper;
            luc lucVar = new luc(signalCallbacks, 2);
            gbkVar.getClass();
            UnityAds.getToken(lucVar);
            return;
        }
        TokenConfiguration tokenConfiguration = new TokenConfiguration(adFormat);
        gbk gbkVar2 = this.unityAdsWrapper;
        luc lucVar2 = new luc(signalCallbacks, 1);
        gbkVar2.getClass();
        UnityAds.getToken(tokenConfiguration, lucVar2);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String version = UnityAds.getVersion();
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
        String[] split = "4.19.0.0".split("\\.");
        if (split.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        String str;
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("gameId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", "gameId", hashSet, str);
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid Game ID.", ADAPTER_ERROR_DOMAIN).toString());
        } else {
            this.unityInitializer.a(context, str, new mbk(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        lbk lbkVar = new lbk(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialAd = lbkVar;
        lbkVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        rbk rbkVar = new rbk(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedAd = rbkVar;
        rbkVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerRtbAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public final void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        lbk lbkVar = new lbk(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialRtbAd = lbkVar;
        lbkVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        rbk rbkVar = new rbk(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedRtbAd = rbkVar;
        rbkVar.a(mediationRewardedAdConfiguration);
    }
}
