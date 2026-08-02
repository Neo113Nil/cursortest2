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
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096B¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/adload/AndroidWebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/domain/CacheAssets;", "cacheAssets", "Lcom/unity3d/ads/core/domain/AdRefresh;", "adRefresh", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/AdRefresh;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Lku3;", "scope", "", "webViewUrl", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/google/protobuf/ByteString;", "opportunityId", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "response", "placementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Lku3;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {

    @NotNull
    private final AdRefresh adRefresh;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheAssets cacheAssets;

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidWebViewLessLoadStrategy(@NotNull AdRepository adRepository, @NotNull CampaignRepository campaignRepository, @NotNull CacheAssets cacheAssets, @NotNull AdRefresh adRefresh, @NotNull SessionRepository sessionRepository) {
        adRepository.getClass();
        campaignRepository.getClass();
        cacheAssets.getClass();
        adRefresh.getClass();
        sessionRepository.getClass();
        this.adRepository = adRepository;
        this.campaignRepository = campaignRepository;
        this.cacheAssets = cacheAssets;
        this.adRefresh = adRefresh;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ku3 ku3Var, @NotNull String str, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull String str2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, @NotNull rq3<? super LoadResult> rq3Var) {
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
        if (rq3Var instanceof AndroidWebViewLessLoadStrategy$invoke$1) {
            androidWebViewLessLoadStrategy$invoke$1 = (AndroidWebViewLessLoadStrategy$invoke$1) rq3Var;
            int i2 = androidWebViewLessLoadStrategy$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewLessLoadStrategy$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewLessLoadStrategy$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidWebViewLessLoadStrategy$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteString trackingToken = adResponse.getTrackingToken();
                    trackingToken.getClass();
                    str3 = str2;
                    AdObject adObject3 = new AdObject(ku3Var, byteString, str3, trackingToken, false, null, null, null, unityAdsLoadOptions, z, diagnosticAdType, null, null, null, null, null, new AdObject.WebViewLessLoadingRequiredData(str, adResponse, null, 4, null), 63728, null);
                    CacheAssets cacheAssets = this.cacheAssets;
                    List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adResponse.getCampaignMetadata().getAssetsToCacheList();
                    assetsToCacheList.getClass();
                    unityAdsLoadOptions2 = unityAdsLoadOptions;
                    androidWebViewLessLoadStrategy$invoke$1.L$0 = unityAdsLoadOptions2;
                    androidWebViewLessLoadStrategy$invoke$1.L$1 = byteString;
                    androidWebViewLessLoadStrategy$invoke$1.L$2 = str3;
                    androidWebViewLessLoadStrategy$invoke$1.L$3 = adObject3;
                    androidWebViewLessLoadStrategy$invoke$1.Z$0 = z;
                    androidWebViewLessLoadStrategy$invoke$1.label = 1;
                    obj = cacheAssets.invoke(adObject3, assetsToCacheList, androidWebViewLessLoadStrategy$invoke$1);
                    if (obj != lu3Var) {
                        z2 = z;
                        adObject = adObject3;
                        byteString2 = byteString;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = androidWebViewLessLoadStrategy$invoke$1.Z$0;
                    adObject2 = (AdObject) androidWebViewLessLoadStrategy$invoke$1.L$3;
                    str5 = (String) androidWebViewLessLoadStrategy$invoke$1.L$2;
                    byteString3 = (ByteString) androidWebViewLessLoadStrategy$invoke$1.L$1;
                    unityAdsLoadOptions3 = (UnityAdsLoadOptions) androidWebViewLessLoadStrategy$invoke$1.L$0;
                    y6a.M(obj);
                    objectId = unityAdsLoadOptions3.getObjectId();
                    if ((objectId != null || StringsKt.R(objectId)) && (data = unityAdsLoadOptions3.getData()) != null && !data.has("adMarkup")) {
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
                y6a.M(obj);
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
                if (adRefresh.invoke(adObject, androidWebViewLessLoadStrategy$invoke$1) != lu3Var) {
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
                return lu3Var;
            }
        }
        androidWebViewLessLoadStrategy$invoke$1 = new AndroidWebViewLessLoadStrategy$invoke$1(this, rq3Var);
        Object obj2 = androidWebViewLessLoadStrategy$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidWebViewLessLoadStrategy$invoke$1.label;
        if (i != 0) {
        }
        cacheAssetsEvent = (CacheAssetsEvent) obj2;
        if (cacheAssetsEvent instanceof CacheAssetsEvent.Success) {
        }
    }
}
