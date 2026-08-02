package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import com.plaid.internal.L5;
import com.plaid.internal.P5;
import com.plaid.internal.Q0;
import com.plaid.link.Plaid;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import ei.AbstractC4212b;
import j.AbstractC5086b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.d;

/* loaded from: classes3.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkTokenConfiguration f39551a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final AbstractC5086b f39552b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<LinkTokenConfiguration, Unit> f39553c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<LinkExit, Unit> f39554d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final P0 f39555e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final C3795y2 f39556f;

    @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1", f = "EmbeddedViewHandler.kt", i = {}, l = {78, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39559a;

        @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1$1", f = "EmbeddedViewHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f39561a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q0 f39562b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Q0 q02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f39561a = obj;
                this.f39562b = q02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f39561a, this.f39562b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
                return new a(this.f39561a, this.f39562b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f39561a;
                Q0 q02 = this.f39562b;
                if (Result.m150exceptionOrNullimpl(obj2) != null) {
                    q02.f39556f.getProgressBar$link_sdk_release().setVisibility(4);
                    q02.f39556f.getWebView$link_sdk_release().setVisibility(4);
                    q02.f39556f.getRetryContainer$link_sdk_release().setVisibility(0);
                    return Unit.INSTANCE;
                }
                Q0 q03 = this.f39562b;
                P5 webView$link_sdk_release = q03.f39556f.getWebView$link_sdk_release();
                webView$link_sdk_release.loadUrl((String) obj2);
                webView$link_sdk_release.setVisibility(0);
                q03.f39556f.getProgressBar$link_sdk_release().setVisibility(4);
                q03.f39556f.getRetryContainer$link_sdk_release().setVisibility(4);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return Q0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return Q0.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            if (Ph.AbstractC1455i.g(r1, r3, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object a10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39559a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Q0 q02 = Q0.this;
                P0 p02 = q02.f39555e;
                String token = q02.f39551a.getToken();
                this.f39559a = 1;
                a10 = p02.a(token, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a10 = ((Result) obj).getValue();
            }
            Ph.M0 c10 = C1452g0.c();
            a aVar = new a(a10, Q0.this, null);
            this.f39559a = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(@NotNull Context context, @NotNull LinkTokenConfiguration linkTokenConfig, @Nullable AbstractC5086b abstractC5086b, @Nullable Function1<? super LinkTokenConfiguration, Unit> function1, @NotNull Function1<? super LinkExit, Unit> failureCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(linkTokenConfig, "linkTokenConfig");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        this.f39551a = linkTokenConfig;
        this.f39552b = abstractC5086b;
        this.f39553c = function1;
        this.f39554d = failureCallback;
        Plaid plaid = Plaid.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        P0 p02 = new P0(plaid.provideLinkTokenComponent$link_sdk_release((Application) applicationContext));
        this.f39555e = p02;
        a aVar = new a(context);
        AbstractC4212b abstractC4212b = p02.f39497c;
        if (abstractC4212b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            abstractC4212b = null;
        }
        S0 s02 = new S0(aVar, abstractC4212b);
        C3795y2 c3795y2 = new C3795y2(context);
        P5 webView$link_sdk_release = c3795y2.getWebView$link_sdk_release();
        R0 listener = new R0(s02);
        webView$link_sdk_release.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "interceptor");
        Context context2 = webView$link_sdk_release.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(P5.a.a(context));
        }
        webView$link_sdk_release.f39512c = L5.a.f39346a;
        C3609d4 c3609d4 = webView$link_sdk_release.f39510a;
        c3609d4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c3609d4.f40555a = listener;
        c3795y2.getRetryButton$link_sdk_release().setOnClickListener(new View.OnClickListener() { // from class: hc.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q0.a(Q0.this, view);
            }
        });
        this.f39556f = c3795y2;
    }

    public static final void a(Q0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public final void a() {
        this.f39556f.getProgressBar$link_sdk_release().setVisibility(0);
        this.f39556f.getWebView$link_sdk_release().setVisibility(4);
        this.f39556f.getRetryContainer$link_sdk_release().setVisibility(4);
        AbstractC1459k.d(C3809z7.a(this.f39556f), null, null, new b(null), 3, null);
    }

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f39558b;

        public a(Context context) {
            this.f39558b = context;
        }

        public final void a(@NotNull M0 embeddedSessionInfo) {
            Intrinsics.checkNotNullParameter(embeddedSessionInfo, "embeddedSessionInfo");
            LinkTokenConfiguration build = new LinkTokenConfiguration.Builder().embeddedSessionInfo(embeddedSessionInfo).noLoadingState(Q0.this.f39551a.getNoLoadingState()).logLevel(Q0.this.f39551a.getLogLevel()).build();
            Q0 q02 = Q0.this;
            AbstractC5086b abstractC5086b = q02.f39552b;
            if (abstractC5086b != null) {
                abstractC5086b.b(build);
                return;
            }
            Function1<LinkTokenConfiguration, Unit> function1 = q02.f39553c;
            if (function1 != null) {
                function1.invoke(build);
            }
        }

        public final void a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            w.d a10 = new d.C0946d().a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            a10.a(this.f39558b, Uri.parse(url));
        }

        public final void a(@NotNull LinkExit linkExit) {
            Intrinsics.checkNotNullParameter(linkExit, "linkExit");
            Q0.this.f39554d.invoke(linkExit);
        }
    }
}
