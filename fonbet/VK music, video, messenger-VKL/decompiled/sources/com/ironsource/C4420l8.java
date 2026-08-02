package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.H8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4420l8 implements H8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "l8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C4384j8 d;
    private C4295e8 e;
    private Context f;

    /* renamed from: com.ironsource.l8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4420l8.this.c != null) {
                C4617w8.a(C4355he.q, new C4527r8().a(B5.A, C4420l8.g).a());
            }
            try {
                C4420l8.this.b(this.a);
                C4420l8.this.c.loadUrl(C4420l8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4420l8.this.a);
                C4420l8.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                C4452n4.d().a(e);
                C4420l8.this.b(this.a, e.getMessage());
                C4617w8.a(C4355he.q, new C4527r8().a(B5.A, e.getMessage()).a());
            }
        }
    }

    /* renamed from: com.ironsource.l8$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4420l8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4420l8.this.a);
                C4384j8 c4384j8 = C4420l8.this.d;
                if (c4384j8 != null) {
                    c4384j8.a(this.a, jSONObject);
                    C4420l8.this.d.b();
                }
                C4420l8 c4420l8 = C4420l8.this;
                c4420l8.d = null;
                c4420l8.f = null;
            } catch (Exception e) {
                C4452n4.d().a(e);
                Log.e(C4420l8.h, "performCleanup | could not destroy ISNAdView webView ID: " + C4420l8.this.a);
                C4617w8.a(C4355he.r, new C4527r8().a(B5.A, e.getMessage()).a());
                C4420l8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.l8$c */
    public class c implements H8.a {
        final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.H8.a
        public void a(String str) {
            Logger.i(C4420l8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4420l8.this.b(this.a, str);
        }

        @Override // com.ironsource.H8.a
        public void b(String str) {
            Logger.i(C4420l8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4420l8.this.c.getParent()).removeView(C4420l8.this.c);
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4420l8.this.d();
        }
    }

    /* renamed from: com.ironsource.l8$d */
    public class d extends WebChromeClient {
        public /* synthetic */ d(C4420l8 c4420l8, int i) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4420l8.this.new d());
            webView2.setWebViewClient(new e(C4420l8.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* renamed from: com.ironsource.l8$e */
    public class e extends WebViewClient {
        public /* synthetic */ e(C4420l8 c4420l8, int i) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4420l8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent a = new OpenUrlActivity.e(new k.c()).a(str).b(false).a(context);
            a.addFlags(268435456);
            context.startActivity(a);
            return true;
        }

        private e() {
        }
    }

    public C4420l8(InterfaceC4349h8 interfaceC4349h8, Context context, String str, C4295e8 c4295e8) {
        this.f = context;
        C4384j8 c4384j8 = new C4384j8();
        this.d = c4384j8;
        c4384j8.g(str);
        this.a = str;
        this.d.a(interfaceC4349h8);
        this.e = c4295e8;
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.a;
    }

    public C4384j8 b() {
        return this.d;
    }

    public C4295e8 c() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf(DomExceptionUtils.SEPARATOR) + 1);
        return substring.substring(substring.indexOf(DomExceptionUtils.SEPARATOR));
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        R7.a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new C4367i8(this), C4313f8.e);
        this.c.setWebViewClient(new C4402k8(new c(str)));
        this.c.setWebChromeClient(new d(this, 0));
        hh.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        R7.a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, X3.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(X3.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(X3.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, X3.c.C);
            }
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            b(str3, X3.c.E);
        }
    }

    public void b(String str, String str2) {
        C4384j8 c4384j8 = this.d;
        if (c4384j8 != null) {
            c4384j8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return i + this.b + d(str);
    }
}
