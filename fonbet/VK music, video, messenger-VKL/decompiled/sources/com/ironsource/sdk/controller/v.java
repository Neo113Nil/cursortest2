package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.B5;
import com.ironsource.C4217a2;
import com.ironsource.C4219a4;
import com.ironsource.C4234b1;
import com.ironsource.C4252c1;
import com.ironsource.C4264cd;
import com.ironsource.C4279da;
import com.ironsource.C4291e4;
import com.ironsource.C4292e5;
import com.ironsource.C4327g4;
import com.ironsource.C4331g8;
import com.ironsource.C4333ga;
import com.ironsource.C4355he;
import com.ironsource.C4373ie;
import com.ironsource.C4380j4;
import com.ironsource.C4385j9;
import com.ironsource.C4412l0;
import com.ironsource.C4438m8;
import com.ironsource.C4452n4;
import com.ironsource.C4492p8;
import com.ironsource.C4510q8;
import com.ironsource.C4527r8;
import com.ironsource.C4574u1;
import com.ironsource.C4581u8;
import com.ironsource.C4589ug;
import com.ironsource.C4617w8;
import com.ironsource.C4631x4;
import com.ironsource.C4671z8;
import com.ironsource.Dg;
import com.ironsource.E1;
import com.ironsource.EnumC4421l9;
import com.ironsource.H8;
import com.ironsource.InterfaceC4240b7;
import com.ironsource.InterfaceC4309f4;
import com.ironsource.InterfaceC4458na;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.InterfaceC4523r4;
import com.ironsource.InterfaceC4529ra;
import com.ironsource.InterfaceC4541s4;
import com.ironsource.InterfaceC4559t4;
import com.ironsource.InterfaceC4577u4;
import com.ironsource.InterfaceC4610w1;
import com.ironsource.InterfaceC4652y7;
import com.ironsource.Kb;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.O6;
import com.ironsource.Oc;
import com.ironsource.Pe;
import com.ironsource.Qc;
import com.ironsource.R3;
import com.ironsource.R7;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.T3;
import com.ironsource.T4;
import com.ironsource.U3;
import com.ironsource.U4;
import com.ironsource.X3;
import com.ironsource.X4;
import com.ironsource.Y6;
import com.ironsource.Z3;
import com.ironsource.eh;
import com.ironsource.gh;
import com.ironsource.hh;
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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ironsourceads.internal.services.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
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
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.e50;
import xsna.go9;
import xsna.gqw0;
import xsna.he6;
import xsna.i5s;
import xsna.ie40;
import xsna.iq;
import xsna.jh;
import xsna.k50;
import xsna.ke9;
import xsna.kw6;
import xsna.l96;
import xsna.n6j;
import xsna.na8;
import xsna.o63;
import xsna.pi40;
import xsna.pzl;
import xsna.qyc;
import xsna.rm3;
import xsna.rml;
import xsna.w63;
import xsna.x8p;
import xsna.yga0;
import xsna.z6;

/* loaded from: classes13.dex */
public class v implements com.ironsource.sdk.controller.l, Oc, DownloadListener {
    private static final String d0 = "about:blank";
    public static int e0 = 0;
    public static String f0 = "is_store";
    public static String g0 = "external_url";
    public static String h0 = "secondary_web_view";
    private static String i0 = "success";
    private static String j0 = "fail";
    private InterfaceC4541s4 A;
    private String B;
    private com.ironsource.sdk.controller.d C;
    private Dg D;
    private C4252c1 E;
    private U4 H;
    private com.ironsource.sdk.controller.o I;
    private com.ironsource.sdk.controller.q J;
    private com.ironsource.sdk.controller.u K;
    private com.ironsource.sdk.controller.i L;
    private com.ironsource.sdk.controller.a M;
    private com.ironsource.sdk.controller.j N;
    private C4574u1 O;
    private C4631x4 P;
    private gh Q;
    private com.ironsource.sdk.controller.c R;
    private R3 S;
    private JSONObject T;
    private l.a U;
    private l.b V;
    private C4380j4 W;
    private boolean X;
    private final boolean Y;
    private final InterfaceC4652y7 Z;
    private final R7 a;
    C4219a4 a0;
    private InterfaceC4309f4 b;
    private volatile C4333ga b0;
    private Qc c0;
    private String f;
    private String g;
    private final C4292e5 h;
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
    private EnumC0236v w;
    private String x;
    private InterfaceC4577u4 y;
    private InterfaceC4559t4 z;
    private String c = "v";
    private String d = "IronSource";
    private final String e = "We're sorry, some error occurred. we will investigate it";
    private final eh n = new eh();
    private int o = 50;
    private int p = 50;
    private String q = X3.e.b;
    private Object F = new Object();
    private boolean G = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ C4510q8 a;

