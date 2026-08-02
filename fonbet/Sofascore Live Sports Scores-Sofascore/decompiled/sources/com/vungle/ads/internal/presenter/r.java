package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.AdConfig;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.u1;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.dmi;
import defpackage.duf;
import defpackage.joa;
import defpackage.lnb;
import defpackage.mum;
import defpackage.p2g;
import defpackage.p5c;
import defpackage.sha;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wv8;
import defpackage.xea;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r implements com.vungle.ads.internal.ui.view.o, com.vungle.ads.internal.ui.view.p {
    public static final Map z = tub.h(new Pair("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), new Pair("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));
    public final com.vungle.ads.internal.ui.view.k a;
    public final h0 b;
    public final i3 c;
    public final com.vungle.ads.internal.ui.z d;
    public Executor e;
    public final com.vungle.ads.internal.omsdk.e f;
    public final com.vungle.ads.internal.platform.f g;
    public long h;
    public a i;
    public boolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public Long m;
    public String n;
    public final joa o;
    public final joa p;
    public final joa q;
    public final joa r;
    public z s;
    public y t;
    public final joa u;
    public final joa v;
    public boolean w;
    public final joa x;
    public long y;

    public r(com.vungle.ads.internal.ui.view.k kVar, h0 h0Var, i3 i3Var, com.vungle.ads.internal.ui.z zVar, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.omsdk.e eVar, com.vungle.ads.internal.platform.f fVar) {
        kVar.getClass();
        h0Var.getClass();
        i3Var.getClass();
        zVar.getClass();
        jVar.getClass();
        eVar.getClass();
        fVar.getClass();
        this.a = kVar;
        this.b = h0Var;
        this.c = i3Var;
        this.d = zVar;
        this.e = jVar;
        this.f = eVar;
        this.g = fVar;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        Context context = kVar.getContext();
        context.getClass();
        ysa ysaVar = ysa.a;
        this.o = ypa.a(ysaVar, new n(context));
        Context context2 = kVar.getContext();
        context2.getClass();
        this.p = ypa.a(ysaVar, new o(context2));
        Context context3 = kVar.getContext();
        context3.getClass();
        this.q = ypa.a(ysaVar, new p(context3));
        Context context4 = kVar.getContext();
        context4.getClass();
        this.r = ypa.a(ysaVar, new q(context4));
        this.u = ypa.b(m.a);
        this.v = ypa.b(new g(this));
        this.x = ypa.b(new d(this));
    }

    public static final void e(r rVar) {
        rVar.getClass();
        String b = rVar.c.b();
        List list = null;
        com.vungle.ads.internal.network.m a = ((VungleApiClient) rVar.o.getValue()).a(new p1(list, rVar.m, rVar.b.e(), b, rVar.n, (c1) null, 67));
        if (a != null) {
            a.a(new j(rVar));
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", "Invalid ri call.");
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Error RI API for placement: ");
        a2.append(rVar.c.b());
        new NetworkUnreachable(a2.toString()).setLogEntry$vungle_ads_release(rVar.b()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b1, code lost:
    
        r19.h = 0;
        r2 = r19.a.getContext();
        r2.getClass();
        r0 = com.vungle.ads.internal.util.l.a(r12, r0, r2, b(), new com.vungle.ads.internal.presenter.f(r12, r19));
        r2 = r19.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cb, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cd, code lost:
    
        r2.a("open", "adClick", r19.c.b());
        r2 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d8, code lost:
    
        if (r0 == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02da, code lost:
    
        r0 = r19.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02dc, code lost:
    
        if (r0 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02de, code lost:
    
        r0.a("open", "adLeftApplication", r19.c.b());
        r0 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
    
        if (r19.h != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029e, code lost:
    
        r19.h = 0;
        com.vungle.ads.internal.AnalyticsClient.a(com.vungle.ads.internal.AnalyticsClient.INSTANCE, new com.vungle.ads.internal.m2(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), b(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027c, code lost:
    
        r2 = java.lang.System.currentTimeMillis() - r19.h;
        r5 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0285, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0287, code lost:
    
        r5 = r5.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0289, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028b, code lost:
    
        r5 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        r5 = r5.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029b, code lost:
    
        if (r2 <= r5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0294, code lost:
    
        r5 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x026c, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021a, code lost:
    
        if (r20.equals("useCustomPrivacy") == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0224, code lost:
    
        if (r20.equals("openNonMraid") == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0615, code lost:
    
        if (r20.equals("action") == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r20.equals("useCustomClose") == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0210, code lost:
    
        if (r20.equals("open") == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0228, code lost:
    
        r0 = r19.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022e, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0230, code lost:
    
        r12 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0234, code lost:
    
        r0 = com.vungle.ads.internal.util.r.a("url", r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023c, code lost:
    
        if (com.vungle.ads.internal.util.n.a(r0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023e, code lost:
    
        new com.vungle.ads.InvalidCTAUrl(defpackage.dmi.j(')', "Invalid CTA Url (", r0)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0254, code lost:
    
        com.vungle.ads.internal.ConfigManager.INSTANCE.getClass();
        r2 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025b, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025d, code lost:
    
        r2 = r2.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0261, code lost:
    
        r2 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0263, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0265, code lost:
    
        r16 = r2.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026e, code lost:
    
        if (r16 == false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, kotlinx.serialization.json.c cVar) {
        int i;
        Integer intOrNull;
        Object u2gVar;
        boolean z2;
        String str2;
        boolean a;
        List a2;
        str.getClass();
        cVar.getClass();
        String str3 = null;
        Map map = null;
        switch (str.hashCode()) {
            case -1988620632:
                if (str.equals("detectBlackScreen")) {
                    String a3 = com.vungle.ads.internal.util.r.a("samplingFactor", cVar);
                    if (a3 != null && (intOrNull = StringsKt.toIntOrNull(a3)) != null) {
                        Integer num = intOrNull.intValue() > 0 ? intOrNull : null;
                        if (num != null) {
                            i = num.intValue();
                            this.d.a(i);
                            break;
                        }
                    }
                    i = 100;
                    this.d.a(i);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -1912374177:
                if (str.equals("successfulView")) {
                    a aVar = this.i;
                    if (aVar != null) {
                        aVar.a("successfulView", null, this.c.b());
                        Unit unit = Unit.a;
                    }
                    if (this.c.j()) {
                        ConfigManager.INSTANCE.getClass();
                        if (ConfigManager.o() && !this.l.getAndSet(true)) {
                            this.e.execute(new mum(this, 2));
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -1422950858:
                break;
            case -735200587:
                if (str.equals("actionWithValue")) {
                    String a4 = com.vungle.ads.internal.util.r.a("event", cVar);
                    String a5 = com.vungle.ads.internal.util.r.a(U3.i.X, cVar);
                    if (HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH.equalsIgnoreCase(a4)) {
                        try {
                            p2g p2gVar = w2g.b;
                            u2gVar = a5 != null ? Long.valueOf(Long.parseLong(a5)) : null;
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        Long l = (Long) (u2gVar instanceof u2g ? null : u2gVar);
                        this.y = l != null ? l.longValue() : 0L;
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -660787472:
                if (str.equals("consentAction")) {
                    String a6 = com.vungle.ads.internal.util.r.a("event", cVar);
                    PrivacyConsent privacyConsent = PrivacyConsent.OPT_OUT;
                    String value = Intrinsics.c(a6, privacyConsent.getValue()) ? privacyConsent.getValue() : PrivacyConsent.OPT_IN.getValue();
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a(value, "vungle_modal", null);
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -649897046:
                if (str.equals("openAppStore")) {
                    com.vungle.ads.internal.model.i c = this.b.c();
                    String a7 = c != null ? c.a() : null;
                    String a8 = com.vungle.ads.internal.util.r.a("url", cVar);
                    if (!com.vungle.ads.internal.util.n.a(a8)) {
                        new InvalidCTAUrl(dmi.j(')', "Invalid InlineInstall Url (", a8)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.h = System.currentTimeMillis();
                    Context context = this.a.getContext();
                    context.getClass();
                    boolean a9 = com.vungle.ads.internal.util.l.a(a7, null, context, b(), new f(a7, this));
                    if (a9) {
                        z2 = a9;
                    } else {
                        if (a8 == null || a8.length() == 0) {
                            a("url: " + a8 + ", message: url is null/empty");
                        } else {
                            Uri parse = Uri.parse(a8);
                            parse.getClass();
                            Intent intent = new Intent("android.intent.action.VIEW", parse);
                            intent.setPackage("com.android.vending");
                            if (!(this.a.getContext() instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            if (intent.resolveActivity(this.a.getContext().getPackageManager()) == null) {
                                a("url: " + a8 + ", message: play store not installed");
                            } else {
                                y yVar = this.t;
                                Pair a10 = yVar != null ? ((com.vungle.ads.internal.ui.k) yVar).a(intent) : new Pair(Boolean.FALSE, null);
                                boolean booleanValue = ((Boolean) a10.a).booleanValue();
                                String str4 = (String) a10.b;
                                if (booleanValue) {
                                    String a11 = com.iab.omid.library.vungle.d.a("url: ", a8);
                                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                                    m2Var.c = 1L;
                                    AnalyticsClient.INSTANCE.a(m2Var, b(), a11);
                                    z2 = true;
                                } else {
                                    a("url: " + a8 + ", message: " + str4);
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        a aVar2 = this.i;
                        if (aVar2 != null) {
                            aVar2.a("open", "adClick", this.c.b());
                            Unit unit2 = Unit.a;
                        }
                        a aVar3 = this.i;
                        if (aVar3 != null) {
                            aVar3.a("open", "adLeftApplication", this.c.b());
                            Unit unit3 = Unit.a;
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -568000867:
                if (str.equals("pingUrl")) {
                    String a12 = com.vungle.ads.internal.util.r.a("requestType", cVar);
                    if (a12 != null) {
                        str2 = a12.toUpperCase(Locale.ROOT);
                        str2.getClass();
                    } else {
                        str2 = null;
                    }
                    if (!CollectionsKt.R(kotlin.collections.b.j(C4094gc.a, C4094gc.b), str2)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, lnb.o("Invalid request type: ", str2, ". Only 'GET' and 'POST' are supported")).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        String a13 = com.vungle.ads.internal.util.r.a("url", cVar);
                        String a14 = com.vungle.ads.internal.util.r.a("requestData", cVar);
                        boolean parseBoolean = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("retry", cVar));
                        String a15 = com.vungle.ads.internal.util.r.a("headers", cVar);
                        if (a15 != null) {
                            try {
                                xea xeaVar = yea.d;
                                p5c p5cVar = xeaVar.b;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                map = (Map) xeaVar.b(sha.Q(p5cVar, duf.e(companion.invariant(duf.b(String.class)), companion.invariant(duf.b(String.class)))), a15);
                            } catch (Exception unused) {
                                new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, com.iab.omid.library.vungle.d.a("Failed to decode header: ", a15)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                                return true;
                            }
                        }
                        if (!com.vungle.ads.internal.util.z.a(a13)) {
                            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else if (a13 != null) {
                            com.vungle.ads.internal.network.p a16 = new com.vungle.ads.internal.network.p(a13).a(map).a(a14).a(parseBoolean).b("pingUrl").a(b());
                            if (Intrinsics.c(str2, C4094gc.a)) {
                                a16.b();
                            } else {
                                a16.c();
                            }
                            Unit unit4 = Unit.a;
                            c().a(a16.a(), false);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -511324706:
                if (str.equals("openPrivacy")) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), b(), 4);
                    String a17 = com.vungle.ads.internal.util.r.a("url", cVar);
                    if (a17 != null && a17.length() != 0 && com.vungle.ads.internal.util.n.a(a17)) {
                        Context context2 = this.a.getContext();
                        context2.getClass();
                        a = com.vungle.ads.internal.util.l.a(null, a17, context2, b(), null);
                        if (!a) {
                            new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else {
                            a aVar4 = this.i;
                            if (aVar4 != null) {
                                aVar4.a("open", "adLeftApplication", this.c.b());
                                Unit unit5 = Unit.a;
                                break;
                            }
                        }
                    } else {
                        if (a17 == null) {
                            a17 = "nonePrivacyUrl";
                        }
                        new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -418575596:
                break;
            case -348095344:
                break;
            case 3417674:
                break;
            case 3566511:
                if (str.equals("tpat")) {
                    String a18 = com.vungle.ads.internal.util.r.a("event", cVar);
                    if (a18 != null && a18.length() != 0) {
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = (Sdk.SDKMetric.SDKMetricType) z.get(a18);
                        if (sDKMetricType != null) {
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(sDKMetricType), b(), 4);
                        }
                        if (a18.equals("checkpoint.0")) {
                            a2 = this.b.b(a18, ((com.vungle.ads.internal.platform.c) this.g).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
                        } else {
                            boolean equals = a18.equals("video.length");
                            h0 h0Var = this.b;
                            a2 = equals ? h0.a(h0Var, a18, String.valueOf(this.y), 4) : h0.a(h0Var, a18, (String) null, 6);
                        }
                        if (a2 != null) {
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                c().a(new com.vungle.ads.internal.network.p((String) it.next()).b(a18).a(b()).a(), false);
                            }
                            Unit unit6 = Unit.a;
                        }
                        if (a18.equals("checkpoint.0") && !this.j) {
                            this.j = true;
                            a aVar5 = this.i;
                            if (aVar5 != null) {
                                aVar5.a("adViewed", null, this.c.b());
                                Unit unit7 = Unit.a;
                            }
                            Handler handler = com.vungle.ads.internal.util.y.a;
                            com.vungle.ads.internal.util.y.a(new i(this));
                            break;
                        }
                    } else {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 94756344:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                    a();
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 96784904:
                if (str.equals("error")) {
                    String a19 = com.vungle.ads.internal.util.r.a("code", cVar);
                    boolean parseBoolean2 = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("fatal", cVar));
                    String a20 = com.vungle.ads.internal.util.r.a("errorMessage", cVar);
                    Sdk.SDKError.Reason reason = parseBoolean2 ? Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR : Sdk.SDKError.Reason.MRAID_ERROR;
                    String i2 = wv8.i(a19, " : ", a20);
                    MraidTemplateError mraidTemplateError = new MraidTemplateError(reason, i2);
                    Handler handler2 = com.vungle.ads.internal.util.y.a;
                    com.vungle.ads.internal.util.y.a(new k(this, mraidTemplateError, parseBoolean2, i2));
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 133423073:
                if (str.equals("setOrientationProperties")) {
                    String a21 = com.vungle.ads.internal.util.r.a("forceOrientation", cVar);
                    if (a21 != null && a21.length() != 0) {
                        Locale locale = Locale.ENGLISH;
                        String k = com.appsflyer.internal.i.k(locale, a21, locale);
                        if (!k.equals(U3.i.C)) {
                            if (k.equals(U3.i.D)) {
                                this.a.setOrientation(7);
                                break;
                            }
                        } else {
                            this.a.setOrientation(6);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 592314818:
                if (str.equals("updateSignals")) {
                    String a22 = com.vungle.ads.internal.util.r.a("signals", cVar);
                    if (a22 != null && a22.length() != 0) {
                        ((com.vungle.ads.internal.signals.j) this.q.getValue()).b(a22);
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 1496446614:
                if (str.equals("getAvailableDiskSpace")) {
                    try {
                        Context context3 = this.a.getContext();
                        File noBackupFilesDir = context3.getNoBackupFilesDir();
                        PathProvider pathProvider = (PathProvider) this.p.getValue();
                        String path = noBackupFilesDir.getPath();
                        path.getClass();
                        pathProvider.getClass();
                        long a23 = PathProvider.a(path);
                        long a24 = com.vungle.ads.internal.util.z.a(context3);
                        Handler handler3 = com.vungle.ads.internal.util.y.a;
                        com.vungle.ads.internal.util.y.a(new l(this, a23, a24));
                        break;
                    } catch (Exception e) {
                        boolean z4 = com.vungle.ads.internal.util.u.a;
                        StringBuilder a25 = com.iab.omid.library.vungle.internal.l.a("Failed to get available disk space: ");
                        a25.append(e.getMessage());
                        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a25.toString());
                        return true;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 1614272768:
                break;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
        }
        return true;
    }

    public final com.vungle.ads.internal.util.s b() {
        return (com.vungle.ads.internal.util.s) this.v.getValue();
    }

    public final com.vungle.ads.internal.network.r c() {
        return (com.vungle.ads.internal.network.r) this.r.getValue();
    }

    public final void d() {
        if (this.w) {
            this.a.a("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final void f() {
        this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        int a;
        a aVar;
        IndexHtmlError indexHtmlError;
        int b;
        this.k.set(false);
        AdConfig j = this.b.j();
        if (j != null && (b = j.getB()) > 0) {
            this.w = (b & 2) == 2;
        }
        AdConfig j2 = this.b.j();
        Integer valueOf = j2 != null ? Integer.valueOf(j2.getAdOrientation()) : null;
        this.a.setOrientation((valueOf != null && valueOf.intValue() == 0) ? 7 : (valueOf != null && valueOf.intValue() == 1) ? 6 : 4);
        this.f.a();
        this.d.a((com.vungle.ads.internal.ui.view.o) this);
        this.d.a((com.vungle.ads.internal.ui.view.p) this);
        this.d.b(false);
        if (!this.b.G()) {
            String str5 = this.b.i;
            File file = str5 != null ? new File(str5) : null;
            if (file == null || !file.exists()) {
                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Fail to load html ");
                a2.append(file != null ? file.getPath() : null);
                indexHtmlError = new IndexHtmlError(reason, a2.toString());
            } else {
                this.a.a(this.d, this.b.v());
                com.vungle.ads.internal.ui.view.k kVar = this.a;
                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("file://");
                a3.append(file.getPath());
                kVar.a(a3.toString());
                indexHtmlError = null;
            }
            if (indexHtmlError != null) {
                indexHtmlError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                a aVar2 = this.i;
                if (aVar2 != null) {
                    aVar2.a(indexHtmlError, this.c.a);
                }
                a();
                return;
            }
        }
        this.m = Long.valueOf(System.currentTimeMillis());
        z zVar = this.s;
        this.n = zVar != null ? ((u1) zVar).r() : null;
        z zVar2 = this.s;
        if (zVar2 == null || (str = ((u1) zVar2).q()) == null) {
            str = "";
        }
        z zVar3 = this.s;
        if (zVar3 == null || (str2 = ((u1) zVar3).n()) == null) {
            str2 = "";
        }
        z zVar4 = this.s;
        if (zVar4 == null || (str3 = ((u1) zVar4).p()) == null) {
            str3 = "";
        }
        z zVar5 = this.s;
        if (zVar5 == null || (str4 = ((u1) zVar5).o()) == null) {
            str4 = "";
        }
        this.b.a(str, str2, str3, str4);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if ("unknown".equals(PrivacyManager.b())) {
                z2 = true;
                this.d.a(z2, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
                if (z2) {
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a("opted_out_by_timeout", "vungle_modal", "");
                }
                a = this.b.a(Boolean.valueOf(this.c.j()));
                if (a <= 0) {
                    ((com.vungle.ads.internal.util.o) this.u.getValue()).a(new mum(this, 0), a);
                } else {
                    this.w = true;
                }
                aVar = this.i;
                if (aVar == null) {
                    aVar.a("start", null, this.c.b());
                    return;
                }
                return;
            }
        }
        z2 = false;
        this.d.a(z2, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
        if (z2) {
        }
        a = this.b.a(Boolean.valueOf(this.c.j()));
        if (a <= 0) {
        }
        aVar = this.i;
        if (aVar == null) {
        }
    }

    public final void h() {
        Long l = this.m;
        if (l != null) {
            List b = this.b.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                    pVar.i = "ad.close";
                    pVar.j = b();
                    c().a(pVar.a(), false);
                }
            }
        }
    }

    public static final void c(r rVar) {
        rVar.getClass();
        rVar.h();
    }

    public static final void d(r rVar) {
        rVar.getClass();
        rVar.w = true;
    }

    public final void e() {
        a(new WebViewRenderProcessUnresponsive("fatal=true"), true, null);
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public final void a(z zVar) {
        this.s = zVar;
    }

    public final void a(com.vungle.ads.internal.ui.k kVar) {
        this.t = kVar;
    }

    public final void a(int i) {
        long j;
        AdSession adSession;
        a aVar;
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "detach()");
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        com.vungle.ads.internal.ui.z zVar = this.d;
        zVar.q = null;
        zVar.o = null;
        if (!z3 && z4 && !this.k.getAndSet(true) && (aVar = this.i) != null) {
            aVar.a(TtmlNode.END, null, this.c.a);
        }
        com.vungle.ads.internal.omsdk.e eVar = this.f;
        if (!eVar.b || (adSession = eVar.c) == null) {
            j = 0;
        } else {
            adSession.finish();
            j = com.vungle.ads.internal.omsdk.e.d;
        }
        eVar.b = false;
        eVar.c = null;
        this.a.a(j);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "user interaction");
            this.h = System.currentTimeMillis();
            ((p0) this.x.getValue()).a(motionEvent);
        }
    }

    public final void a() {
        if (com.vungle.ads.internal.util.y.a()) {
            this.e.execute(new mum(this, 1));
        } else {
            h();
        }
        com.vungle.ads.internal.util.y.a(new e(this));
    }

    public final void a(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new h(this));
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        m2Var.c = 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.a(m2Var, b(), str);
        analyticsClient.c(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), b());
    }

    public final void a(boolean z2, String str) {
        str.getClass();
        if (z2) {
            WebViewError webViewError = new WebViewError(str);
            webViewError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(webViewError, this.c.a);
            }
            a();
        }
    }

    public final void a(VungleError vungleError, boolean z2, String str) {
        boolean z3 = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("handleWebViewException: ");
        a.append(vungleError.getLocalizedMessage());
        a.append(", fatal: ");
        a.append(z2);
        a.append(", errorMsg: ");
        a.append(str);
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a.toString());
        vungleError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        if (z2) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(vungleError, this.c.a);
            }
            a();
        }
    }
}
