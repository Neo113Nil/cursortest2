package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MediationUtils;
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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import defpackage.bf3;
import defpackage.de0;
import defpackage.dmi;
import defpackage.kba;
import defpackage.kpg;
import defpackage.mba;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.oba;
import defpackage.qba;
import defpackage.rba;
import defpackage.sba;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class IronSourceMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public final kpg a = new kpg(27);

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = IronSourceAds.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length < 3) {
            StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
            sb.append(sdkVersion);
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
        String[] split = "9.5.0.0".split("\\.");
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
        if (b.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        if (size > 1) {
            String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str);
        }
        IronSource.setMediationType(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME + "9.5.0.0".replace(".", "") + "SDK" + MobileAds.getVersion().toString().replace(".", "") + "iAds511");
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        boolean z = n9e.I() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            LevelPlay.setMetaData(a.b, "true");
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            LevelPlay.setMetaData(a.b, "false");
        }
        IronSourceAds.init(context, new InitRequest.Builder(str).withLegacyAdFormats(new ArrayList(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED))).build(), new de0(initializationCompleteCallback, 26));
        IronSource.setISDemandOnlyInterstitialListener(mba.e);
        IronSource.setISDemandOnlyRewardedVideoListener(oba.e);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        kba kbaVar = new kba(mediationAdLoadCallback);
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context = mediationBannerAdConfiguration.getContext();
        AdError M = nq8.M(context, string);
        if (M != null) {
            M.toString();
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(M);
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = kba.f;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(string);
        if (weakReference != null && weakReference.get() != null) {
            AdError adError2 = new AdError(103, dmi.q("An IronSource banner is already loaded for instance ID: ", string), ADAPTER_ERROR_DOMAIN);
            adError2.toString();
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
                return;
            }
            return;
        }
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.LARGE_BANNER;
        arrayList.add(adSize4);
        this.a.getClass();
        context.getClass();
        adSize.getClass();
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        ISBannerSize iSBannerSize = findClosestSize == null ? null : adSize2.equals(findClosestSize) ? ISBannerSize.BANNER : adSize3.equals(findClosestSize) ? ISBannerSize.RECTANGLE : adSize4.equals(findClosestSize) ? ISBannerSize.LARGE : new ISBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        kbaVar.e = iSBannerSize;
        if (iSBannerSize == null) {
            AdError adError3 = new AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + adSize, ADAPTER_ERROR_DOMAIN);
            adError3.toString();
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError3);
                return;
            }
            return;
        }
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context2 = mediationBannerAdConfiguration.getContext();
        Activity activity = (Activity) context2;
        concurrentHashMap.put(string2, new WeakReference(kbaVar));
        kbaVar.c = new FrameLayout(context2);
        ISDemandOnlyBannerLayout createBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, kbaVar.e);
        kbaVar.d = createBannerForDemandOnly;
        createBannerForDemandOnly.setBannerDemandOnlyListener(kba.g);
        IronSource.loadISDemandOnlyBanner(activity, kbaVar.d, string2);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        mba mbaVar = new mba(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        Context context = mediationInterstitialAdConfiguration.getContext();
        String str = mbaVar.c;
        AdError M = nq8.M(context, str);
        MediationAdLoadCallback mediationAdLoadCallback2 = mbaVar.b;
        if (M != null) {
            M.toString();
            if (mediationAdLoadCallback2 != null) {
                mediationAdLoadCallback2.onFailure(M);
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = mba.d;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        if (weakReference == null || weakReference.get() == null) {
            concurrentHashMap.put(str, new WeakReference(mbaVar));
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), str);
            return;
        }
        AdError adError2 = new AdError(103, dmi.q("An IronSource interstitial ad is already loading for instance ID: ", str), ADAPTER_ERROR_DOMAIN);
        adError2.toString();
        if (mediationAdLoadCallback2 != null) {
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", ADAPTER_ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        oba obaVar = new oba(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        Context context = mediationRewardedAdConfiguration.getContext();
        String str = obaVar.c;
        AdError M = nq8.M(context, str);
        MediationAdLoadCallback mediationAdLoadCallback2 = obaVar.b;
        if (M != null) {
            M.toString();
            mediationAdLoadCallback2.onFailure(M);
            return;
        }
        ConcurrentHashMap concurrentHashMap = oba.d;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        if (weakReference == null || weakReference.get() == null) {
            concurrentHashMap.put(str, new WeakReference(obaVar));
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), str);
        } else {
            AdError adError2 = new AdError(103, dmi.q("An IronSource Rewarded ad is already loading for instance ID: ", str), ADAPTER_ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        qba qbaVar = new qba(mediationAdLoadCallback);
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(nq8.u(101, "Missing or invalid instance ID."));
            return;
        }
        Bundle f = bf3.f("google_watermark", mediationBannerAdConfiguration.getWatermark());
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdSize adSize2 = AdSize.BANNER;
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        AdSize adSize4 = AdSize.LARGE_BANNER;
        AdSize adSize5 = AdSize.LEADERBOARD;
        ArrayList arrayList = new ArrayList(Arrays.asList(adSize2, adSize3, adSize4, adSize5));
        this.a.getClass();
        context.getClass();
        adSize.getClass();
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        BannerAdRequest build = new BannerAdRequest.Builder(context, string, bidResponse, findClosestSize == null ? com.unity3d.ironsourceads.AdSize.banner() : adSize2.equals(findClosestSize) ? com.unity3d.ironsourceads.AdSize.banner() : adSize3.equals(findClosestSize) ? com.unity3d.ironsourceads.AdSize.mediumRectangle() : adSize4.equals(findClosestSize) ? com.unity3d.ironsourceads.AdSize.large() : adSize5.equals(findClosestSize) ? com.unity3d.ironsourceads.AdSize.leaderboard() : com.unity3d.ironsourceads.AdSize.banner()).withExtraParams(f).build();
        qbaVar.c = new FrameLayout(context);
        BannerAdLoader.loadAd(build, qbaVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        rba rbaVar = new rba(mediationAdLoadCallback);
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(nq8.u(101, "Missing or invalid instance ID."));
        } else {
            InterstitialAdLoader.loadAd(new InterstitialAdRequest.Builder(string, mediationInterstitialAdConfiguration.getBidResponse()).withExtraParams(bf3.f("google_watermark", mediationInterstitialAdConfiguration.getWatermark())).build(), rbaVar);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        sba sbaVar = new sba(mediationAdLoadCallback);
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(nq8.u(101, "Missing or invalid instance ID."));
        } else {
            RewardedAdLoader.loadAd(new RewardedAdRequest.Builder(string, mediationRewardedAdConfiguration.getBidResponse()).withExtraParams(bf3.f("google_watermark", mediationRewardedAdConfiguration.getWatermark())).build(), sbaVar);
        }
    }

    public void setIsInitialized(boolean z) {
        b.set(z);
    }
}
