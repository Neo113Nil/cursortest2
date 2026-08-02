package defpackage;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class sl extends WebViewClient {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public sl(Context context, Function0 function0, Function0 function02, Function0 function03) {
        this.b = context;
        this.c = function0;
        this.d = function02;
        this.e = function03;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Function0 function0;
        if (this.a || (function0 = this.e) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.a = true;
        Function0 function0 = this.d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.a = true;
        Function0 function0 = this.d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!Intrinsics.c(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null, Boolean.TRUE)) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        f7a.g = true;
        Function0 function0 = this.d;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        bea.G(this.b, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        Function0 function0 = this.c;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }
}
