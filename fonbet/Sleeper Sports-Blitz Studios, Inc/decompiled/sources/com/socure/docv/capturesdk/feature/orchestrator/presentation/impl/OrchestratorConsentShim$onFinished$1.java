package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrchestratorConsentShim.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorConsentShim$onFinished$1", f = "OrchestratorConsentShim.kt", i = {}, l = {22, 20, 28}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class OrchestratorConsentShim$onFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $consentGiven;
    Object L$0;
    int label;
    final /* synthetic */ OrchestratorConsentShim this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrchestratorConsentShim$onFinished$1(OrchestratorConsentShim orchestratorConsentShim, boolean z, Continuation<? super OrchestratorConsentShim$onFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = orchestratorConsentShim;
        this.$consentGiven = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrchestratorConsentShim$onFinished$1(this.this$0, this.$consentGiven, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrchestratorConsentShim$onFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (r8.invoke(r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r1.invoke(kotlin.Result.m13470constructorimpl(r8), r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r8 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase;
        ModuleOrchestrator moduleOrchestrator;
        Object mo11539onFinishedgIAlus;
        OnModuleCompletedUseCase onModuleCompletedUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            onModuleSubmissionErrorUseCase = this.this$0.onModuleSubmissionErrorUseCase;
            moduleOrchestrator = this.this$0.moduleOrchestrator;
            this.L$0 = onModuleSubmissionErrorUseCase;
            this.label = 1;
            mo11539onFinishedgIAlus = moduleOrchestrator.mo11539onFinishedgIAlus(new ModuleSubmission.Consent(this.$consentGiven), this);
        } else if (i == 1) {
            onModuleSubmissionErrorUseCase = (OnModuleSubmissionErrorUseCase) this.L$0;
            ResultKt.throwOnFailure(obj);
            mo11539onFinishedgIAlus = ((Result) obj).getValue();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            onModuleCompletedUseCase = this.this$0.moduleCompletedUseCase;
            this.label = 3;
        }
        if (Result.m13477isSuccessimpl(mo11539onFinishedgIAlus)) {
            Result.Companion companion = Result.INSTANCE;
            mo11539onFinishedgIAlus = Unit.INSTANCE;
        }
        this.L$0 = null;
        this.label = 2;
    }
}
