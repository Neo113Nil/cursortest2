package com.unity3d.ads.core.domain.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OperativeEventJob.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", i = {0}, l = {22}, m = "doWork", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class OperativeEventJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperativeEventJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperativeEventJob$doWork$1(OperativeEventJob operativeEventJob, Continuation<? super OperativeEventJob$doWork$1> continuation) {
        super(continuation);
        this.this$0 = operativeEventJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
