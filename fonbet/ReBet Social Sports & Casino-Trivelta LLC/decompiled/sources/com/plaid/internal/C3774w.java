package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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

/* renamed from: com.plaid.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3774w extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3609d4 f41155a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public String f41156b;

    @DebugMetadata(c = "com.plaid.core.webview.BasePlaidWebViewClient$onPageFinished$1", f = "WebViewClients.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.w$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CookieManager.getInstance().flush();
            return Unit.INSTANCE;
        }
    }

    public C3774w(@NotNull C3609d4 urlInterceptor) {
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
        this.f41155a = urlInterceptor;
        this.f41156b = "";
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        if (Intrinsics.areEqual(cookie, this.f41156b)) {
            return;
        }
        this.f41156b = cookie;
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.b(), null, new a(null), 2, null);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        int statusCode = errorResponse.getStatusCode();
        if (400 > statusCode || statusCode >= 500 || statusCode == 408 || statusCode == 404) {
            C3556a6.a.b(C3556a6.f39823a, new C3709o5(C7.a(errorResponse)), "onReceivedHttpError");
        } else {
            C3556a6.a.b(C3556a6.f39823a, new C3709o5(C7.a(errorResponse)), "onReceivedHttpError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        C3556a6.a.e(C3556a6.f39823a, "onReceivedSslError " + error);
    }
}
