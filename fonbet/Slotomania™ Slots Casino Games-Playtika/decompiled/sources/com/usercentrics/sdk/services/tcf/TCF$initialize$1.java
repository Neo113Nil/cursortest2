package com.usercentrics.sdk.services.tcf;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCF.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", i = {0, 0, 0}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION_VALUE}, m = "initialize-gIAlu-s", n = {"this", "settingsId", "storedTCFData"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class TCF$initialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCF$initialize$1(TCF tcf, Continuation<? super TCF$initialize$1> continuation) {
        super(continuation);
        this.this$0 = tcf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10609initializegIAlus = this.this$0.mo10609initializegIAlus(null, this);
        return mo10609initializegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10609initializegIAlus : Result.m11179boximpl(mo10609initializegIAlus);
    }
}
