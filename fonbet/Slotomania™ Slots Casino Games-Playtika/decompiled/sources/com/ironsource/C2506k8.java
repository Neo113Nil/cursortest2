package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.G8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2506k8 implements G8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "k8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C2471i8 d;
    private C2381d8 e;
    private Context f;

    /* renamed from: com.ironsource.k8$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2506k8.this.c != null) {
                C2703v8.a(C2459he.q, new C2614q8().a(B5.A, C2506k8.g).a());
            }
            try {
                C2506k8.this.b(this.a);
                IronSourceNetworkBridge.webviewLoadUrl(C2506k8.this.c, C2506k8.this.a(this.b.getString("urlForWebView")));
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put("adViewId", C2506k8.this.a);
                C2506k8.this.d.a(this.c, jsonObjectInit);
            } catch (Exception e) {
                C2556n4.d().a(e);
                C2506k8.this.b(this.a, e.getMessage());
                C2703v8.a(C2459he.q, new C2614q8().a(B5.A, e.getMessage()).a());
            }
        }
    }

    /* renamed from: com.ironsource.k8$b */
    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C2506k8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put("adViewId", C2506k8.this.a);
                C2471i8 c2471i8 = C2506k8.this.d;
                if (c2471i8 != null) {
                    c2471i8.a(this.a, jsonObjectInit);
                    C2506k8.this.d.b();
                }
                C2506k8 c2506k8 = C2506k8.this;
                c2506k8.d = null;
                c2506k8.f = null;
            } catch (Exception e) {
                C2556n4.d().a(e);
                Log.e(C2506k8.h, "performCleanup | could not destroy ISNAdView webView ID: " + C2506k8.this.a);
                C2703v8.a(C2459he.r, new C2614q8().a(B5.A, e.getMessage()).a());
                C2506k8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.k8$c */
    class c implements G8.a {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.G8.a
        public void a(String str) {
            Logger.i(C2506k8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C2506k8.this.b(this.a, str);
        }

        @Override // com.ironsource.G8.a
        public void b(String str) {
            Logger.i(C2506k8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C2506k8.this.c.getParent()).removeView(C2506k8.this.c);
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C2506k8.this.d();
        }
    }

    /* renamed from: com.ironsource.k8$d */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/k8$d;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
            boolean safedk_k8$d_onCreateWindow_40ace430e22092059a833db5ed169609 = safedk_k8$d_onCreateWindow_40ace430e22092059a833db5ed169609(webView, z, z2, message);
            BrandSafetyUtils.onWebChromeClientCreateWindow(com.safedk.android.utils.h.f, webView, message, safedk_k8$d_onCreateWindow_40ace430e22092059a833db5ed169609);
            return safedk_k8$d_onCreateWindow_40ace430e22092059a833db5ed169609;
        }

        public boolean safedk_k8$d_onCreateWindow_40ace430e22092059a833db5ed169609(WebView p0, boolean p1, boolean p2, Message p3) {
            WebView webView = new WebView(p0.getContext());
            webView.setWebChromeClient(C2506k8.this.new d());
            webView.setWebViewClient(new e());
            ((WebView.WebViewTransport) p3.obj).setWebView(webView);
            p3.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* renamed from: com.ironsource.k8$e */
    private class e extends WebViewClient {
        private e() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
            p0.startActivity(p1);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C2506k8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_k8$e_shouldOverrideUrlLoading_99fdc2ad9b01189ee46cb43bb9a65fd5(WebView p0, String p1) {
            Context context = p0.getContext();
            Intent a = new OpenUrlActivity.e(new k.c()).a(p1).b(false).a(context);
            a.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/k8$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_k8$e_shouldOverrideUrlLoading_99fdc2ad9b01189ee46cb43bb9a65fd5 = safedk_k8$e_shouldOverrideUrlLoading_99fdc2ad9b01189ee46cb43bb9a65fd5(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_k8$e_shouldOverrideUrlLoading_99fdc2ad9b01189ee46cb43bb9a65fd5);
            return safedk_k8$e_shouldOverrideUrlLoading_99fdc2ad9b01189ee46cb43bb9a65fd5;
        }
    }

    public C2506k8(InterfaceC2435g8 interfaceC2435g8, Context context, String str, C2381d8 c2381d8) {
        this.f = context;
        C2471i8 c2471i8 = new C2471i8();
        this.d = c2471i8;
        c2471i8.g(str);
        this.a = str;
        this.d.a(interfaceC2435g8);
        this.e = c2381d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.a;
    }

    public C2471i8 b() {
        return this.d;
    }

    public C2381d8 c() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.ironsource.G8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf("/") + 1);
        return substring.substring(substring.indexOf("/"));
    }

    @Override // com.ironsource.G8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.G8
    public void b(JSONObject jSONObject, String str, String str2) {
        Q7.a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.G8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        IronSourceNetworkBridge.webviewAddJavascriptInterface(webView, new C2453h8(this), C2399e8.e);
        this.c.setWebViewClient(new C2488j8(new c(str)));
        this.c.setWebChromeClient(new d());
        bh.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.G8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        Q7.a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.G8
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
            C2556n4.d().a(e2);
            b(str3, X3.c.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return c(str) ? "file://" + this.b + d(str) : str;
    }

    public void b(String str, String str2) {
        C2471i8 c2471i8 = this.d;
        if (c2471i8 != null) {
            c2471i8.a(str, str2);
        }
    }
}
