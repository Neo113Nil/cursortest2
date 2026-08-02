package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

    public CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        this.$getOperativeEventApi = getOperativeEventApi;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<? super Unit> rq3Var) {
        CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
        int i;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    byte[] decode = Base64.decode((String) obj2, 2);
                    decode.getClass();
                    ByteString byteString = ByteStringsKt.toByteString(decode);
                    GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                    if (getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, rq3Var);
        Object obj3 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.a;
    }
}
