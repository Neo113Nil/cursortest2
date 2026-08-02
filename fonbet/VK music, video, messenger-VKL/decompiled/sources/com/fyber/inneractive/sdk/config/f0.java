package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.B5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class f0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (iAConfigManager.K == null && (context = iAConfigManager.f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new y());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.K = webView;
        }
        WebView webView2 = iAConfigManager.K;
        String str = this.a;
        String str2 = this.b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", B5.O, null);
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(IAConfigManager.P, TimeUnit.SECONDS.toMillis(10L));
    }
}
