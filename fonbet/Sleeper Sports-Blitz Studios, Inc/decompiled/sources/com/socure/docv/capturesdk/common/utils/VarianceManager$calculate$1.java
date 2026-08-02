package com.socure.docv.capturesdk.common.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VarianceManager.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.utils.VarianceManager", f = "VarianceManager.kt", i = {0, 0, 0, 0, 0}, l = {83}, m = "calculate", n = {"this", "image1", "image2", "$this$withLock_u24default$iv", "currentTime"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0"})
/* loaded from: classes8.dex */
final class VarianceManager$calculate$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VarianceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VarianceManager$calculate$1(VarianceManager varianceManager, Continuation<? super VarianceManager$calculate$1> continuation) {
        super(continuation);
        this.this$0 = varianceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.calculate(null, null, this);
    }
}
