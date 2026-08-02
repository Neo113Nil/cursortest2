package com.socure.docv.capturesdk.common.network.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: StepUpRepository.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.StepUpRepository", f = "StepUpRepository.kt", i = {}, l = {Opcodes.INSTANCEOF}, m = "submitTransition-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
final class StepUpRepository$submitTransition$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepUpRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepUpRepository$submitTransition$1(StepUpRepository stepUpRepository, Continuation<? super StepUpRepository$submitTransition$1> continuation) {
        super(continuation);
        this.this$0 = stepUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11534submitTransitiongIAlus = this.this$0.m11534submitTransitiongIAlus(null, this);
        return m11534submitTransitiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11534submitTransitiongIAlus : Result.m13469boximpl(m11534submitTransitiongIAlus);
    }
}
