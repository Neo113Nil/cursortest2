package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.model.AdRefreshStateKt;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;
import xsna.dli0;
import xsna.epx;
import xsna.pn00;
import xsna.spj;
import xsna.t5j;
import xsna.uki0;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    public CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, AndroidGetAdPlayerContext androidGetAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        int i;
        String str;
        AdObject adObject;
        IsOMActivated isOMActivated;
        Map map;
        Map map2;
        Map map3;
        JSONObject data;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdRefreshState adRefreshState;
        Iterator it;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    String str2 = this.$adData;
                    String str3 = this.$impressionConfig;
                    String str4 = this.$adDataRefreshToken;
                    AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
                    AdObject adObject2 = this.$adObject;
                    IsOMActivated isOMActivated2 = this.$isOMActivated;
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put("adData", str2);
                    mapBuilder.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
                    mapBuilder.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = mapBuilder;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = mapBuilder;
                    str = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = mapBuilder;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
                    obj = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    adObject = adObject2;
                    isOMActivated = isOMActivated2;
                    map = mapBuilder;
                    map2 = map;
                    map3 = map2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
                    str = (String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
                    map2 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
                    map3 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
                    isOMActivated = (IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
                    adObject = (AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
                    a.a(obj);
                }
                map.put(str, obj);
                map2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
                data = adObject.getLoadOptions().getData();
                if (data != null && data.length() != 0) {
                    uki0 c = dli0.c(data.keys());
                    JSONObject jSONObject = new JSONObject();
                    it = ((t5j) c).iterator();
                    while (it.hasNext()) {
                        String str5 = (String) it.next();
                        if (!epx.f(str5, "adMarkup") && !epx.f(str5, "objectId")) {
                            jSONObject = jSONObject.put(str5, data.get(str5));
                        }
                    }
                    map2.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
                }
                if (isOMActivated.invoke()) {
                    map2.put(HandleInvocationsFromAdViewer.KEY_OMID, pn00.k(new Pair(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new Pair(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
                }
                map2.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
                map2.put("impressionOpportunityId", ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString());
                webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
                if (webViewLessLoadingRequiredData != null && (adRefreshState = webViewLessLoadingRequiredData.getAdRefreshState()) != null) {
                    map2.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
                }
                return ((MapBuilder) map3).h();
            }
        }
        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i != 0) {
        }
        map.put(str, obj2);
        map2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        data = adObject.getLoadOptions().getData();
        if (data != null) {
            uki0 c2 = dli0.c(data.keys());
            JSONObject jSONObject2 = new JSONObject();
            it = ((t5j) c2).iterator();
            while (it.hasNext()) {
            }
            map2.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject2);
        }
        if (isOMActivated.invoke()) {
        }
        map2.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
        map2.put("impressionOpportunityId", ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString());
        webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            map2.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
        }
        return ((MapBuilder) map3).h();
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
