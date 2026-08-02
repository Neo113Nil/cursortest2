package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling$getNewPollingJob$1", f = "ChannelPolling.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class D extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f39189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f39190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f39191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f10, A a10, G g10, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f39189b = f10;
        this.f39190c = a10;
        this.f39191d = g10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new D(this.f39189b, this.f39190c, this.f39191d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((D) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39188a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            F f10 = this.f39189b;
            A a10 = this.f39190c;
            G g10 = this.f39191d;
            this.f39188a = 1;
            if (F.a(f10, a10, g10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
