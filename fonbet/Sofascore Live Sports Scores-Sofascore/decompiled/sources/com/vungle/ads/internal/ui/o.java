package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o extends WebViewRenderProcessClient {
    public com.vungle.ads.internal.ui.view.p a;

    public o(com.vungle.ads.internal.ui.view.p pVar) {
        this.a = pVar;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        webView.getClass();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        webView.getClass();
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new n(webView, webViewRenderProcess));
        com.vungle.ads.internal.ui.view.p pVar = this.a;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).e();
        }
    }
}
