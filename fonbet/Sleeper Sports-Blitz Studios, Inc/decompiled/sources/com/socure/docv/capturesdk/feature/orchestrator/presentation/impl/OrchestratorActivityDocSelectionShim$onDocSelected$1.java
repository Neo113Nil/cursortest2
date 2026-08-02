package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrchestratorActivityDocSelectionShim.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityDocSelectionShim$onDocSelected$1", f = "OrchestratorActivityDocSelectionShim.kt", i = {}, l = {23, 31, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class OrchestratorActivityDocSelectionShim$onDocSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DocSelection $type;
    int label;
    final /* synthetic */ OrchestratorActivityDocSelectionShim this$0;

    /* compiled from: OrchestratorActivityDocSelectionShim.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocSelection.values().length];
            try {
                iArr[DocSelection.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocSelection.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrchestratorActivityDocSelectionShim$onDocSelected$1(DocSelection docSelection, OrchestratorActivityDocSelectionShim orchestratorActivityDocSelectionShim, Continuation<? super OrchestratorActivityDocSelectionShim$onDocSelected$1> continuation) {
        super(2, continuation);
        this.$type = docSelection;
        this.this$0 = orchestratorActivityDocSelectionShim;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrchestratorActivityDocSelectionShim$onDocSelected$1(this.$type, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrchestratorActivityDocSelectionShim$onDocSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        if (r8.invoke(r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r1.invoke(kotlin.Result.m13470constructorimpl(r8), r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r8 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ModuleOrchestrator moduleOrchestrator;
        ModuleSubmission.IDSelection.Type type;
        Object mo11539onFinishedgIAlus;
        OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase;
        OnModuleCompletedUseCase onModuleCompletedUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SessionManager.INSTANCE.setSelectedDocument(this.$type);
            moduleOrchestrator = this.this$0.moduleOrchestrator;
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
            if (i2 == 1) {
                type = ModuleSubmission.IDSelection.Type.ID_CARD;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = ModuleSubmission.IDSelection.Type.PASSPORT;
            }
            this.label = 1;
            mo11539onFinishedgIAlus = moduleOrchestrator.mo11539onFinishedgIAlus(new ModuleSubmission.IDSelection(type), this);
        } else if (i == 1) {
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
        onModuleSubmissionErrorUseCase = this.this$0.onModuleSubmissionErrorUseCase;
        if (Result.m13477isSuccessimpl(mo11539onFinishedgIAlus)) {
            Result.Companion companion = Result.INSTANCE;
            mo11539onFinishedgIAlus = Unit.INSTANCE;
        }
        this.label = 2;
    }
}
