package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.E8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4126i8 implements E8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "i8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C4090g8 d;
    private C4000b8 e;
    private Context f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i8$a */
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
            if (C4126i8.this.c != null) {
                C4322t8.a(C4096ge.q, new C4233o8().a(C4427z5.A, C4126i8.g).a());
            }
            try {
                C4126i8.this.b(this.a);
                C4126i8.this.c.loadUrl(C4126i8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4126i8.this.a);
                C4126i8.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                C4157k4.d().a(e);
                C4126i8.this.b(this.a, e.getMessage());
                C4322t8.a(C4096ge.q, new C4233o8().a(C4427z5.A, e.getMessage()).a());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i8$b */
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
                WebView webView = C4126i8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4126i8.this.a);
                C4090g8 c4090g8 = C4126i8.this.d;
                if (c4090g8 != null) {
                    c4090g8.a(this.a, jSONObject);
                    C4126i8.this.d.b();
                }
                C4126i8 c4126i8 = C4126i8.this;
                c4126i8.d = null;
                c4126i8.f = null;
            } catch (Exception e) {
                C4157k4.d().a(e);
                String unused = C4126i8.this.a;
                C4322t8.a(C4096ge.r, new C4233o8().a(C4427z5.A, e.getMessage()).a());
                C4126i8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i8$c */
    public class c implements E8.a {
        final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.E8.a
        public void a(String str) {
            Logger.i(C4126i8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4126i8.this.b(this.a, str);
        }

        @Override // com.ironsource.E8.a
        public void b(String str) {
            Logger.i(C4126i8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4126i8.this.c.getParent()).removeView(C4126i8.this.c);
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4126i8.this.d();
        }
    }

    public C4126i8(InterfaceC4054e8 interfaceC4054e8, Context context, String str, C4000b8 c4000b8) {
        this.f = context;
        C4090g8 c4090g8 = new C4090g8();
        this.d = c4090g8;
        c4090g8.g(str);
        this.a = str;
        this.d.a(interfaceC4054e8);
        this.e = c4000b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new C4072f8(this), C4018c8.e);
        this.c.setWebViewClient(new C4108h8(new c(str)));
        this.c.setWebChromeClient(new d(this, 0));
        eh.a(this.c);
        this.d.a(this.c);
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf("/") + 1);
        return substring.substring(substring.indexOf("/"));
    }

    @Override // com.ironsource.E8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, U3.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(U3.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (!str.equals(U3.i.u0)) {
                b(str3, U3.c.C);
            } else {
                this.c.onResume();
                this.d.f(str2);
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            b(str3, U3.c.E);
        }
    }

    @Override // com.ironsource.E8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    @Override // com.ironsource.E8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    public void e(String str) {
        this.b = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i8$d */
    public class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4126i8.this.new d());
            webView2.setWebViewClient(new e(C4126i8.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public /* synthetic */ d(C4126i8 c4126i8, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i8$e */
    public class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4126i8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
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

        public /* synthetic */ e(C4126i8 c4126i8, int i) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public C4000b8 c() {
        return this.e;
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    public C4090g8 b() {
        return this.d;
    }

    @Override // com.ironsource.E8
    public void b(JSONObject jSONObject, String str, String str2) {
        O7.a.d(new a(str2, jSONObject, str));
    }

    public void b(String str, String str2) {
        C4090g8 c4090g8 = this.d;
        if (c4090g8 != null) {
            c4090g8.a(str, str2);
        }
    }

    public String a() {
        return this.a;
    }

    @Override // com.ironsource.E8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.E8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        O7.a.d(new b(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return i + this.b + d(str);
    }
}
