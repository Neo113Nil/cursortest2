package com.plaid.internal;

import Ph.AbstractC1459k;
import com.plaid.internal.C3556a6;
import com.plaid.internal.I2;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkResult;
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

/* renamed from: com.plaid.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3797y4 extends G {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public String f41206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3806z4 f41207b;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onNoResultFromChannel$1", f = "OutOfProcessWebviewViewModel.kt", i = {1}, l = {93, 95}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
    /* renamed from: com.plaid.internal.y4$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public C3806z4 f41208a;

        /* renamed from: b, reason: collision with root package name */
        public LinkResult f41209b;

        /* renamed from: c, reason: collision with root package name */
        public int f41210c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C3806z4 f41211d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3797y4 f41212e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3806z4 c3806z4, C3797y4 c3797y4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f41211d = c3806z4;
            this.f41212e = c3797y4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f41211d, this.f41212e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new a(this.f41211d, this.f41212e, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        
            if (r9 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            C3806z4 c3806z4;
            LinkResult linkResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41210c;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3806z4 c3806z42 = this.f41211d;
                this.f41210c = 1;
                obj = C3806z4.b(c3806z42, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkResult = this.f41209b;
                    c3806z4 = this.f41208a;
                    ResultKt.throwOnFailure(obj);
                    C3806z4.a(c3806z4, linkResult);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            LinkResult linkResult2 = (LinkResult) obj;
            if (linkResult2 == null) {
                C3556a6.a.a(C3556a6.f39823a, "Link Exit -- no LinkResult from polling and no preCompletionResult.");
                C3806z4.a(this.f41211d, new LinkExit(null, new LinkExitMetadata(null, null, this.f41212e.b(), null, null, 27, null)));
                return Unit.INSTANCE;
            }
            c3806z4 = this.f41211d;
            C3556a6.a.a(C3556a6.f39823a, "The preCompletionResult is: " + linkResult2);
            I7 b10 = c3806z4.b();
            this.f41208a = c3806z4;
            this.f41209b = linkResult2;
            this.f41210c = 2;
            if (b10.b(this) != coroutine_suspended) {
                linkResult = linkResult2;
                C3806z4.a(c3806z4, linkResult);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onPreCompletionResult$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.y4$b */
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f41213a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3806z4 f41214b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Channel$Message.SDKResult f41215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3806z4 c3806z4, Channel$Message.SDKResult sDKResult, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f41214b = c3806z4;
            this.f41215c = sDKResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f41214b, this.f41215c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new b(this.f41214b, this.f41215c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41213a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3806z4 c3806z4 = this.f41214b;
                Channel$Message.SDKResult sDKResult = this.f41215c;
                this.f41213a = 1;
                z8 z8Var = c3806z4.f41236f;
                if (z8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("writePreCompletionResult");
                    z8Var = null;
                }
                Object a10 = z8Var.a(sDKResult, this);
                if (a10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a10 = Unit.INSTANCE;
                }
                if (a10 == coroutine_suspended) {
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

    public C3797y4(C3806z4 c3806z4) {
        this.f41207b = c3806z4;
    }

    @Override // com.plaid.internal.G
    public final void a(@NotNull Channel$Message.SDKResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C3556a6.a.a(C3556a6.f39823a, "Pre Completion Result: " + result);
        AbstractC1459k.d(androidx.lifecycle.S.a(this.f41207b), null, null, new b(this.f41207b, result, null), 3, null);
    }

    @Nullable
    public final String b() {
        return this.f41206a;
    }

    @Override // com.plaid.internal.G
    public final void a(@NotNull LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C3556a6.a.a(C3556a6.f39823a, "Link Result from polling: " + result);
        C3806z4.a(this.f41207b, result);
    }

    @Override // com.plaid.internal.G
    public final void a(@NotNull LinkEvent event, @NotNull I2.d options) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(options, "options");
        C3556a6.a.a(C3556a6.f39823a, "Link Event from polling: " + event);
        if (this.f41206a == null) {
            this.f41206a = event.getMetadata().getLinkSessionId();
        }
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(event, options);
        }
    }

    @Override // com.plaid.internal.G
    public final void a() {
        AbstractC1459k.d(androidx.lifecycle.S.a(this.f41207b), null, null, new a(this.f41207b, this, null), 3, null);
    }
}
