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

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.PlaidCrashHandler$handleCrash$1", f = "PlaidCrashHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Y4 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z4 f39793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f39794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(Z4 z42, Throwable th2, Continuation<? super Y4> continuation) {
        super(2, continuation);
        this.f39793b = z42;
        this.f39794c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Y4(this.f39793b, this.f39794c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new Y4(this.f39793b, this.f39794c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39792a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Z4 z42 = this.f39793b;
            C3668k0 c3668k0 = z42.f39807b;
            Crash a10 = z42.f39806a.a(this.f39794c);
            this.f39792a = 1;
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
