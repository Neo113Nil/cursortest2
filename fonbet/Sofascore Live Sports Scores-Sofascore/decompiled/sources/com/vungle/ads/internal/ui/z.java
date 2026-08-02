package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s1;
import com.vungle.ads.internal.ui.z;
import defpackage.dp1;
import defpackage.fn0;
import defpackage.jga;
import defpackage.joa;
import defpackage.p2g;
import defpackage.qfa;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xtl;
import defpackage.ypa;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z extends WebViewClient implements com.vungle.ads.internal.util.v {
    public final h0 a;
    public final i3 b;
    public final ExecutorService c;
    public final com.vungle.ads.internal.platform.f d;
    public final com.vungle.ads.internal.load.e e;
    public final Long f;
    public final joa g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public WebView m;
    public boolean n;
    public com.vungle.ads.internal.ui.view.o o;
    public com.vungle.ads.internal.ui.view.p p;
    public com.vungle.ads.internal.omsdk.f q;
    public Boolean r;
    public final s1 s;
    public final s1 t;
    public final m2 u;

    public z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.e eVar, Long l) {
        h0Var.getClass();
        i3Var.getClass();
        executorService.getClass();
        this.a = h0Var;
        this.b = i3Var;
        this.c = executorService;
        this.d = fVar;
        this.e = eVar;
        this.f = l;
        this.g = ypa.b(p.a);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.s = new s1(sDKMetricType);
        this.t = new s1(sDKMetricType);
        this.u = new m2(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public static final void a(boolean z, z zVar) {
        zVar.getClass();
        jga jgaVar = new jga(0);
        jgaVar.b("placementType", qfa.c(zVar.a.F()));
        Boolean bool = zVar.r;
        if (bool != null) {
            jgaVar.b(U3.i.o, qfa.a(bool));
        }
        jgaVar.b(L6.F, qfa.c("android"));
        jgaVar.b("osVersion", qfa.c(String.valueOf(Build.VERSION.SDK_INT)));
        jgaVar.b("incentivized", qfa.a(Boolean.valueOf(zVar.b.j())));
        com.vungle.ads.internal.platform.f fVar = zVar.d;
        if (fVar != null) {
            jgaVar.b("isSilent", qfa.a(Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).o())));
        }
        Long l = zVar.f;
        if (l != null) {
            jgaVar.b("timeLoaded", qfa.b(l));
        }
        if (zVar.h) {
            jgaVar.b("consentRequired", qfa.a(Boolean.TRUE));
            jgaVar.b("consentTitleText", qfa.c(zVar.i));
            jgaVar.b("consentBodyText", qfa.c(zVar.j));
            jgaVar.b("consentAcceptButtonText", qfa.c(zVar.k));
            jgaVar.b("consentDenyButtonText", qfa.c(zVar.l));
        } else {
            jgaVar.b("consentRequired", qfa.a(Boolean.FALSE));
        }
        jgaVar.b("sdkVersion", qfa.c(BuildConfig.VERSION_NAME));
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(jgaVar.a) + ',' + z + ')';
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, str);
        }
    }

    public static final void c(z zVar, WebView webView) {
        zVar.getClass();
        com.vungle.ads.internal.load.e eVar = zVar.e;
        if (eVar != null) {
            eVar.a();
        }
        zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final void b(boolean z) {
        this.r = Boolean.valueOf(z);
        WebView webView = this.m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kotlinx.serialization.json.d a = qfa.a(Boolean.valueOf(z));
            a.getClass();
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", r.a);
        if (webView == null) {
            return;
        }
        this.m = webView;
        webView.setVisibility(0);
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.p));
        }
        com.vungle.ads.internal.omsdk.f fVar = this.q;
        if (fVar != null) {
            ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String valueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.m = null;
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView, renderProcessGoneDetail));
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            Boolean valueOf = renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null;
            com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) pVar;
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : true;
            rVar.a(new WebViewRenderingProcessGone(com.appsflyer.internal.i.j("didCrash=", booleanValue)), booleanValue, null);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        Object u2gVar;
        List split$default;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url != null && (scheme = url.getScheme()) != null) {
            Locale locale = Locale.ROOT;
            String k = com.appsflyer.internal.i.k(locale, scheme, locale);
            if (k.equals("http") || k.equals(HttpRequest.DEFAULT_SCHEME)) {
                if (!this.a.B()) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleWebClient", w.a);
                    return null;
                }
                String uri = url.toString();
                uri.getClass();
                com.vungle.ads.internal.model.b a = this.a.a(uri);
                String c = a != null ? a.c() : null;
                if (c != null && c.length() != 0) {
                    File file = new File(c);
                    if (file.exists()) {
                        long b = a.b();
                        if (b > 0) {
                            long length = file.length();
                            String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
                            this.s.a(str + " cached:" + length + ' ' + uri);
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.s, this.a.q());
                            try {
                                p2g p2gVar = w2g.b;
                                if (str == null || !kotlin.text.c.v(str, "bytes=", false)) {
                                    u2gVar = new Pair(0L, null);
                                } else {
                                    split$default = StringsKt__StringsKt.split$default(StringsKt.V(str, "bytes="), new String[]{"-"}, false, 0, 6, null);
                                    String str2 = (String) CollectionsKt.a0(0, split$default);
                                    Long k0 = str2 != null ? StringsKt.k0(str2) : null;
                                    String str3 = (String) CollectionsKt.a0(1, split$default);
                                    Long k02 = str3 != null ? StringsKt.k0(str3) : null;
                                    if (k0 == null) {
                                        if (k02 == null) {
                                            k0 = 0L;
                                        } else {
                                            k0 = Long.valueOf(b - k02.longValue());
                                            k02 = null;
                                        }
                                    }
                                    u2gVar = new Pair(k0, k02);
                                }
                            } catch (Throwable th) {
                                p2g p2gVar2 = w2g.b;
                                u2gVar = new u2g(th);
                            }
                            if (w2g.a(u2gVar) != null) {
                                u2gVar = new Pair(0L, null);
                            }
                            Pair pair = (Pair) u2gVar;
                            Number number = (Number) pair.a;
                            a.c(number.longValue());
                            Long l = (Long) pair.b;
                            a.a(l);
                            long longValue = number.longValue();
                            long j = length - longValue;
                            boolean z2 = com.vungle.ads.internal.util.u.a;
                            StringBuilder sb = new StringBuilder(">>request: ");
                            sb.append(url);
                            sb.append(" rangeStart=");
                            sb.append(longValue);
                            sb.append(" rangeEnd=");
                            sb.append(l);
                            sb.append(" cachedFileLength=");
                            sb.append(length);
                            fn0.t(j, " availableBytes=", " contentLength=", sb);
                            sb.append(b);
                            sb.append(' ');
                            com.vungle.ads.internal.util.t.a(sb.toString());
                            if (j <= 0) {
                                com.vungle.ads.internal.util.t.a("VungleWebClient", new x(str));
                                a.q();
                                length = file.length();
                            }
                            long longValue2 = l != null ? l.longValue() : length - 1;
                            long j2 = (longValue2 - longValue) + 1;
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                WebResourceResponse webResourceResponse = new WebResourceResponse(a.d(), C.UTF8_NAME, 206, "Partial Content", tub.h(new Pair("Content-Type", a.d()), new Pair("Accept-Ranges", "bytes"), new Pair("Content-Length", String.valueOf(j2)), new Pair("Content-Range", "bytes " + longValue + '-' + longValue2 + '/' + b)), new BufferedInputStream(fileInputStream, 1024));
                                StringBuilder sb2 = new StringBuilder("<<Return:");
                                sb2.append(webResourceResponse.getResponseHeaders());
                                com.vungle.ads.internal.util.t.a(sb2.toString());
                                return webResourceResponse;
                            } catch (Throwable th2) {
                                p2g p2gVar3 = w2g.b;
                                Throwable a2 = w2g.a(new u2g(th2));
                                if (a2 != null) {
                                    boolean z3 = com.vungle.ads.internal.util.u.a;
                                    StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Error serving local range video: ");
                                    a3.append(a2.getMessage());
                                    com.vungle.ads.internal.util.t.a("VungleWebClient", a3.toString(), a2);
                                    this.t.a(uri + ' ' + a2.getMessage());
                                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.t, this.a.q());
                                }
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        String str2;
        final int i = 0;
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + str);
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        }
        Uri parse = Uri.parse(str);
        parse.getClass();
        String scheme = parse.getScheme();
        if (scheme != null && scheme.length() != 0) {
            String scheme2 = parse.getScheme();
            final int i2 = 1;
            if (!Intrinsics.c(scheme2, CampaignEx.JSON_KEY_MRAID)) {
                str2 = "VungleWebClient";
                if (!"http".equalsIgnoreCase(scheme2)) {
                    if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme2)) {
                    }
                    this.u.a("url: ".concat(str));
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.u, this.a.q(), 4);
                    com.vungle.ads.internal.util.t.a(str2, new y(str));
                    return false;
                }
                com.vungle.ads.internal.util.t.a(str2, "Open URL".concat(str));
                com.vungle.ads.internal.ui.view.o oVar = this.o;
                if (oVar != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    kotlinx.serialization.json.d c = qfa.c(str);
                    c.getClass();
                    ((com.vungle.ads.internal.presenter.r) oVar).a("openNonMraid", new kotlinx.serialization.json.c(linkedHashMap));
                }
                return true;
            }
            str2 = "VungleWebClient";
            String host = parse.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != -1943542072) {
                    if (hashCode == 88409791) {
                        if (host.equals("failToLoad")) {
                            this.c.execute(new Runnable(this) { // from class: d1n
                                public final /* synthetic */ z b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i3 = i2;
                                    WebView webView2 = webView;
                                    z zVar = this.b;
                                    switch (i3) {
                                        case 0:
                                            z.b(zVar, webView2);
                                            break;
                                        case 1:
                                            z.c(zVar, webView2);
                                            break;
                                        default:
                                            z.a(zVar, webView2);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                    } else if (hashCode == 119543762 && host.equals("readyToPlay")) {
                        this.c.execute(new Runnable(this) { // from class: d1n
                            public final /* synthetic */ z b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i;
                                WebView webView2 = webView;
                                z zVar = this.b;
                                switch (i3) {
                                    case 0:
                                        z.b(zVar, webView2);
                                        break;
                                    case 1:
                                        z.c(zVar, webView2);
                                        break;
                                    default:
                                        z.a(zVar, webView2);
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                } else if (host.equals("propertiesChangeCompleted")) {
                    if (!this.n) {
                        this.n = true;
                        final int i3 = 2;
                        this.c.execute(new Runnable(this) { // from class: d1n
                            public final /* synthetic */ z b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i32 = i3;
                                WebView webView2 = webView;
                                z zVar = this.b;
                                switch (i32) {
                                    case 0:
                                        z.b(zVar, webView2);
                                        break;
                                    case 1:
                                        z.c(zVar, webView2);
                                        break;
                                    default:
                                        z.a(zVar, webView2);
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                    return true;
                }
                com.vungle.ads.internal.ui.view.o oVar2 = this.o;
                if (oVar2 == null) {
                    a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
                    return true;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str3 : parse.getQueryParameterNames()) {
                    str3.getClass();
                    kotlinx.serialization.json.d c2 = qfa.c(parse.getQueryParameter(str3));
                    c2.getClass();
                }
                this.c.execute(new dp1((Object) oVar2, host, (Object) new kotlinx.serialization.json.c(linkedHashMap2), (Object) this, (Object) webView, 5));
                return true;
            }
            this.u.a("url: ".concat(str));
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.u, this.a.q(), 4);
            com.vungle.ads.internal.util.t.a(str2, new y(str));
            return false;
        }
        return false;
    }

    public /* synthetic */ z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(h0Var, i3Var, executorService, fVar, null, null);
    }

    public static final void b(z zVar, WebView webView) {
        zVar.getClass();
        com.vungle.ads.internal.load.e eVar = zVar.e;
        if (eVar != null) {
            eVar.b();
        }
        zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        super.onReceivedError(webView, i, str, str2);
    }

    public final void a(int i) {
        ((com.vungle.ads.internal.util.j) this.g.getValue()).a(this.m, i, new q(this));
    }

    public final void a(boolean z, String str, String str2, String str3, String str4) {
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.o oVar) {
        this.o = oVar;
    }

    public static final void a(z zVar, WebView webView) {
        zVar.getClass();
        zVar.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + zVar.a.g() + ')');
    }

    public static final void a(com.vungle.ads.internal.ui.view.o oVar, String str, kotlinx.serialization.json.c cVar, z zVar, WebView webView) {
        oVar.getClass();
        str.getClass();
        cVar.getClass();
        zVar.getClass();
        if (((com.vungle.ads.internal.presenter.r) oVar).a(str, cVar)) {
            zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public final void a() {
        this.c.execute(new xtl(this, 18));
    }

    public final void a(String str, int i) {
        str.getClass();
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i + ')');
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i + '%');
        if (i >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i, this.a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, str, this.a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        WebView webView = this.m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kotlinx.serialization.json.d a = qfa.a(Boolean.valueOf(z));
            a.getClass();
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.p pVar) {
        pVar.getClass();
        this.p = pVar;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new u(str));
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new v(this, webView, str));
    }
}
