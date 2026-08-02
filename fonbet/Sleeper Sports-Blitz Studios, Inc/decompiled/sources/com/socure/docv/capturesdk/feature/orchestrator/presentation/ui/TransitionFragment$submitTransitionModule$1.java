package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
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

/* compiled from: TransitionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$submitTransitionModule$1", f = "TransitionFragment.kt", i = {}, l = {65, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class TransitionFragment$submitTransitionModule$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TransitionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionFragment$submitTransitionModule$1(TransitionFragment transitionFragment, Continuation<? super TransitionFragment$submitTransitionModule$1> continuation) {
        super(2, continuation);
        this.this$0 = transitionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitionFragment$submitTransitionModule$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitionFragment$submitTransitionModule$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$submitTransitionModule$1.AnonymousClass1(r6.this$0, r7, null), r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrchestratorActivityComponent component;
        Object mo11539onFinishedgIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            component = this.this$0.getComponent();
            this.label = 1;
            mo11539onFinishedgIAlus = component.getOrchestratorModuleOrchestrator().mo11539onFinishedgIAlus(ModuleSubmission.Transition.INSTANCE, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            mo11539onFinishedgIAlus = ((Result) obj).getValue();
        }
        this.label = 2;
    }

    /* compiled from: TransitionFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$submitTransitionModule$1$1", f = "TransitionFragment.kt", i = {}, l = {69, 70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$submitTransitionModule$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $result;
        int label;
        final /* synthetic */ TransitionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TransitionFragment transitionFragment, Object obj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = transitionFragment;
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (r6.getOnModuleCompletedUseCase().invoke(r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            if (r6.invoke(kotlin.Result.m13470constructorimpl(r1), r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OrchestratorActivityComponent component;
            OrchestratorActivityComponent component2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                component = this.this$0.getComponent();
                OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase = component.getOnModuleSubmissionErrorUseCase();
                Object obj2 = this.$result;
                if (Result.m13477isSuccessimpl(obj2)) {
                    Result.Companion companion = Result.INSTANCE;
                    obj2 = Unit.INSTANCE;
                }
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            component2 = this.this$0.getComponent();
            this.label = 2;
        }
    }
}
