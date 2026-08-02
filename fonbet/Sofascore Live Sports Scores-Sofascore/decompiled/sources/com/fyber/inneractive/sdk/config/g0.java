package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.N;
        WebView webView2 = iAConfigManager.K;
        if (webView2 == null || iAConfigManager.f == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new WebView(iAConfigManager.f);
            webView.setWebViewClient(new y());
        } catch (Throwable unused) {
            IAlog.a("failed to create a new webview", new Object[0]);
            webView = null;
        }
        iAConfigManager.K = webView;
    }
}
