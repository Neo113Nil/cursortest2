package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", f = "CrashStorage.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3632g0 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f40619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3641h0 f40620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Crash[] f40621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3632g0(C3641h0 c3641h0, Crash[] crashArr, Continuation<? super C3632g0> continuation) {
        super(2, continuation);
        this.f40620b = c3641h0;
        this.f40621c = crashArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3632g0(this.f40620b, this.f40621c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3632g0(this.f40620b, this.f40621c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40619a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3655i5 c3655i5 = this.f40620b.f40638a;
            String a10 = C3641h0.a();
            String v10 = this.f40620b.f40640c.v(ArraysKt.asList(this.f40621c));
            Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
            this.f40619a = 1;
            Object g10 = AbstractC1455i.g(C1452g0.b(), new C3646h5(c3655i5, a10, v10, null), this);
            if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                g10 = Unit.INSTANCE;
            }
            if (g10 == coroutine_suspended) {
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
