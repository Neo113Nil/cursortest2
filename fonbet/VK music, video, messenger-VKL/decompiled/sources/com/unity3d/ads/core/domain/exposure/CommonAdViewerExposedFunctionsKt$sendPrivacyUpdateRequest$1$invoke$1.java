package com.unity3d.ads.core.domain.exposure;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@b6l(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1", f = "CommonAdViewerExposedFunctions.kt", l = {Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, spj<? super CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (spj<Object>) this);
    }
}
