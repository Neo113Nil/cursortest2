package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.om.GetOmData;
import defpackage.a70;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$omGetData$1 implements ExposedFunction {
    final /* synthetic */ GetOmData $getOmData;

    public CommonAdViewerExposedFunctionsKt$omGetData$1(GetOmData getOmData) {
        this.$getOmData = getOmData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<Object> rq3Var) {
        CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
        int i;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    GetOmData getOmData = this.$getOmData;
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                    obj = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
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
                OMData oMData = (OMData) obj;
                ltb ltbVar = new ltb();
                ltbVar.put("version", oMData.getVersion());
                ltbVar.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
                ltbVar.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
                return ltbVar.d();
            }
        }
        commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, rq3Var);
        Object obj2 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
        if (i != 0) {
        }
        OMData oMData2 = (OMData) obj2;
        ltb ltbVar2 = new ltb();
        ltbVar2.put("version", oMData2.getVersion());
        ltbVar2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData2.getPartnerName());
        ltbVar2.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData2.getPartnerVersion());
        return ltbVar2.d();
    }
}
