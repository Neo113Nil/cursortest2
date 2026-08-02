package com.plaid.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C3556a6;
import com.reactnativecommunity.clipboard.ClipboardModule;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class K5 extends C3774w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(@NotNull C3609d4 urlInterceptor) {
        super(urlInterceptor);
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        int errorCode = errorResponse.getErrorCode();
        if (400 > errorCode || errorCode >= 500 || errorCode == 408 || errorCode == 404) {
            C3556a6.a.b(C3556a6.f39823a, new C3709o5(B7.a(errorResponse)), "onReceivedError");
        } else {
            C3556a6.a.a(C3556a6.f39823a, new C3709o5(B7.a(errorResponse)), "onReceivedError");
        }
        super.onReceivedError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        String path;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        if (!request.isForMainFrame() && (path = request.getUrl().getPath()) != null && StringsKt.endsWith$default(path, "/favicon.ico", false, 2, (Object) null)) {
            try {
                return new WebResourceResponse(ClipboardModule.MIMETYPE_PNG, null, null);
            } catch (Exception e10) {
                C3556a6.a.a(C3556a6.f39823a, e10, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            C3609d4 c3609d4 = this.f41155a;
            String uri = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return c3609d4.a(uri);
        } catch (Exception e10) {
            C3556a6.a.a(C3556a6.f39823a, e10);
            return true;
        }
    }
}
