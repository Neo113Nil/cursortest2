package com.unity3d.ads.core.domain.exposure;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1", f = "CommonAdViewerExposedFunctions.kt", l = {293}, m = "invoke")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 extends sq3 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$refreshAdData$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(CommonAdViewerExposedFunctionsKt$refreshAdData$1 commonAdViewerExposedFunctionsKt$refreshAdData$1, rq3<? super CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1> rq3Var) {
        super(rq3Var);
        this.this$0 = commonAdViewerExposedFunctionsKt$refreshAdData$1;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (rq3<Object>) this);
    }
}