        public c(C4510q8 c4510q8) {
            this.a = c4510q8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.R.c("controller html - failed to download - " + this.a.b());
        }
    }

    public class d implements Runnable {
        final /* synthetic */ Context a;

        public d(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.a);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ Context a;

        public e(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.g(this.a);
        }
    }

    public class f implements Runnable {
        final /* synthetic */ C4492p8.e a;
        final /* synthetic */ String b;

        public f(C4492p8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4523r4 a;
            C4492p8.e eVar = this.a;
            if ((eVar == C4492p8.e.RewardedVideo || eVar == C4492p8.e.Interstitial) && (a = v.this.a(eVar)) != null) {
                a.b(this.a, this.b);
            }
        }
    }

    public class h implements gh {
        public h() {
        }

        @Override // com.ironsource.gh
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    public class i implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ WebView b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public i(JSONObject jSONObject, WebView webView, int i, String str) {
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

    public class k implements t {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4492p8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    public class l implements t {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4492p8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    public class m implements t {
        public m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4492p8.e eVar, T4 t4) {
            v.this.a(str, eVar, t4);
        }
    }

    public class n implements Runnable {
        final /* synthetic */ C4492p8.e a;
        final /* synthetic */ T4 b;
        final /* synthetic */ String c;

        public n(C4492p8.e eVar, T4 t4, String str) {
            this.a = eVar;
            this.b = t4;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            T4 t4;
            C4492p8.e eVar = C4492p8.e.RewardedVideo;
            C4492p8.e eVar2 = this.a;
            if ((eVar != eVar2 && C4492p8.e.Interstitial != eVar2 && C4492p8.e.Banner != eVar2) || (t4 = this.b) == null || TextUtils.isEmpty(t4.h())) {
                return;
            }
            InterfaceC4523r4 a = v.this.a(this.a);
            String unused = v.this.c;
            Objects.toString(this.a);
            if (a != null) {
                a.a(this.a, this.b.h(), this.c);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class p extends WebChromeClient {
        public /* synthetic */ p(v vVar, int i) {
            this();
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
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new r(v.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
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

        private p() {
        }
    }

    public static class q {
        C4492p8.e a;
        String b;

        public q(C4492p8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public C4492p8.e b() {
            return this.a;
        }
    }

    public class r extends WebViewClient {
        public /* synthetic */ r(v vVar, int i) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context q = v.this.q();
            q.startActivity(new OpenUrlActivity.e(new k.c()).a(str).b(false).a(q));
            return true;
        }

        private r() {
        }
    }

    public class s {

        public class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = v.this.c;
                v.this.y.b(this.b, str);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ String a;

            public b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.z.a(C4492p8.e.Interstitial, this.a, (C4234b1) null);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = v.this.c;
                v.this.z.a(C4492p8.e.Interstitial, this.b, str);
            }
        }

        public class d implements Runnable {
            final /* synthetic */ InterfaceC4523r4 a;
            final /* synthetic */ C4492p8.e b;
            final /* synthetic */ String c;

            public d(InterfaceC4523r4 interfaceC4523r4, C4492p8.e eVar, String str) {
                this.a = interfaceC4523r4;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(this.b, this.c);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ JSONObject b;

            public e(String str, JSONObject jSONObject) {
                this.a = str;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.a(this.a, this.b);
            }
        }

        public class f implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public f(String str, String str2) {
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

        public class g implements Runnable {
            final /* synthetic */ String a;

            public g(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.A.a(C4492p8.e.Banner, this.a, (C4234b1) null);
            }
        }

        public class h implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = v.this.c;
                v.this.A.a(C4492p8.e.Banner, this.b, str);
            }
        }

        public class i implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ C4331g8 b;

            public i(String str, C4331g8 c4331g8) {
                this.a = str;
                this.b = c4331g8;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.A.a(this.a, this.b);
            }
        }

        public class j implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public j(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.A.c(this.b, str);
            }
        }

        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.I();
            }
        }

        public class l implements Runnable {
            final /* synthetic */ String a;

            public l(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.a).has(f.b.b)) {
                        v.this.U.a(f.a.a(this.a));
                    } else {
                        v.this.V.a(Nb.a(this.a));
                    }
                } catch (JSONException e) {
                    C4452n4.d().a(e);
                    Logger.e(v.this.c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        public class m implements Runnable {
            final /* synthetic */ C4492p8.e a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ JSONObject d;

            public m(C4492p8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4523r4 a;
                C4492p8.e eVar = this.a;
                if ((eVar == C4492p8.e.Interstitial || eVar == C4492p8.e.RewardedVideo || eVar == C4492p8.e.Banner) && (a = v.this.a(eVar)) != null) {
                    a.a(this.a, this.b, this.c, this.d);
                }
            }
        }

        public class n implements Runnable {
            final /* synthetic */ String a;

            public n(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.c, "omidAPI(" + this.a + ")");
                    v.this.I.a(new C4373ie(this.a).toString(), s.this.new w());
                } catch (Exception e) {
                    C4452n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.E();
            }
        }

        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.removeJavascriptInterface(X3.e);
            }
        }

        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.getSettings().setMixedContentMode(0);
            }
        }

        public class r implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ C4234b1 c;

            public r(int i, String str, C4234b1 c4234b1) {
                this.a = i;
                this.b = str;
                this.c = c4234b1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a <= 0) {
                    v.this.y.c(this.b);
                } else {
                    String unused = v.this.c;
                    v.this.y.a(C4492p8.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        public class RunnableC0234s implements Runnable {
            final /* synthetic */ String a;

            public RunnableC0234s(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.N.a(new JSONObject(this.a), s.this.new w());
                } catch (Exception e) {
                    C4452n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        public class t implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ int c;

            public t(String str, String str2, int i) {
                this.a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a.equalsIgnoreCase(C4492p8.e.RewardedVideo.toString())) {
                    v.this.y.a(this.b, this.c);
                }
            }
        }

        public class u implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ int b;

            public u(String str, int i) {
                this.a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.z.onInterstitialAdRewarded(this.a, this.b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        public class RunnableC0235v implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public RunnableC0235v(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = v.this.c;
                v.this.y.a(C4492p8.e.RewardedVideo, this.b, str);
            }
        }

        public s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(String str) {
            try {
                Logger.i(v.this.c, "permissionsAPI(" + str + ")");
                v.this.J.a(new C4373ie(str).toString(), new w());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.c, "adClicked(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d(X3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            C4492p8.e g2 = v.this.g(d2);
            InterfaceC4523r4 a2 = v.this.a(g2);
            if (g2 == null || a2 == null) {
                return;
            }
            v.this.b(new d(a2, g2, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            v.this.d;
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d(X3.i.k);
            int parseInt = d2 != null ? Integer.parseInt(d2) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            String d3 = c4373ie.d(X3.i.m);
            if (TextUtils.isEmpty(d3)) {
                v.this.d;
            }
            if (C4492p8.e.Interstitial.toString().equalsIgnoreCase(d3)) {
                a(fetchDemandSourceId, parseInt);
            } else if (v.this.r(d3)) {
                v.this.b(new t(d3, fetchDemandSourceId, parseInt));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.c, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4373ie(str));
            C4234b1 c4234b1 = new C4234b1(str);
            if (!c4234b1.g()) {
                v.this.a(str, false, X3.c.r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String d2 = c4234b1.d();
            if (C4492p8.e.RewardedVideo.toString().equalsIgnoreCase(d2) && v.this.r(d2)) {
                v.this.b(new r(Integer.parseInt(c4234b1.c()), fetchDemandSourceId, c4234b1));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            v.this.a.a(new e50(13, this, str), R7.l);
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            R7.a.b(new l96(7, this, str));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C4492p8.e g2;
            try {
                Logger.i(v.this.c, "cleanAdInstance(" + str + ")");
                C4373ie c4373ie = new C4373ie(str);
                String d2 = c4373ie.d(X3.i.m);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (g2 = v.this.g(d2)) == null) {
                    return;
                }
                v.this.H.b(g2, fetchDemandSourceId);
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> a2 = C4279da.e().a();
                C4373ie c4373ie = new C4373ie(str);
                if (!a2.isEmpty()) {
                    c4373ie.b(X3.i.x0, a2.toString());
                }
                v.this.a(c4373ie.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            v.this.a.a(new qyc(9, this, str), "deleteFile");
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            v.this.a.a(new he6(13, this, str), "deleteFolder");
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.c, "destroyInlineStore() called");
            try {
                a.AbstractC0369a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), EnumC4421l9.b.a(new C4373ie(str).a(X3.f.e, EnumC4421l9.APP_ACTIVITY.b())));
                if (a2 instanceof a.AbstractC0369a.C0370a) {
                    v.this.a(str, false, ((a.AbstractC0369a.C0370a) a2).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            v.this.a.a(new rm3(10, this, str), R7.k);
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            yga0.c("displayWebView(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
            C4373ie c4373ie = new C4373ie(str);
            boolean booleanValue = ((Boolean) c4373ie.b("display")).booleanValue();
            String d2 = c4373ie.d(X3.i.m);
            boolean c2 = c4373ie.c(X3.i.u);
            String d3 = c4373ie.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            boolean c3 = c4373ie.c(X3.i.z0);
            if (!booleanValue) {
                v.this.a(EnumC0236v.Gone);
                v.this.o();
                return;
            }
            v.this.G = c4373ie.c(X3.i.v);
            boolean c4 = c4373ie.c(X3.i.y);
            EnumC0236v v = v.this.v();
            EnumC0236v enumC0236v = EnumC0236v.Display;
            if (v == enumC0236v) {
                Logger.i(v.this.c, "State: " + v.this.w);
                return;
            }
            v.this.a(enumC0236v);
            Logger.i(v.this.c, "State: " + v.this.w);
            Context q2 = v.this.q();
            String t2 = v.this.t();
            int K = v.this.Z.K(q2);
            if (c2) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(q2);
                hVar.addView(v.this.v);
                hVar.a(v.this);
                return;
            }
            Intent intent = c4 ? new Intent(q2, (Class<?>) InterstitialActivity.class) : new Intent(q2, (Class<?>) ControllerActivity.class);
            C4492p8.e eVar = C4492p8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d2)) {
                if ("application".equals(t2)) {
                    t2 = SDKUtils.translateRequestedOrientation(v.this.Z.M(q2));
                }
                intent.putExtra(X3.i.m, eVar.toString());
                v.this.E.a(eVar.ordinal());
                v.this.E.f(fetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.y.c(eVar, fetchDemandSourceId);
                }
            } else {
                C4492p8.e eVar2 = C4492p8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d2)) {
                    if ("application".equals(t2)) {
                        t2 = SDKUtils.translateRequestedOrientation(v.this.Z.M(q2));
                    }
                    intent.putExtra(X3.i.m, eVar2.toString());
                }
            }
            if (d3 != null) {
                intent.putExtra("adViewId", d3);
            }
            intent.putExtra(X3.i.z0, c3);
            intent.setFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            intent.putExtra(X3.i.v, v.this.G);
            intent.putExtra(X3.i.A, t2);
            intent.putExtra(X3.i.B, K);
            v vVar = v.this;
            vVar.j = new q(vVar.g(d2), fetchDemandSourceId);
            q2.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            v.this.a.a(new w63(12, this, str), R7.f);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            yga0.c("fileSystemAPI(", str, ")", v.this.c);
            v.this.a(new RunnableC0234s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            yga0.c("getApplicationInfo(", str, ")", v.this.c);
            String e2 = v.this.e(str);
            String d2 = v.this.d(str);
            C4373ie c4373ie = new C4373ie(str);
            Object[] f2 = v.this.f(c4373ie.d(X3.i.m), SDKUtils.fetchDemandSourceId(c4373ie));
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
        public void getCachedFilesMap(String str) {
            v.this.a.a(new ke9(9, this, str), R7.i);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String e2;
            Logger.i(v.this.c, "getConnectivityInfo(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d(v.i0);
            String d3 = c4373ie.d(v.j0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            R3 r3 = vVar.S;
            if (r3 != null) {
                jSONObject = r3.a(vVar.b0.getContext());
            }
            if (jSONObject.length() > 0) {
                e2 = v.this.e(d2, jSONObject.toString());
            } else {
                e2 = v.this.e(d3, v.e0(v.this, "errMsg", X3.c.A, null, null, null, null, null, null));
            }
            v.this.i(e2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.c, "getControllerConfig(" + str + ")");
            String d2 = new C4373ie(str).d(v.i0);
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
            C4373ie c4373ie = new C4373ie(str);
            String d3 = c4373ie.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            String d4 = c4373ie.d(X3.i.m);
            if (d4 == null || d3 == null) {
                return;
            }
            try {
                C4492p8.e productType = SDKUtils.getProductType(d4);
                if (productType != null) {
                    T4 a2 = v.this.H.a(productType, fetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(X3.i.m, d4);
                    jSONObject.put("demandSourceName", d3);
                    jSONObject.put("demandSourceId", fetchDemandSourceId);
                    if (a2 == null || a2.a(-1)) {
                        d2 = v.this.d(str);
                    } else {
                        d2 = v.this.e(str);
                        jSONObject.put("state", a2.j());
                    }
                    a(d2, jSONObject.toString());
                }
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getDeviceStatus(String str) {
            v.this.a.a(new x8p(5, this, str), R7.d);
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            yga0.c("getDeviceVolume(", str, ")", v.this.c);
            try {
                Context context = v.this.b0.getContext();
                float a2 = X4.b(context).a(context);
                C4373ie c4373ie = new C4373ie(str);
                c4373ie.b(X3.j.P, String.valueOf(a2));
                v.this.a(c4373ie.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.c, "getInitSummery(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            c4373ie.a(X3.j.q0, v.this.T);
            v.this.a(c4373ie.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C4617w8.a(C4355he.z, new C4527r8().a(B5.y, str).a());
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
            C4373ie c4373ie = new C4373ie(str);
            if (!c4373ie.a("key")) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            String e2 = v.this.e(str);
            String d2 = c4373ie.d("key");
            v.this.i(v.this.e(e2, v.e0(v.this, d2, C4279da.e().a(d2), null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            v.this.a.a(new k50(9, this, str), R7.e);
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.c, "initController(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            CountDownTimer countDownTimer = v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.m = null;
            }
            if (c4373ie.a(X3.i.q)) {
                String d2 = c4373ie.d(X3.i.q);
                if (X3.i.s.equalsIgnoreCase(d2)) {
                    v vVar = v.this;
                    vVar.i = true;
                    vVar.R.d();
                } else if (X3.i.r.equalsIgnoreCase(d2)) {
                    v.this.R.c();
                } else if (!"failed".equalsIgnoreCase(d2)) {
                    Logger.i(v.this.c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.R.c(go9.b("controller js failed to initialize : ", c4373ie.d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            yga0.c("onAdWindowsClosed(", str, ")", v.this.c);
            v.this.E.a();
            v.this.E.f(null);
            v.this.j = null;
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d(X3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            C4492p8.e g2 = v.this.g(d2);
            v.this.d;
            Objects.toString(g2);
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
            yga0.c("onGetApplicationInfoFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            yga0.c("onGetApplicationInfoSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            yga0.c("onGetCachedFilesMapFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            yga0.c("onGetCachedFilesMapSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            yga0.c("onGetDeviceStatusFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            yga0.c("onGetDeviceStatusSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.c, "onInitBannerFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            U4 u4 = v.this.H;
            C4492p8.e eVar = C4492p8.e.Banner;
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
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4373ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C4492p8.e.Banner.toString())) {
                v.this.b(new g(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.c, "onInitInterstitialFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            U4 u4 = v.this.H;
            C4492p8.e eVar = C4492p8.e.Interstitial;
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
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4373ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C4492p8.e.Interstitial.toString())) {
                v.this.b(new b(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onInitRewardedVideoFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            U4 u4 = v.this.H;
            C4492p8.e eVar = C4492p8.e.RewardedVideo;
            T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0235v(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.c, "onLoadBannerFail()");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && v.this.r(C4492p8.e.Banner.toString())) {
                v.this.b(new j(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.c, "onLoadBannerSuccess()");
            C4373ie c4373ie = new C4373ie(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            String d2 = c4373ie.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            H8 a2 = C4438m8.a().a(d2);
            if (a2 == null) {
                v.this.A.c(fetchDemandSourceId, "not found view for the current adViewId= " + d2);
                return;
            }
            if (a2 instanceof C4331g8) {
                C4331g8 c4331g8 = (C4331g8) a2;
                if (v.this.r(C4492p8.e.Banner.toString())) {
                    v.this.b(new i(fetchDemandSourceId, c4331g8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.c, "onLoadInterstitialFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (v.this.r(C4492p8.e.Interstitial.toString())) {
                v.this.b(new f(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            JSONObject a2 = c4373ie.a();
            a(fetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C4492p8.e.Interstitial.toString())) {
                v.this.b(new e(fetchDemandSourceId, a2));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            yga0.c("onReceivedMessage(", str, ")", v.this.c);
            R7.a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.c, "onShowInterstitialFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            final String d2 = c4373ie.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final boolean r2 = v.this.r(C4492p8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: xsna.ufz0
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.a(r2, d2, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            yga0.c("onShowInterstitialSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4373ie(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C4252c1 c4252c1 = v.this.E;
            C4492p8.e eVar = C4492p8.e.Interstitial;
            c4252c1.a(eVar.ordinal());
            v.this.E.f(fetchDemandSourceId);
            final boolean r2 = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: xsna.tfz0
                @Override // java.lang.Runnable
                public final void run() {
                    v.s.this.a(r2, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoFail(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
            if (v.this.r(C4492p8.e.RewardedVideo.toString())) {
                v.this.b(new a(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            yga0.c("onShowRewardedVideoSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String unused = v.this.c;
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d(X3.i.m);
            if (v.this.D == null || TextUtils.isEmpty(d2)) {
                return;
            }
            String d3 = c4373ie.d("status");
            if (X3.i.d0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoStarted();
                return;
            }
            if (X3.i.e0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoPaused();
                return;
            }
            if (X3.i.f0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoResumed();
                return;
            }
            if (X3.i.g0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoEnded();
                return;
            }
            if (X3.i.h0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoStopped();
                return;
            }
            Logger.i(v.this.c, "onVideoStatusChanged: unknown status: " + d3);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.c, "openInlineStore(" + str + ")");
                C4373ie c4373ie = new C4373ie(str);
                a.AbstractC0369a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), new C4385j9(c4373ie.d("url"), c4373ie.d(X3.f.c), EnumC4421l9.b.a(c4373ie.a(X3.f.e, EnumC4421l9.APP_ACTIVITY.b())), (!c4373ie.a(X3.f.d) || c4373ie.e(X3.f.d)) ? null : (JSONObject) c4373ie.b(X3.f.d)));
                if (a2 instanceof a.AbstractC0369a.C0370a) {
                    v.this.a(str, false, ((a.AbstractC0369a.C0370a) a2).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.c, "openUrl(" + str + ")");
                C4373ie c4373ie = new C4373ie(str);
                p.c a2 = new p.a(c4373ie.d("method"), new Sc(v.this.G, 805306368)).a(c4373ie.c(X3.i.L0) ? v.this.b0.getContext() : v.this.q(), new Rc(c4373ie.d("url"), c4373ie.d("package_name")));
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
        public void permissionsAPI(String str) {
            v.this.a.a(new z6(7, this, str), R7.j);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            C4373ie c4373ie;
            String d2;
            String str2;
            try {
                Logger.i(v.this.c, "postAdEventNotification(" + str + ")");
                c4373ie = new C4373ie(str);
                d2 = c4373ie.d(X3.i.j0);
            } catch (Exception e2) {
                e = e2;
            }
            try {
                if (TextUtils.isEmpty(d2)) {
                    v.this.a(str, false, X3.c.w, (String) null);
                    return;
                }
                String d3 = c4373ie.d(X3.i.k0);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4373ie);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d3;
                JSONObject jSONObject = (JSONObject) c4373ie.b(X3.i.l0);
                String d4 = c4373ie.d(X3.i.m);
                C4492p8.e g2 = v.this.g(d4);
                try {
                    if (!v.this.r(d4)) {
                        v.this.a(str, false, X3.c.v, (String) null);
                        return;
                    }
                    String e3 = v.this.e(str);
                    if (TextUtils.isEmpty(e3)) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        v.this.i(v.this.a(e3, v.e0(v.this, X3.i.m, d4, X3.i.j0, d2, "demandSourceName", d3, "demandSourceId", str2), X3.h.c0, X3.h.d0));
                    }
                    try {
                        v.this.b(new m(g2, str2, d2, jSONObject));
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        C4452n4.d().a(exc);
                        IronLog.INTERNAL.error(exc.toString());
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception e6) {
                exc = e6;
                C4452n4.d().a(exc);
                IronLog.INTERNAL.error(exc.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            yga0.c("removeCloseEventHandler(", str, ")", v.this.c);
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
                C4373ie c4373ie = new C4373ie(str);
                String d2 = c4373ie.d("path");
                String d3 = c4373ie.d(X3.i.b);
                if (TextUtils.isEmpty(d3)) {
                    v.this.a(str, false, X3.c.g, "1");
                    return;
                }
                C4671z8 c4671z8 = new C4671z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2), SDKUtils.getFileName(d3));
                IronSourceStorageUtils.ensurePathSafety(c4671z8, v.this.B);
                v vVar = v.this;
                if (vVar.Z.a(vVar.B) <= 0) {
                    v.this.a(str, false, Z3.A, (String) null);
                    return;
                }
                if (c4671z8.exists()) {
                    v.this.a(str, false, Z3.z, (String) null);
                    return;
                }
                if (!T3.h(v.this.b0.getContext())) {
                    v.this.a(str, false, Z3.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.h.a(c4671z8, d3, c4373ie.a("connectionTimeout", 0), c4373ie.a("readTimeout", 0));
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.c, "setBackButtonState(" + str + ")");
            C4279da.e().c(new C4373ie(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.c, "setForceClose(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            String d2 = c4373ie.d("width");
            String d3 = c4373ie.d("height");
            v.this.o = Integer.parseInt(d2);
            v.this.p = Integer.parseInt(d3);
            v.this.q = c4373ie.d(X3.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            yga0.c("setMixedContentAlwaysAllow(", str, ")", v.this.c);
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.c, "setOrientation(" + str + ")");
                String d2 = new C4373ie(str).d(X3.i.n);
                v.this.o(d2);
                v vVar = v.this;
                if (vVar.c0 != null) {
                    v.this.c0.onOrientationChanged(d2, vVar.Z.K(vVar.b0.getContext()));
                }
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.c, "setStoreSearchKeys(" + str + ")");
            C4279da.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.c, "setUserData(" + str + ")");
            C4373ie c4373ie = new C4373ie(str);
            if (!c4373ie.a("key")) {
                v.this.a(str, false, X3.c.F, (String) null);
                return;
            }
            if (!c4373ie.a("value")) {
                v.this.a(str, false, X3.c.G, (String) null);
                return;
            }
            String d2 = c4373ie.d("key");
            String d3 = c4373ie.d("value");
            C4279da.e().a(d2, d3);
            v.this.i(v.this.e(v.this.e(str), v.e0(v.this, d2, d3, null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            yga0.c("setWebviewBackgroundColor(", str, ")", v.this.c);
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            yga0.c("stillAlive(", str, ")", v.this.c);
            v.this.b.a();
        }

        public void u(String str) {
            v.this.i(v.this.a(X3.h.d, str, (String) null, (String) null));
        }

        public void v(String str) {
            v.this.i(v.this.a(X3.h.e, str, (String) null, (String) null));
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.C.f());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
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
                C4452n4.d().a(e2);
                C4617w8.a(C4355he.p, new C4527r8().a(B5.A, e2.getMessage()).a());
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
                String d2 = new C4373ie(str).d("path");
                if (d2 == null) {
                    v.this.a(str, false, X3.c.g, "1");
                    return;
                }
                C4671z8 c4671z8 = new C4671z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2));
                IronSourceStorageUtils.ensurePathSafety(c4671z8, v.this.B);
                if (!c4671z8.exists()) {
                    v.this.a(str, false, X3.c.e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c4671z8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(String str) {
            try {
                Logger.i(v.this.c, "deviceDataAPI(" + str + ")");
                v.this.L.a(new C4373ie(str).toString(), new w());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o(String str) {
            try {
                Logger.i(v.this.c, "dsSharedSignalsAPI(" + str + ")");
                v.this.P.a(new C4373ie(str).toString(), new w());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void p(String str) {
            yga0.c("getCachedFilesMap(", str, ")", v.this.c);
            String e2 = v.this.e(str);
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            C4373ie c4373ie = new C4373ie(str);
            if (!c4373ie.a("path")) {
                v.this.a(str, false, X3.c.s, (String) null);
                return;
            }
            String str2 = (String) c4373ie.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.B, str2)) {
                v.this.a(str, false, X3.c.t, (String) null);
                return;
            }
            v.this.i(v.this.a(e2, IronSourceStorageUtils.getCachedFilesMap(v.this.B, str2), X3.h.s, X3.h.r));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void q(String str) {
            yga0.c("getDeviceStatus(", str, ")", v.this.c);
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
                v.this.K.a(new C4373ie(str).toString(), new w());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            try {
                InterfaceC4610w1 a2 = InterfaceC4610w1.a(str);
                v vVar = v.this;
                C4574u1.a a3 = vVar.O.a(vVar.b0.getContext(), a2);
                v.this.i(v.this.e(a3.f(), a3.i().toString()));
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        public class w implements InterfaceC4458na {
            public w() {
            }

            @Override // com.ironsource.InterfaceC4458na
            public void a(boolean z, String str, String str2) {
                C4373ie c4373ie = new C4373ie();
                c4373ie.b(z ? v.i0 : v.j0, str);
                c4373ie.b("data", str2);
                v.this.a(c4373ie.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4458na
            public void a(boolean z, String str, C4373ie c4373ie) {
                c4373ie.b(z ? v.i0 : v.j0, str);
                v.this.a(c4373ie.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4458na
            public void a(boolean z, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z ? v.i0 : v.j0, str);
                    v.this.a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C4452n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (b(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C4452n4.d().a(e2);
                    Logger.d(v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(String str) {
            try {
                Logger.i(v.this.c, "deleteFile(" + str + ")");
                C4373ie c4373ie = new C4373ie(str);
                String d2 = c4373ie.d(X3.i.b);
                String d3 = c4373ie.d("path");
                if (d3 != null && !TextUtils.isEmpty(d2)) {
                    C4671z8 c4671z8 = new C4671z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d3), d2);
                    IronSourceStorageUtils.ensurePathSafety(c4671z8, v.this.B);
                    if (!c4671z8.exists()) {
                        v.this.a(str, false, X3.c.f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c4671z8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, X3.c.g, "1");
            } catch (Exception e2) {
                C4452n4.d().a(e2);
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

        public boolean b(String str) {
            if (TextUtils.isEmpty(str) || str.contains(C4217a2.f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        private void a(String str, int i2) {
            T4 a2;
            v vVar = v.this;
            C4492p8.e eVar = C4492p8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (a2 = v.this.H.a(eVar, str)) != null && a2.k()) {
                v.this.b(new u(str, i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str) {
            if (z) {
                v.this.z.c(C4492p8.e.Interstitial, str);
                v.this.z.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z) {
            T4 a2 = v.this.H.a(C4492p8.e.Interstitial, str);
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
                v.this.M.a(new C4373ie(str).toString(), new w());
            } catch (Exception e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }
    }

    public interface t {
        void a(String str, C4492p8.e eVar, T4 t4);
    }

    public static class u {
        String a;
        String b;
    }

    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC0236v {
        Display,
        Gone
    }

    public class w extends WebViewClient {
        public /* synthetic */ w(v vVar, int i) {
            this();
        }

        private void a() {
            String b = v.this.n.b();
            if (b != null) {
                v.this.m(b);
            }
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
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(X3.f) && (cVar = v.this.R) != null) {
                cVar.c(iq.a(i, "controller html - web-view receivedError on loading - ", str, " (errorCode: ", ")"));
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
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

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e) {
                C4452n4.d().a(e);
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(v.this.B);
                String a = i5s.a(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(a));
                    return new WebResourceResponse("text/javascript", C.UTF8_NAME, getClass().getResourceAsStream(a));
                } catch (FileNotFoundException e2) {
                    C4452n4.d().a(e2);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.A();
                    return true;
                }
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        private w() {
        }
    }

    public v(Context context, U4 u4, C4219a4 c4219a4, com.ironsource.sdk.controller.c cVar, R7 r7, int i2, C4292e5 c4292e5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        int i3 = 0;
        p pVar = new p(this, i3);
        this.r = pVar;
        boolean s2 = Kb.Y().h().s();
        this.Y = Kb.Y().h().E();
        if (s2) {
            countDownLatch = new CountDownLatch(1);
            a(context, r7, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.Z = Kb.Y().a();
        if (!s2) {
            this.b0 = new C4333ga(context, new InterfaceC4529ra.a());
        }
        Logger.i(this.c, "C'tor");
        this.a0 = c4219a4;
        this.R = cVar;
        this.a = r7;
        this.H = u4;
        if (!s2) {
            a(context, this.b0);
        }
        this.B = str;
        this.E = new C4252c1();
        this.T = new JSONObject();
        this.h = c4292e5;
        this.U = aVar;
        this.V = bVar;
        boolean optBoolean = SDKUtils.getNetworkConfiguration().optBoolean(X3.a.i, false);
        this.X = optBoolean;
        if (optBoolean) {
            this.W = new C4380j4(new C4327g4(SDKUtils.getControllerUrl(), this.B, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C4264cd(SDKUtils.getControllerUrl())), new gqw0(this, 3), c4292e5, new InterfaceC4488p4.a());
        } else {
            c4292e5.a(this);
            this.C = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.B, SDKUtils.getControllerUrl(), c4292e5);
        }
        if (!s2) {
            this.b0.setWebViewClient(new w(this, i3));
            this.b0.setWebChromeClient(pVar);
            hh.a(this.b0);
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
                C4452n4.d().a(e2);
                Thread.currentThread().interrupt();
                this.R.c("WebView initialization was interrupted");
                return;
            }
        }
        this.b = InterfaceC4309f4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    public static /* bridge */ /* synthetic */ String e0(v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return vVar.a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.c, str + " " + str4);
    }

    public class g extends R3 {
        public g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC4562t7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC4562t7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.d(jSONObject);
            } catch (JSONException e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC4562t7
        public void a() {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n("none");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B() {
        return Kb.Y().h().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        ViewParent parent = this.b0.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b0);
        }
        this.b0.destroy();
    }

    @SuppressLint({"NewApi"})
    private void J() {
    }

    private void a(Context context, R7 r7, CountDownLatch countDownLatch) {
        r7.d(new rml(this, context, countDownLatch, 4));
    }

    private R3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
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
                jSONObject.put(X3.i.m, str);
            } catch (JSONException e2) {
                C4452n4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C4452n4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(X3.j.f), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                C4452n4.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(X3.j.g), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                C4452n4.d().a(e5);
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
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    C4452n4.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new kw6(13, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.b0.a(new m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.c, "load(): " + str);
            this.b0.loadUrl(str);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    private void n() {
        CountDownTimer countDownTimer;
        if (!Kb.Y().h().h() || (countDownTimer = this.m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C4373ie c4373ie = new C4373ie(str);
        String d2 = c4373ie.d("color");
        String d3 = c4373ie.d("adViewId");
        int parseColor = !X3.i.T.equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 == null) {
            this.b0.setBackgroundColor(parseColor);
            return;
        }
        WebView presentingView = C4438m8.a().a(d3).getPresentingView();
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
            C4452n4.d().a(th);
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
            C4452n4.d().a(th);
            Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
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
    public C4492p8.c h() {
        return C4492p8.c.Web;
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

    public gh p() {
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

    public C4252c1 u() {
        return this.E;
    }

    public EnumC0236v v() {
        return this.w;
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        C4492p8.e b2 = this.j.b();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.b0 = new C4333ga(context, new InterfaceC4529ra.a());
                a(context, this.b0);
                this.b0.setWebViewClient(new w(this, 0));
                this.b0.setWebChromeClient(this.r);
                hh.a(this.b0);
                a(this.b0);
                this.b0.setDownloadListener(this);
            } catch (Exception e2) {
                this.R.c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e2);
                C4452n4.d().a(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Qc qc = this.c0;
        if (qc != null) {
            qc.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C4492p8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C4492p8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C4492p8.e.Banner.toString()) || this.A == null : this.y == null) : this.z != null) {
            z = true;
        }
        if (!z) {
            Logger.d(this.c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.X) {
            this.W.b();
            return;
        }
        this.C.a(new C4527r8());
        if (this.C.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                i(e(X3.h.p, a(X3.i.b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C4452n4.d().a(exc);
                b(str3, str2, exc.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str;
        }
    }

    public boolean h(String str) {
        try {
            if (!new Pe(str, C4279da.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C4589ug.a(q(), str);
            return true;
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C4373ie(str).d(i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C4373ie(str).d(j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4492p8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4492p8.e eVar = C4492p8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4492p8.e eVar2 = C4492p8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C4492p8.e eVar3 = C4492p8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.b0.getSettings().setCacheMode(2);
        } else {
            this.b0.getSettings().setCacheMode(-1);
        }
    }

    private String e(Context context) {
        String[] strArr = {"com.android.vending", "com.google.market"};
        for (int i2 = 0; i2 < 2; i2++) {
            String a2 = a(context, strArr[i2]);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return "";
    }

    public void n(String str) {
        String d2;
        try {
            d2 = U3.d(this.b0.getContext());
            Logger.i(this.c, "device status changed, connection type " + str);
            C4581u8.a(str);
            C4581u8.b(d2);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            i(e(X3.h.x, a("connectionType", str, "rawConnectionType", d2, null, null, null, null, null, false)));
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            C4452n4.d().a(exc);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        X4 b2 = X4.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        try {
            jSONObject.put(X3.j.z, "none");
            jSONObject.put(X3.j.A, SDKUtils.translateDeviceOrientation(this.Z.A(context)));
            String d2 = b2.d();
            if (d2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(d2));
            }
            String c2 = b2.c();
            if (c2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(c2));
            } else {
                z = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.c, "add LAT");
                jSONObject.put(X3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            String e2 = b2.e();
            if (e2 != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.m), SDKUtils.encodeString(e2));
            } else {
                z = true;
            }
            String f2 = b2.f();
            if (f2 != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.n), f2.replaceAll("[^0-9/.]", ""));
            } else {
                z = true;
            }
            String f3 = b2.f();
            if (f3 != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.o), SDKUtils.encodeString(f3));
            }
            String valueOf = String.valueOf(b2.a());
            if (valueOf != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.p), valueOf);
            } else {
                z = true;
            }
            jSONObject.put(O6.j0, String.valueOf(C4412l0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.q), SDKUtils.encodeString(sDKVersion));
            }
            if (b2.b() != null && b2.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(X3.j.r), SDKUtils.encodeString(b2.b()));
            }
            String b3 = U3.b(context);
            if (b3.equals("none")) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(b3));
            }
            String d3 = U3.d(context);
            if (d3 != null) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(d3));
            } else {
                z = true;
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.v), U3.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(X3.j.y, SDKUtils.encodeString(String.valueOf(this.Z.a(this.B))));
            String valueOf2 = String.valueOf(this.Z.o());
            if (TextUtils.isEmpty(valueOf2)) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(X3.j.G) + X3.j.d + SDKUtils.encodeString("width") + X3.j.e, SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.G) + X3.j.d + SDKUtils.encodeString("height") + X3.j.e, SDKUtils.encodeString(String.valueOf(this.Z.b())));
            String g2 = E1.g(this.b0.getContext());
            if (!TextUtils.isEmpty(g2)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g2));
            }
            String valueOf3 = String.valueOf(this.Z.r());
            if (!TextUtils.isEmpty(valueOf3)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.K), SDKUtils.encodeString(valueOf3));
            }
            String valueOf4 = String.valueOf(this.Z.p());
            if (!TextUtils.isEmpty(valueOf4)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.O), SDKUtils.encodeString(valueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.P), X4.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.Y), this.Z.l(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), T3.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), T3.c(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), T3.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.R), SDKUtils.encodeString(T3.g(context)));
            jSONObject.put(SDKUtils.encodeString(X3.j.V), E1.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.X), E1.d(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(E1.b(context)));
            String e3 = E1.e(context);
            if (!TextUtils.isEmpty(e3)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.c0), SDKUtils.encodeString(e3));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.o0), SDKUtils.encodeString(e(this.b0.getContext())));
            jSONObject.put(SDKUtils.encodeString(X3.j.p0), this.Z.u(context));
        } catch (JSONException e4) {
            C4452n4.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    public void b(int i2) {
        e0 = i2;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(X3.h.u));
    }

    private String c(JSONObject jSONObject) {
        X4 b2 = X4.b(this.b0.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            jh.f(sb, "SDKVersion=", sDKVersion, "&");
        }
        String e2 = b2.e();
        if (!TextUtils.isEmpty(e2)) {
            sb.append("deviceOs=");
            sb.append(e2);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str = parse.getScheme() + StringUtils.PROCESS_POSTFIX_DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = na8.a(port, host, StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            n6j.b(sb, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{X3.j.Z, X3.j.g}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&");
                        sb.append("controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e3) {
                    C4452n4.d().a(e3);
                    IronLog.INTERNAL.error(e3.toString());
                }
            }
            sb.append("&debug=");
            sb.append(r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean b3 = C4291e4.b(this.b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && b3) {
                sb.append("&chfb=true");
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        a(t4, map);
    }

    public Context q() {
        return this.a0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.c(context);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
        Map<String, String> b2 = t4.b();
        if (b2 != null) {
            i(e(X3.h.T, SDKUtils.flatMapToJsonAsString(b2)));
        }
        this.H.b(C4492p8.e.Interstitial, t4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(X3.h.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), X3.d);
        webView.addJavascriptInterface(b(sVar), X3.e);
    }

    private String b(String str) {
        String str2 = this.B + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(X3.h.q, a(X3.i.b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                C4452n4.d().a(e);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new s()), sVar);
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.I = oVar;
    }

    public class j extends CountDownTimer {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.R.c(X3.c.j);
            }
        }

        public class b implements Runnable {
            public b() {
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
        public j(long j, long j2, int i, int i2) {
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

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.J = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.K = uVar;
    }

    public void b(boolean z, String str) {
        i(e(X3.h.V, a(X3.i.K, str, null, null, null, null, null, null, X3.i.o, z)));
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.L = iVar;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.M = aVar;
        aVar.a(p());
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.N = jVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    public void a(C4574u1 c4574u1) {
        this.O = c4574u1;
    }

    public void b(Runnable runnable) {
        R7 r7 = this.a;
        if (r7 != null) {
            r7.c(runnable);
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.b(context);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.E);
    }

    public void a(C4631x4 c4631x4) {
        this.P = c4631x4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC4523r4 a(C4492p8.e eVar) {
        if (eVar == C4492p8.e.Interstitial) {
            return this.z;
        }
        if (eVar == C4492p8.e.RewardedVideo) {
            return this.y;
        }
        if (eVar == C4492p8.e.Banner) {
            return this.A;
        }
        return null;
    }

    public void a(Dg dg) {
        this.D = dg;
    }

    public void a(int i2) {
        String uri;
        if (!this.X && !this.C.m()) {
            Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String c2 = c(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            c2 = String.format("%s&sessionid=%s", c2, initSDKParams.get("sessionid"));
        }
        if (this.X) {
            uri = this.W.c().toURI().toString();
        } else {
            uri = this.C.g().toURI().toString();
        }
        String b2 = pzl.b(uri, "?", c2);
        this.a.d(new i(controllerConfigAsJSONObject, this.b0, i2, b2));
        n();
        this.m = new j(1000 * Kb.Y().h().I(), 1000L, i2, Kb.Y().h().c()).start();
    }

    private boolean c(C4671z8 c4671z8) {
        int i2;
        boolean copyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c4671z8);
        if (!copyFileFromBundleToStorage) {
            return false;
        }
        byte[] a2 = C4291e4.a(this.b0.getContext(), X3.g);
        String a3 = C4291e4.a(this.b0.getContext());
        if (a3 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c4671z8.getParent());
        String str = File.separator;
        n6j.b(sb, str, "controller_", a3, str);
        sb.append(X3.g);
        String sb2 = sb.toString();
        if (a2 == null || a2.length == 0) {
            return copyFileFromBundleToStorage;
        }
        try {
            i2 = IronSourceStorageUtils.saveFile(a2, sb2);
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            copyFileFromBundleToStorage = false;
            i2 = 0;
        }
        if (i2 != 0) {
            return copyFileFromBundleToStorage;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c4671z8.getName());
        return false;
    }

    public void c(String str) {
        if (str.equals(X3.i.i)) {
            o();
        }
        i(e(X3.h.z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    private void a(String str, C4492p8.e eVar, T4 t4, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, t4);
        } else {
            i(a(eVar, t4).b);
        }
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    public void c(Runnable runnable) {
        R7 r7 = this.a;
        if (r7 != null) {
            r7.d(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4577u4 interfaceC4577u4) {
        this.f = str;
        this.g = str2;
        this.y = interfaceC4577u4;
        this.E.i(str);
        this.E.j(str2);
        a(str, C4492p8.e.RewardedVideo, t4, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4559t4 interfaceC4559t4) {
        this.f = str;
        this.g = str2;
        this.z = interfaceC4559t4;
        this.E.g(str);
        this.E.h(this.g);
        a(this.f, C4492p8.e.Interstitial, t4, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4559t4 interfaceC4559t4) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.E.d(str, true);
        i(a(X3.h.E, flatMapToJsonAsString, X3.h.F, X3.h.G));
    }

    private void a(T4 t4, Map<String, String> map) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, t4.b()});
        if (map.containsKey("adm")) {
            this.b.a(new pi40(this, 27));
        }
        this.E.d(t4.h(), true);
        i(a(X3.h.E, SDKUtils.flatMapToJsonAsString(mergeHashMaps), X3.h.F, X3.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC4240b7 interfaceC4240b7) {
        interfaceC4240b7.a(new ie40(this, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Y6 y6) {
        try {
            this.R.a(y6);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4559t4 interfaceC4559t4) {
        i(a(C4492p8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        i(a(C4492p8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, t4.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        T4 a2 = this.H.a(C4492p8.e.Interstitial, str);
        return a2 != null && a2.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4541s4 interfaceC4541s4) {
        this.f = str;
        this.g = str2;
        this.A = interfaceC4541s4;
        a(str, C4492p8.e.Banner, t4, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4541s4 interfaceC4541s4) {
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
        this.H.b(C4492p8.e.Banner, t4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4541s4 interfaceC4541s4) {
        i(a(X3.h.N, jSONObject.toString(), X3.h.O, X3.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), X3.h.U, X3.h.U));
    }

    private u a(C4492p8.e eVar, T4 t4) {
        u uVar = new u();
        if (eVar != C4492p8.e.RewardedVideo && eVar != C4492p8.e.Interstitial && eVar != C4492p8.e.Banner) {
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

    private String a(C4492p8.e eVar, JSONObject jSONObject) {
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
    public Object d(C4671z8 c4671z8) {
        this.h.a(this);
        if (c4671z8 != null && c4671z8.exists()) {
            a(c4671z8);
            return null;
        }
        a(new C4671z8(X3.f), new C4510q8(1, "Unable to download Html file"));
        return null;
    }

    public void d(JSONObject jSONObject) {
        Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(X3.h.y, a(X3.j.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C4492p8.e eVar, T4 t4) {
        if (r(eVar.toString())) {
            b(new n(eVar, t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4577u4 interfaceC4577u4) {
        i(a(C4492p8.e.RewardedVideo, jSONObject));
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
        String d2 = new C4373ie(str).d(z ? i0 : j0);
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
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C4452n4.d().a(e2);
            }
        }
        return str;
    }

    private String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    private String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8) {
        if (this.X && this.W.a(c4671z8)) {
            a(1);
        } else {
            if (c4671z8.getName().contains(X3.f)) {
                C4291e4.a(this.b0.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.C.a(new o());
                return;
            }
            c(c4671z8.getName(), c4671z8.getParent());
        }
    }

    @Override // com.ironsource.Oc
    public void a(C4671z8 c4671z8, C4510q8 c4510q8) {
        if (this.X && this.W.a(c4671z8)) {
            this.R.c("controller html - failed to download - " + c4510q8.b());
            return;
        }
        boolean z = false;
        if (c4671z8.getName().contains(X3.f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c4671z8.getName().equals(X3.f)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c4671z8.getName() + " and sdk_controller.min.gz.js");
                z = c(c4671z8);
            }
            if (z) {
                C4617w8.a(C4355he.C);
                C4291e4.a(this.b0.getContext(), true);
                this.C.a(new a());
                return;
            }
            this.C.a(new b(), new c(c4510q8));
            return;
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c4671z8)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c4671z8.getName());
            z = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c4671z8);
        }
        if (z) {
            c(c4671z8.getName(), c4671z8.getParent());
        } else {
            b(c4671z8.getName(), c4671z8.getParent(), c4510q8.b());
        }
    }

    private boolean a(File file) {
        return C4291e4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(Qc qc) {
        this.c0 = qc;
        this.b0.a(qc);
    }

    public void a(EnumC0236v enumC0236v) {
        this.w = enumC0236v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.Y) {
            if (this.b0 != null) {
                this.a.d(new o63(this, 15));
            }
        } else if (this.b0 != null) {
            this.b0.destroy();
        }
        C4292e5 c4292e5 = this.h;
        if (c4292e5 != null) {
            c4292e5.d();
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

    public void a(C4492p8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(C4252c1 c4252c1) {
        synchronized (this.F) {
            try {
                if (c4252c1.j() && this.i) {
                    c4252c1.toString();
                    int c2 = c4252c1.c();
                    if (c2 != -1) {
                        C4492p8.e eVar = C4492p8.e.RewardedVideo;
                        if (c2 == eVar.ordinal()) {
                            String b2 = c4252c1.b();
                            InterfaceC4523r4 a2 = a(eVar);
                            if (a2 != null && !TextUtils.isEmpty(b2)) {
                                a2.b(eVar, b2);
                            }
                        } else {
                            C4492p8.e eVar2 = C4492p8.e.Interstitial;
                            if (c2 == eVar2.ordinal()) {
                                String b3 = c4252c1.b();
                                InterfaceC4523r4 a3 = a(eVar2);
                                if (a3 != null && !TextUtils.isEmpty(b3)) {
                                    a3.b(eVar2, b3);
                                }
                            }
                        }
                        c4252c1.a(-1);
                        c4252c1.f(null);
                    }
                    String d2 = c4252c1.d();
                    String f2 = c4252c1.f();
                    for (T4 t4 : this.H.a(C4492p8.e.Interstitial)) {
                        if (t4.e() == 2) {
                            t4.f();
                            a(d2, f2, t4, this.z);
                        }
                    }
                    String g2 = c4252c1.g();
                    String h2 = c4252c1.h();
                    for (T4 t42 : this.H.a(C4492p8.e.RewardedVideo)) {
                        if (t42.e() == 2) {
                            this.y.c(t42.f());
                            a(g2, h2, t42, this.y);
                        }
                    }
                    c4252c1.a(false);
                }
                this.E = c4252c1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable) {
        R7 r7 = this.a;
        if (r7 != null) {
            r7.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.a0.a(activity);
    }
}
