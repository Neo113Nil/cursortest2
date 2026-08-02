package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.om.GetOmData;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$omGetData$1 implements ExposedFunction {
    final /* synthetic */ GetOmData $getOmData;

    public CommonAdViewerExposedFunctionsKt$omGetData$1(GetOmData getOmData) {
        this.$getOmData = getOmData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
        int i;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    GetOmData getOmData = this.$getOmData;
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                    obj = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                OMData oMData = (OMData) obj;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("version", oMData.getVersion());
                mapBuilder.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
                mapBuilder.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
                return mapBuilder.h();
            }
        }
        commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
        if (i != 0) {
        }
        OMData oMData2 = (OMData) obj2;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("version", oMData2.getVersion());
        mapBuilder2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData2.getPartnerName());
        mapBuilder2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData2.getPartnerVersion());
        return mapBuilder2.h();
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
