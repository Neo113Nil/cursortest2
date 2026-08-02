package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lsl extends WebViewClient {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ m0m a;

    public lsl(m0m m0mVar) {
        this.a = m0mVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        m0m m0mVar = this.a;
        m0mVar.d.getClass();
        String str2 = m0mVar.b;
        if (str2 != null) {
            m0mVar.evaluateJavascript(str2, new r5l(1));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        return false;
    }
}
