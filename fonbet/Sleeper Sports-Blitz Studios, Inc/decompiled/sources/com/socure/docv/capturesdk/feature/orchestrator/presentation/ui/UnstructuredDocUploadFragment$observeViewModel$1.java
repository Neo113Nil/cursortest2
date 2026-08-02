package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import com.socure.docv.capturesdk.databinding.FragmentUnstructuredDocSocureBinding;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UnstructuredDocUploadFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$observeViewModel$1", f = "UnstructuredDocUploadFragment.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class UnstructuredDocUploadFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentUnstructuredDocSocureBinding $binding;
    int label;
    final /* synthetic */ UnstructuredDocUploadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnstructuredDocUploadFragment$observeViewModel$1(UnstructuredDocUploadFragment unstructuredDocUploadFragment, FragmentUnstructuredDocSocureBinding fragmentUnstructuredDocSocureBinding, Continuation<? super UnstructuredDocUploadFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = unstructuredDocUploadFragment;
        this.$binding = fragmentUnstructuredDocSocureBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnstructuredDocUploadFragment$observeViewModel$1(this.this$0, this.$binding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnstructuredDocUploadFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: UnstructuredDocUploadFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "state", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$observeViewModel$1$1", f = "UnstructuredDocUploadFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$observeViewModel$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<IUnstructuredDocUploadViewModel.State, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentUnstructuredDocSocureBinding $binding;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnstructuredDocUploadFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UnstructuredDocUploadFragment unstructuredDocUploadFragment, FragmentUnstructuredDocSocureBinding fragmentUnstructuredDocSocureBinding, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unstructuredDocUploadFragment;
            this.$binding = fragmentUnstructuredDocSocureBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IUnstructuredDocUploadViewModel.State state, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.bindUnstructuredDocModel(this.$binding, (IUnstructuredDocUploadViewModel.State) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iUnstructuredDocUploadViewModel = this.this$0.viewModel;
            if (iUnstructuredDocUploadViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iUnstructuredDocUploadViewModel = null;
            }
            this.label = 1;
            if (FlowKt.collectLatest(iUnstructuredDocUploadViewModel.getState(), new AnonymousClass1(this.this$0, this.$binding, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
