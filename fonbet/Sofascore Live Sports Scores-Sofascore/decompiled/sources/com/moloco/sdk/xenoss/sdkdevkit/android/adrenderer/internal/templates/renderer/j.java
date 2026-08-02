package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.ironsource.U3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import defpackage.ad2;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.k0l;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.un0;
import defpackage.xw3;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends WebViewClientCompat {
    public static final /* synthetic */ int s = 0;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f a;
    public final com.moloco.sdk.acm.recorder.c b;
    public final boolean c;
    public final ad2 d;
    public final fdi e;
    public final fdi f;
    public final fdi g;
    public final jof h;
    public final fdi i;
    public final jof j;
    public int k;
    public g9i l;
    public g9i m;
    public final fdi n;
    public g9i o;
    public com.moloco.sdk.acm.h p;
    public com.moloco.sdk.acm.h q;
    public String r;

    public j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar, com.moloco.sdk.acm.recorder.c cVar, boolean z) {
        this.a = fVar;
        this.b = cVar;
        this.c = z;
        hs4 hs4Var = z45.a;
        this.d = s9a.c(rob.a);
        Boolean bool = Boolean.FALSE;
        fdi a = gdi.a(bool);
        this.e = a;
        this.f = a;
        fdi a2 = gdi.a(bool);
        this.g = a2;
        this.h = un0.u(a2);
        fdi a3 = gdi.a(null);
        this.i = a3;
        this.j = un0.u(a3);
        this.n = gdi.a(bool);
    }

    public final void a(String str, int i, WebView webView) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Retrying error... Attempt: " + (this.k + 1), null, false, 12, null);
        this.k = this.k + 1;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_html_ad_retry_attempt");
        dVar.a("required", "true");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar.a("attempt", String.valueOf(this.k));
        dVar.a("reason", String.valueOf(str));
        dVar.a("status_code", String.valueOf(i));
        this.b.a(dVar);
        g9i g9iVar = this.l;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.l = xw3.L(this.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, webView, rq3Var, 2), 3);
    }

    public final void b(String str, int i, f0 f0Var) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder q = mz1.q(i, "Setting unrecoverable error with description: ", str, ", code: ", ", errorType: ");
        q.append(f0Var);
        MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", q.toString(), null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_html_ad_error");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar.a("result", "failure");
        dVar.a("required", "true");
        dVar.a("reason", String.valueOf(str));
        dVar.a("status_code", String.valueOf(i));
        dVar.a("is_loaded", String.valueOf(((Boolean) this.f.getValue()).booleanValue()));
        this.b.a(dVar);
        this.r = str;
        fdi fdiVar = this.i;
        fdiVar.getClass();
        fdiVar.m(null, f0Var);
    }

    public final void c() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("HTML Page finished loading is success: ");
        jof jofVar = this.j;
        int i = 1;
        sb.append(jofVar.a.getValue() == null);
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb.toString(), null, false, 12, null);
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = this.g;
        fdiVar.getClass();
        rq3 rq3Var = null;
        fdiVar.m(null, bool);
        Object value = jofVar.a.getValue();
        com.moloco.sdk.acm.recorder.c cVar = this.b;
        if (value == null) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_page_load_end");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("result", "success");
            cVar.a(dVar);
            com.moloco.sdk.acm.h hVar = this.p;
            if (hVar != null) {
                hVar.a("result", "success");
                cVar.b(hVar);
            }
            this.o = xw3.L(this.d, null, null, new i(this, rq3Var, i), 3);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        Boolean bool2 = Boolean.FALSE;
        fdi fdiVar2 = this.e;
        fdiVar2.getClass();
        fdiVar2.m(null, bool2);
        g9i g9iVar = this.o;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        g9i g9iVar2 = this.l;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        this.l = null;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("webview_page_load_end");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar2.a("result", "failure");
        String str = this.r;
        if (str == null) {
            str = "unknown";
        }
        dVar2.a("reason", str);
        cVar.a(dVar2);
        com.moloco.sdk.acm.h hVar2 = this.p;
        if (hVar2 != null) {
            hVar2.a("result", "failure");
            String str2 = this.r;
            hVar2.a("reason", str2 != null ? str2 : "unknown");
            cVar.b(hVar2);
        }
    }

    public final boolean d() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("retryCount: ");
        sb.append(this.k);
        sb.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb.append(this.k < 5);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sb.toString(), false, 4, null);
        return this.k < 5;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("Webview page finished loading has pending error: ");
        fdi fdiVar = this.n;
        sb.append(((Boolean) fdiVar.getValue()).booleanValue());
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb.toString(), null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_page_load_finish_callback");
        dVar.a("pending_error", String.valueOf(((Boolean) fdiVar.getValue()).booleanValue()));
        this.b.a(dVar);
        if (!((Boolean) fdiVar.getValue()).booleanValue()) {
            c();
            return;
        }
        this.m = xw3.L(this.d, null, null, new i(this, null, 0), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "HTML Page started loading", null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_page_load_start");
        com.moloco.sdk.acm.recorder.c cVar = this.b;
        cVar.a(dVar);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        this.p = cVar.c("webview_page_load_ms");
        this.q = cVar.c("webview_required_content_load_ms");
    }

    @Override // androidx.webkit.WebViewClientCompat
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, k0l k0lVar) {
        webView.getClass();
        webResourceRequest.getClass();
        k0lVar.getClass();
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = this.n;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + k0lVar.b() + ", with description: " + ((Object) k0lVar.a()) + " for url: " + webResourceRequest.getUrl() + " ad isLoaded: " + ((Boolean) this.f.getValue()).booleanValue() + ", isPageFinished: " + ((Boolean) this.h.a.getValue()).booleanValue(), null, false, 12, null);
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        webView.evaluateJavascript(lnb.o("ContentChecker.isRequiredContent('", uri, "');"), new g(this, k0lVar, webView, 1));
        super.onReceivedError(webView, webResourceRequest, k0lVar);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = this.n;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", U3.j.d + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(webResourceResponse.getStatusCode()) + ", with description: " + webResourceResponse.getReasonPhrase() + " for url: " + webResourceRequest.getUrl(), null, false, 12, null);
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        webView.evaluateJavascript(lnb.o("ContentChecker.isRequiredContent('", uri, "');"), new g(this, webResourceResponse, webView, 0));
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_html_ad_error");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar.a("result", "failure");
        dVar.a("reason", "render_process_gone_error");
        dVar.a("is_loaded", String.valueOf(((Boolean) this.f.getValue()).booleanValue()));
        this.b.a(dVar);
        f0 f0Var = f0.e;
        fdi fdiVar = this.i;
        fdiVar.getClass();
        fdiVar.m(null, f0Var);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        Boolean bool = Boolean.FALSE;
        fdi fdiVar2 = this.n;
        fdiVar2.getClass();
        fdiVar2.m(null, bool);
        return true;
    }
}
