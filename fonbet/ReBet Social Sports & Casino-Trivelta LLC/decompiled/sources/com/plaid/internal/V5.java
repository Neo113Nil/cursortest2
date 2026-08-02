package com.plaid.internal;

import com.plaid.internal.C3647h6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.AbstractC5323h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1", f = "PlaidWebview.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class V5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P5 f39718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3647h6.a f39719c;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1$1", f = "PlaidWebview.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f39720a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f39720a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            Boolean bool2 = bool;
            bool2.getClass();
            a aVar = new a(continuation);
            aVar.f39720a = bool2.booleanValue();
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f39720a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(P5 p52, C3647h6.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f39718b = p52;
        this.f39719c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new V5(this.f39718b, this.f39719c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new V5(this.f39718b, this.f39719c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39717a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.L l10 = this.f39718b.f39511b.f40966d;
            a aVar = new a(null);
            this.f39717a = 1;
            if (AbstractC5323h.s(l10, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.f39718b.f39515f.get()) {
            this.f39719c.invoke();
        }
        return Unit.INSTANCE;
    }
}
