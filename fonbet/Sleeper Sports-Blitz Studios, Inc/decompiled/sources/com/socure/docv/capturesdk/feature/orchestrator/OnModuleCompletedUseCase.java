package com.socure.docv.capturesdk.feature.orchestrator;

import com.socure.docv.capturesdk.api.Keys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: OnModuleCompletedUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u0005H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "", "()V", "_flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", Keys.KEY_FLOW, "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnModuleCompletedUseCase {
    public static final int $stable = 8;
    private final MutableSharedFlow<Unit> _flow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    public final Flow<Unit> getFlow() {
        return this._flow;
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        Object emit = this._flow.emit(Unit.INSTANCE, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
