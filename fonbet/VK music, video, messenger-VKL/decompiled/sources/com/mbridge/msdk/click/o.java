package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.B5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import xsna.wga0;

/* compiled from: WebViewSpider.java */
/* loaded from: classes13.dex */
public class o {
    private static final String r = "o";
    private int a;
    private int b;
    private com.mbridge.msdk.setting.g d;
    private f e;
    private String f;
    private String g;
    private WebView h;
    private boolean i;
    private String j;
    private int k;
    private boolean m;
    boolean n;
    boolean o;
    private boolean l = false;
    private final Runnable p = new d();
    private final Runnable q = new e();
    private Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: WebViewSpider.java */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        public a(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.a, this.b, this.c, oVar.f);
        }
    }

    /* compiled from: WebViewSpider.java */
    public class b extends WebViewClient {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        public b(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.m) {
                    o.this.k = 0;
                    o.this.f();
                    return;
                }
                o.this.o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.n = true;
                }
                synchronized (o.r) {
                    try {
                        o.this.f = str;
                        if (o.this.e == null || !o.this.e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            synchronized (o.r) {
                o.this.m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.e != null) {
                o.this.e.a(i, webView.getUrl(), str, o.this.j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.c).a(this.b, this.a, webView.getUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.r) {
                    o.this.m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.e != null) {
                    o.this.e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                q0.b(o.r, th.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.r) {
                try {
                    o oVar = o.this;
                    oVar.o = true;
                    oVar.c();
                    if (o.this.m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f = str;
                    if (o.this.e != null && o.this.e.c(str)) {
                        o.this.m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.i) {
                        HashMap hashMap = new HashMap();
                        if (o.this.h.getUrl() != null) {
                            hashMap.put("Referer", o.this.h.getUrl());
                        }
                        o.this.h.loadUrl(str, hashMap);
                    } else {
                        o.this.h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: WebViewSpider.java */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.m) {
                        o oVar = o.this;
                        if (!oVar.o) {
                            oVar.g();
                        }
                    }
                    if (o.this.e != null) {
                        o.this.e.b(webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: WebViewSpider.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 1;
            o.this.e();
        }
    }

    /* compiled from: WebViewSpider.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 2;
            o.this.e();
        }
    }

    /* compiled from: WebViewSpider.java */
    public interface f {
        void a(int i, String str, String str2, String str3);

        void a(String str, boolean z, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.a = 15000;
        this.b = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        com.mbridge.msdk.setting.g a2 = wga0.a(com.mbridge.msdk.setting.i.b());
        this.d = a2;
        if (a2 == null) {
            this.d = com.mbridge.msdk.setting.i.b().a();
        }
        this.i = this.d.O0();
        this.a = (int) this.d.u0();
        this.b = (int) this.d.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.c.removeCallbacks(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.c.removeCallbacks(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (r) {
            try {
                try {
                    b();
                    this.h.destroy();
                    f fVar = this.e;
                    if (fVar != null) {
                        fVar.a(this.f, this.l, this.j);
                    }
                } catch (Exception e2) {
                    q0.b(r, e2.getMessage());
                } catch (Throwable th) {
                    q0.b(r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.e;
                        if (fVar != null) {
                            fVar.a(this.f, this.l, this.j);
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    q0.b(r, e2.getMessage());
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.c.postDelayed(this.p, this.b);
    }

    private void j() {
        this.c.postDelayed(this.q, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.g = str4;
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f);
        } else {
            this.c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.g)) {
                this.h.getSettings().setDefaultTextEncodingName(B5.O);
                this.b = 2000;
                this.a = 2000;
                q0.c(r, this.g);
                this.h.loadDataWithBaseURL(str3, this.g, "*/*", B5.O, str3);
                return;
            }
            if (this.i) {
                HashMap hashMap = new HashMap();
                if (this.h.getUrl() != null) {
                    hashMap.put("Referer", this.h.getUrl());
                }
                this.h.loadUrl(str3, hashMap);
                return;
            }
            this.h.loadUrl(str3);
        } catch (Throwable th) {
            try {
                f fVar = this.e;
                if (fVar != null) {
                    fVar.a(0, this.f, th.getMessage(), this.j);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.h.getSettings().setCacheMode(2);
        this.h.getSettings().setLoadsImagesAutomatically(false);
        this.h.setWebViewClient(new b(str2, str, context));
        this.h.setWebChromeClient(new c());
    }
}
