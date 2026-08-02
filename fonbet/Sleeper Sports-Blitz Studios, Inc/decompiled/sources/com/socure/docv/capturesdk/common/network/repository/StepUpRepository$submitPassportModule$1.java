package com.socure.docv.capturesdk.common.network.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StepUpRepository.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.StepUpRepository", f = "StepUpRepository.kt", i = {}, l = {52}, m = "submitPassportModule-BWLJW6A", n = {}, s = {})
/* loaded from: classes8.dex */
final class StepUpRepository$submitPassportModule$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepUpRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepUpRepository$submitPassportModule$1(StepUpRepository stepUpRepository, Continuation<? super StepUpRepository$submitPassportModule$1> continuation) {
        super(continuation);
        this.this$0 = stepUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11532submitPassportModuleBWLJW6A = this.this$0.m11532submitPassportModuleBWLJW6A(null, null, null, this);
        return m11532submitPassportModuleBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11532submitPassportModuleBWLJW6A : Result.m13469boximpl(m11532submitPassportModuleBWLJW6A);
    }
}
