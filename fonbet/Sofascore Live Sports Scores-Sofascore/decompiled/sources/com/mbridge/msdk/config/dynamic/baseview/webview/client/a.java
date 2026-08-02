package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends WebChromeClient {
    private final String a = "MBWebChromeClient";
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i);
        }
    }
}
