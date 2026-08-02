package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@b6l(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1", f = "CommonAdViewerExposedFunctions.kt", l = {468}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$request$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$request$1$invoke$1(CommonAdViewerExposedFunctionsKt$request$1 commonAdViewerExposedFunctionsKt$request$1, spj<? super CommonAdViewerExposedFunctionsKt$request$1$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$request$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (spj<Object>) this);
    }
}
