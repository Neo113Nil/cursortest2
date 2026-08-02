package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
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
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.bf3;
import defpackage.iic;
import defpackage.im6;
import defpackage.jm6;
import defpackage.k03;
import defpackage.km6;
import defpackage.lm6;
import defpackage.mm6;
import defpackage.n9e;
import defpackage.nm6;
import defpackage.pm6;
import defpackage.qm6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";
    public final k03 a = new k03();

    @NonNull
    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    @Nullable
    public static String getPlacementId(@NonNull Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(@NonNull MediationAdConfiguration mediationAdConfiguration) {
        boolean z = n9e.I() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1 || mediationAdConfiguration.taggedForUnderAgeTreatment() == 1 || z) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0 || mediationAdConfiguration.taggedForUnderAgeTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] split = "6.21.0".split("\\.");
        return split.length >= 3 ? new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])) : new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "6.21.0.4".split("\\.");
        if (split.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementId = getPlacementId(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementId)) {
                arrayList.add(placementId);
            }
        }
        im6 im6Var = im6.d;
        if (im6Var == null) {
            im6Var = new im6();
            im6.d = im6Var;
        }
        im6 im6Var2 = im6Var;
        jm6 jm6Var = new jm6(initializationCompleteCallback);
        if (im6Var.a) {
            im6Var.c.add(jm6Var);
            return;
        }
        if (im6Var.b) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        im6Var.a = true;
        if (im6Var2 == null) {
            im6Var2 = new im6();
            im6.d = im6Var2;
        }
        im6Var2.c.add(jm6Var);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.4").withPlacementIds(arrayList).withInitListener(im6Var).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        InterstitialAd.InterstitialAdLoadConfigBuilder withBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener;
        InterstitialAd interstitialAd;
        iic iicVar = new iic(mediationAdLoadCallback, this.a);
        mediationAppOpenAdConfiguration.getClass();
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String placementId = getPlacementId(serverParameters);
        if (TextUtils.isEmpty(placementId)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationAppOpenAdConfiguration);
        iicVar.b = new InterstitialAd(mediationAppOpenAdConfiguration.getContext(), placementId);
        if (!TextUtils.isEmpty(mediationAppOpenAdConfiguration.getWatermark()) && (interstitialAd = iicVar.b) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(mediationAppOpenAdConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd2 = iicVar.b;
        if (interstitialAd2 != null) {
            InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd2.buildLoadAdConfig();
            interstitialAd2.loadAd((buildLoadAdConfig == null || (withBid = buildLoadAdConfig.withBid(mediationAppOpenAdConfiguration.getBidResponse())) == null || (withAdListener = withBid.withAdListener(iicVar)) == null) ? null : withAdListener.build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        k03 k03Var = this.a;
        mm6 mm6Var = new mm6(mediationAdLoadCallback, k03Var);
        String placementId = getPlacementId(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementId)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationBannerAdConfiguration);
        try {
            Context context = mediationBannerAdConfiguration.getContext();
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            k03Var.getClass();
            mm6Var.b = new AdView(context, placementId, bidResponse);
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                mm6Var.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context2 = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context2), -2);
            mm6Var.c = new FrameLayout(context2);
            mm6Var.b.setLayoutParams(layoutParams);
            mm6Var.c.addView(mm6Var.b);
            AdView adView = mm6Var.b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(mm6Var).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(111, bf3.j(e, new StringBuilder("Failed to create banner ad: ")), ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        nm6 nm6Var = new nm6(mediationAdLoadCallback, this.a);
        String placementId = getPlacementId(mediationInterstitialAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementId)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            adError.getMessage();
            nm6Var.a.onFailure(adError);
            return;
        }
        setMixedAudience(mediationInterstitialAdConfiguration);
        Context context = mediationInterstitialAdConfiguration.getContext();
        nm6Var.f.getClass();
        nm6Var.b = new InterstitialAd(context, placementId);
        if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration.getWatermark())) {
            nm6Var.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd = nm6Var.b;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration.getBidResponse()).withAdListener(nm6Var).build());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        qm6 qm6Var = new qm6(mediationAdLoadCallback, this.a);
        String placementId = getPlacementId(mediationNativeAdConfiguration.getServerParameters());
        boolean isEmpty = TextUtils.isEmpty(placementId);
        MediationAdLoadCallback mediationAdLoadCallback2 = qm6Var.q;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback2.onFailure(adError);
            return;
        }
        setMixedAudience(mediationNativeAdConfiguration);
        Context context = mediationNativeAdConfiguration.getContext();
        qm6Var.u.getClass();
        qm6Var.t = new MediaView(context);
        try {
            qm6Var.r = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementId, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                qm6Var.r.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = qm6Var.r;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new pm6(qm6Var, mediationNativeAdConfiguration.getContext(), qm6Var.r)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, bf3.j(e, new StringBuilder("Failed to create native ad from bid payload: ")), ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new km6(mediationAdLoadCallback, this.a).b(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new lm6(mediationAdLoadCallback, this.a).b(mediationRewardedAdConfiguration);
    }
}
