package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", f = "PlaidCrashReporter.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3565b5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3575c5 f39838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RuntimeException f39839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3565b5(C3575c5 c3575c5, RuntimeException runtimeException, Continuation<? super C3565b5> continuation) {
        super(2, continuation);
        this.f39838b = c3575c5;
        this.f39839c = runtimeException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3565b5(this.f39838b, this.f39839c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3565b5(this.f39838b, this.f39839c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39837a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3575c5 c3575c5 = this.f39838b;
            C3668k0 c3668k0 = c3575c5.f39851c;
            Crash a10 = c3575c5.f39850b.a(this.f39839c);
            this.f39837a = 1;
            if (c3668k0.a(a10, this) == coroutine_suspended) {
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
