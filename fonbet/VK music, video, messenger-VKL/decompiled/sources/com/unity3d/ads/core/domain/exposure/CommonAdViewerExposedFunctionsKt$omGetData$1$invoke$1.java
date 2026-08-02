package com.unity3d.ads.core.domain.exposure;

import com.ironsource.InterfaceC4413l1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@b6l(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1", f = "CommonAdViewerExposedFunctions.kt", l = {InterfaceC4413l1.a.b.h}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$omGetData$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(CommonAdViewerExposedFunctionsKt$omGetData$1 commonAdViewerExposedFunctionsKt$omGetData$1, spj<? super CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$omGetData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (spj<Object>) this);
    }
}
