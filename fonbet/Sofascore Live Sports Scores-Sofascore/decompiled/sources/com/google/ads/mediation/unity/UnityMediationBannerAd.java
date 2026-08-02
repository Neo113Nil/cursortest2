package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import defpackage.dbk;
import defpackage.fbk;
import defpackage.hbk;
import defpackage.ibk;
import defpackage.iec;
import defpackage.jbk;
import defpackage.nbk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes2.dex */
public class UnityMediationBannerAd implements MediationBannerAd, BannerView.IListener {
    static final String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    static final String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private String bannerPlacementId;
    private String gameId;

    @Nullable
    private MediationBannerAdCallback mediationBannerAdCallback;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationBannerAdLoadCallback;
    private final fbk unityAdsLoader;
    private final hbk unityBannerViewFactory;

    @Nullable
    private ibk unityBannerViewWrapper;
    private final jbk unityInitializer;

    public UnityMediationBannerAd(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull jbk jbkVar, @NonNull hbk hbkVar, @NonNull fbk fbkVar) {
        this.mediationBannerAdLoadCallback = mediationAdLoadCallback;
        this.unityBannerViewFactory = hbkVar;
        this.unityInitializer = jbkVar;
        this.unityAdsLoader = fbkVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.unityBannerViewWrapper.a;
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, iec iecVar) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        this.gameId = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string = serverParameters.getString("zoneId");
        this.bannerPlacementId = string;
        if (TextUtils.isEmpty(this.gameId) || TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            adError.toString();
            this.mediationBannerAdLoadCallback.onFailure(adError);
            return;
        }
        if (!(context instanceof Activity)) {
            AdError adError2 = new AdError(105, "Unity Ads requires an Activity context to load ads.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            adError2.toString();
            this.mediationBannerAdLoadCallback.onFailure(adError2);
            return;
        }
        Activity activity = (Activity) context;
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        boolean isEmpty = TextUtils.isEmpty(bidResponse);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        iecVar.getClass();
        adSize.getClass();
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        UnityBannerSize unityBannerSize = findClosestSize != null ? new UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight()) : !isEmpty ? new UnityBannerSize(adSize.getWidth(), adSize.getHeight()) : null;
        if (unityBannerSize != null) {
            this.unityInitializer.a(context, this.gameId, new nbk(this, activity, activity, unityBannerSize, mediationBannerAdConfiguration, bidResponse));
            return;
        }
        AdError adError3 = new AdError(110, ERROR_MSG_NO_MATCHING_AD_SIZE + adSize, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
        adError3.toString();
        this.mediationBannerAdLoadCallback.onFailure(adError3);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad was clicked for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        int i = dbk.a[bannerErrorInfo.errorCode.ordinal()];
        AdError adError = new AdError(i != 1 ? i != 2 ? i != 3 ? i != 4 ? 200 : 204 : 203 : 202 : 201, bannerErrorInfo.errorMessage, "com.unity3d.ads");
        adError.toString();
        this.mediationBannerAdLoadCallback.onFailure(adError);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad left application for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        new StringBuilder("Unity Ads finished loading banner ad for placement ID: ").append(bannerView.getPlacementId());
        this.mediationBannerAdCallback = this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad was shown for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
