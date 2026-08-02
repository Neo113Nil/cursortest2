package com.google.ads.mediation.moloco;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
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
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import defpackage.duf;
import defpackage.huc;
import defpackage.iuc;
import defpackage.juc;
import defpackage.km5;
import defpackage.kuc;
import defpackage.luc;
import defpackage.nuc;
import defpackage.p2g;
import defpackage.quc;
import defpackage.suc;
import defpackage.tuc;
import defpackage.u2g;
import defpackage.uuc;
import defpackage.w2g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001aH\u0016¢\u0006\u0004\b#\u0010$J+\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u001aH\u0016¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0\u001aH\u0016¢\u0006\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoMediationAdapter;", "Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;", "<init>", "()V", "Lcom/google/android/gms/ads/VersionInfo;", "getSDKVersionInfo", "()Lcom/google/android/gms/ads/VersionInfo;", "getVersionInfo", "Landroid/content/Context;", "context", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "initializationCompleteCallback", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "mediationConfigurations", "", "initialize", "(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;Ljava/util/List;)V", "Lcom/google/android/gms/ads/mediation/rtb/RtbSignalData;", "signalData", "Lcom/google/android/gms/ads/mediation/rtb/SignalCallbacks;", "callback", "collectSignals", "(Lcom/google/android/gms/ads/mediation/rtb/RtbSignalData;Lcom/google/android/gms/ads/mediation/rtb/SignalCallbacks;)V", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "loadRtbBannerAd", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "mediationInterstitialAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadRtbInterstitialAd", "(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRtbRewardedAd", "(Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "loadRtbNativeAdMapper", "(Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Companion", "nuc", "moloco_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MolocoMediationAdapter extends RtbAdapter {

    @NotNull
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.moloco";

    @NotNull
    public static final nuc Companion = new nuc();
    public static final int ERROR_CODE_AD_IS_NULL = 103;
    public static final int ERROR_CODE_MISSING_AD_UNIT = 102;
    public static final int ERROR_CODE_MISSING_APP_KEY = 101;

    @NotNull
    public static final String ERROR_MSG_AD_IS_NULL = "Moloco ad object returned was null.";

    @NotNull
    public static final String ERROR_MSG_MISSING_AD_UNIT = "Missing or invalid Ad Unit configured for this ad source instance in the AdMob or Ad Manager UI.";

    @NotNull
    public static final String ERROR_MSG_MISSING_APP_KEY = "Missing or invalid App Key configured for this ad source instance in the AdMob or Ad Manager UI.";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NotNull
    public static final String KEY_APP_KEY = "app_key";

    @NotNull
    public static final String MEDIATION_PLATFORM_NAME = "AdMob";

    @NotNull
    public static final String SDK_ERROR_DOMAIN = "com.moloco.sdk";

    static {
        duf.a.getOrCreateKotlinClass(MolocoMediationAdapter.class).getSimpleName();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NotNull RtbSignalData signalData, @NotNull SignalCallbacks callback) {
        signalData.getClass();
        callback.getClass();
        MediationInfo mediationInfo = new MediationInfo(MEDIATION_PLATFORM_NAME);
        Context context = signalData.getContext();
        context.getClass();
        Moloco.getBidToken(mediationInfo, context, new luc(callback, 0));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NotNull
    public VersionInfo getSDKVersionInfo() {
        return new VersionInfo(4, 10, 1);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NotNull
    public VersionInfo getVersionInfo() {
        Collection collection;
        List h = new Regex("\\.").h("4.10.1.0");
        if (!h.isEmpty()) {
            ListIterator listIterator = h.listIterator(h.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = km5.a;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        if (strArr.length < 4) {
            String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", Arrays.copyOf(new Object[]{"4.10.1.0"}, 1));
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[3]) + (Integer.parseInt(strArr[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NotNull Context context, @NotNull final InitializationCompleteCallback initializationCompleteCallback, @NotNull List<? extends MediationConfiguration> mediationConfigurations) {
        context.getClass();
        initializationCompleteCallback.getClass();
        mediationConfigurations.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mediationConfigurations.iterator();
        while (it.hasNext()) {
            String string = ((MediationConfiguration) it.next()).getServerParameters().getString("app_key");
            if (string == null || string.length() == 0) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed(ERROR_MSG_MISSING_APP_KEY);
            return;
        }
        String str = (String) arrayList.get(0);
        if (arrayList.size() > 1) {
            arrayList.toString();
        }
        MediationInfo mediationInfo = new MediationInfo(MEDIATION_PLATFORM_NAME);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Moloco.initialize(new MolocoInitParams(applicationContext, str, mediationInfo), new MolocoInitializationListener(this) { // from class: muc
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                nuc nucVar = MolocoMediationAdapter.Companion;
                molocoInitStatus.getClass();
                Initialization initialization = molocoInitStatus.getInitialization();
                Initialization initialization2 = Initialization.SUCCESS;
                InitializationCompleteCallback initializationCompleteCallback2 = initializationCompleteCallback;
                if (initialization == initialization2) {
                    boolean z = MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1 || MobileAds.getRequestConfiguration().getTagForUnderAgeOfConsent() == 1 || (n9e.I() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD);
                    MolocoPrivacy molocoPrivacy = MolocoPrivacy.INSTANCE;
                    MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(molocoPrivacy.getPrivacySettings().getIsUserConsent(), Boolean.valueOf(z), molocoPrivacy.getPrivacySettings().getIsDoNotSell()));
                    initializationCompleteCallback2.onInitializationSucceeded();
                    return;
                }
                initializationCompleteCallback2.onInitializationFailed("Moloco SDK failed to initialize: " + molocoInitStatus.getDescription() + ".");
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NotNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NotNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback) {
        Object u2gVar;
        mediationBannerAdConfiguration.getClass();
        callback.getClass();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        serverParameters.getClass();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        adSize.getClass();
        String string = serverParameters.getString(KEY_AD_UNIT_ID);
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(102, ERROR_MSG_MISSING_AD_UNIT, ADAPTER_ERROR_DOMAIN);
            callback.onFailure(adError);
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(new NoSuchElementException(adError.getMessage()));
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            bidResponse.getClass();
            String watermark = mediationBannerAdConfiguration.getWatermark();
            watermark.getClass();
            p2g p2gVar2 = w2g.b;
            u2gVar = new iuc(callback, adSize, string, bidResponse, watermark);
        }
        if (u2gVar instanceof u2g) {
            return;
        }
        iuc iucVar = (iuc) u2gVar;
        huc hucVar = new huc(iucVar);
        MediationInfo mediationInfo = new MediationInfo(MEDIATION_PLATFORM_NAME);
        AdSize adSize2 = AdSize.LEADERBOARD;
        AdSize adSize3 = iucVar.b;
        boolean c = Intrinsics.c(adSize3, adSize2);
        String str = iucVar.c;
        String str2 = iucVar.e;
        if (c) {
            Moloco.createBannerTablet(mediationInfo, str, str2, hucVar);
        } else if (Intrinsics.c(adSize3, AdSize.MEDIUM_RECTANGLE)) {
            Moloco.createMREC(mediationInfo, str, str2, hucVar);
        } else {
            Moloco.createBanner(mediationInfo, str, str2, hucVar);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NotNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NotNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> callback) {
        Object u2gVar;
        mediationInterstitialAdConfiguration.getClass();
        callback.getClass();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString(KEY_AD_UNIT_ID);
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(102, ERROR_MSG_MISSING_AD_UNIT, ADAPTER_ERROR_DOMAIN);
            callback.onFailure(adError);
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(new NoSuchElementException(adError.getMessage()));
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            bidResponse.getClass();
            String watermark = mediationInterstitialAdConfiguration.getWatermark();
            watermark.getClass();
            p2g p2gVar2 = w2g.b;
            u2gVar = new kuc(callback, string, bidResponse, watermark);
        }
        if (u2gVar instanceof u2g) {
            return;
        }
        kuc kucVar = (kuc) u2gVar;
        Moloco.createInterstitial(new MediationInfo(MEDIATION_PLATFORM_NAME), kucVar.b, kucVar.d, new juc(kucVar));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NotNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NotNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> callback) {
        Object u2gVar;
        mediationNativeAdConfiguration.getClass();
        callback.getClass();
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString(KEY_AD_UNIT_ID);
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(102, ERROR_MSG_MISSING_AD_UNIT, ADAPTER_ERROR_DOMAIN);
            callback.onFailure(adError);
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(new NoSuchElementException(adError.getMessage()));
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            bidResponse.getClass();
            String watermark = mediationNativeAdConfiguration.getWatermark();
            watermark.getClass();
            p2g p2gVar2 = w2g.b;
            u2gVar = new suc(callback, string, bidResponse, watermark);
        }
        if (u2gVar instanceof u2g) {
            return;
        }
        suc sucVar = (suc) u2gVar;
        Moloco.createNativeAd(new MediationInfo(MEDIATION_PLATFORM_NAME), sucVar.q, sucVar.s, new quc(sucVar));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NotNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NotNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> callback) {
        Object u2gVar;
        mediationRewardedAdConfiguration.getClass();
        callback.getClass();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString(KEY_AD_UNIT_ID);
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(102, ERROR_MSG_MISSING_AD_UNIT, ADAPTER_ERROR_DOMAIN);
            callback.onFailure(adError);
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(new NoSuchElementException(adError.getMessage()));
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            bidResponse.getClass();
            String watermark = mediationRewardedAdConfiguration.getWatermark();
            watermark.getClass();
            p2g p2gVar2 = w2g.b;
            u2gVar = new uuc(callback, string, bidResponse, watermark);
        }
        if (u2gVar instanceof u2g) {
            return;
        }
        uuc uucVar = (uuc) u2gVar;
        Moloco.createRewardedInterstitial(new MediationInfo(MEDIATION_PLATFORM_NAME), uucVar.b, uucVar.d, new tuc(uucVar));
    }
}
