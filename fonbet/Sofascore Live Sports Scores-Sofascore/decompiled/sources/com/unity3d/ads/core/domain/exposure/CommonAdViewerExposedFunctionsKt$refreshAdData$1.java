package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.a70;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    public CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<Object> rq3Var) {
        CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
        int i;
        ByteString fromBase64$default;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (objArr.length == 0) {
                        fromBase64$default = ByteString.EMPTY;
                    } else {
                        Object obj2 = objArr[0];
                        obj2.getClass();
                        String optString = ((JSONObject) obj2).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                        optString.getClass();
                        fromBase64$default = ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null);
                    }
                    Refresh refresh = this.$refresh;
                    fromBase64$default.getClass();
                    ByteString opportunityId = this.$adObject.getOpportunityId();
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                    obj = refresh.invoke(fromBase64$default, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (!adDataRefreshResponse.hasError()) {
                    a70.p("Refresh failed");
                    return null;
                }
                ltb ltbVar = new ltb();
                ByteString adData = adDataRefreshResponse.getAdData();
                adData.getClass();
                ltbVar.put("adData", ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
                ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
                adDataRefreshToken.getClass();
                ltbVar.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
                ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
                trackingToken.getClass();
                ltbVar.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
                return ltbVar.d();
            }
        }
        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, rq3Var);
        Object obj3 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
        if (i != 0) {
        }
        adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj3;
        if (!adDataRefreshResponse.hasError()) {
        }
    }
}
