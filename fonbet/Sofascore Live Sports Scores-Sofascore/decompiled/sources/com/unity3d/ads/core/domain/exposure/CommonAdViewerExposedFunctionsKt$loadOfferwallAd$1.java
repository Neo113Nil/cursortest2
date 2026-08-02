package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

    public CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
        this.$adObject = adObject;
        this.$loadOfferwallAd = loadOfferwallAd;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<? super Unit> rq3Var) {
        CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1;
        int i;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    String optString = ((JSONObject) obj2).optString("placementName");
                    this.$adObject.setOfferwallAd(true);
                    this.$adObject.setOfferwallPlacementName(optString);
                    LoadOfferwallAd loadOfferwallAd = this.$loadOfferwallAd;
                    optString.getClass();
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = 1;
                    if (loadOfferwallAd.invoke(optString, commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) == lu3Var) {
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
        commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, rq3Var);
        Object obj3 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.a;
    }
}
