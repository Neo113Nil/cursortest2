package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class T7 extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U7 f39643a;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$linkResultCallback$1$onRequestSilentNetworkAuth$1", f = "WebviewViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39644a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC3648h7 f39645b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ U7 f39646c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3648h7 abstractC3648h7, U7 u72, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f39645b = abstractC3648h7;
            this.f39646c = u72;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f39645b, this.f39646c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new a(this.f39645b, this.f39646c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39644a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC3648h7 abstractC3648h7 = this.f39645b;
                C3755t7 c3755t7 = null;
                C3736r6 c3736r6 = null;
                if (abstractC3648h7 instanceof C3754t6) {
                    C3736r6 c3736r62 = this.f39646c.f39686o;
                    if (c3736r62 != null) {
                        c3736r6 = c3736r62;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("proveAuthController");
                    }
                    c3736r6.a((C3754t6) this.f39645b);
                } else if (abstractC3648h7 instanceof C3764u7) {
                    C3755t7 c3755t72 = this.f39646c.f39682k;
                    if (c3755t72 != null) {
                        c3755t7 = c3755t72;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("twilioAuthController");
                    }
                    C3764u7 c3764u7 = (C3764u7) this.f39645b;
                    this.f39644a = 1;
                    if (c3755t7.a(c3764u7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public T7(U7 u72) {
        this.f39643a = u72;
    }

    @Override // com.plaid.internal.G
    public final void a(@NotNull AbstractC3648h7 requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        AbstractC1459k.d(androidx.lifecycle.S.a(this.f39643a), C1452g0.b(), null, new a(requestInfo, this.f39643a, null), 2, null);
    }
}
