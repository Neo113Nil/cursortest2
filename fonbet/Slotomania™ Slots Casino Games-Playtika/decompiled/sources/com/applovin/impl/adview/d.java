package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.p;

/* loaded from: classes3.dex */
class d {
    private final com.applovin.impl.sdk.l a;
    private final WebViewRenderProcessClient b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.a.Q();
                if (p.a()) {
                    d.this.a.Q().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
    }

    WebViewRenderProcessClient a() {
        return this.b;
    }
}
