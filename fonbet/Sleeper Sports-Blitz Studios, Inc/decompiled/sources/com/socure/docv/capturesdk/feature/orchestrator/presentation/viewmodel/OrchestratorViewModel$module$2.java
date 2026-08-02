package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.socure.docv.capturesdk.models.ModuleModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: OrchestratorViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "module", "<anonymous parameter 1>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$module$2", f = "OrchestratorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class OrchestratorViewModel$module$2 extends SuspendLambda implements Function3<ModuleModel, Unit, Continuation<? super ModuleModel>, Object> {
    /* synthetic */ Object L$0;
    int label;

    OrchestratorViewModel$module$2(Continuation<? super OrchestratorViewModel$module$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ModuleModel moduleModel, Unit unit, Continuation<? super ModuleModel> continuation) {
        OrchestratorViewModel$module$2 orchestratorViewModel$module$2 = new OrchestratorViewModel$module$2(continuation);
        orchestratorViewModel$module$2.L$0 = moduleModel;
        return orchestratorViewModel$module$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return (ModuleModel) this.L$0;
    }
}
