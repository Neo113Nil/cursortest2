package com.plaid.internal;

import Ph.AbstractC1455i;
import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
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

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3769v3 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3787x3 f41135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent f41137d;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1$1", f = "LinkWorkflowAnalytics.kt", i = {0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
    /* renamed from: com.plaid.internal.v3$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Workflow$LinkWorkflowEventRequest f41138a;

        /* renamed from: b, reason: collision with root package name */
        public int f41139b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3787x3 f41140c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f41141d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent f41142e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3787x3 c3787x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f41140c = c3787x3;
            this.f41141d = str;
            this.f41142e = clientEventOuterClass$ClientEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f41140c, this.f41141d, this.f41142e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i8 i8Var;
            Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41139b;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Workflow$LinkWorkflowEventRequest.a newBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                String str = this.f41141d;
                ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = this.f41142e;
                newBuilder.a(str);
                newBuilder.a(clientEventOuterClass$ClientEvent).build();
                Workflow$LinkWorkflowEventRequest build = newBuilder.build();
                i8Var = this.f41140c.f41185a;
                Intrinsics.checkNotNull(build);
                this.f41138a = build;
                this.f41139b = 1;
                Object a10 = i8Var.a(build, this);
                if (a10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workflow$LinkWorkflowEventRequest = build;
                obj = a10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflow$LinkWorkflowEventRequest = this.f41138a;
                ResultKt.throwOnFailure(obj);
            }
            if (((AbstractC3654i4) obj) instanceof AbstractC3654i4.c) {
                C3556a6.a.a(C3556a6.f39823a, "Event sent: " + workflow$LinkWorkflowEventRequest);
            } else {
                C3556a6.a.b(C3556a6.f39823a, "Error sending event " + workflow$LinkWorkflowEventRequest);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3769v3(C3787x3 c3787x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super C3769v3> continuation) {
        super(2, continuation);
        this.f41135b = c3787x3;
        this.f41136c = str;
        this.f41137d = clientEventOuterClass$ClientEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3769v3(this.f41135b, this.f41136c, this.f41137d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((C3769v3) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41134a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3787x3 c3787x3 = this.f41135b;
            Ph.L l10 = c3787x3.f41187c;
            a aVar = new a(c3787x3, this.f41136c, this.f41137d, null);
            this.f41134a = 1;
            if (AbstractC1455i.g(l10, aVar, this) == coroutine_suspended) {
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
