package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.link.OnLoadCallback;
import com.plaid.link.SubmissionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2", f = "PreloadLinkController.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3647h6 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f40654a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3674k6 f40656c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OnLoadCallback f40658e;

    @SourceDebugExtension({"SMAP\nPreloadLinkController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadLinkController.kt\ncom/plaid/internal/workflow/preload/PreloadLinkController$preloadWebview$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    /* renamed from: com.plaid.internal.h6$a */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnLoadCallback f40659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OnLoadCallback onLoadCallback) {
            super(0);
            this.f40659a = onLoadCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnLoadCallback onLoadCallback = this.f40659a;
            if (onLoadCallback != null) {
                onLoadCallback.onLoad();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2$2", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.h6$b */
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3674k6 f40660a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ P5 f40661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3674k6 c3674k6, P5 p52, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f40660a = c3674k6;
            this.f40661b = p52;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f40660a, this.f40661b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new b(this.f40660a, this.f40661b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SubmissionData submissionData = this.f40660a.f40738g;
            if (submissionData == null) {
                return null;
            }
            this.f40661b.a(submissionData.getPhoneNumber(), submissionData.getDateOfBirth(), submissionData.getParams());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3647h6(C3674k6 c3674k6, String str, OnLoadCallback onLoadCallback, Continuation<? super C3647h6> continuation) {
        super(2, continuation);
        this.f40656c = c3674k6;
        this.f40657d = str;
        this.f40658e = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C3647h6 c3647h6 = new C3647h6(this.f40656c, this.f40657d, this.f40658e, continuation);
        c3647h6.f40655b = obj;
        return c3647h6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((C3647h6) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40654a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Ph.P p10 = (Ph.P) this.f40655b;
            if (!Ph.F0.q(p10.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            P5 b10 = this.f40656c.f40734c.b();
            if (!Ph.F0.q(p10.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            C3674k6 c3674k6 = this.f40656c;
            C3692m6 listener = c3674k6.f40736e;
            L7 l72 = c3674k6.f40737f;
            String url = this.f40657d;
            l72.getClass();
            Intrinsics.checkNotNullParameter(url, "uri");
            Intrinsics.checkNotNullParameter(listener, "interceptor");
            Intrinsics.checkNotNullParameter(url, "url");
            C3609d4 c3609d4 = b10.f39510a;
            c3609d4.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            c3609d4.f40555a = listener;
            b10.loadUrl(url);
            b10.a(new a(this.f40658e));
            Ph.L b11 = C1452g0.b();
            b bVar = new b(this.f40656c, b10, null);
            this.f40654a = 1;
            if (AbstractC1455i.g(b11, bVar, this) == coroutine_suspended) {
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
