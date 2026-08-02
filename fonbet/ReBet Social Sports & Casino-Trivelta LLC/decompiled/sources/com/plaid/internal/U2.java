package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class U2 extends SuspendLambda implements Function1<Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f39657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Workflow$LinkWorkflowNextRequest f39658c;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", f = "LinkStateReducer.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39659a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y2 f39660b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Workflow$LinkWorkflowNextRequest f39661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y2 y22, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f39660b = y22;
            this.f39661c = workflow$LinkWorkflowNextRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f39660b, this.f39661c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
            return new a(this.f39660b, this.f39661c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39659a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            i8 i8Var = this.f39660b.f39785a;
            Workflow$LinkWorkflowNextRequest nextRequest = this.f39661c;
            Intrinsics.checkNotNullExpressionValue(nextRequest, "$nextRequest");
            this.f39659a = 1;
            Object a10 = i8Var.a(nextRequest, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(Y2 y22, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super U2> continuation) {
        super(1, continuation);
        this.f39657b = y22;
        this.f39658c = workflow$LinkWorkflowNextRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new U2(this.f39657b, this.f39658c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super AbstractC3654i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
        return new U2(this.f39657b, this.f39658c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39656a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Ph.L b10 = C1452g0.b();
        a aVar = new a(this.f39657b, this.f39658c, null);
        this.f39656a = 1;
        Object g10 = AbstractC1455i.g(b10, aVar, this);
        return g10 == coroutine_suspended ? coroutine_suspended : g10;
    }
}
