package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.C2323a4;
import com.ironsource.C2338b1;
import com.ironsource.C2350bd;
import com.ironsource.C2356c1;
import com.ironsource.C2365ca;
import com.ironsource.C2368cd;
import com.ironsource.C2395e4;
import com.ironsource.C2396e5;
import com.ironsource.C2417f8;
import com.ironsource.C2419fa;
import com.ironsource.C2431g4;
import com.ironsource.C2459he;
import com.ironsource.C2472i9;
import com.ironsource.C2477ie;
import com.ironsource.C2484j4;
import com.ironsource.C2516l0;
import com.ironsource.C2524l8;
import com.ironsource.C2556n4;
import com.ironsource.C2578o8;
import com.ironsource.C2586og;
import com.ironsource.C2596p8;
import com.ironsource.C2614q8;
import com.ironsource.C2667t8;
import com.ironsource.C2678u1;
import com.ironsource.C2703v8;
import com.ironsource.C2735x4;
import com.ironsource.C2757y8;
import com.ironsource.E1;
import com.ironsource.EnumC2507k9;
import com.ironsource.G8;
import com.ironsource.InterfaceC2326a7;
import com.ironsource.InterfaceC2344b7;
import com.ironsource.InterfaceC2413f4;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.InterfaceC2616qa;
import com.ironsource.InterfaceC2627r4;
import com.ironsource.InterfaceC2645s4;
import com.ironsource.InterfaceC2663t4;
import com.ironsource.InterfaceC2681u4;
import com.ironsource.InterfaceC2714w1;
import com.ironsource.InterfaceC2738x7;
import com.ironsource.InterfaceC2747xg;
import com.ironsource.Jb;
import com.ironsource.M6;
import com.ironsource.Mb;
import com.ironsource.N;
import com.ironsource.Nc;
import com.ironsource.Pc;
import com.ironsource.Pe;
import com.ironsource.Q7;
import com.ironsource.Qc;
import com.ironsource.R3;
import com.ironsource.Rc;
import com.ironsource.T3;
import com.ironsource.T4;
import com.ironsource.U3;
import com.ironsource.U4;
import com.ironsource.X3;
import com.ironsource.X4;
import com.ironsource.X6;
import com.ironsource.Yg;
import com.ironsource.Z3;
import com.ironsource.ah;
import com.ironsource.bh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.ironsourceads.internal.services.a;
import com.vungle.ads.internal.model.AdPayload;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class v implements com.ironsource.sdk.controller.l, Nc, DownloadListener {
    private static final String d0 = "about:blank";
    public static int e0 = 0;
    public static String f0 = "is_store";
    public static String g0 = "external_url";
    public static String h0 = "secondary_web_view";
    private static String i0 = "success";
    private static String j0 = "fail";
    private InterfaceC2645s4 A;
    private String B;
    private com.ironsource.sdk.controller.d C;
    private InterfaceC2747xg D;
    private C2356c1 E;
    private U4 H;
    private com.ironsource.sdk.controller.o I;
    private com.ironsource.sdk.controller.q J;
    private com.ironsource.sdk.controller.u K;
    private com.ironsource.sdk.controller.i L;
    private com.ironsource.sdk.controller.a M;
    private com.ironsource.sdk.controller.j N;
    private C2678u1 O;
    private C2735x4 P;
    private ah Q;
    private com.ironsource.sdk.controller.c R;
    private R3 S;
    private JSONObject T;
    private l.a U;
    private l.b V;
    private C2484j4 W;
    private boolean X;
    private final boolean Y;
    private final InterfaceC2738x7 Z;
    private final Q7 a;
    C2323a4 a0;
    private InterfaceC2413f4 b;
    private volatile C2419fa b0;
    private Pc c0;
    private String f;
    private String g;
    private final C2396e5 h;
    private boolean i;
    private q j;
    private boolean k;
    private CountDownTimer l;
    public CountDownTimer m;
    private final p r;
    private View s;
    private FrameLayout t;
    private WebChromeClient.CustomViewCallback u;
    private FrameLayout v;
    private EnumC0225v w;
    private String x;
    private InterfaceC2681u4 y;
    private InterfaceC2663t4 z;
    private String c = "v";
    private String d = "IronSource";
    private final String e = "We're sorry, some error occurred. we will investigate it";
    private final Yg n = new Yg();
    private int o = 50;
    private int p = 50;
    private String q = X3.e.b;
    private Object F = new Object();
    private boolean G = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class c implements Runnable {
        final /* synthetic */ C2596p8 a;

        c(C2596p8 c2596p8) {
            this.a = c2596p8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.R.c("controller html - failed to download - " + this.a.b());
        }
    }

    class d implements Runnable {
        final /* synthetic */ Context a;

        d(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.a);
        }
    }

    class e implements Runnable {
        final /* synthetic */ Context a;

        e(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.a);
        }
    }

    class f implements Runnable {
        final /* synthetic */ C2578o8.e a;
        final /* synthetic */ String b;

        f(C2578o8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2627r4 a;
            C2578o8.e eVar = this.a;
            if ((eVar == C2578o8.e.RewardedVideo || eVar == C2578o8.e.Interstitial) && (a = v.this.a(eVar)) != null) {
                a.b(this.a, this.b);
            }
        }
    }

    class h implements ah {
        h() {
        }

        @Override // com.ironsource.ah
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    class i implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ WebView b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        i(JSONObject jSONObject, WebView webView, int i, String str) {
            this.a = jSONObject;
            this.b = webView;
            this.c = i;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.a, this.b);
            if (v.B()) {
                v.this.n.a(this.c, this.d);
                v.this.m("about:blank");
            } else {
                v.this.m("about:blank");
                v.this.m(this.d);
            }
        }
    }

    class j extends CountDownTimer {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.R.c(X3.c.j);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronLog.INTERNAL.verbose("Stopping WebView load before retry attempt $nextAttempt");
                    v.this.b0.stopLoading();
                } catch (Exception unused) {
                    IronLog.INTERNAL.verbose("Failed to stop WebView loading: $error");
                }
                j jVar = j.this;
                v.this.a(jVar.a + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j, long j2, int i, int i2) {
            super(j, j2);
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.c, "Loading Controller Timer Finish");
            if (this.a >= this.b) {
                v.this.b(new a());
            } else if (v.B()) {
                v.this.c(new b());
            } else {
                v.this.a(this.a + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class k implements t {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C2578o8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    class l implements t {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C2578o8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    class m implements t {
        m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C2578o8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    class n implements Runnable {
        final /* synthetic */ C2578o8.e a;
        final /* synthetic */ T4 b;
        final /* synthetic */ String c;

        n(C2578o8.e eVar, T4 t4, String str) {
            this.a = eVar;
            this.b = t4;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            T4 t4;
            C2578o8.e eVar = C2578o8.e.RewardedVideo;
            C2578o8.e eVar2 = this.a;
            if ((eVar != eVar2 && C2578o8.e.Interstitial != eVar2 && C2578o8.e.Banner != eVar2) || (t4 = this.b) == null || TextUtils.isEmpty(t4.h())) {
                return;
            }
            InterfaceC2627r4 a = v.this.a(this.a);
            Log.d(v.this.c, "onAdProductInitFailed (message:" + this.c + ")(" + this.a + ")");
            if (a != null) {
                a.a(this.a, this.b.h(), this.c);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    private class p extends WebChromeClient {
        private p() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.b0.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$p;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
            boolean safedk_v$p_onCreateWindow_d2efa889a446a540cd1ed9ca450be92c = safedk_v$p_onCreateWindow_d2efa889a446a540cd1ed9ca450be92c(webView, z, z2, message);
            BrandSafetyUtils.onWebChromeClientCreateWindow(com.safedk.android.utils.h.f, webView, message, safedk_v$p_onCreateWindow_d2efa889a446a540cd1ed9ca450be92c);
            return safedk_v$p_onCreateWindow_d2efa889a446a540cd1ed9ca450be92c;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.s;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.t.removeView(vVar.s);
            v vVar2 = v.this;
            vVar2.s = null;
            vVar2.t.setVisibility(8);
            v.this.u.onCustomViewHidden();
            v.this.b0.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.b0.setVisibility(8);
            if (v.this.s != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.t.addView(view);
            v vVar = v.this;
            vVar.s = view;
            vVar.u = customViewCallback;
            vVar.t.setVisibility(0);
        }

        public boolean safedk_v$p_onCreateWindow_d2efa889a446a540cd1ed9ca450be92c(WebView p0, boolean p1, boolean p2, Message p3) {
            WebView webView = new WebView(p0.getContext());
            webView.setWebChromeClient(this);
            webView.setWebViewClient(new r());
            ((WebView.WebViewTransport) p3.obj).setWebView(webView);
            p3.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    static class q {
        C2578o8.e a;
        String b;

        public q(C2578o8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        String a() {
            return this.b;
        }

        C2578o8.e b() {
            return this.a;
        }
    }

    private class r extends WebViewClient {
        private r() {
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
            Logger.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(WebView p0, String p1) {
            Context q = v.this.q();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(q, new OpenUrlActivity.e(new k.c()).a(p1).b(false).a(q));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$r;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812 = safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812);
            return safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812;
        }
    }

    private interface t {
        void a(String str, C2578o8.e eVar, T4 t4);
    }

    static class u {
        String a;
        String b;

        u() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC0225v {
        Display,
        Gone
    }

    private class w extends WebViewClient {
        private w() {
        }

        private void a() {
            String b = v.this.n.b();
            if (b != null) {
                v.this.m(b);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (v.B() && v.this.n.c() && str.equals("about:blank")) {
                a();
            }
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.D();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
            safedk_v$w_onPageStarted_00019339693c2db60c9fb3d685a60e98(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
            safedk_v$w_onReceivedError_b23118ad6c1137d5448613e879d09ee2(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.R;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.w();
            return true;
        }

        public void safedk_v$w_onPageStarted_00019339693c2db60c9fb3d685a60e98(WebView p0, String p1, Bitmap p2) {
            Logger.i("onPageStarted", p1);
            super.onPageStarted(p0, p1, p2);
        }

        public void safedk_v$w_onReceivedError_b23118ad6c1137d5448613e879d09ee2(WebView p0, int p1, String p2, String p3) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", p3 + ServerSentEventKt.SPACE + p2);
            if (p3.contains(X3.f) && (cVar = v.this.R) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + p2 + " (errorCode: " + p1 + ")");
            }
            super.onReceivedError(p0, p1, p2, p3);
        }

        public WebResourceResponse safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(WebView p0, String p1) {
            boolean z;
            Logger.i("shouldInterceptRequest", p1);
            try {
                z = new URL(p1).getFile().contains(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k);
            } catch (MalformedURLException e) {
                C2556n4.d().a(e);
                z = false;
            }
            if (z) {
                String str = AdPayload.FILE_SCHEME + v.this.B + File.separator + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k;
                try {
                    new FileInputStream(new File(str));
                    return new WebResourceResponse("text/javascript", C.UTF8_NAME, getClass().getResourceAsStream(str));
                } catch (FileNotFoundException e2) {
                    C2556n4.d().a(e2);
                }
            }
            return super.shouldInterceptRequest(p0, p1);
        }

        public boolean safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(WebView p0, String p1) {
            Logger.i("shouldOverrideUrlLoading", p1);
            try {
                if (v.this.h(p1)) {
                    v.this.A();
                    return true;
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(p0, p1);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.f, webView, str, safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040 = safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040);
            return safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040;
        }
    }

    public v(Context context, U4 u4, C2323a4 c2323a4, com.ironsource.sdk.controller.c cVar, Q7 q7, int i2, C2396e5 c2396e5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        p pVar = new p();
        this.r = pVar;
        boolean s2 = Jb.Y().h().s();
        this.Y = Jb.Y().h().C();
        if (s2) {
            countDownLatch = new CountDownLatch(1);
            a(context, q7, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.Z = Jb.Y().a();
        if (!s2) {
            this.b0 = new C2419fa(context, new InterfaceC2616qa.a());
        }
        Logger.i(this.c, "C'tor");
        this.a0 = c2323a4;
        this.R = cVar;
        this.a = q7;
        this.H = u4;
        if (!s2) {
            a(context, this.b0);
        }
        this.B = str;
        this.E = new C2356c1();
        this.T = IronSourceNetworkBridge.jsonObjectInit();
        this.h = c2396e5;
        this.U = aVar;
        this.V = bVar;
        boolean optBoolean = SDKUtils.getNetworkConfiguration().optBoolean(X3.a.i, false);
        this.X = optBoolean;
        if (optBoolean) {
            this.W = new C2484j4(new C2431g4(SDKUtils.getControllerUrl(), this.B, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C2368cd(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object d2;
                    d2 = v.this.d((C2757y8) obj);
                    return d2;
                }
            }, c2396e5, new InterfaceC2592p4.a());
        } else {
            c2396e5.a(this);
            this.C = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.B, SDKUtils.getControllerUrl(), c2396e5);
        }
        if (!s2) {
            this.b0.setWebViewClient(new w());
            this.b0.setWebChromeClient(pVar);
            bh.a(this.b0);
            a(this.b0);
            this.b0.setDownloadListener(this);
        }
        this.S = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        if (s2) {
            try {
                countDownLatch.await();
                if (this.b0 == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.R.c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e2) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e2);
                C2556n4.d().a(e2);
                Thread.currentThread().interrupt();
                this.R.c("WebView initialization was interrupted");
                return;
            }
        }
        this.b = InterfaceC2413f4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B() {
        return Jb.Y().h().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        ViewParent parent = this.b0.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b0);
        }
        this.b0.destroy();
    }

    private void J() {
    }

    private void a(final Context context, Q7 q7, final CountDownLatch countDownLatch) {
        q7.d(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                v.this.a(context, countDownLatch);
            }
        });
    }

    private R3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        boolean z2 = true;
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            T4 a2 = this.H.a(g(str), str2);
            if (a2 != null) {
                map = a2.g();
                map.put("demandSourceName", a2.f());
                map.put("demandSourceId", a2.h());
            }
            try {
                jsonObjectInit.put(X3.i.m, str);
            } catch (JSONException e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jsonObjectInit = SDKUtils.mergeJSONObjects(jsonObjectInit, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C2556n4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.f), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                C2556n4.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.g), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                C2556n4.d().a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
            z2 = z;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jsonObjectInit.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    C2556n4.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jsonObjectInit.toString(), Boolean.valueOf(z2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                v.this.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.b0.a(new m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.c, "load(): " + str);
            IronSourceNetworkBridge.webviewLoadUrl(this.b0, str);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    private void n() {
        CountDownTimer countDownTimer;
        if (!Jb.Y().h().h() || (countDownTimer = this.m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C2477ie c2477ie = new C2477ie(str);
        String d2 = c2477ie.d("color");
        String d3 = c2477ie.d("adViewId");
        int parseColor = !X3.i.T.equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 == null) {
            this.b0.setBackgroundColor(parseColor);
            return;
        }
        WebView presentingView = C2524l8.a().a(d3).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(parseColor);
        }
    }

    public void A() {
        i(f(X3.h.Z));
    }

    public void D() {
        i(f(X3.h.A));
    }

    public void E() {
        try {
            this.b0.onPause();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            Logger.i(this.c, "WebViewController: onPause() - " + th);
        }
    }

    public void F() {
        this.D = null;
    }

    public void G() {
        this.b0.a();
        this.c0 = null;
    }

    public void H() {
        this.b0.requestFocus();
    }

    public void I() {
        try {
            this.b0.onResume();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = X3.c.z;
        }
        i(e(X3.h.a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(X3.h.t));
    }

    public void g(String str, String str2) {
        i(e(X3.h.W, a(X3.i.p, str2, X3.i.m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C2578o8.c h() {
        return C2578o8.c.Web;
    }

    public void j(String str) {
        i(e(X3.f.j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(X3.h.w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void o(String str) {
        this.x = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.c, str + ServerSentEventKt.SPACE + str4);
    }

    public ah p() {
        if (this.Q == null) {
            this.Q = new h();
        }
        return this.Q;
    }

    public int r() {
        return e0;
    }

    public FrameLayout s() {
        return this.v;
    }

    public String t() {
        return this.x;
    }

    public C2356c1 u() {
        return this.E;
    }

    public EnumC0225v v() {
        return this.w;
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        C2578o8.e b2 = this.j.b();
        String a2 = this.j.a();
        if (r(b2.toString())) {
            a(b2, a2);
        }
    }

    public void x() {
        this.r.onHideCustomView();
    }

    public boolean y() {
        return this.s != null;
    }

    public void z() {
        i(f(X3.f.h));
    }

    class g extends R3 {
        g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC2648s7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC2648s7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC2648s7
        public void a() {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n("none");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.b0 = new C2419fa(context, new InterfaceC2616qa.a());
                a(context, this.b0);
                this.b0.setWebViewClient(new w());
                this.b0.setWebChromeClient(this.r);
                bh.a(this.b0);
                a(this.b0);
                this.b0.setDownloadListener(this);
            } catch (Exception e2) {
                this.R.c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e2);
                C2556n4.d().a(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Pc pc = this.c0;
        if (pc != null) {
            pc.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C2578o8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C2578o8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C2578o8.e.Banner.toString()) || this.A == null : this.y == null) : this.z != null) {
            z = true;
        }
        if (!z) {
            Logger.d(this.c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.X) {
            this.W.b();
            return;
        }
        this.C.a(new C2614q8());
        if (this.C.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
        } catch (Exception e2) {
            e = e2;
            str3 = str;
        }
        try {
            i(e(X3.h.p, a("file", str3, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            C2556n4.d().a(exc);
            b(str3, str2, exc.getMessage());
        }
    }

    public boolean h(String str) {
        try {
            if (!new Pe(str, C2365ca.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C2586og.a(q(), str);
            return true;
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public class s {

        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVShowFail(message:" + this.a + ")");
                v.this.y.b(this.b, str);
            }
        }

        class b implements Runnable {
            final /* synthetic */ String a;

            b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onInterstitialInitSuccess()");
                v.this.z.a(C2578o8.e.Interstitial, this.a, (C2338b1) null);
            }
        }

        class c implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onInterstitialInitFail(message:" + str + ")");
                v.this.z.a(C2578o8.e.Interstitial, this.b, str);
            }
        }

        class d implements Runnable {
            final /* synthetic */ InterfaceC2627r4 a;
            final /* synthetic */ C2578o8.e b;
            final /* synthetic */ String c;

            d(InterfaceC2627r4 interfaceC2627r4, C2578o8.e eVar, String str) {
                this.a = interfaceC2627r4;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(this.b, this.c);
            }
        }

        class e implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ JSONObject b;

            e(String str, JSONObject jSONObject) {
                this.a = str;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.a(this.a, this.b);
            }
        }

        class f implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            f(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.z.a(this.b, str);
            }
        }

        class g implements Runnable {
            final /* synthetic */ String a;

            g(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerInitSuccess()");
                v.this.A.a(C2578o8.e.Banner, this.a, (C2338b1) null);
            }
        }

        class h implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onBannerInitFail(message:" + str + ")");
                v.this.A.a(C2578o8.e.Banner, this.b, str);
            }
        }

        class i implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ C2417f8 b;

            i(String str, C2417f8 c2417f8) {
                this.a = str;
                this.b = c2417f8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onBannerLoadSuccess()");
                v.this.A.a(this.a, this.b);
            }
        }

        class j implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            j(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.c, "onLoadBannerFail()");
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.A.c(this.b, str);
            }
        }

        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.I();
            }
        }

        class l implements Runnable {
            final /* synthetic */ String a;

            l(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (IronSourceNetworkBridge.jsonObjectInit(this.a).has(f.b.b)) {
                        v.this.U.a(f.a.a(this.a));
                    } else {
                        v.this.V.a(Mb.a(this.a));
                    }
                } catch (JSONException e) {
                    C2556n4.d().a(e);
                    Logger.e(v.this.c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        class m implements Runnable {
            final /* synthetic */ C2578o8.e a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ JSONObject d;

            m(C2578o8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC2627r4 a;
                C2578o8.e eVar = this.a;
                if ((eVar == C2578o8.e.Interstitial || eVar == C2578o8.e.RewardedVideo || eVar == C2578o8.e.Banner) && (a = v.this.a(eVar)) != null) {
                    a.a(this.a, this.b, this.c, this.d);
                }
            }
        }

        class n implements Runnable {
            final /* synthetic */ String a;

            n(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.c, "omidAPI(" + this.a + ")");
                    v.this.I.a(new C2477ie(this.a).toString(), s.this.new w());
                } catch (Exception e) {
                    C2556n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.E();
            }
        }

        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.removeJavascriptInterface(X3.e);
            }
        }

        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.getSettings().setMixedContentMode(0);
            }
        }

        class r implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ C2338b1 c;

            r(int i, String str, C2338b1 c2338b1) {
                this.a = i;
                this.b = str;
                this.c = c2338b1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a <= 0) {
                    v.this.y.c(this.b);
                } else {
                    Log.d(v.this.c, "onRVInitSuccess()");
                    v.this.y.a(C2578o8.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        class RunnableC0223s implements Runnable {
            final /* synthetic */ String a;

            RunnableC0223s(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.N.a(IronSourceNetworkBridge.jsonObjectInit(this.a), s.this.new w());
                } catch (Exception e) {
                    C2556n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        class t implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;

            t(String str, String str2, int i) {
                this.a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a.equalsIgnoreCase(C2578o8.e.RewardedVideo.toString())) {
                    v.this.y.a(this.b, this.c);
                }
            }
        }

        class u implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ int b;

            u(String str, int i) {
                this.a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.onInterstitialAdRewarded(this.a, this.b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        class RunnableC0224v implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            RunnableC0224v(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.c, "onRVInitFail(message:" + str + ")");
                v.this.y.a(C2578o8.e.RewardedVideo, this.b, str);
            }
        }

        public s() {
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.C.f());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                Logger.d(v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(X3.a.h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                C2703v8.a(C2459he.p, new C2614q8().a(B5.A, e2.getMessage()).a());
                Logger.d(v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.X) {
                return;
            }
            a(jSONObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m(String str) {
            try {
                Logger.i(v.this.c, "deleteFolder(" + str + ")");
                String d2 = new C2477ie(str).d("path");
                if (d2 == null) {
                    v.this.a(str, false, X3.c.g, "1");
                    return;
                }
                C2757y8 c2757y8 = new C2757y8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2));
                IronSourceStorageUtils.ensurePathSafety(c2757y8, v.this.B);
                if (!c2757y8.exists()) {
                    v.this.a(str, false, X3.c.e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c2757y8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(String str) {
            try {
                Logger.i(v.this.c, "deviceDataAPI(" + str + ")");
                v.this.L.a(new C2477ie(str).toString(), new w());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o(String str) {
            try {
                Logger.i(v.this.c, "dsSharedSignalsAPI(" + str + ")");
                v.this.P.a(new C2477ie(str).toString(), new w());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void p(String str) {
            Logger.i(v.this.c, "getCachedFilesMap(" + str + ")");
            String e2 = v.this.e(str);
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            C2477ie c2477ie = new C2477ie(str);
            if (!c2477ie.a("path")) {
                v.this.a(str, false, X3.c.s, (String) null);
                return;
            }
            String str2 = (String) c2477ie.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.B, str2)) {
                v.this.a(str, false, X3.c.t, (String) null);
                return;
            }
            v.this.i(v.this.a(e2, IronSourceStorageUtils.getCachedFilesMap(v.this.B, str2), X3.h.s, X3.h.r));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void q(String str) {
            Logger.i(v.this.c, "getDeviceStatus(" + str + ")");
            String e2 = v.this.e(str);
            String d2 = v.this.d(str);
            v vVar = v.this;
            Object[] d3 = vVar.d(vVar.b0.getContext());
            String str2 = (String) d3[0];
            if (((Boolean) d3[1]).booleanValue()) {
                if (!TextUtils.isEmpty(d2)) {
                    e2 = d2;
                }
                e2 = null;
            }
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            v.this.i(v.this.a(e2, str2, X3.h.l, X3.h.m));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void r(String str) {
            try {
                Logger.i(v.this.c, "iabTokenAPI(" + str + ")");
                v.this.K.a(new C2477ie(str).toString(), new w());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            try {
                InterfaceC2714w1 a2 = InterfaceC2714w1.a(str);
                v vVar = v.this;
                C2678u1.a a3 = vVar.O.a(vVar.b0.getContext(), a2);
                v.this.i(v.this.e(a3.f(), a3.i().toString()));
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
            p0.startActivity(p1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(String str) {
            try {
                Logger.i(v.this.c, "permissionsAPI(" + str + ")");
                v.this.J.a(new C2477ie(str).toString(), new w());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.c, "adClicked(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d(X3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            C2578o8.e g2 = v.this.g(d2);
            InterfaceC2627r4 a2 = v.this.a(g2);
            if (g2 == null || a2 == null) {
                return;
            }
            v.this.b(new d(a2, g2, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.d, "adCredited(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d(X3.i.k);
            int parseInt = d2 != null ? Integer.parseInt(d2) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            String d3 = c2477ie.d(X3.i.m);
            if (TextUtils.isEmpty(d3)) {
                Log.d(v.this.d, "adCredited | product type is missing");
            }
            if (C2578o8.e.Interstitial.toString().equalsIgnoreCase(d3)) {
                a(fetchDemandSourceId, parseInt);
            } else if (v.this.r(d3)) {
                v.this.b(new t(d3, fetchDemandSourceId, parseInt));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.c, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C2477ie(str));
            C2338b1 c2338b1 = new C2338b1(str);
            if (!c2338b1.g()) {
                v.this.a(str, false, X3.c.r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String d2 = c2338b1.d();
            if (C2578o8.e.RewardedVideo.toString().equalsIgnoreCase(d2) && v.this.r(d2)) {
                v.this.b(new r(Integer.parseInt(c2338b1.c()), fetchDemandSourceId, c2338b1));
            }
        }

        @JavascriptInterface
        public void adViewAPI(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.j(str);
                }
            }, Q7.l);
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            Q7.a.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.k(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C2578o8.e g2;
            try {
                Logger.i(v.this.c, "cleanAdInstance(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                String d2 = c2477ie.d(X3.i.m);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (g2 = v.this.g(d2)) == null) {
                    return;
                }
                v.this.H.b(g2, fetchDemandSourceId);
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> a2 = C2365ca.e().a();
                C2477ie c2477ie = new C2477ie(str);
                if (!a2.isEmpty()) {
                    c2477ie.b(X3.i.x0, a2.toString());
                }
                v.this.a(c2477ie.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.l(str);
                }
            }, "deleteFile");
        }

        @JavascriptInterface
        public void deleteFolder(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.m(str);
                }
            }, "deleteFolder");
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.c, "destroyInlineStore() called");
            try {
                a.AbstractC0392a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), EnumC2507k9.b.a(new C2477ie(str).a(X3.f.e, EnumC2507k9.APP_ACTIVITY.b())));
                if (a2 instanceof a.AbstractC0392a.C0393a) {
                    v.this.a(str, false, ((a.AbstractC0392a.C0393a) a2).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.n(str);
                }
            }, Q7.k);
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            C2477ie c2477ie = new C2477ie(str);
            boolean booleanValue = ((Boolean) c2477ie.b("display")).booleanValue();
            String d2 = c2477ie.d(X3.i.m);
            boolean c2 = c2477ie.c(X3.i.u);
            String d3 = c2477ie.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            boolean c3 = c2477ie.c(X3.i.z0);
            if (!booleanValue) {
                v.this.a(EnumC0225v.Gone);
                v.this.o();
                return;
            }
            v.this.G = c2477ie.c(X3.i.v);
            boolean c4 = c2477ie.c(X3.i.y);
            EnumC0225v v = v.this.v();
            EnumC0225v enumC0225v = EnumC0225v.Display;
            if (v == enumC0225v) {
                Logger.i(v.this.c, "State: " + v.this.w);
                return;
            }
            v.this.a(enumC0225v);
            Logger.i(v.this.c, "State: " + v.this.w);
            Context q2 = v.this.q();
            String t2 = v.this.t();
            int L = v.this.Z.L(q2);
            if (c2) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(q2);
                hVar.addView(v.this.v);
                hVar.a(v.this);
                return;
            }
            Intent intent = c4 ? new Intent(q2, (Class<?>) InterstitialActivity.class) : new Intent(q2, (Class<?>) ControllerActivity.class);
            C2578o8.e eVar = C2578o8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d2)) {
                if ("application".equals(t2)) {
                    t2 = SDKUtils.translateRequestedOrientation(v.this.Z.N(q2));
                }
                intent.putExtra(X3.i.m, eVar.toString());
                v.this.E.a(eVar.ordinal());
                v.this.E.f(fetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.y.c(eVar, fetchDemandSourceId);
                }
            } else {
                C2578o8.e eVar2 = C2578o8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d2)) {
                    if ("application".equals(t2)) {
                        t2 = SDKUtils.translateRequestedOrientation(v.this.Z.N(q2));
                    }
                    intent.putExtra(X3.i.m, eVar2.toString());
                }
            }
            if (d3 != null) {
                intent.putExtra("adViewId", d3);
            }
            intent.putExtra(X3.i.z0, c3);
            intent.setFlags(536870912);
            intent.putExtra(X3.i.v, v.this.G);
            intent.putExtra(X3.i.A, t2);
            intent.putExtra(X3.i.B, L);
            v vVar = v.this;
            vVar.j = new q(vVar.g(d2), fetchDemandSourceId);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(q2, intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.o(str);
                }
            }, Q7.f);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.c, "fileSystemAPI(" + str + ")");
            v.this.a(new RunnableC0223s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            Logger.i(v.this.c, "getApplicationInfo(" + str + ")");
            String e2 = v.this.e(str);
            String d2 = v.this.d(str);
            C2477ie c2477ie = new C2477ie(str);
            Object[] f2 = v.this.f(c2477ie.d(X3.i.m), SDKUtils.fetchDemandSourceId(c2477ie));
            String str2 = (String) f2[0];
            if (((Boolean) f2[1]).booleanValue()) {
                if (!TextUtils.isEmpty(d2)) {
                    e2 = d2;
                }
                e2 = null;
            }
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            v.this.i(v.this.a(e2, str2, X3.h.n, X3.h.o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.p(str);
                }
            }, Q7.i);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String e2;
            Logger.i(v.this.c, "getConnectivityInfo(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d(v.i0);
            String d3 = c2477ie.d(v.j0);
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            v vVar = v.this;
            R3 r3 = vVar.S;
            if (r3 != null) {
                jsonObjectInit = r3.a(vVar.b0.getContext());
            }
            if (jsonObjectInit.length() > 0) {
                e2 = v.this.e(d2, jsonObjectInit.toString());
            } else {
                e2 = v.this.e(d3, v.this.a("errMsg", X3.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(e2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.c, "getControllerConfig(" + str + ")");
            String d2 = new C2477ie(str).d(v.i0);
            if (TextUtils.isEmpty(d2)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(d2, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String d2;
            Logger.i(v.this.c, "getMediationState(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d3 = c2477ie.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            String d4 = c2477ie.d(X3.i.m);
            if (d4 == null || d3 == null) {
                return;
            }
            try {
                C2578o8.e productType = SDKUtils.getProductType(d4);
                if (productType != null) {
                    T4 a2 = v.this.H.a(productType, fetchDemandSourceId);
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    jsonObjectInit.put(X3.i.m, d4);
                    jsonObjectInit.put("demandSourceName", d3);
                    jsonObjectInit.put("demandSourceId", fetchDemandSourceId);
                    if (a2 == null || a2.a(-1)) {
                        d2 = v.this.d(str);
                    } else {
                        d2 = v.this.e(str);
                        jsonObjectInit.put("state", a2.j());
                    }
                    a(d2, jsonObjectInit.toString());
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getDeviceStatus(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.q(str);
                }
            }, Q7.d);
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.b0.getContext();
                float a2 = X4.b(context).a(context);
                C2477ie c2477ie = new C2477ie(str);
                c2477ie.b(X3.j.P, String.valueOf(a2));
                v.this.a(c2477ie.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.c, "getInitSummery(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            c2477ie.a(X3.j.s0, v.this.T);
            v.this.a(c2477ie.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C2703v8.a(C2459he.z, new C2614q8().a(B5.y, str).a());
            String e2 = v.this.e(str);
            String jSONObject = SDKUtils.getOrientation(v.this.b0.getContext()).toString();
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            v.this.i(v.this.a(e2, jSONObject, X3.h.X, X3.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.c, "getUserData(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            if (!c2477ie.a("key")) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            String e2 = v.this.e(str);
            String d2 = c2477ie.d("key");
            v.this.i(v.this.e(e2, v.this.a(d2, C2365ca.e().a(d2), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.r(str);
                }
            }, Q7.e);
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.c, "initController(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            CountDownTimer countDownTimer = v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.m = null;
            }
            if (c2477ie.a(X3.i.q)) {
                String d2 = c2477ie.d(X3.i.q);
                if (X3.i.s.equalsIgnoreCase(d2)) {
                    v vVar = v.this;
                    vVar.i = true;
                    vVar.R.d();
                } else if (X3.i.r.equalsIgnoreCase(d2)) {
                    v.this.R.c();
                } else if (!X3.i.t.equalsIgnoreCase(d2)) {
                    Logger.i(v.this.c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.R.c("controller js failed to initialize : " + c2477ie.d("errMsg"));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.c, "onAdWindowsClosed(" + str + ")");
            v.this.E.a();
            v.this.E.f(null);
            v.this.j = null;
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d(X3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            C2578o8.e g2 = v.this.g(d2);
            Log.d(v.this.d, "onAdClosed() with type " + g2);
            if (v.this.r(d2)) {
                v.this.a(g2, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.c, "onInitBannerFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            U4 u4 = v.this.H;
            C2578o8.e eVar = C2578o8.e.Banner;
            T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.c, "onInitBannerSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C2477ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C2578o8.e.Banner.toString())) {
                v.this.b(new g(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.c, "onInitInterstitialFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            U4 u4 = v.this.H;
            C2578o8.e eVar = C2578o8.e.Interstitial;
            T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onInitInterstitialSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C2477ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C2578o8.e.Interstitial.toString())) {
                v.this.b(new b(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onInitRewardedVideoFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            U4 u4 = v.this.H;
            C2578o8.e eVar = C2578o8.e.RewardedVideo;
            T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0224v(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.c, "onLoadBannerFail()");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && v.this.r(C2578o8.e.Banner.toString())) {
                v.this.b(new j(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.c, "onLoadBannerSuccess()");
            C2477ie c2477ie = new C2477ie(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            String d2 = c2477ie.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            G8 a2 = C2524l8.a().a(d2);
            if (a2 == null) {
                v.this.A.c(fetchDemandSourceId, "not found view for the current adViewId= " + d2);
            } else if (a2 instanceof C2417f8) {
                C2417f8 c2417f8 = (C2417f8) a2;
                if (v.this.r(C2578o8.e.Banner.toString())) {
                    v.this.b(new i(fetchDemandSourceId, c2417f8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.c, "onLoadInterstitialFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (v.this.r(C2578o8.e.Interstitial.toString())) {
                v.this.b(new f(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            JSONObject a2 = c2477ie.a();
            a(fetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C2578o8.e.Interstitial.toString())) {
                v.this.b(new e(fetchDemandSourceId, a2));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.c, "onReceivedMessage(" + str + ")");
            Q7.a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.c, "onShowInterstitialFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            final String d2 = c2477ie.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final boolean r2 = v.this.r(C2578o8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.a(r2, d2, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C2477ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C2356c1 c2356c1 = v.this.E;
            C2578o8.e eVar = C2578o8.e.Interstitial;
            c2356c1.a(eVar.ordinal());
            v.this.E.f(fetchDemandSourceId);
            final boolean r2 = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.a(r2, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoFail(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
            if (v.this.r(C2578o8.e.RewardedVideo.toString())) {
                v.this.b(new a(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.c, "onVideoStatusChanged(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d(X3.i.m);
            if (v.this.D == null || TextUtils.isEmpty(d2)) {
                return;
            }
            String d3 = c2477ie.d("status");
            if ("started".equalsIgnoreCase(d3)) {
                v.this.D.onVideoStarted();
                return;
            }
            if ("paused".equalsIgnoreCase(d3)) {
                v.this.D.onVideoPaused();
                return;
            }
            if ("playing".equalsIgnoreCase(d3)) {
                v.this.D.onVideoResumed();
                return;
            }
            if (X3.i.g0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoEnded();
            } else if (X3.i.h0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoStopped();
            } else {
                Logger.i(v.this.c, "onVideoStatusChanged: unknown status: " + d3);
            }
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.c, "openInlineStore(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                a.AbstractC0392a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), new C2472i9(c2477ie.d("url"), c2477ie.d(X3.f.c), EnumC2507k9.b.a(c2477ie.a(X3.f.e, EnumC2507k9.APP_ACTIVITY.b())), (!c2477ie.a(X3.f.d) || c2477ie.e(X3.f.d)) ? null : (JSONObject) c2477ie.b(X3.f.d)));
                if (a2 instanceof a.AbstractC0392a.C0393a) {
                    v.this.a(str, false, ((a.AbstractC0392a.C0393a) a2).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.c, "openUrl(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                p.c a2 = new p.a(c2477ie.d("method"), new Rc(v.this.G, C.ENCODING_PCM_32BIT)).a(c2477ie.c(X3.i.L0) ? v.this.b0.getContext() : v.this.q(), new Qc(c2477ie.d("url"), c2477ie.d("package_name")));
                if (a2 instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) a2).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(final String str) {
            v.this.a.a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.s(str);
                }
            }, Q7.j);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.i(v.this.c, "postAdEventNotification(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                String d2 = c2477ie.d(X3.i.j0);
                try {
                    if (TextUtils.isEmpty(d2)) {
                        v.this.a(str, false, X3.c.w, (String) null);
                        return;
                    }
                    String d3 = c2477ie.d(X3.i.k0);
                    String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c2477ie);
                    String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d3;
                    JSONObject jSONObject = (JSONObject) c2477ie.b(X3.i.l0);
                    String d4 = c2477ie.d(X3.i.m);
                    C2578o8.e g2 = v.this.g(d4);
                    try {
                        if (!v.this.r(d4)) {
                            v.this.a(str, false, X3.c.v, (String) null);
                            return;
                        }
                        String e2 = v.this.e(str);
                        if (TextUtils.isEmpty(e2)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            v.this.i(v.this.a(e2, v.this.a(X3.i.m, d4, X3.i.j0, d2, "demandSourceName", d3, "demandSourceId", str2, null, false), X3.h.c0, X3.h.d0));
                        }
                        try {
                            v.this.b(new m(g2, str2, d2, jSONObject));
                        } catch (Exception e3) {
                            e = e3;
                            exc = e;
                            C2556n4.d().a(exc);
                            IronLog.INTERNAL.error(exc.toString());
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    exc = e5;
                    C2556n4.d().a(exc);
                    IronLog.INTERNAL.error(exc.toString());
                }
            } catch (Exception e6) {
                e = e6;
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = v.this.l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.c, "saveFile(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                String d2 = c2477ie.d("path");
                String d3 = c2477ie.d("file");
                if (TextUtils.isEmpty(d3)) {
                    v.this.a(str, false, X3.c.g, "1");
                    return;
                }
                C2757y8 c2757y8 = new C2757y8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2), SDKUtils.getFileName(d3));
                IronSourceStorageUtils.ensurePathSafety(c2757y8, v.this.B);
                v vVar = v.this;
                if (vVar.Z.a(vVar.B) <= 0) {
                    v.this.a(str, false, Z3.A, (String) null);
                    return;
                }
                if (c2757y8.exists()) {
                    v.this.a(str, false, Z3.z, (String) null);
                    return;
                }
                if (!T3.h(v.this.b0.getContext())) {
                    v.this.a(str, false, Z3.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.h.a(c2757y8, d3, c2477ie.a("connectionTimeout", 0), c2477ie.a("readTimeout", 0));
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.c, "setBackButtonState(" + str + ")");
            C2365ca.e().c(new C2477ie(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.c, "setForceClose(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            String d2 = c2477ie.d("width");
            String d3 = c2477ie.d("height");
            v.this.o = Integer.parseInt(d2);
            v.this.p = Integer.parseInt(d3);
            v.this.q = c2477ie.d(X3.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.c, "setOrientation(" + str + ")");
                String d2 = new C2477ie(str).d("orientation");
                v.this.o(d2);
                v vVar = v.this;
                if (vVar.c0 != null) {
                    v.this.c0.onOrientationChanged(d2, vVar.Z.L(vVar.b0.getContext()));
                }
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.c, "setStoreSearchKeys(" + str + ")");
            C2365ca.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.c, "setUserData(" + str + ")");
            C2477ie c2477ie = new C2477ie(str);
            if (!c2477ie.a("key")) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            if (!c2477ie.a("value")) {
                v.this.a(str, false, X3.c.G, (String) null);
                return;
            }
            String d2 = c2477ie.d("key");
            String d3 = c2477ie.d("value");
            C2365ca.e().a(d2, d3);
            v.this.i(v.this.e(v.this.e(str), v.this.a(d2, d3, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.c, "setWebviewBackgroundColor(" + str + ")");
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.c, "stillAlive(" + str + ")");
            v.this.b.a();
        }

        void u(String str) {
            v.this.i(v.this.a(X3.h.d, str, (String) null, (String) null));
        }

        void v(String str) {
            v.this.i(v.this.a(X3.h.e, str, (String) null, (String) null));
        }

        public class w implements InterfaceC2544ma {
            public w() {
            }

            @Override // com.ironsource.InterfaceC2544ma
            public void a(boolean z, String str, String str2) {
                C2477ie c2477ie = new C2477ie();
                c2477ie.b(z ? v.i0 : v.j0, str);
                c2477ie.b("data", str2);
                v.this.a(c2477ie.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC2544ma
            public void a(boolean z, String str, C2477ie c2477ie) {
                c2477ie.b(z ? v.i0 : v.j0, str);
                v.this.a(c2477ie.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC2544ma
            public void a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z) {
                        str2 = v.i0;
                    } else {
                        str2 = v.j0;
                    }
                    jSONObject.put(str2, str);
                    v.this.a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C2556n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (b(str)) {
                try {
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                    jSONObject.putOpt("testerABGroup", jsonObjectInit.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jsonObjectInit.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C2556n4.d().a(e2);
                    Logger.d(v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(String str) {
            try {
                Logger.i(v.this.c, "deleteFile(" + str + ")");
                C2477ie c2477ie = new C2477ie(str);
                String d2 = c2477ie.d("file");
                String d3 = c2477ie.d("path");
                if (d3 != null && !TextUtils.isEmpty(d2)) {
                    C2757y8 c2757y8 = new C2757y8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d3), d2);
                    IronSourceStorageUtils.ensurePathSafety(c2757y8, v.this.B);
                    if (!c2757y8.exists()) {
                        v.this.a(str, false, X3.c.f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c2757y8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, X3.c.g, "1");
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i2) {
            T4 a2;
            v vVar = v.this;
            C2578o8.e eVar = C2578o8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (a2 = v.this.H.a(eVar, str)) != null && a2.k()) {
                v.this.b(new u(str, i2));
            }
        }

        boolean b(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                if (jsonObjectInit.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jsonObjectInit.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str) {
            if (z) {
                v.this.z.c(C2578o8.e.Interstitial, str);
                v.this.z.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z) {
            T4 a2 = v.this.H.a(C2578o8.e.Interstitial, str);
            if (a2 != null) {
                a2.a(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str, String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.z.d(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(String str) {
            try {
                Logger.i(v.this.c, "adViewAPI(" + str + ")");
                v.this.M.a(new C2477ie(str).toString(), new w());
            } catch (Exception e2) {
                C2556n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C2477ie(str).d(i0);
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(X3.h.y, a(X3.j.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        String d2;
        try {
            d2 = U3.d(this.b0.getContext());
            Logger.i(this.c, "device status changed, connection type " + str);
            C2667t8.a(str);
            C2667t8.b(d2);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            i(e(X3.h.x, a("connectionType", str, "rawConnectionType", d2, null, null, null, null, null, false)));
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
        }
    }

    public void b(int i2) {
        e0 = i2;
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.b0.getSettings().setCacheMode(2);
        } else {
            this.b0.getSettings().setCacheMode(-1);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        a(t4, map);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
        Map<String, String> b2 = t4.b();
        if (b2 != null) {
            i(e(X3.h.T, SDKUtils.flatMapToJsonAsString(b2)));
        }
        this.H.b(C2578o8.e.Interstitial, t4.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2578o8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2578o8.e eVar = C2578o8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C2578o8.e eVar2 = C2578o8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C2578o8.e eVar3 = C2578o8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public Context q() {
        return this.a0.a();
    }

    private String d(JSONObject jSONObject) {
        X4 b2 = X4.b(this.b0.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=").append(sDKVersion).append(X3.j.c);
        }
        String e2 = b2.e();
        if (!TextUtils.isEmpty(e2)) {
            sb.append("deviceOs=").append(e2);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol=").append(str);
            sb.append("&domain=").append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{X3.j.Z, X3.j.g}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append(X3.j.c).append("controllerConfig").append("=").append(jSONObject2);
                    }
                } catch (JSONException e3) {
                    C2556n4.d().a(e3);
                    IronLog.INTERNAL.error(e3.toString());
                }
            }
            sb.append("&debug=").append(r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean b3 = C2395e4.b(this.b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && b3) {
                sb.append("&chfb=true");
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb.toString();
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C2350bd.e(this.b0.getContext()));
        jSONObject.put(SDKUtils.encodeString(X3.j.p0), SDKUtils.encodeString(C2350bd.b(this.b0.getContext())));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(X3.h.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(X3.h.u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.b(context);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        IronSourceNetworkBridge.webviewAddJavascriptInterface(webView, a(sVar), X3.d);
        IronSourceNetworkBridge.webviewAddJavascriptInterface(webView, b(sVar), X3.e);
    }

    private String b(String str) {
        String str2 = this.B + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(X3.h.q, a("file", str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                C2556n4.d().a(e);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private boolean c(C2757y8 c2757y8) {
        int i2;
        boolean copyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c2757y8);
        if (!copyFileFromBundleToStorage) {
            return false;
        }
        byte[] a2 = C2395e4.a(this.b0.getContext(), X3.g);
        String a3 = C2395e4.a(this.b0.getContext());
        if (a3 == null) {
            return false;
        }
        StringBuilder append = new StringBuilder().append(c2757y8.getParent());
        String str = File.separator;
        String sb = append.append(str).append("controller_").append(a3).append(str).append(X3.g).toString();
        if (a2 == null || a2.length == 0) {
            return copyFileFromBundleToStorage;
        }
        try {
            i2 = IronSourceStorageUtils.saveFile(a2, sb);
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            copyFileFromBundleToStorage = false;
            i2 = 0;
        }
        if (i2 != 0) {
            return copyFileFromBundleToStorage;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c2757y8.getName());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new s()), sVar);
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.I = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.J = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.K = uVar;
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.L = iVar;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.M = aVar;
        aVar.a(p());
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.N = jVar;
    }

    public void b(boolean z, String str) {
        i(e(X3.h.V, a(X3.i.K, str, null, null, null, null, null, null, X3.i.o, z)));
    }

    public void a(C2678u1 c2678u1) {
        this.O = c2678u1;
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.v = new FrameLayout(context);
        this.t = new FrameLayout(context);
        this.t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.t.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.v.addView(this.t, layoutParams);
        this.v.addView(frameLayout);
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    void b(Runnable runnable) {
        Q7 q7 = this.a;
        if (q7 != null) {
            q7.c(runnable);
        }
    }

    public void c(String str) {
        if (str.equals(X3.i.i)) {
            o();
        }
        i(e(X3.h.z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    public void a(C2735x4 c2735x4) {
        this.P = c2735x4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC2627r4 a(C2578o8.e eVar) {
        if (eVar == C2578o8.e.Interstitial) {
            return this.z;
        }
        if (eVar == C2578o8.e.RewardedVideo) {
            return this.y;
        }
        if (eVar == C2578o8.e.Banner) {
            return this.A;
        }
        return null;
    }

    void c(Runnable runnable) {
        Q7 q7 = this.a;
        if (q7 != null) {
            q7.d(runnable);
        }
    }

    public void a(InterfaceC2747xg interfaceC2747xg) {
        this.D = interfaceC2747xg;
    }

    public void a(int i2) {
        String uri;
        if (!this.X && !this.C.m()) {
            Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String d2 = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            d2 = String.format("%s&sessionid=%s", d2, initSDKParams.get("sessionid"));
        }
        if (this.X) {
            uri = this.W.c().toURI().toString();
        } else {
            uri = this.C.g().toURI().toString();
        }
        this.a.d(new i(controllerConfigAsJSONObject, this.b0, i2, uri + "?" + d2));
        n();
        this.m = new j(1000 * Jb.Y().h().G(), 1000L, i2, Jb.Y().h().c()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.c(context);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C2477ie(str).d(j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        X4 b2 = X4.b(context);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        boolean z = false;
        try {
            jsonObjectInit.put(X3.j.z, "none");
            jsonObjectInit.put(X3.j.A, SDKUtils.translateDeviceOrientation(this.Z.A(context)));
            String d2 = b2.d();
            if (d2 != null) {
                jsonObjectInit.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(d2));
            }
            String c2 = b2.c();
            if (c2 != null) {
                jsonObjectInit.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(c2));
            } else {
                z = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.c, "add AID");
                jsonObjectInit.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.c, "add LAT");
                jsonObjectInit.put(X3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            String e2 = b2.e();
            if (e2 != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.m), SDKUtils.encodeString(e2));
            } else {
                z = true;
            }
            String f2 = b2.f();
            if (f2 != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.n), f2.replaceAll("[^0-9/.]", ""));
            } else {
                z = true;
            }
            String f3 = b2.f();
            if (f3 != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.o), SDKUtils.encodeString(f3));
            }
            String valueOf = String.valueOf(b2.a());
            if (valueOf != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.p), valueOf);
            } else {
                z = true;
            }
            jsonObjectInit.put(M6.j0, String.valueOf(C2516l0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.q), SDKUtils.encodeString(sDKVersion));
            }
            if (b2.b() != null && b2.b().length() > 0) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.r), SDKUtils.encodeString(b2.b()));
            }
            String b3 = U3.b(context);
            if (b3.equals("none")) {
                z = true;
            } else {
                jsonObjectInit.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(b3));
            }
            String d3 = U3.d(context);
            if (d3 != null) {
                jsonObjectInit.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(d3));
            } else {
                z = true;
            }
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.v), U3.e(context));
            jsonObjectInit.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jsonObjectInit.put(X3.j.y, SDKUtils.encodeString(String.valueOf(this.Z.a(this.B))));
            String valueOf2 = String.valueOf(this.Z.o());
            if (TextUtils.isEmpty(valueOf2)) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(SDKUtils.encodeString(X3.j.G)).append(X3.j.d).append(SDKUtils.encodeString("width")).append(X3.j.e);
                jsonObjectInit.put(sb.toString(), SDKUtils.encodeString(valueOf2));
            }
            String valueOf3 = String.valueOf(this.Z.b());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SDKUtils.encodeString(X3.j.G)).append(X3.j.d).append(SDKUtils.encodeString("height")).append(X3.j.e);
            jsonObjectInit.put(sb2.toString(), SDKUtils.encodeString(valueOf3));
            String g2 = E1.g(this.b0.getContext());
            if (!TextUtils.isEmpty(g2)) {
                jsonObjectInit.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g2));
            }
            String valueOf4 = String.valueOf(this.Z.r());
            if (!TextUtils.isEmpty(valueOf4)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.K), SDKUtils.encodeString(valueOf4));
            }
            String valueOf5 = String.valueOf(this.Z.p());
            if (!TextUtils.isEmpty(valueOf5)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.O), SDKUtils.encodeString(valueOf5));
            }
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.P), X4.b(context).a(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.Y), this.Z.l(context));
            jsonObjectInit.put(SDKUtils.encodeString("mcc"), T3.b(context));
            jsonObjectInit.put(SDKUtils.encodeString("mnc"), T3.c(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.S), T3.f(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.R), SDKUtils.encodeString(T3.g(context)));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.V), E1.f(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.X), E1.d(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.W), SDKUtils.encodeString(E1.b(context)));
            String e3 = E1.e(context);
            if (!TextUtils.isEmpty(e3)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.c0), SDKUtils.encodeString(e3));
            }
            c(jsonObjectInit);
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.q0), this.Z.u(context));
        } catch (JSONException e4) {
            C2556n4.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return new Object[]{jsonObjectInit.toString(), Boolean.valueOf(z)};
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    private void a(String str, C2578o8.e eVar, T4 t4, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, t4);
        } else {
            i(a(eVar, t4).b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2681u4 interfaceC2681u4) {
        this.f = str;
        this.g = str2;
        this.y = interfaceC2681u4;
        this.E.i(str);
        this.E.j(str2);
        a(str, C2578o8.e.RewardedVideo, t4, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2663t4 interfaceC2663t4) {
        this.f = str;
        this.g = str2;
        this.z = interfaceC2663t4;
        this.E.g(str);
        this.E.h(this.g);
        a(this.f, C2578o8.e.Interstitial, t4, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC2663t4 interfaceC2663t4) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.E.d(str, true);
        i(a(X3.h.E, flatMapToJsonAsString, X3.h.F, X3.h.G));
    }

    private void a(T4 t4, Map<String, String> map) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t4.b()});
        if (map.containsKey("adm")) {
            this.b.a(new InterfaceC2413f4.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
                @Override // com.ironsource.InterfaceC2413f4.d
                public final void a(InterfaceC2326a7 interfaceC2326a7) {
                    v.this.a(interfaceC2326a7);
                }
            });
        }
        this.E.d(t4.h(), true);
        i(a(X3.h.E, SDKUtils.flatMapToJsonAsString(mergeHashMaps), X3.h.F, X3.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC2326a7 interfaceC2326a7) {
        interfaceC2326a7.a(new InterfaceC2344b7() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda4
            @Override // com.ironsource.InterfaceC2344b7
            public final void a(X6 x6) {
                v.this.a(x6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(X6 x6) {
        try {
            this.R.a(x6);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2663t4 interfaceC2663t4) {
        i(a(C2578o8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        i(a(C2578o8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, t4.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        T4 a2 = this.H.a(C2578o8.e.Interstitial, str);
        return a2 != null && a2.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2645s4 interfaceC2645s4) {
        this.f = str;
        this.g = str2;
        this.A = interfaceC2645s4;
        a(str, C2578o8.e.Banner, t4, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2645s4 interfaceC2645s4) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t4.b()});
        if (map != null) {
            i(a(X3.h.N, SDKUtils.flatMapToJsonAsString(mergeHashMaps), X3.h.O, X3.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
        Map<String, String> b2 = t4.b();
        if (b2 != null) {
            i(a(X3.h.S, SDKUtils.flatMapToJsonAsString(b2), X3.h.P, X3.h.Q));
        }
        this.H.b(C2578o8.e.Banner, t4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2645s4 interfaceC2645s4) {
        i(a(X3.h.N, jSONObject.toString(), X3.h.O, X3.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), X3.h.U, X3.h.U));
    }

    private u a(C2578o8.e eVar, T4 t4) {
        u uVar = new u();
        if (eVar != C2578o8.e.RewardedVideo && eVar != C2578o8.e.Interstitial && eVar != C2578o8.e.Banner) {
            return uVar;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(X3.j.g, this.f);
        if (!TextUtils.isEmpty(this.g)) {
            hashMap.put(X3.j.f, this.g);
        }
        if (t4 != null) {
            if (t4.g() != null) {
                hashMap.putAll(t4.g());
                hashMap.put(X3.i.y0, String.valueOf(N.a.c(t4.h())));
            }
            hashMap.put("demandSourceName", t4.f());
            hashMap.put("demandSourceId", t4.h());
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        X3.h a2 = X3.h.a(eVar);
        String a3 = a(a2.a, flatMapToJsonAsString, a2.b, a2.c);
        uVar.a = a2.a;
        uVar.b = a3;
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(C2757y8 c2757y8) {
        this.h.a(this);
        if (c2757y8 != null && c2757y8.exists()) {
            a(c2757y8);
            return null;
        }
        a(new C2757y8(X3.f), new C2596p8(1, "Unable to download Html file"));
        return null;
    }

    private String a(C2578o8.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        T4 a2 = this.H.a(eVar, fetchDemandSourceId);
        if (a2 != null) {
            if (a2.g() != null) {
                hashMap.putAll(a2.g());
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        X3.h b2 = X3.h.b(eVar);
        return a(b2.a, flatMapToJsonAsString, b2.b, b2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C2578o8.e eVar, T4 t4) {
        if (r(eVar.toString())) {
            b(new n(eVar, t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2681u4 interfaceC2681u4) {
        i(a(C2578o8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.T = jSONObject;
        }
    }

    public void a(boolean z, String str) {
        i(e(X3.h.V, a(X3.i.M0, str, null, null, null, null, null, null, X3.i.o, z)));
    }

    public void a(int i2, boolean z) {
        i(e(X3.f.i, a(X3.f.f, String.valueOf(i2), null, null, null, null, null, null, X3.f.g, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, String str2, String str3) {
        String d2 = new C2477ie(str).d(z ? i0 : j0);
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        i(e(d2, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, X3.i.g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return IronSourceNetworkBridge.jsonObjectInit(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C2556n4.d().a(e2);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jsonObjectInit.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jsonObjectInit.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jsonObjectInit.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jsonObjectInit.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jsonObjectInit.put(str9, z);
            }
        } catch (JSONException e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jsonObjectInit.toString();
    }

    @Override // com.ironsource.Nc
    public void a(C2757y8 c2757y8) {
        if (this.X && this.W.a(c2757y8)) {
            a(1);
        } else {
            if (c2757y8.getName().contains(X3.f)) {
                C2395e4.a(this.b0.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.C.a(new o());
                return;
            }
            c(c2757y8.getName(), c2757y8.getParent());
        }
    }

    @Override // com.ironsource.Nc
    public void a(C2757y8 c2757y8, C2596p8 c2596p8) {
        if (this.X && this.W.a(c2757y8)) {
            this.R.c("controller html - failed to download - " + c2596p8.b());
            return;
        }
        boolean z = false;
        if (c2757y8.getName().contains(X3.f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c2757y8.getName().equals(X3.f)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c2757y8.getName() + " and sdk_controller.min.gz.js");
                z = c(c2757y8);
            }
            if (z) {
                C2703v8.a(C2459he.C);
                C2395e4.a(this.b0.getContext(), true);
                this.C.a(new a());
                return;
            }
            this.C.a(new b(), new c(c2596p8));
            return;
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c2757y8)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c2757y8.getName());
            z = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c2757y8);
        }
        if (z) {
            c(c2757y8.getName(), c2757y8.getParent());
        } else {
            b(c2757y8.getName(), c2757y8.getParent(), c2596p8.b());
        }
    }

    private boolean a(File file) {
        return C2395e4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(Pc pc) {
        this.c0 = pc;
        this.b0.a(pc);
    }

    public void a(EnumC0225v enumC0225v) {
        this.w = enumC0225v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.Y) {
            if (this.b0 != null) {
                this.a.d(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.C();
                    }
                });
            }
        } else if (this.b0 != null) {
            this.b0.destroy();
        }
        C2396e5 c2396e5 = this.h;
        if (c2396e5 != null) {
            c2396e5.d();
        }
        R3 r3 = this.S;
        if (r3 != null) {
            r3.b();
        }
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    void a(C2578o8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(C2356c1 c2356c1) {
        synchronized (this.F) {
            if (c2356c1.j() && this.i) {
                Log.d(this.c, "restoreState(state:" + c2356c1 + ")");
                int c2 = c2356c1.c();
                if (c2 != -1) {
                    C2578o8.e eVar = C2578o8.e.RewardedVideo;
                    if (c2 == eVar.ordinal()) {
                        Log.d(this.c, "onRVAdClosed()");
                        String b2 = c2356c1.b();
                        InterfaceC2627r4 a2 = a(eVar);
                        if (a2 != null && !TextUtils.isEmpty(b2)) {
                            a2.b(eVar, b2);
                        }
                    } else {
                        C2578o8.e eVar2 = C2578o8.e.Interstitial;
                        if (c2 == eVar2.ordinal()) {
                            Log.d(this.c, "onInterstitialAdClosed()");
                            String b3 = c2356c1.b();
                            InterfaceC2627r4 a3 = a(eVar2);
                            if (a3 != null && !TextUtils.isEmpty(b3)) {
                                a3.b(eVar2, b3);
                            }
                        }
                    }
                    c2356c1.a(-1);
                    c2356c1.f(null);
                } else {
                    Log.d(this.c, "No ad was opened");
                }
                String d2 = c2356c1.d();
                String f2 = c2356c1.f();
                for (T4 t4 : this.H.a(C2578o8.e.Interstitial)) {
                    if (t4.e() == 2) {
                        Log.d(this.c, "initInterstitial(appKey:" + d2 + ", userId:" + f2 + ", demandSource:" + t4.f() + ")");
                        a(d2, f2, t4, this.z);
                    }
                }
                String g2 = c2356c1.g();
                String h2 = c2356c1.h();
                for (T4 t42 : this.H.a(C2578o8.e.RewardedVideo)) {
                    if (t42.e() == 2) {
                        String f3 = t42.f();
                        Log.d(this.c, "onRVNoMoreOffers()");
                        this.y.c(f3);
                        Log.d(this.c, "initRewardedVideo(appKey:" + g2 + ", userId:" + h2 + ", demandSource:" + f3 + ")");
                        a(g2, h2, t42, this.y);
                    }
                }
                c2356c1.a(false);
            }
            this.E = c2356c1;
        }
    }

    void a(Runnable runnable) {
        Q7 q7 = this.a;
        if (q7 != null) {
            q7.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.a0.a(activity);
    }
}
