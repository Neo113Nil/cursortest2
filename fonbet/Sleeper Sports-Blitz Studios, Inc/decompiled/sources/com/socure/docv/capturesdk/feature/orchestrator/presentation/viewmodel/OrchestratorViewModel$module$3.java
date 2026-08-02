package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OrchestratorViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$module$3", f = "OrchestratorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class OrchestratorViewModel$module$3 extends SuspendLambda implements Function3<FlowCollector<? super ModuleModel>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrchestratorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrchestratorViewModel$module$3(OrchestratorViewModel orchestratorViewModel, Continuation<? super OrchestratorViewModel$module$3> continuation) {
        super(3, continuation);
        this.this$0 = orchestratorViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ModuleModel> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        OrchestratorViewModel$module$3 orchestratorViewModel$module$3 = new OrchestratorViewModel$module$3(this.this$0, continuation);
        orchestratorViewModel$module$3.L$0 = th;
        return orchestratorViewModel$module$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.L$0;
        if (th instanceof SocureApiError) {
            this.this$0.getError().postValue(new IOrchestratorViewModel.Error.ApiError(((SocureApiError) th).getSocureDocVError()));
        } else {
            this.this$0.getError().postValue(IOrchestratorViewModel.Error.FailedToProvideModule.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
