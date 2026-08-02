package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.C3556a6;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
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

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1", f = "LinkActivityViewModel.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* renamed from: com.plaid.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3670k2 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f40723a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3661j2 f40725c;

    @DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1$1", f = "LinkActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.k2$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkEvent f40726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkEvent linkEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f40726a = linkEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f40726a, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new a(this.f40726a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C3556a6.a.a(C3556a6.f39823a, "delivering " + this.f40726a);
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(this.f40726a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3670k2(C3661j2 c3661j2, Continuation<? super C3670k2> continuation) {
        super(2, continuation);
        this.f40725c = c3661j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C3670k2 c3670k2 = new C3670k2(this.f40725c, continuation);
        c3670k2.f40724b = obj;
        return c3670k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        C3670k2 c3670k2 = new C3670k2(this.f40725c, continuation);
        c3670k2.f40724b = p10;
        return c3670k2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ph.P p10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40723a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            p10 = (Ph.P) this.f40724b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p10 = (Ph.P) this.f40724b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException unused) {
                C3556a6.a.e(C3556a6.f39823a, "Link event consumer has ended. This is normal at the end of the activity lifecycle.If it occurs at any other time, it may result in loss of link events delivered.");
                return Unit.INSTANCE;
            }
        }
        while (Ph.Q.i(p10)) {
            A2 a22 = this.f40725c.f40700e;
            if (a22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkEventQueue");
                a22 = null;
            }
            DelayedC3793y0 poll = a22.f39148a.poll(200L, TimeUnit.MILLISECONDS);
            LinkEvent linkEvent = poll != null ? poll.f41193a : null;
            if (linkEvent != null) {
                Ph.M0 c10 = C1452g0.c();
                a aVar = new a(linkEvent, null);
                this.f40724b = p10;
                this.f40723a = 1;
                if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
