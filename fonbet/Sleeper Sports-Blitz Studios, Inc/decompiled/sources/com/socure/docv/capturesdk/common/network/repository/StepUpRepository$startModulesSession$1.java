package com.socure.docv.capturesdk.common.network.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StepUpRepository.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.StepUpRepository", f = "StepUpRepository.kt", i = {}, l = {235}, m = "startModulesSession-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
final class StepUpRepository$startModulesSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StepUpRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepUpRepository$startModulesSession$1(StepUpRepository stepUpRepository, Continuation<? super StepUpRepository$startModulesSession$1> continuation) {
        super(continuation);
        this.this$0 = stepUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11526startModulesSessiongIAlus = this.this$0.m11526startModulesSessiongIAlus(null, this);
        return m11526startModulesSessiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11526startModulesSessiongIAlus : Result.m13469boximpl(m11526startModulesSessiongIAlus);
    }
}
