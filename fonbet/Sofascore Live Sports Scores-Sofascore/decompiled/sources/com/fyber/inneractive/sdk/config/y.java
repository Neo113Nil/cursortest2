package com.fyber.inneractive.sdk.config;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (iAConfigManager.K == webView) {
            iAConfigManager.K = null;
        }
        if (webView == null) {
            return true;
        }
        com.fyber.inneractive.sdk.util.v.a(webView);
        webView.destroy();
        return true;
    }
}
