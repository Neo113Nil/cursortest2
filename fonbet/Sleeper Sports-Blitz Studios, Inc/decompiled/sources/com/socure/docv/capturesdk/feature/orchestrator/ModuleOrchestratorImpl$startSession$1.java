package com.socure.docv.capturesdk.feature.orchestrator;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ModuleOrchestratorImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestratorImpl", f = "ModuleOrchestratorImpl.kt", i = {}, l = {28}, m = "startSession-IoAF18A", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModuleOrchestratorImpl$startSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModuleOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModuleOrchestratorImpl$startSession$1(ModuleOrchestratorImpl moduleOrchestratorImpl, Continuation<? super ModuleOrchestratorImpl$startSession$1> continuation) {
        super(continuation);
        this.this$0 = moduleOrchestratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo11540startSessionIoAF18A = this.this$0.mo11540startSessionIoAF18A(this);
        return mo11540startSessionIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo11540startSessionIoAF18A : Result.m13469boximpl(mo11540startSessionIoAF18A);
    }
}
