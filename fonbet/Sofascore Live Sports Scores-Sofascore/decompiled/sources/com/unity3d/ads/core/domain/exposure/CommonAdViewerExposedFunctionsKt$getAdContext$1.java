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
import defpackage.a70;
import defpackage.e5h;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.ml3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<Object> rq3Var) {
        CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        int i;
        IsOMActivated isOMActivated;
        String str;
        Map map;
        Map map2;
        Map map3;
        AdObject adObject;
        JSONObject data;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdRefreshState adRefreshState;
        Iterator it;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    String str2 = this.$adData;
                    String str3 = this.$impressionConfig;
                    String str4 = this.$adDataRefreshToken;
                    AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
                    AdObject adObject2 = this.$adObject;
                    IsOMActivated isOMActivated2 = this.$isOMActivated;
                    ltb ltbVar = new ltb();
                    ltbVar.put("adData", str2);
                    ltbVar.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
                    ltbVar.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = ltbVar;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = ltbVar;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = ltbVar;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
                    Object invoke = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
                    if (invoke == lu3Var) {
                        return lu3Var;
                    }
                    isOMActivated = isOMActivated2;
                    str = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    map = ltbVar;
                    map2 = map;
                    map3 = map2;
                    obj = invoke;
                    adObject = adObject2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
                    str = (String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
                    map2 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
                    map3 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
                    isOMActivated = (IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
                    adObject = (AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
                    y6a.M(obj);
                }
                map.put(str, obj);
                map2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
                data = adObject.getLoadOptions().getData();
                if (data != null && data.length() != 0) {
                    Iterator<String> keys = data.keys();
                    keys.getClass();
                    ml3 b = e5h.b(keys);
                    JSONObject jSONObject = new JSONObject();
                    it = b.iterator();
                    while (it.hasNext()) {
                        String str5 = (String) it.next();
                        if (!Intrinsics.c(str5, "adMarkup") && !Intrinsics.c(str5, "objectId")) {
                            jSONObject = jSONObject.put(str5, data.get(str5));
                            jSONObject.getClass();
                        }
                    }
                    map2.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
                }
                if (isOMActivated.invoke()) {
                    map2.put(HandleInvocationsFromAdViewer.KEY_OMID, tub.h(new Pair(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new Pair(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
                }
                map2.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
                String uuid = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
                uuid.getClass();
                map2.put("impressionOpportunityId", uuid);
                webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
                if (webViewLessLoadingRequiredData != null && (adRefreshState = webViewLessLoadingRequiredData.getAdRefreshState()) != null) {
                    map2.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
                }
                map3.getClass();
                return ((ltb) map3).d();
            }
        }
        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, rq3Var);
        Object obj2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i != 0) {
        }
        map.put(str, obj2);
        map2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        data = adObject.getLoadOptions().getData();
        if (data != null) {
            Iterator<String> keys2 = data.keys();
            keys2.getClass();
            ml3 b2 = e5h.b(keys2);
            JSONObject jSONObject2 = new JSONObject();
            it = b2.iterator();
            while (it.hasNext()) {
            }
            map2.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject2);
        }
        if (isOMActivated.invoke()) {
        }
        map2.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
        String uuid2 = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        uuid2.getClass();
        map2.put("impressionOpportunityId", uuid2);
        webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            map2.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
        }
        map3.getClass();
        return ((ltb) map3).d();
    }
}
