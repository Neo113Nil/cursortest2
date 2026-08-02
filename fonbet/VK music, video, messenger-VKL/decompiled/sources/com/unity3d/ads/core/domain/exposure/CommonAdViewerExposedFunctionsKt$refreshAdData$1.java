package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    public CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
        int i;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteString fromBase64$default = objArr.length == 0 ? ByteString.EMPTY : ProtobufExtensionsKt.fromBase64$default(((JSONObject) objArr[0]).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN), false, 1, null);
                    Refresh refresh = this.$refresh;
                    ByteString opportunityId = this.$adObject.getOpportunityId();
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                    obj = refresh.invoke(fromBase64$default, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (!adDataRefreshResponse.hasError()) {
                    throw new IllegalArgumentException("Refresh failed");
                }
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("adData", ProtobufExtensionsKt.toBase64$default(adDataRefreshResponse.getAdData(), false, 1, null));
                mapBuilder.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshResponse.getAdDataRefreshToken(), false, 1, null));
                mapBuilder.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshResponse.getTrackingToken(), false, 1, null));
                return mapBuilder.h();
            }
        }
        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
        if (i != 0) {
        }
        adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj2;
        if (!adDataRefreshResponse.hasError()) {
        }
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
