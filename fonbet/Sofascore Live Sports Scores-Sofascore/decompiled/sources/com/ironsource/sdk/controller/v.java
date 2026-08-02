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
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.Ag;
import com.ironsource.C1;
import com.ironsource.C3950a1;
import com.ironsource.C3996b4;
import com.ironsource.C4005bd;
import com.ironsource.C4015c5;
import com.ironsource.C4020ca;
import com.ironsource.C4032d4;
import com.ironsource.C4036d8;
import com.ironsource.C4074fa;
import com.ironsource.C4086g4;
import com.ironsource.C4096ge;
import com.ironsource.C4114he;
import com.ironsource.C4143j8;
import com.ironsource.C4144j9;
import com.ironsource.C4157k4;
import com.ironsource.C4171l0;
import com.ironsource.C4197m8;
import com.ironsource.C4215n8;
import com.ironsource.C4233o8;
import com.ironsource.C4286r8;
import com.ironsource.C4294rg;
import com.ironsource.C4297s1;
import com.ironsource.C4322t8;
import com.ironsource.C4336u4;
import com.ironsource.C4376w8;
import com.ironsource.C4427z5;
import com.ironsource.E8;
import com.ironsource.EnumC4180l9;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4014c4;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.InterfaceC4229o4;
import com.ironsource.InterfaceC4247p4;
import com.ironsource.InterfaceC4265q4;
import com.ironsource.InterfaceC4271qa;
import com.ironsource.InterfaceC4282r4;
import com.ironsource.InterfaceC4333u1;
import com.ironsource.InterfaceC4339u7;
import com.ironsource.L6;
import com.ironsource.Lb;
import com.ironsource.N;
import com.ironsource.Nc;
import com.ironsource.Ne;
import com.ironsource.O3;
import com.ironsource.O7;
import com.ironsource.Pc;
import com.ironsource.Q3;
import com.ironsource.Q4;
import com.ironsource.Qc;
import com.ironsource.R3;
import com.ironsource.R4;
import com.ironsource.Rc;
import com.ironsource.U3;
import com.ironsource.U6;
import com.ironsource.V4;
import com.ironsource.W3;
import com.ironsource.X3;
import com.ironsource.X6;
import com.ironsource.Y1;
import com.ironsource.Z0;
import com.ironsource.bh;
import com.ironsource.dh;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ironsourceads.internal.services.a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.dym;
import defpackage.eym;
import defpackage.iol;
import defpackage.mz1;
import defpackage.q12;
import defpackage.ti5;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wem;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.xtl;
import defpackage.zol;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class v implements com.ironsource.sdk.controller.l, Nc, DownloadListener {
    private static final String d0 = "about:blank";
    public static int e0 = 0;
    public static String f0 = "is_store";
    public static String g0 = "external_url";
    public static String h0 = "secondary_web_view";
    private static String i0 = "success";
    private static String j0 = "fail";
    private InterfaceC4247p4 A;
    private String B;
    private com.ironsource.sdk.controller.d C;
    private Ag D;
    private C3950a1 E;
    private R4 H;
    private com.ironsource.sdk.controller.o I;
    private com.ironsource.sdk.controller.q J;
    private com.ironsource.sdk.controller.u K;
    private com.ironsource.sdk.controller.i L;
    private com.ironsource.sdk.controller.a M;
    private com.ironsource.sdk.controller.j N;
    private C4297s1 O;
    private C4336u4 P;
    private dh Q;
    private com.ironsource.sdk.controller.c R;
    private O3 S;
    private JSONObject T;
    private l.a U;
    private l.b V;
    private C4086g4 W;
    private boolean X;
    private final boolean Y;
    private final InterfaceC4339u7 Z;
    private final O7 a;
    X3 a0;
    private InterfaceC4014c4 b;
    private volatile C4074fa b0;
    private Pc c0;
    private String f;
    private String g;
    private final C4015c5 h;
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
    private EnumC1218v w;
    private String x;
    private InterfaceC4282r4 y;
    private InterfaceC4265q4 z;
    private String c = "v";
    private String d = "IronSource";
    private final String e = "We're sorry, some error occurred. we will investigate it";
    private final bh n = new bh();
    private int o = 50;
    private int p = 50;
    private String q = U3.e.b;
    private Object F = new Object();
    private boolean G = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ C4215n8 a;

        public c(C4215n8 c4215n8) {
            this.a = c4215n8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.R.c("controller html - failed to download - " + this.a.b());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ C4197m8.e a;
        final /* synthetic */ String b;

        public f(C4197m8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4229o4 a;
            C4197m8.e eVar = this.a;
            if ((eVar == C4197m8.e.RewardedVideo || eVar == C4197m8.e.Interstitial) && (a = v.this.a(eVar)) != null) {
                a.b(this.a, this.b);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements dh {
        public h() {
        }

        @Override // com.ironsource.dh
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
            boolean B = v.B();
            v vVar = v.this;
            if (B) {
                vVar.n.a(this.c, this.d);
                v.this.m("about:blank");
            } else {
                vVar.m("about:blank");
                v.this.m(this.d);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class k implements t {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4197m8.e eVar, Q4 q4) {
            v.this.a(str, eVar, q4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class l implements t {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4197m8.e eVar, Q4 q4) {
            v.this.a(str, eVar, q4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class m implements t {
        public m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C4197m8.e eVar, Q4 q4) {
            v.this.a(str, eVar, q4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class n implements Runnable {
        final /* synthetic */ C4197m8.e a;
        final /* synthetic */ Q4 b;
        final /* synthetic */ String c;

        public n(C4197m8.e eVar, Q4 q4, String str) {
            this.a = eVar;
            this.b = q4;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q4 q4;
            C4197m8.e eVar = C4197m8.e.RewardedVideo;
            C4197m8.e eVar2 = this.a;
            if ((eVar != eVar2 && C4197m8.e.Interstitial != eVar2 && C4197m8.e.Banner != eVar2) || (q4 = this.b) == null || TextUtils.isEmpty(q4.h())) {
                return;
            }
            InterfaceC4229o4 a = v.this.a(this.a);
            String unused = v.this.c;
            Objects.toString(this.a);
            if (a != null) {
                a.a(this.a, this.b.h(), this.c);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class q {
        C4197m8.e a;
        String b;

        public q(C4197m8.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public C4197m8.e b() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface t {
        void a(String str, C4197m8.e eVar, Q4 q4);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class u {
        String a;
        String b;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC1218v {
        Display,
        Gone
    }

    public v(Context context, R4 r4, X3 x3, com.ironsource.sdk.controller.c cVar, O7 o7, int i2, C4015c5 c4015c5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        int i3 = 0;
        p pVar = new p(this, i3);
        this.r = pVar;
        this.R = cVar;
        boolean t2 = Ib.a0().h().t();
        this.Y = Ib.a0().h().E();
        if (t2) {
            countDownLatch = new CountDownLatch(1);
            a(context, o7, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.Z = Ib.a0().a();
        if (!t2) {
            this.b0 = new C4074fa(context, new InterfaceC4271qa.a());
        }
        Logger.i(this.c, "C'tor");
        this.a0 = x3;
        this.a = o7;
        this.H = r4;
        if (!t2) {
            a(context, this.b0);
        }
        this.B = str;
        this.E = new C3950a1();
        this.T = new JSONObject();
        this.h = c4015c5;
        this.U = aVar;
        this.V = bVar;
        boolean optBoolean = SDKUtils.getNetworkConfiguration().optBoolean(U3.a.i, false);
        this.X = optBoolean;
        if (optBoolean) {
            this.W = new C4086g4(new C4032d4(SDKUtils.getControllerUrl(), this.B, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C4005bd(SDKUtils.getControllerUrl())), new iol(this, 16), c4015c5, new InterfaceC4193m4.a());
        } else {
            c4015c5.a(this);
            this.C = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.B, SDKUtils.getControllerUrl(), c4015c5);
        }
        if (!t2) {
            this.b0.setWebViewClient(new w(this, i3));
            this.b0.setWebChromeClient(pVar);
            eh.a(this.b0);
            a(this.b0);
            this.b0.setDownloadListener(this);
        }
        this.S = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        if (t2) {
            try {
                countDownLatch.await();
                if (this.b0 == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.R.c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e2) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e2);
                C4157k4.d().a(e2);
                Thread.currentThread().interrupt();
                this.R.c("WebView initialization was interrupted");
                return;
            }
        }
        this.b = InterfaceC4014c4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B() {
        return Ib.a0().h().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        ViewParent parent = this.b0.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b0);
        }
        this.b0.destroy();
    }

    private String c(JSONObject jSONObject) {
        V4 b2 = V4.b(this.b0.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            wt3.A("SDKVersion=", sDKVersion, sb, U3.j.c);
        }
        String e2 = b2.e();
        if (!TextUtils.isEmpty(e2)) {
            sb.append("deviceOs=");
            sb.append(e2);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            bf3.v(sb, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{U3.j.Z, U3.j.g}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append(U3.j.c);
                        sb.append("controllerConfig");
                        sb.append(U3.j.b);
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e3) {
                    C4157k4.d().a(e3);
                    IronLog.INTERNAL.error(e3.toString());
                }
            }
            sb.append("&debug=");
            sb.append(r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean b3 = C3996b4.b(this.b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && b3) {
                sb.append("&chfb=true");
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        V4 b2 = V4.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        try {
            jSONObject.put(U3.j.z, "none");
            jSONObject.put(U3.j.A, SDKUtils.translateDeviceOrientation(this.Z.A(context)));
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
                jSONObject.put(U3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            String e2 = b2.e();
            if (e2 != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.m), SDKUtils.encodeString(e2));
            } else {
                z = true;
            }
            String f2 = b2.f();
            if (f2 != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.n), f2.replaceAll("[^0-9/.]", ""));
            } else {
                z = true;
            }
            String f3 = b2.f();
            if (f3 != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.o), SDKUtils.encodeString(f3));
            }
            String valueOf = String.valueOf(b2.a());
            if (valueOf != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.p), valueOf);
            } else {
                z = true;
            }
            jSONObject.put(L6.j0, String.valueOf(C4171l0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.q), SDKUtils.encodeString(sDKVersion));
            }
            if (b2.b() != null && b2.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(U3.j.r), SDKUtils.encodeString(b2.b()));
            }
            String b3 = R3.b(context);
            if (b3.equals("none")) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(b3));
            }
            String d3 = R3.d(context);
            if (d3 != null) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(d3));
            } else {
                z = true;
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.v), R3.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(U3.j.y, SDKUtils.encodeString(String.valueOf(this.Z.a(this.B))));
            String valueOf2 = String.valueOf(this.Z.o());
            if (TextUtils.isEmpty(valueOf2)) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(U3.j.G) + U3.j.d + SDKUtils.encodeString("width") + U3.j.e, SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.G) + U3.j.d + SDKUtils.encodeString("height") + U3.j.e, SDKUtils.encodeString(String.valueOf(this.Z.b())));
            String g2 = C1.g(this.b0.getContext());
            if (!TextUtils.isEmpty(g2)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g2));
            }
            String valueOf3 = String.valueOf(this.Z.r());
            if (!TextUtils.isEmpty(valueOf3)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.K), SDKUtils.encodeString(valueOf3));
            }
            String valueOf4 = String.valueOf(this.Z.p());
            if (!TextUtils.isEmpty(valueOf4)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.O), SDKUtils.encodeString(valueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.P), V4.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.Y), this.Z.l(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), Q3.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), Q3.c(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.S), Q3.f(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.R), SDKUtils.encodeString(Q3.g(context)));
            jSONObject.put(SDKUtils.encodeString(U3.j.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.W), SDKUtils.encodeString(C1.b(context)));
            String e3 = C1.e(context);
            if (!TextUtils.isEmpty(e3)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.c0), SDKUtils.encodeString(e3));
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.o0), SDKUtils.encodeString(e(this.b0.getContext())));
            jSONObject.put(SDKUtils.encodeString(U3.j.p0), this.Z.u(context));
        } catch (JSONException e4) {
            C4157k4.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
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

    public static /* bridge */ /* synthetic */ String e0(v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return vVar.a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
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
            Q4 a2 = this.H.a(g(str), str2);
            if (a2 != null) {
                map = a2.g();
                map.put("demandSourceName", a2.f());
                map.put("demandSourceId", a2.h());
            }
            try {
                jSONObject.put(U3.i.m, str);
            } catch (JSONException e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C4157k4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(U3.j.f), SDKUtils.encodeString(this.g));
            } catch (JSONException e4) {
                C4157k4.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(U3.j.g), SDKUtils.encodeString(this.f));
            } catch (JSONException e5) {
                C4157k4.d().a(e5);
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
                    C4157k4.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4197m8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4197m8.e eVar = C4197m8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4197m8.e eVar2 = C4197m8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C4197m8.e eVar3 = C4197m8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new wem(15, this, str));
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
            C4157k4.d().a(th);
            Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Pc pc = this.c0;
        if (pc != null) {
            pc.onCloseRequested();
        }
    }

    private void p(String str) {
        boolean equalsIgnoreCase = str.equalsIgnoreCase("0");
        C4074fa c4074fa = this.b0;
        if (equalsIgnoreCase) {
            c4074fa.getSettings().setCacheMode(2);
        } else {
            c4074fa.getSettings().setCacheMode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C4114he c4114he = new C4114he(str);
        String d2 = c4114he.d("color");
        String d3 = c4114he.d("adViewId");
        int parseColor = !U3.i.T.equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 == null) {
            this.b0.setBackgroundColor(parseColor);
            return;
        }
        WebView presentingView = C4143j8.a().a(d3).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C4197m8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C4197m8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C4197m8.e.Banner.toString()) || this.A == null : this.y == null) : this.z != null) {
            z = true;
        }
        if (!z) {
            Logger.d(this.c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z;
    }

    public void A() {
        i(f(U3.h.Z));
    }

    public void D() {
        i(f(U3.h.A));
    }

    public void E() {
        try {
            this.b0.onPause();
        } catch (Throwable th) {
            C4157k4.d().a(th);
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
            C4157k4.d().a(th);
            Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    @Override // com.ironsource.Nc
    public void a(C4376w8 c4376w8, C4215n8 c4215n8) {
        if (this.X && this.W.a(c4376w8)) {
            this.R.c("controller html - failed to download - " + c4215n8.b());
            return;
        }
        boolean z = false;
        if (!c4376w8.getName().contains(U3.f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c4376w8)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c4376w8.getName());
                z = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c4376w8);
            }
            if (z) {
                c(c4376w8.getName(), c4376w8.getParent());
                return;
            } else {
                b(c4376w8.getName(), c4376w8.getParent(), c4215n8.b());
                return;
            }
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c4376w8.getName().equals(U3.f)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c4376w8.getName() + " and sdk_controller.min.gz.js");
            z = c(c4376w8);
        }
        if (!z) {
            this.C.a(new b(), new c(c4215n8));
            return;
        }
        C4322t8.a(C4096ge.C);
        C3996b4.a(this.b0.getContext(), true);
        this.C.a(new a());
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(U3.h.q, a(U3.i.b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e2) {
            C4157k4.d().a(e2);
        }
    }

    public boolean h(String str) {
        try {
            if (!new Ne(str, C4020ca.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C4294rg.a(q(), str);
            return true;
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void j(String str) {
        i(e(U3.f.j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(U3.h.w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void n(String str) {
        try {
            String d2 = R3.d(this.b0.getContext());
            Logger.i(this.c, "device status changed, connection type " + str);
            C4286r8.a(str);
            C4286r8.b(d2);
            i(e(U3.h.x, a("connectionType", str, "rawConnectionType", d2, null, null, null, null, null, false)));
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e2));
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.i(this.c, str + " " + str4);
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        C4197m8.e b2 = this.j.b();
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
        i(f(U3.f.h));
    }

    private void J() {
    }

    public FrameLayout s() {
        return this.v;
    }

    public String t() {
        return this.x;
    }

    public C3950a1 u() {
        return this.E;
    }

    public EnumC1218v v() {
        return this.w;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class p extends WebChromeClient {
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

        public /* synthetic */ p(v vVar, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class r extends WebViewClient {
        private r() {
        }

        @Override // android.webkit.WebViewClient
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

        public /* synthetic */ r(v vVar, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class w extends WebViewClient {
        private w() {
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
            if (str2.contains(U3.f) && (cVar = v.this.R) != null) {
                cVar.c(vxd.k(i, "controller html - web-view receivedError on loading - ", str, " (errorCode: ", ")"));
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String unused = v.this.c;
            renderProcessGoneDetail.didCrash();
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
                C4157k4.d().a(e);
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(v.this.B);
                String o = mz1.o(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(o));
                    return new WebResourceResponse("text/javascript", C.UTF8_NAME, getClass().getResourceAsStream(o));
                } catch (FileNotFoundException e2) {
                    C4157k4.d().a(e2);
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
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public /* synthetic */ w(v vVar, int i) {
            this();
        }
    }

    public void o(String str) {
        this.x = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g extends O3 {
        public g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.O3, com.ironsource.InterfaceC4250p7
        public void a() {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n("none");
            }
        }

        @Override // com.ironsource.O3, com.ironsource.InterfaceC4250p7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.d(jSONObject);
            } catch (JSONException e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.O3, com.ironsource.InterfaceC4250p7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.i) {
                vVar.n(str);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class j extends CountDownTimer {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.R.c(U3.c.j);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                return;
            }
            boolean B = v.B();
            v vVar = v.this;
            if (B) {
                vVar.c(new b());
            } else {
                vVar.a(this.a + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    public dh p() {
        dh dhVar = this.Q;
        if (dhVar != null) {
            return dhVar;
        }
        h hVar = new h();
        this.Q = hVar;
        return hVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(U3.h.t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C4114he(str).d(i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.X) {
            this.W.b();
            return;
        }
        this.C.a(new C4233o8());
        if (this.C.k()) {
            a(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class s {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class b implements Runnable {
            final /* synthetic */ String a;

            public b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.z.a(C4197m8.e.Interstitial, this.a, (Z0) null);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                v.this.z.a(C4197m8.e.Interstitial, this.b, str);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class d implements Runnable {
            final /* synthetic */ InterfaceC4229o4 a;
            final /* synthetic */ C4197m8.e b;
            final /* synthetic */ String c;

            public d(InterfaceC4229o4 interfaceC4229o4, C4197m8.e eVar, String str) {
                this.a = interfaceC4229o4;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(this.b, this.c);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class g implements Runnable {
            final /* synthetic */ String a;

            public g(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.A.a(C4197m8.e.Banner, this.a, (Z0) null);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                v.this.A.a(C4197m8.e.Banner, this.b, str);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class i implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ C4036d8 b;

            public i(String str, C4036d8 c4036d8) {
                this.a = str;
                this.b = c4036d8;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = v.this.c;
                v.this.A.a(this.a, this.b);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.I();
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class l implements Runnable {
            final /* synthetic */ String a;

            public l(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean has = new JSONObject(this.a).has(f.b.b);
                    String str = this.a;
                    if (has) {
                        v.this.U.a(f.a.a(str));
                    } else {
                        v.this.V.a(Lb.a(str));
                    }
                } catch (JSONException e) {
                    C4157k4.d().a(e);
                    Logger.e(v.this.c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class m implements Runnable {
            final /* synthetic */ C4197m8.e a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ JSONObject d;

            public m(C4197m8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4229o4 a;
                C4197m8.e eVar = this.a;
                if ((eVar == C4197m8.e.Interstitial || eVar == C4197m8.e.RewardedVideo || eVar == C4197m8.e.Banner) && (a = v.this.a(eVar)) != null) {
                    a.a(this.a, this.b, this.c, this.d);
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class n implements Runnable {
            final /* synthetic */ String a;

            public n(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.c, "omidAPI(" + this.a + ")");
                    v.this.I.a(new C4114he(this.a).toString(), s.this.new w());
                } catch (Exception e) {
                    C4157k4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.E();
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.removeJavascriptInterface(U3.e);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b0.getSettings().setMixedContentMode(0);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class r implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ Z0 c;

            public r(int i, String str, Z0 z0) {
                this.a = i;
                this.b = str;
                this.c = z0;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = this.a;
                s sVar = s.this;
                if (i <= 0) {
                    v.this.y.c(this.b);
                } else {
                    String unused = v.this.c;
                    v.this.y.a(C4197m8.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        public class RunnableC1216s implements Runnable {
            final /* synthetic */ String a;

            public RunnableC1216s(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.N.a(new JSONObject(this.a), s.this.new w());
                } catch (Exception e) {
                    C4157k4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.i(v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                if (this.a.equalsIgnoreCase(C4197m8.e.RewardedVideo.toString())) {
                    v.this.y.a(this.b, this.c);
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        public class RunnableC1217v implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public RunnableC1217v(String str, String str2) {
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
                v.this.y.a(C4197m8.e.RewardedVideo, this.b, str);
            }
        }

        public s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(String str) {
            try {
                Logger.i(v.this.c, "adViewAPI(" + str + ")");
                v.this.M.a(new C4114he(str).toString(), new w());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(U3.a.h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                C4322t8.a(C4096ge.p, new C4233o8().a(C4427z5.A, e2.getMessage()).a());
                Logger.d(v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(String str) {
            try {
                Logger.i(v.this.c, "deleteFile(" + str + ")");
                C4114he c4114he = new C4114he(str);
                String d2 = c4114he.d(U3.i.b);
                String d3 = c4114he.d("path");
                if (d3 != null && !TextUtils.isEmpty(d2)) {
                    C4376w8 c4376w8 = new C4376w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d3), d2);
                    IronSourceStorageUtils.ensurePathSafety(c4376w8, v.this.B);
                    if (!c4376w8.exists()) {
                        v.this.a(str, false, U3.c.f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c4376w8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, U3.c.g, "1");
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m(String str) {
            try {
                Logger.i(v.this.c, "deleteFolder(" + str + ")");
                String d2 = new C4114he(str).d("path");
                if (d2 == null) {
                    v.this.a(str, false, U3.c.g, "1");
                    return;
                }
                C4376w8 c4376w8 = new C4376w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2));
                IronSourceStorageUtils.ensurePathSafety(c4376w8, v.this.B);
                if (!c4376w8.exists()) {
                    v.this.a(str, false, U3.c.e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c4376w8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(String str) {
            try {
                Logger.i(v.this.c, "deviceDataAPI(" + str + ")");
                v.this.L.a(new C4114he(str).toString(), new w());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o(String str) {
            try {
                Logger.i(v.this.c, "dsSharedSignalsAPI(" + str + ")");
                v.this.P.a(new C4114he(str).toString(), new w());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void p(String str) {
            w1l.D("getCachedFilesMap(", str, ")", v.this.c);
            String e2 = v.this.e(str);
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            C4114he c4114he = new C4114he(str);
            if (!c4114he.a("path")) {
                v.this.a(str, false, U3.c.s, (String) null);
                return;
            }
            String str2 = (String) c4114he.b("path");
            boolean isPathExist = IronSourceStorageUtils.isPathExist(v.this.B, str2);
            v vVar = v.this;
            if (!isPathExist) {
                vVar.a(str, false, U3.c.t, (String) null);
                return;
            }
            v.this.i(v.this.a(e2, IronSourceStorageUtils.getCachedFilesMap(vVar.B, str2), U3.h.s, U3.h.r));
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
            w1l.D("getDeviceStatus(", str, ")", v.this.c);
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
            v.this.i(v.this.a(e2, str2, U3.h.l, U3.h.m));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void r(String str) {
            try {
                Logger.i(v.this.c, "iabTokenAPI(" + str + ")");
                v.this.K.a(new C4114he(str).toString(), new w());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            try {
                InterfaceC4333u1 a2 = InterfaceC4333u1.a(str);
                v vVar = v.this;
                C4297s1.a a3 = vVar.O.a(vVar.b0.getContext(), a2);
                v.this.i(v.this.e(a3.f(), a3.i().toString()));
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(String str) {
            try {
                Logger.i(v.this.c, "permissionsAPI(" + str + ")");
                v.this.J.a(new C4114he(str).toString(), new w());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.i(v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.c, "adClicked(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d(U3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            C4197m8.e g2 = v.this.g(d2);
            InterfaceC4229o4 a2 = v.this.a(g2);
            if (g2 == null || a2 == null) {
                return;
            }
            v.this.b(new d(a2, g2, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            v.this.d;
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d(U3.i.k);
            int parseInt = d2 != null ? Integer.parseInt(d2) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            String d3 = c4114he.d(U3.i.m);
            if (TextUtils.isEmpty(d3)) {
                v.this.d;
            }
            if (C4197m8.e.Interstitial.toString().equalsIgnoreCase(d3)) {
                a(fetchDemandSourceId, parseInt);
            } else if (v.this.r(d3)) {
                v.this.b(new t(d3, fetchDemandSourceId, parseInt));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.c, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4114he(str));
            Z0 z0 = new Z0(str);
            boolean g2 = z0.g();
            v vVar = v.this;
            if (!g2) {
                vVar.a(str, false, U3.c.r, (String) null);
                return;
            }
            vVar.a(str, true, (String) null, (String) null);
            String d2 = z0.d();
            if (C4197m8.e.RewardedVideo.toString().equalsIgnoreCase(d2) && v.this.r(d2)) {
                v.this.b(new r(Integer.parseInt(z0.c()), fetchDemandSourceId, z0));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            v.this.a.a(new eym(this, str, 1), O7.l);
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            O7.a.b(new eym(this, str, 4));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C4197m8.e g2;
            try {
                Logger.i(v.this.c, "cleanAdInstance(" + str + ")");
                C4114he c4114he = new C4114he(str);
                String d2 = c4114he.d(U3.i.m);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (g2 = v.this.g(d2)) == null) {
                    return;
                }
                v.this.H.b(g2, fetchDemandSourceId);
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> a2 = C4020ca.e().a();
                C4114he c4114he = new C4114he(str);
                if (!a2.isEmpty()) {
                    c4114he.b(U3.i.x0, a2.toString());
                }
                v.this.a(c4114he.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            v.this.a.a(new eym(this, str, 8), "deleteFile");
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            v.this.a.a(new eym(this, str, 0), "deleteFolder");
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.c, "destroyInlineStore() called");
            try {
                a.AbstractC1347a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), EnumC4180l9.b.a(new C4114he(str).a(U3.f.e, EnumC4180l9.APP_ACTIVITY.b())));
                boolean z = a2 instanceof a.AbstractC1347a.C1348a;
                v vVar = v.this;
                if (z) {
                    vVar.a(str, false, ((a.AbstractC1347a.C1348a) a2).b(), (String) null);
                } else {
                    vVar.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            v.this.a.a(new eym(this, str, 6), O7.k);
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            w1l.D("displayWebView(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
            C4114he c4114he = new C4114he(str);
            boolean booleanValue = ((Boolean) c4114he.b(U3.i.d)).booleanValue();
            String d2 = c4114he.d(U3.i.m);
            boolean c2 = c4114he.c(U3.i.u);
            String d3 = c4114he.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            boolean c3 = c4114he.c(U3.i.z0);
            v vVar = v.this;
            if (!booleanValue) {
                vVar.a(EnumC1218v.Gone);
                v.this.o();
                return;
            }
            vVar.G = c4114he.c(U3.i.v);
            boolean c4 = c4114he.c(U3.i.y);
            EnumC1218v v = v.this.v();
            EnumC1218v enumC1218v = EnumC1218v.Display;
            v vVar2 = v.this;
            if (v == enumC1218v) {
                Logger.i(vVar2.c, "State: " + v.this.w);
                return;
            }
            vVar2.a(enumC1218v);
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
            C4197m8.e eVar = C4197m8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d2)) {
                if ("application".equals(t2)) {
                    t2 = SDKUtils.translateRequestedOrientation(v.this.Z.M(q2));
                }
                intent.putExtra(U3.i.m, eVar.toString());
                v.this.E.a(eVar.ordinal());
                v.this.E.f(fetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.y.c(eVar, fetchDemandSourceId);
                }
            } else {
                C4197m8.e eVar2 = C4197m8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d2)) {
                    if ("application".equals(t2)) {
                        t2 = SDKUtils.translateRequestedOrientation(v.this.Z.M(q2));
                    }
                    intent.putExtra(U3.i.m, eVar2.toString());
                }
            }
            if (d3 != null) {
                intent.putExtra("adViewId", d3);
            }
            intent.putExtra(U3.i.z0, c3);
            intent.setFlags(536870912);
            intent.putExtra(U3.i.v, v.this.G);
            intent.putExtra(U3.i.A, t2);
            intent.putExtra(U3.i.B, K);
            v vVar3 = v.this;
            vVar3.j = new q(vVar3.g(d2), fetchDemandSourceId);
            q2.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            v.this.a.a(new eym(this, str, 5), O7.f);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            w1l.D("fileSystemAPI(", str, ")", v.this.c);
            v.this.a(new RunnableC1216s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            w1l.D("getApplicationInfo(", str, ")", v.this.c);
            String e2 = v.this.e(str);
            String d2 = v.this.d(str);
            C4114he c4114he = new C4114he(str);
            Object[] f2 = v.this.f(c4114he.d(U3.i.m), SDKUtils.fetchDemandSourceId(c4114he));
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
            v.this.i(v.this.a(e2, str2, U3.h.n, U3.h.o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            v.this.a.a(new eym(this, str, 9), O7.i);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String e2;
            Logger.i(v.this.c, "getConnectivityInfo(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d(v.i0);
            String d3 = c4114he.d(v.j0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            O3 o3 = vVar.S;
            if (o3 != null) {
                jSONObject = o3.a(vVar.b0.getContext());
            }
            int length = jSONObject.length();
            v vVar2 = v.this;
            if (length > 0) {
                e2 = vVar2.e(d2, jSONObject.toString());
            } else {
                e2 = v.this.e(d3, v.e0(vVar2, "errMsg", U3.c.A, null, null, null, null, null, null));
            }
            v.this.i(e2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.c, "getControllerConfig(" + str + ")");
            String d2 = new C4114he(str).d(v.i0);
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
            C4114he c4114he = new C4114he(str);
            String d3 = c4114he.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            String d4 = c4114he.d(U3.i.m);
            if (d4 == null || d3 == null) {
                return;
            }
            try {
                C4197m8.e productType = SDKUtils.getProductType(d4);
                if (productType != null) {
                    Q4 a2 = v.this.H.a(productType, fetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(U3.i.m, d4);
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
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getDeviceStatus(String str) {
            v.this.a.a(new eym(this, str, 3), O7.d);
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            w1l.D("getDeviceVolume(", str, ")", v.this.c);
            try {
                Context context = v.this.b0.getContext();
                float a2 = V4.b(context).a(context);
                C4114he c4114he = new C4114he(str);
                c4114he.b(U3.j.P, String.valueOf(a2));
                v.this.a(c4114he.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.c, "getInitSummery(" + str + ")");
            C4114he c4114he = new C4114he(str);
            c4114he.a(U3.j.q0, v.this.T);
            v.this.a(c4114he.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C4322t8.a(C4096ge.z, new C4233o8().a(C4427z5.y, str).a());
            String e2 = v.this.e(str);
            String jSONObject = SDKUtils.getOrientation(v.this.b0.getContext()).toString();
            if (TextUtils.isEmpty(e2)) {
                return;
            }
            v.this.i(v.this.a(e2, jSONObject, U3.h.X, U3.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.c, "getUserData(" + str + ")");
            C4114he c4114he = new C4114he(str);
            boolean a2 = c4114he.a(U3.i.W);
            v vVar = v.this;
            if (!a2) {
                vVar.a(str, false, U3.c.F, (String) null);
                return;
            }
            String e2 = vVar.e(str);
            String d2 = c4114he.d(U3.i.W);
            v.this.i(v.this.e(e2, v.e0(v.this, d2, C4020ca.e().a(d2), null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            v.this.a.a(new eym(this, str, 7), O7.e);
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.c, "initController(" + str + ")");
            C4114he c4114he = new C4114he(str);
            CountDownTimer countDownTimer = v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.m = null;
            }
            if (c4114he.a("stage")) {
                String d2 = c4114he.d("stage");
                if (U3.i.s.equalsIgnoreCase(d2)) {
                    v vVar = v.this;
                    vVar.i = true;
                    vVar.R.d();
                } else if (U3.i.r.equalsIgnoreCase(d2)) {
                    v.this.R.c();
                } else if (!U3.i.t.equalsIgnoreCase(d2)) {
                    Logger.i(v.this.c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.R.c(dmi.q("controller js failed to initialize : ", c4114he.d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            w1l.D("onAdWindowsClosed(", str, ")", v.this.c);
            v.this.E.a();
            v.this.E.f(null);
            v.this.j = null;
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d(U3.i.m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            C4197m8.e g2 = v.this.g(d2);
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
            w1l.D("onGetApplicationInfoFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            w1l.D("onGetApplicationInfoSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            w1l.D("onGetCachedFilesMapFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            w1l.D("onGetCachedFilesMapSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            w1l.D("onGetDeviceStatusFail(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            w1l.D("onGetDeviceStatusSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.c, "onInitBannerFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            boolean isEmpty = TextUtils.isEmpty(fetchDemandSourceId);
            v vVar = v.this;
            if (isEmpty) {
                Logger.i(vVar.c, "onInitBannerFail failed with no demand source");
                return;
            }
            R4 r4 = vVar.H;
            C4197m8.e eVar = C4197m8.e.Banner;
            Q4 a2 = r4.a(eVar, fetchDemandSourceId);
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
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4114he(str));
            boolean isEmpty = TextUtils.isEmpty(fetchDemandSourceId);
            v vVar = v.this;
            if (isEmpty) {
                Logger.i(vVar.c, "onInitBannerSuccess failed with no demand source");
            } else if (vVar.r(C4197m8.e.Banner.toString())) {
                v.this.b(new g(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.c, "onInitInterstitialFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            boolean isEmpty = TextUtils.isEmpty(fetchDemandSourceId);
            v vVar = v.this;
            if (isEmpty) {
                Logger.i(vVar.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            R4 r4 = vVar.H;
            C4197m8.e eVar = C4197m8.e.Interstitial;
            Q4 a2 = r4.a(eVar, fetchDemandSourceId);
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
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4114he(str));
            boolean isEmpty = TextUtils.isEmpty(fetchDemandSourceId);
            v vVar = v.this;
            if (isEmpty) {
                Logger.i(vVar.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (vVar.r(C4197m8.e.Interstitial.toString())) {
                v.this.b(new b(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onInitRewardedVideoFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            R4 r4 = v.this.H;
            C4197m8.e eVar = C4197m8.e.RewardedVideo;
            Q4 a2 = r4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC1217v(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.c, "onLoadBannerFail()");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && v.this.r(C4197m8.e.Banner.toString())) {
                v.this.b(new j(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.c, "onLoadBannerSuccess()");
            C4114he c4114he = new C4114he(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            String d2 = c4114he.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            E8 a2 = C4143j8.a().a(d2);
            if (a2 == null) {
                v.this.A.c(fetchDemandSourceId, "not found view for the current adViewId= " + d2);
                return;
            }
            if (a2 instanceof C4036d8) {
                C4036d8 c4036d8 = (C4036d8) a2;
                if (v.this.r(C4197m8.e.Banner.toString())) {
                    v.this.b(new i(fetchDemandSourceId, c4036d8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.c, "onLoadInterstitialFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (v.this.r(C4197m8.e.Interstitial.toString())) {
                v.this.b(new f(d2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            JSONObject a2 = c4114he.a();
            a(fetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C4197m8.e.Interstitial.toString())) {
                v.this.b(new e(fetchDemandSourceId, a2));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            w1l.D("onReceivedMessage(", str, ")", v.this.c);
            O7.a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.c, "onShowInterstitialFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            v.this.b(new q12(this, v.this.r(C4197m8.e.Interstitial.toString()), d2, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            w1l.D("onShowInterstitialSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4114he(str));
            boolean isEmpty = TextUtils.isEmpty(fetchDemandSourceId);
            v vVar = v.this;
            if (isEmpty) {
                Logger.i(vVar.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C3950a1 c3950a1 = vVar.E;
            C4197m8.e eVar = C4197m8.e.Interstitial;
            c3950a1.a(eVar.ordinal());
            v.this.E.f(fetchDemandSourceId);
            v.this.b(new ti5(this, v.this.r(eVar.toString()), fetchDemandSourceId));
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.c, "onShowRewardedVideoFail(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
            if (v.this.r(C4197m8.e.RewardedVideo.toString())) {
                v.this.b(new a(d2, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            w1l.D("onShowRewardedVideoSuccess(", str, ")", v.this.c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String unused = v.this.c;
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d(U3.i.m);
            if (v.this.D == null || TextUtils.isEmpty(d2)) {
                return;
            }
            String d3 = c4114he.d("status");
            if (U3.i.d0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoStarted();
                return;
            }
            if (U3.i.e0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoPaused();
                return;
            }
            if (U3.i.f0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoResumed();
                return;
            }
            if (U3.i.g0.equalsIgnoreCase(d3)) {
                v.this.D.onVideoEnded();
                return;
            }
            boolean equalsIgnoreCase = U3.i.h0.equalsIgnoreCase(d3);
            v vVar = v.this;
            if (equalsIgnoreCase) {
                vVar.D.onVideoStopped();
                return;
            }
            Logger.i(vVar.c, "onVideoStatusChanged: unknown status: " + d3);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.c, "openInlineStore(" + str + ")");
                C4114he c4114he = new C4114he(str);
                a.AbstractC1347a a2 = new com.unity3d.ironsourceads.internal.services.b().a(v.this.q(), new C4144j9(c4114he.d("url"), c4114he.d(U3.f.c), EnumC4180l9.b.a(c4114he.a(U3.f.e, EnumC4180l9.APP_ACTIVITY.b())), (!c4114he.a(U3.f.d) || c4114he.e(U3.f.d)) ? null : (JSONObject) c4114he.b(U3.f.d)));
                boolean z = a2 instanceof a.AbstractC1347a.C1348a;
                v vVar = v.this;
                if (z) {
                    vVar.a(str, false, ((a.AbstractC1347a.C1348a) a2).b(), (String) null);
                } else {
                    vVar.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.c, "openUrl(" + str + ")");
                C4114he c4114he = new C4114he(str);
                String d2 = c4114he.d("url");
                String d3 = c4114he.d("method");
                String d4 = c4114he.d("package_name");
                boolean c2 = c4114he.c(U3.i.L0);
                v vVar = v.this;
                p.c a2 = new p.a(d3, new Rc(v.this.G, 805306368)).a(c2 ? vVar.b0.getContext() : vVar.q(), new Qc(d2, d4));
                boolean z = a2 instanceof p.c.a;
                v vVar2 = v.this;
                if (z) {
                    vVar2.a(str, false, ((p.c.a) a2).b(), (String) null);
                } else {
                    vVar2.a(str, true, (String) null, (String) null);
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
            v.this.a.a(new eym(this, str, 2), O7.j);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2;
            try {
                Logger.i(v.this.c, "postAdEventNotification(" + str + ")");
                C4114he c4114he = new C4114he(str);
                String d2 = c4114he.d(U3.i.j0);
                if (TextUtils.isEmpty(d2)) {
                    v.this.a(str, false, U3.c.w, (String) null);
                    return;
                }
                String d3 = c4114he.d(U3.i.k0);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(c4114he);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d3;
                JSONObject jSONObject = (JSONObject) c4114he.b(U3.i.l0);
                String d4 = c4114he.d(U3.i.m);
                C4197m8.e g2 = v.this.g(d4);
                boolean r2 = v.this.r(d4);
                v vVar = v.this;
                if (!r2) {
                    vVar.a(str, false, U3.c.v, (String) null);
                    return;
                }
                String e2 = vVar.e(str);
                if (TextUtils.isEmpty(e2)) {
                    str2 = str3;
                } else {
                    str2 = str3;
                    v.this.i(v.this.a(e2, v.e0(v.this, U3.i.m, d4, U3.i.j0, d2, "demandSourceName", d3, "demandSourceId", str2), U3.h.c0, U3.h.d0));
                }
                v.this.b(new m(g2, str2, d2, jSONObject));
            } catch (Exception e3) {
                C4157k4.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            w1l.D("removeCloseEventHandler(", str, ")", v.this.c);
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
                C4114he c4114he = new C4114he(str);
                String d2 = c4114he.d("path");
                String d3 = c4114he.d(U3.i.b);
                if (TextUtils.isEmpty(d3)) {
                    v.this.a(str, false, U3.c.g, "1");
                    return;
                }
                C4376w8 c4376w8 = new C4376w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.B, d2), SDKUtils.getFileName(d3));
                IronSourceStorageUtils.ensurePathSafety(c4376w8, v.this.B);
                v vVar = v.this;
                if (vVar.Z.a(vVar.B) <= 0) {
                    v.this.a(str, false, W3.A, (String) null);
                    return;
                }
                boolean exists = c4376w8.exists();
                v vVar2 = v.this;
                if (exists) {
                    vVar2.a(str, false, W3.z, (String) null);
                    return;
                }
                boolean h2 = Q3.h(vVar2.b0.getContext());
                v vVar3 = v.this;
                if (!h2) {
                    vVar3.a(str, false, W3.C, (String) null);
                    return;
                }
                vVar3.a(str, true, (String) null, (String) null);
                v.this.h.a(c4376w8, d3, c4114he.a("connectionTimeout", 0), c4114he.a("readTimeout", 0));
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                v.this.a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.c, "setBackButtonState(" + str + ")");
            C4020ca.e().c(new C4114he(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.c, "setForceClose(" + str + ")");
            C4114he c4114he = new C4114he(str);
            String d2 = c4114he.d("width");
            String d3 = c4114he.d("height");
            v.this.o = Integer.parseInt(d2);
            v.this.p = Integer.parseInt(d3);
            v.this.q = c4114he.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            w1l.D("setMixedContentAlwaysAllow(", str, ")", v.this.c);
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.c, "setOrientation(" + str + ")");
                String d2 = new C4114he(str).d(U3.i.n);
                v.this.o(d2);
                v vVar = v.this;
                if (vVar.c0 != null) {
                    v.this.c0.onOrientationChanged(d2, vVar.Z.K(vVar.b0.getContext()));
                }
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.c, "setStoreSearchKeys(" + str + ")");
            C4020ca.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.c, "setUserData(" + str + ")");
            C4114he c4114he = new C4114he(str);
            if (!c4114he.a(U3.i.W)) {
                v.this.a(str, false, U3.c.F, (String) null);
                return;
            }
            if (!c4114he.a(U3.i.X)) {
                v.this.a(str, false, U3.c.G, (String) null);
                return;
            }
            String d2 = c4114he.d(U3.i.W);
            String d3 = c4114he.d(U3.i.X);
            C4020ca.e().a(d2, d3);
            v.this.i(v.this.e(v.this.e(str), v.e0(v.this, d2, d3, null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            w1l.D("setWebviewBackgroundColor(", str, ")", v.this.c);
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            w1l.D("stillAlive(", str, ")", v.this.c);
            v.this.b.a();
        }

        public void u(String str) {
            v.this.i(v.this.a(U3.h.d, str, (String) null, (String) null));
        }

        public void v(String str) {
            v.this.i(v.this.a(U3.h.e, str, (String) null, (String) null));
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class w implements InterfaceC4199ma {
            public w() {
            }

            @Override // com.ironsource.InterfaceC4199ma
            public void a(boolean z, @NotNull String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z ? v.i0 : v.j0, str);
                    v.this.a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C4157k4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }

            @Override // com.ironsource.InterfaceC4199ma
            public void a(boolean z, @NotNull String str, C4114he c4114he) {
                c4114he.b(z ? v.i0 : v.j0, str);
                v.this.a(c4114he.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4199ma
            public void a(boolean z, @NotNull String str, @NotNull String str2) {
                C4114he c4114he = new C4114he();
                c4114he.b(z ? v.i0 : v.j0, str);
                c4114he.b("data", str2);
                v.this.a(c4114he.toString(), z, (String) null, (String) null);
            }
        }

        public boolean b(String str) {
            if (TextUtils.isEmpty(str) || str.contains(Y1.f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.C.f());
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                Logger.d(v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (b(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C4157k4.d().a(e2);
                    Logger.d(v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i2) {
            Q4 a2;
            v vVar = v.this;
            C4197m8.e eVar = C4197m8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (a2 = v.this.H.a(eVar, str)) != null && a2.k()) {
                v.this.b(new u(str, i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, String str) {
            if (z) {
                v.this.z.c(C4197m8.e.Interstitial, str);
                v.this.z.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z) {
            Q4 a2 = v.this.H.a(C4197m8.e.Interstitial, str);
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

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.X) {
                return;
            }
            a(jSONObject);
        }
    }

    public void b(int i2) {
        e0 = i2;
    }

    public void g(String str, String str2) {
        i(e(U3.h.W, a(U3.i.p, str2, U3.i.m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        a(q4, map);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4) {
        Map<String, String> b2 = q4.b();
        if (b2 != null) {
            i(e(U3.h.T, SDKUtils.flatMapToJsonAsString(b2)));
        }
        this.H.b(C4197m8.e.Interstitial, q4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(U3.h.u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context) {
        try {
            O3 o3 = this.S;
            if (o3 == null) {
                return;
            }
            o3.c(context);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(U3.h.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    private String b(String str) {
        String str2 = this.B + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public Context q() {
        return this.a0.a();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4197m8.c h() {
        return C4197m8.c.Web;
    }

    public void b(boolean z, String str) {
        i(e(U3.h.V, a(U3.i.K, str, null, null, null, null, null, null, U3.i.o, z)));
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    public void b(Runnable runnable) {
        O7 o7 = this.a;
        if (o7 != null) {
            o7.c(runnable);
        }
    }

    public int r() {
        return e0;
    }

    private void n() {
        CountDownTimer countDownTimer;
        if (!Ib.a0().h().i() || (countDownTimer = this.m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.m = null;
    }

    private void a(Context context, O7 o7, CountDownLatch countDownLatch) {
        o7.d(new zol(13, this, context, countDownLatch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.b0 = new C4074fa(context, new InterfaceC4271qa.a());
                a(context, this.b0);
                this.b0.setWebViewClient(new w(this, 0));
                this.b0.setWebChromeClient(this.r);
                eh.a(this.b0);
                a(this.b0);
                this.b0.setDownloadListener(this);
            } catch (Exception e2) {
                com.ironsource.sdk.controller.c cVar = this.R;
                if (cVar != null) {
                    cVar.c("Failed to create WebView on UI thread");
                }
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e2);
                C4157k4.d().a(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private O3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    public void c(String str, String str2) {
        v vVar;
        String str3;
        try {
            vVar = this;
            str3 = str;
            try {
                vVar.i(vVar.e(U3.h.p, vVar.a(U3.i.b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C4157k4.d().a(exc);
                vVar.b(str3, str2, exc.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            vVar = this;
            str3 = str;
        }
    }

    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), U3.d);
        webView.addJavascriptInterface(b(sVar), U3.e);
    }

    private boolean c(C4376w8 c4376w8) {
        int i2;
        boolean copyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c4376w8);
        if (!copyFileFromBundleToStorage) {
            return false;
        }
        byte[] a2 = C3996b4.a(this.b0.getContext(), U3.g);
        String a3 = C3996b4.a(this.b0.getContext());
        if (a3 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c4376w8.getParent());
        String str = File.separator;
        bf3.v(sb, str, "controller_", a3, str);
        sb.append(U3.g);
        String sb2 = sb.toString();
        if (a2 == null || a2.length == 0) {
            return copyFileFromBundleToStorage;
        }
        try {
            i2 = IronSourceStorageUtils.saveFile(a2, sb2);
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            i2 = 0;
            copyFileFromBundleToStorage = false;
        }
        if (i2 != 0) {
            return copyFileFromBundleToStorage;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c4376w8.getName());
        return false;
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
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

    public void a(C4297s1 c4297s1) {
        this.O = c4297s1;
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

    public void c(String str) {
        if (str.equals(U3.i.i)) {
            o();
        }
        i(e(U3.h.z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    public void c(Runnable runnable) {
        O7 o7 = this.a;
        if (o7 != null) {
            o7.d(runnable);
        }
    }

    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public void a(C4336u4 c4336u4) {
        this.P = c4336u4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC4229o4 a(C4197m8.e eVar) {
        if (eVar == C4197m8.e.Interstitial) {
            return this.z;
        }
        if (eVar == C4197m8.e.RewardedVideo) {
            return this.y;
        }
        if (eVar == C4197m8.e.Banner) {
            return this.A;
        }
        return null;
    }

    public void a(Ag ag) {
        this.D = ag;
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
        String i3 = wv8.i(uri, "?", c2);
        this.a.d(new i(controllerConfigAsJSONObject, this.b0, i2, i3));
        n();
        this.m = new j(1000 * Ib.a0().h().H(), 1000L, i2, Ib.a0().h().c()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            O3 o3 = this.S;
            if (o3 == null) {
                return;
            }
            o3.b(context);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private void a(String str, C4197m8.e eVar, Q4 q4, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, q4);
        } else {
            i(a(eVar, q4).b);
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4282r4 interfaceC4282r4) {
        this.f = str;
        this.g = str2;
        this.y = interfaceC4282r4;
        this.E.i(str);
        this.E.j(str2);
        a(str, C4197m8.e.RewardedVideo, q4, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.E);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4265q4 interfaceC4265q4) {
        this.f = str;
        this.g = str2;
        this.z = interfaceC4265q4;
        this.E.g(str);
        this.E.h(this.g);
        a(this.f, C4197m8.e.Interstitial, q4, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4265q4 interfaceC4265q4) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.E.d(str, true);
        i(a(U3.h.E, flatMapToJsonAsString, U3.h.F, U3.h.G));
    }

    private void a(Q4 q4, Map<String, String> map) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, q4.b()});
        if (map.containsKey("adm")) {
            this.b.a(new dym(this));
        }
        this.E.d(q4.h(), true);
        i(a(U3.h.E, SDKUtils.flatMapToJsonAsString(mergeHashMaps), U3.h.F, U3.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(X6 x6) {
        x6.a(new dym(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(U6 u6) {
        try {
            this.R.a(u6);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4265q4 interfaceC4265q4) {
        i(a(C4197m8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        i(a(C4197m8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, q4.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        Q4 a2 = this.H.a(C4197m8.e.Interstitial, str);
        return a2 != null && a2.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4247p4 interfaceC4247p4) {
        this.f = str;
        this.g = str2;
        this.A = interfaceC4247p4;
        a(str, C4197m8.e.Banner, q4, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4247p4 interfaceC4247p4) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, q4.b()});
        if (map != null) {
            i(a(U3.h.N, SDKUtils.flatMapToJsonAsString(mergeHashMaps), U3.h.O, U3.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4) {
        Map<String, String> b2 = q4.b();
        if (b2 != null) {
            i(a(U3.h.S, SDKUtils.flatMapToJsonAsString(b2), U3.h.P, U3.h.Q));
        }
        this.H.b(C4197m8.e.Banner, q4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4247p4 interfaceC4247p4) {
        i(a(U3.h.N, jSONObject.toString(), U3.h.O, U3.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), U3.h.U, U3.h.U));
    }

    private u a(C4197m8.e eVar, Q4 q4) {
        u uVar = new u();
        if (eVar != C4197m8.e.RewardedVideo && eVar != C4197m8.e.Interstitial && eVar != C4197m8.e.Banner) {
            return uVar;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(U3.j.g, this.f);
        if (!TextUtils.isEmpty(this.g)) {
            hashMap.put(U3.j.f, this.g);
        }
        if (q4 != null) {
            if (q4.g() != null) {
                hashMap.putAll(q4.g());
                hashMap.put(U3.i.y0, String.valueOf(N.a.c(q4.h())));
            }
            hashMap.put("demandSourceName", q4.f());
            hashMap.put("demandSourceId", q4.h());
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        U3.h a2 = U3.h.a(eVar);
        String a3 = a(a2.a, flatMapToJsonAsString, a2.b, a2.c);
        uVar.a = a2.a;
        uVar.b = a3;
        return uVar;
    }

    private String a(C4197m8.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        Q4 a2 = this.H.a(eVar, fetchDemandSourceId);
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
        U3.h b2 = U3.h.b(eVar);
        return a(b2.a, flatMapToJsonAsString, b2.b, b2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C4197m8.e eVar, Q4 q4) {
        if (r(eVar.toString())) {
            b(new n(eVar, q4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4282r4 interfaceC4282r4) {
        i(a(C4197m8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.T = jSONObject;
        }
    }

    public void a(boolean z, String str) {
        i(e(U3.h.V, a(U3.i.M0, str, null, null, null, null, null, null, U3.i.o, z)));
    }

    public void a(int i2, boolean z) {
        i(e(U3.f.i, a(U3.f.f, String.valueOf(i2), null, null, null, null, null, null, U3.f.g, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, String str2, String str3) {
        String d2 = new C4114he(str).d(z ? i0 : j0);
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        i(e(d2, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, U3.i.g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C4157k4.d().a(e2);
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
            C4157k4.d().a(e2);
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

    @Override // com.ironsource.Nc
    public void a(C4376w8 c4376w8) {
        if (this.X && this.W.a(c4376w8)) {
            a(1);
        } else {
            if (c4376w8.getName().contains(U3.f)) {
                C3996b4.a(this.b0.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.C.a(new o());
                return;
            }
            c(c4376w8.getName(), c4376w8.getParent());
        }
    }

    private boolean a(File file) {
        return C3996b4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(Pc pc) {
        this.c0 = pc;
        this.b0.a(pc);
    }

    public void a(EnumC1218v enumC1218v) {
        this.w = enumC1218v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        boolean z = this.Y;
        C4074fa c4074fa = this.b0;
        if (z) {
            if (c4074fa != null) {
                this.a.d(new xtl(this, 13));
            }
        } else if (c4074fa != null) {
            this.b0.destroy();
        }
        C4015c5 c4015c5 = this.h;
        if (c4015c5 != null) {
            c4015c5.d();
        }
        O3 o3 = this.S;
        if (o3 != null) {
            o3.b();
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

    public void a(C4197m8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(C3950a1 c3950a1) {
        synchronized (this.F) {
            try {
                if (c3950a1.j() && this.i) {
                    c3950a1.toString();
                    int c2 = c3950a1.c();
                    if (c2 != -1) {
                        C4197m8.e eVar = C4197m8.e.RewardedVideo;
                        if (c2 == eVar.ordinal()) {
                            String b2 = c3950a1.b();
                            InterfaceC4229o4 a2 = a(eVar);
                            if (a2 != null && !TextUtils.isEmpty(b2)) {
                                a2.b(eVar, b2);
                            }
                        } else {
                            C4197m8.e eVar2 = C4197m8.e.Interstitial;
                            if (c2 == eVar2.ordinal()) {
                                String b3 = c3950a1.b();
                                InterfaceC4229o4 a3 = a(eVar2);
                                if (a3 != null && !TextUtils.isEmpty(b3)) {
                                    a3.b(eVar2, b3);
                                }
                            }
                        }
                        c3950a1.a(-1);
                        c3950a1.f(null);
                    }
                    String d2 = c3950a1.d();
                    String f2 = c3950a1.f();
                    for (Q4 q4 : this.H.a(C4197m8.e.Interstitial)) {
                        if (q4.e() == 2) {
                            q4.f();
                            a(d2, f2, q4, this.z);
                        }
                    }
                    String g2 = c3950a1.g();
                    String h2 = c3950a1.h();
                    for (Q4 q42 : this.H.a(C4197m8.e.RewardedVideo)) {
                        if (q42.e() == 2) {
                            this.y.c(q42.f());
                            a(g2, h2, q42, this.y);
                        }
                    }
                    c3950a1.a(false);
                }
                this.E = c3950a1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable) {
        O7 o7 = this.a;
        if (o7 != null) {
            o7.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.a0.a(activity);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = U3.c.z;
        }
        i(e(U3.h.a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C4114he(str).d(j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(C4376w8 c4376w8) {
        this.h.a(this);
        if (c4376w8 != null && c4376w8.exists()) {
            a(c4376w8);
            return null;
        }
        a(new C4376w8(U3.f), new C4215n8(1, "Unable to download Html file"));
        return null;
    }

    public void d(JSONObject jSONObject) {
        Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(U3.h.y, a(U3.j.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }
}
