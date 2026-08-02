package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

    public CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        this.$getOperativeEventApi = getOperativeEventApi;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
        CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
        int i;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                    ByteString byteString = ByteStringsKt.toByteString(Base64.decode((String) objArr[0], 2));
                    GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                    if (getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return s3q0.a;
            }
        }
        commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<? super s3q0>) spjVar);
    }
}
