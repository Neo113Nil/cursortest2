package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;
import xsna.drm0;
import xsna.spj;
import xsna.yvj;

/* compiled from: AndroidWebViewLessLoadStrategy.kt */
/* loaded from: classes14.dex */
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {
    private final AdRefresh adRefresh;
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final CampaignRepository campaignRepository;
    private final SessionRepository sessionRepository;

    public AndroidWebViewLessLoadStrategy(AdRepository adRepository, CampaignRepository campaignRepository, CacheAssets cacheAssets, AdRefresh adRefresh, SessionRepository sessionRepository) {
        this.adRepository = adRepository;
        this.campaignRepository = campaignRepository;
        this.cacheAssets = cacheAssets;
        this.adRefresh = adRefresh;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(yvj yvjVar, String str, UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, spj<? super LoadResult> spjVar) {
        AndroidWebViewLessLoadStrategy$invoke$1 androidWebViewLessLoadStrategy$invoke$1;
        int i;
        String str3;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z2;
        AdObject adObject;
        ByteString byteString2;
        CacheAssetsEvent cacheAssetsEvent;
        String str4;
        boolean z3;
        AdObject adObject2;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        ByteString byteString3;
        String str5;
        String objectId;
        JSONObject data;
        if (spjVar instanceof AndroidWebViewLessLoadStrategy$invoke$1) {
            androidWebViewLessLoadStrategy$invoke$1 = (AndroidWebViewLessLoadStrategy$invoke$1) spjVar;
            int i2 = androidWebViewLessLoadStrategy$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewLessLoadStrategy$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewLessLoadStrategy$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidWebViewLessLoadStrategy$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    str3 = str2;
                    AdObject adObject3 = new AdObject(yvjVar, byteString, str3, adResponse.getTrackingToken(), false, null, null, null, unityAdsLoadOptions, z, diagnosticAdType, null, null, null, null, null, new AdObject.WebViewLessLoadingRequiredData(str, adResponse, null, 4, null), 63728, null);
                    CacheAssets cacheAssets = this.cacheAssets;
                    List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adResponse.getCampaignMetadata().getAssetsToCacheList();
                    unityAdsLoadOptions2 = unityAdsLoadOptions;
                    androidWebViewLessLoadStrategy$invoke$1.L$0 = unityAdsLoadOptions2;
                    androidWebViewLessLoadStrategy$invoke$1.L$1 = byteString;
                    androidWebViewLessLoadStrategy$invoke$1.L$2 = str3;
                    androidWebViewLessLoadStrategy$invoke$1.L$3 = adObject3;
                    androidWebViewLessLoadStrategy$invoke$1.Z$0 = z;
                    androidWebViewLessLoadStrategy$invoke$1.label = 1;
                    obj = cacheAssets.invoke(adObject3, assetsToCacheList, androidWebViewLessLoadStrategy$invoke$1);
                    if (obj != coroutineSingletons) {
                        z2 = z;
                        adObject = adObject3;
                        byteString2 = byteString;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = androidWebViewLessLoadStrategy$invoke$1.Z$0;
                    adObject2 = (AdObject) androidWebViewLessLoadStrategy$invoke$1.L$3;
                    str5 = (String) androidWebViewLessLoadStrategy$invoke$1.L$2;
                    byteString3 = (ByteString) androidWebViewLessLoadStrategy$invoke$1.L$1;
                    unityAdsLoadOptions3 = (UnityAdsLoadOptions) androidWebViewLessLoadStrategy$invoke$1.L$0;
                    a.a(obj);
                    objectId = unityAdsLoadOptions3.getObjectId();
                    if ((objectId != null || drm0.N(objectId)) && (data = unityAdsLoadOptions3.getData()) != null && !data.has("adMarkup")) {
                        this.adRepository.enqueueOpportunityForPlacement(str5, byteString3);
                    }
                    if (z3) {
                        this.sessionRepository.incrementTokenWinsCount();
                    }
                    return new LoadResult.Success(adObject2);
                }
                z2 = androidWebViewLessLoadStrategy$invoke$1.Z$0;
                adObject = (AdObject) androidWebViewLessLoadStrategy$invoke$1.L$3;
                String str6 = (String) androidWebViewLessLoadStrategy$invoke$1.L$2;
                byteString2 = (ByteString) androidWebViewLessLoadStrategy$invoke$1.L$1;
                UnityAdsLoadOptions unityAdsLoadOptions4 = (UnityAdsLoadOptions) androidWebViewLessLoadStrategy$invoke$1.L$0;
                a.a(obj);
                str3 = str6;
                unityAdsLoadOptions2 = unityAdsLoadOptions4;
                cacheAssetsEvent = (CacheAssetsEvent) obj;
                if (cacheAssetsEvent instanceof CacheAssetsEvent.Success) {
                    ErrorOuterClass.PublicErrorCode publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM;
                    CacheAssetsEvent.Failure failure = cacheAssetsEvent instanceof CacheAssetsEvent.Failure ? (CacheAssetsEvent.Failure) cacheAssetsEvent : null;
                    if (failure == null || (str4 = failure.getMessage()) == null) {
                        str4 = "";
                    }
                    return new LoadResult.Failure(publicErrorCode, null, null, str4, null, null, 54, null);
                }
                this.campaignRepository.setLoadTimestamp(byteString2);
                this.adRepository.addAd(byteString2, adObject);
                AdRefresh adRefresh = this.adRefresh;
                androidWebViewLessLoadStrategy$invoke$1.L$0 = unityAdsLoadOptions2;
                androidWebViewLessLoadStrategy$invoke$1.L$1 = byteString2;
                androidWebViewLessLoadStrategy$invoke$1.L$2 = str3;
                androidWebViewLessLoadStrategy$invoke$1.L$3 = adObject;
                androidWebViewLessLoadStrategy$invoke$1.Z$0 = z2;
                androidWebViewLessLoadStrategy$invoke$1.label = 2;
                if (adRefresh.invoke(adObject, androidWebViewLessLoadStrategy$invoke$1) != coroutineSingletons) {
                    z3 = z2;
                    adObject2 = adObject;
                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                    byteString3 = byteString2;
                    str5 = str3;
                    objectId = unityAdsLoadOptions3.getObjectId();
                    if (objectId != null) {
                    }
                    this.adRepository.enqueueOpportunityForPlacement(str5, byteString3);
                    if (z3) {
                    }
                    return new LoadResult.Success(adObject2);
                }
                return coroutineSingletons;
            }
        }
        androidWebViewLessLoadStrategy$invoke$1 = new AndroidWebViewLessLoadStrategy$invoke$1(this, spjVar);
        Object obj2 = androidWebViewLessLoadStrategy$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewLessLoadStrategy$invoke$1.label;
        if (i != 0) {
        }
        cacheAssetsEvent = (CacheAssetsEvent) obj2;
        if (cacheAssetsEvent instanceof CacheAssetsEvent.Success) {
        }
    }
}
