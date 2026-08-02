package co.paystack.android.ui;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import i3.AbstractC4523d;
import i3.AbstractC4524e;
import j3.C5091a;

/* loaded from: classes.dex */
public class AuthActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public final co.paystack.android.ui.b f28065a = co.paystack.android.ui.b.a();

    /* renamed from: b, reason: collision with root package name */
    public WebView f28066b;

    /* renamed from: c, reason: collision with root package name */
    public String f28067c;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (str.contains(C5091a.f53660b + "charge/three_d_response/")) {
                webView.loadUrl("javascript:window.INTERFACE.processContent(document.getElementById('return').innerText);");
            }
        }
    }

    public class b extends c {
        public b() {
            super();
        }

        @JavascriptInterface
        public void processContent(String str) {
            AuthActivity.this.f28067c = str;
            AuthActivity.this.b();
        }
    }

    public abstract class c {
        public c() {
        }
    }

    public class d {
        public d() {
        }

        public final c b() {
            return AuthActivity.this.new b();
        }
    }

    public void b() {
        if (this.f28067c == null) {
            this.f28067c = "{\"status\":\"requery\",\"message\":\"Reaffirm Transaction Status on Server\"}";
        }
        synchronized (this.f28065a) {
            this.f28065a.d(this.f28067c);
            this.f28065a.notify();
        }
        finish();
    }

    public void c() {
        setContentView(AbstractC4524e.f48078a);
        WebView webView = (WebView) findViewById(AbstractC4523d.f48077q);
        this.f28066b = webView;
        webView.setKeepScreenOn(true);
        this.f28066b.getSettings().setJavaScriptEnabled(true);
        this.f28066b.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f28066b.addJavascriptInterface(new d().b(), "INTERFACE");
        this.f28066b.setWebViewClient(new a());
        this.f28066b.loadUrl(this.f28065a.c());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC4524e.f48078a);
        setTitle("Authorize your card");
        getWindow().addFlags(128);
        this.f28066b = (WebView) findViewById(AbstractC4523d.f48077q);
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f28066b;
        if (webView != null) {
            webView.stopLoading();
            this.f28066b.removeJavascriptInterface("INTERFACE");
        }
        b();
    }
}
