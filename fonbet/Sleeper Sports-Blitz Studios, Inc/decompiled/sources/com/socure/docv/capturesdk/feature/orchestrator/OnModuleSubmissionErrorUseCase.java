package com.socure.docv.capturesdk.feature.orchestrator;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: OnModuleSubmissionErrorUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086Bø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\rR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "", "()V", "_flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Result;", "", "result", "Lkotlinx/coroutines/flow/Flow;", "getResult", "()Lkotlinx/coroutines/flow/Flow;", "invoke", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnModuleSubmissionErrorUseCase {
    public static final int $stable = 8;
    private final MutableSharedFlow<Result<Unit>> _flow;
    private final Flow<Result<Unit>> result;

    public OnModuleSubmissionErrorUseCase() {
        MutableSharedFlow<Result<Unit>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._flow = MutableSharedFlow$default;
        this.result = MutableSharedFlow$default;
    }

    public final Flow<Result<Unit>> getResult() {
        return this.result;
    }

    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        if (Result.m13476isFailureimpl(obj)) {
            Object emit = this._flow.emit(Result.m13469boximpl(obj), continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
