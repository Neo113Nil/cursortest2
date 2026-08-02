package com.plaid.internal;

import Ph.AbstractC1459k;
import com.plaid.internal.C3556a6;
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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$2", f = "WebviewViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class R7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f39602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(U7 u72, Continuation<? super R7> continuation) {
        super(2, continuation);
        this.f39602b = u72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new R7(this.f39602b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new R7(this.f39602b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39601a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC3781w6 interfaceC3781w6 = this.f39602b.f39680i;
            if (interfaceC3781w6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                interfaceC3781w6 = null;
            }
            this.f39601a = 1;
            obj = interfaceC3781w6.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        A channelInfo = (A) obj;
        if (channelInfo == null) {
            C3556a6.a.e(C3556a6.f39823a, "No Out Of Process Polling Info Available");
            return Unit.INSTANCE;
        }
        F f10 = this.f39602b.f39681j;
        if (f10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
            f10 = null;
        }
        Ph.P coroutineScope = androidx.lifecycle.S.a(this.f39602b);
        T7 pollingCallback = this.f39602b.f39689r;
        f10.getClass();
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
        Intrinsics.checkNotNullParameter(pollingCallback, "pollingCallback");
        AbstractC1459k.d(coroutineScope, null, null, new D(f10, channelInfo, pollingCallback, null), 3, null);
        return Unit.INSTANCE;
    }
}
