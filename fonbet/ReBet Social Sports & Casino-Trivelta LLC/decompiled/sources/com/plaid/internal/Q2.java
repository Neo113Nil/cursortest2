package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Q2 extends SuspendLambda implements Function2<Ph.P, Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f39566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Workflow$LinkWorkflowStartRequest f39567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(Y2 y22, Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super Q2> continuation) {
        super(2, continuation);
        this.f39566b = y22;
        this.f39567c = workflow$LinkWorkflowStartRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Q2(this.f39566b, this.f39567c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>> continuation) {
        return new Q2(this.f39566b, this.f39567c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39565a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        i8 i8Var = this.f39566b.f39785a;
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.f39567c;
        this.f39565a = 1;
        Object a10 = i8Var.a(workflow$LinkWorkflowStartRequest, this);
        return a10 == coroutine_suspended ? coroutine_suspended : a10;
    }
}
