package com.usercentrics.sdk.services.tcf;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCF.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {281, 289}, m = "initTCModel-0E7RQCE", n = {"this", "tcf2Settings", "storedTCFData", "gvl", "this", "tcf2Settings", "storedTCFData", "gvl"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes2.dex */
final class TCF$initTCModel$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCF$initTCModel$1(TCF tcf, Continuation<? super TCF$initTCModel$1> continuation) {
        super(continuation);
        this.this$0 = tcf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10606initTCModel0E7RQCE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m10606initTCModel0E7RQCE = this.this$0.m10606initTCModel0E7RQCE(null, null, this);
        return m10606initTCModel0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10606initTCModel0E7RQCE : Result.m11179boximpl(m10606initTCModel0E7RQCE);
    }
}
