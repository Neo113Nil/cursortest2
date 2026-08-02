package com.socure.docv.capturesdk.feature.orchestrator;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ModuleOrchestratorImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestratorImpl", f = "ModuleOrchestratorImpl.kt", i = {}, l = {51}, m = "onFinished-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModuleOrchestratorImpl$onFinished$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModuleOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModuleOrchestratorImpl$onFinished$1(ModuleOrchestratorImpl moduleOrchestratorImpl, Continuation<? super ModuleOrchestratorImpl$onFinished$1> continuation) {
        super(continuation);
        this.this$0 = moduleOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo11539onFinishedgIAlus = this.this$0.mo11539onFinishedgIAlus(null, this);
        return mo11539onFinishedgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo11539onFinishedgIAlus : Result.m13469boximpl(mo11539onFinishedgIAlus);
    }
}
