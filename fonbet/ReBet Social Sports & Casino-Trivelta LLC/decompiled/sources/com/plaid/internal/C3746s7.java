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

@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController$asyncAuthentication$result$1", f = "TwilioAuthController.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.s7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3746s7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super InterfaceC3728q6>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3755t7 f41059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3764u7 f41060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3746s7(C3755t7 c3755t7, C3764u7 c3764u7, Continuation<? super C3746s7> continuation) {
        super(2, continuation);
        this.f41059b = c3755t7;
        this.f41060c = c3764u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3746s7(this.f41059b, this.f41060c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super InterfaceC3728q6> continuation) {
        return new C3746s7(this.f41059b, this.f41060c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41058a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC3773v7 interfaceC3773v7 = this.f41059b.f41098a;
        String str = this.f41060c.f41124b;
        this.f41058a = 1;
        Object a10 = interfaceC3773v7.a(str, this);
        return a10 == coroutine_suspended ? coroutine_suspended : a10;
    }
}
