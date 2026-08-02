package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import defpackage.kql;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {
    public InneractiveAdSpot a;
    public x b;
    public InneractiveUnitController.EventsListener c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public Runnable g;
    public com.fyber.inneractive.sdk.click.r h;
    public z i;
    public View j;

    public final boolean A() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.b;
        if (xVar == null || (rVar = xVar.c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.b.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        cVar.getClass();
        return new ArrayList(cVar.c.values()).size() > 0;
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        x xVar = this.b;
        if (xVar != null) {
            return xVar.b();
        }
        return true;
    }

    public boolean D() {
        return this instanceof com.fyber.inneractive.sdk.renderers.c0;
    }

    public final void E() {
        com.fyber.inneractive.sdk.response.e eVar;
        w();
        if (this.e || this.c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.c.onAdImpression(this.a);
        x xVar = this.b;
        if (xVar != null && (eVar = xVar.b) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.w;
            if (x0Var != null) {
                UnitDisplayType unitDisplayType = eVar.n;
                ImpressionData impressionData = eVar.r;
                x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVar.x);
                if (this.b.isVideoAd()) {
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
            }
            com.fyber.inneractive.sdk.util.y0 y0Var = iAConfigManager.z;
            com.fyber.inneractive.sdk.config.s0 s0Var = this.b.d;
            ImpressionData impressionData2 = eVar.r;
            if (s0Var != null) {
                OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.a;
                if (onGlobalImpressionDataListener != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    onGlobalImpressionDataListener.onImpression(r0Var.b, r0Var.a, impressionData2);
                }
            } else {
                y0Var.getClass();
            }
            InneractiveUnitController.EventsListener eventsListener = this.c;
            if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.a, eVar.r);
            } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.a, eVar.r);
            }
        }
        this.e = true;
    }

    public final void F() {
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.c.onAdWillOpenExternalApp(this.a);
        }
    }

    public void G() {
        View x = x();
        if (x == null || this.j == null || x.getParent() == null || !(x.getParent() instanceof ViewGroup)) {
            return;
        }
        x.getLayoutParams();
        ((ViewGroup) x.getParent()).removeView(this.j);
        e(this.j);
        this.j = null;
    }

    public final void H() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        String str = eVar.o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z, com.fyber.inneractive.sdk.click.o oVar) {
        String str2;
        String str3;
        boolean z2;
        com.fyber.inneractive.sdk.click.r rVar;
        com.fyber.inneractive.sdk.web.v0 a;
        x xVar;
        com.fyber.inneractive.sdk.click.r rVar2;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        if (!z && (!this.f || this.d)) {
            String str4 = this.d ? "external/browser is already open" : "click is in grace period";
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str4);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception(str4));
        }
        if (context != null) {
            IAlog.a("%sBlocking clicks until grace has ended", IAlog.a(this));
            this.f = false;
            Runnable runnable = this.g;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            }
            a0 a0Var = new a0(this);
            this.g = a0Var;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(a0Var, 1000L);
        }
        float f = g1Var.a;
        c(z);
        if (TextUtils.isEmpty(str)) {
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new Object[0]);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("empty url"));
        }
        x xVar2 = this.b;
        if (xVar2 != null && (eVar2 = xVar2.b) != null && eVar2.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.N.D;
            if (hVar.f) {
                hVar.a((kql) null);
            }
        }
        this.i = new z(this, g1Var, gVar, oVar);
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme != null && scheme.equals("fybernativebrowser") && host != null && host.equals("navigate")) {
                str2 = parse.getQueryParameter("url");
                String scheme2 = TextUtils.isEmpty(str) ? Uri.parse(str).getScheme() : null;
                if (TextUtils.isEmpty(str2)) {
                    str3 = str2;
                } else {
                    str3 = str;
                    if (!str3.contains("FYBER_OPEN_BROWSER")) {
                        z2 = true;
                        if (str3.contains("[IS_CTA_CLICK]")) {
                            str3 = str3.replace("[IS_CTA_CLICK]", String.valueOf(B() && gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA));
                        }
                        String str5 = str3;
                        if (x() != null) {
                            v();
                        }
                        rVar = this.h;
                        if (rVar != null) {
                            rVar.f = true;
                            Iterator it = rVar.j.iterator();
                            while (it.hasNext()) {
                                ((com.fyber.inneractive.sdk.click.a) it.next()).a();
                            }
                            rVar.j.clear();
                            h1 h1Var = rVar.i;
                            if (h1Var != null) {
                                h1Var.a = true;
                            }
                            com.fyber.inneractive.sdk.util.z0 z0Var = rVar.a;
                            z0Var.c = false;
                            com.fyber.inneractive.sdk.config.e eVar3 = IAConfigManager.N.w.b;
                            if (eVar3 != null) {
                                eVar3.a.remove(z0Var);
                            }
                            rVar.e = null;
                            this.h = null;
                        }
                        com.fyber.inneractive.sdk.click.r rVar3 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
                        rVar3.j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
                        this.h = rVar3;
                        x xVar3 = this.b;
                        a = xVar3 != null ? xVar3.a() : null;
                        if (a != null) {
                            a.i = this;
                        }
                        x xVar4 = this.b;
                        boolean z3 = xVar4 == null && xVar4.a(g1Var.c, gVar);
                        xVar = this.b;
                        if (xVar != null && xVar.b != null) {
                            xVar.e();
                        }
                        rVar2 = this.h;
                        if (rVar2 != null) {
                            z zVar = this.i;
                            x xVar5 = this.b;
                            com.fyber.inneractive.sdk.ignite.m mVar = (xVar5 == null || (eVar = xVar5.b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.E;
                            InneractiveAdSpot inneractiveAdSpot = this.a;
                            rVar2.a(context, str5, zVar, a, z3, mVar, inneractiveAdSpot != null ? inneractiveAdSpot.getLocalUniqueId() : null);
                        }
                        com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
                        context.getClass();
                        return new com.fyber.inneractive.sdk.util.d0(g0Var, null);
                    }
                }
                z2 = false;
                if (str3.contains("[IS_CTA_CLICK]")) {
                }
                String str52 = str3;
                if (x() != null) {
                }
                rVar = this.h;
                if (rVar != null) {
                }
                com.fyber.inneractive.sdk.click.r rVar32 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
                rVar32.j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
                this.h = rVar32;
                x xVar32 = this.b;
                if (xVar32 != null) {
                }
                if (a != null) {
                }
                x xVar42 = this.b;
                if (xVar42 == null) {
                }
                xVar = this.b;
                if (xVar != null) {
                    xVar.e();
                }
                rVar2 = this.h;
                if (rVar2 != null) {
                }
                com.fyber.inneractive.sdk.util.g0 g0Var2 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
                context.getClass();
                return new com.fyber.inneractive.sdk.util.d0(g0Var2, null);
            }
        }
        str2 = null;
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
        z2 = false;
        if (str3.contains("[IS_CTA_CLICK]")) {
        }
        String str522 = str3;
        if (x() != null) {
        }
        rVar = this.h;
        if (rVar != null) {
        }
        com.fyber.inneractive.sdk.click.r rVar322 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
        rVar322.j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
        this.h = rVar322;
        x xVar322 = this.b;
        if (xVar322 != null) {
        }
        if (a != null) {
        }
        x xVar422 = this.b;
        if (xVar422 == null) {
        }
        xVar = this.b;
        if (xVar != null) {
        }
        rVar2 = this.h;
        if (rVar2 != null) {
        }
        com.fyber.inneractive.sdk.util.g0 g0Var22 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new com.fyber.inneractive.sdk.util.d0(g0Var22, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if ((r10 != null ? r10.booleanValue() : true) != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.config.global.r rVar2;
        com.fyber.inneractive.sdk.config.global.r rVar3;
        x xVar = this.b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        JSONArray b = (xVar == null || (rVar3 = xVar.c) == null) ? null : rVar3.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = b;
        com.fyber.inneractive.sdk.network.x xVar2 = new com.fyber.inneractive.sdk.network.x();
        int z = z();
        int y = y();
        long j = bVar.e;
        if (j != 0) {
            xVar2.a(Long.valueOf(j), "time_passed");
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = bVar.f.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", jVar.a);
                jSONObject.put("success", jVar.b);
                jSONObject.put("opened_by", jVar.c);
                jSONObject.put("reason", jVar.d);
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        xVar2.a(jSONArray, "urls");
        xVar2.a(gVar, "origin");
        if (gVar == com.fyber.inneractive.sdk.util.g.FMP_ENDCARD) {
            xVar2.a(gVar.a(), "version");
        }
        if (g1Var != null && g1Var.c) {
            xVar2.a(Boolean.TRUE, "is_auto_click");
        }
        if (g1Var != null) {
            float f = g1Var.a;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && g1Var.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int b2 = C() ? z : com.fyber.inneractive.sdk.util.o.b(z);
                float f3 = b2 == 0 ? 0.0f : g1Var.a / b2;
                int b3 = C() ? y : com.fyber.inneractive.sdk.util.o.b(y);
                if (b3 != 0) {
                    f2 = g1Var.b / b3;
                }
                IAlog.a("Point location -  x - %.2f , y- %.2f", Float.valueOf(f3), Float.valueOf(f2));
                C();
                Locale locale = Locale.ENGLISH;
                com.fyber.inneractive.sdk.network.x a = xVar2.a(String.format(locale, "%.2f", Float.valueOf(f3)), "td_x");
                C();
                a.a(String.format(locale, "%.2f", Float.valueOf(f2)), "td_y");
            }
        }
        if (C() || D()) {
            xVar2.a(com.fyber.inneractive.sdk.util.o.c() == 1 ? TtmlNode.TAG_P : "l", "o");
        } else if (z > 0 || y > 0) {
            xVar2.a(Integer.valueOf(z), "b_w");
            xVar2.a(Integer.valueOf(y), "b_h");
        }
        x xVar3 = this.b;
        com.fyber.inneractive.sdk.config.global.features.d dVar = (xVar3 == null || (rVar2 = xVar3.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.d) rVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
        if (dVar != null) {
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
            if (aVar != null ? aVar.d : false) {
                if (!com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD.equals(gVar) && !com.fyber.inneractive.sdk.util.g.VIDEO_CTA.equals(gVar)) {
                    if (com.fyber.inneractive.sdk.util.g.VIDEO_CLICK.equals(gVar)) {
                        x xVar4 = this.b;
                        com.fyber.inneractive.sdk.config.global.features.v vVar = (xVar4 == null || (rVar = xVar4.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
                        if (vVar != null) {
                            Boolean c = vVar.c("show_cta");
                        }
                    }
                }
                xVar2.a(IAConfigManager.N.o, "cta_lng");
            }
        }
        wVar.f.put(xVar2.a);
        wVar.a((String) null);
    }

    public final void c(boolean z) {
        com.fyber.inneractive.sdk.response.e eVar;
        if (z) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.c.onAdClicked(this.a);
        }
        x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        IAConfigManager.N.w.a(eVar.n, "LAST_CLICKED", "1");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.d = false;
        }
        Runnable runnable = this.g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.g = null;
        }
        this.b = null;
        this.c = null;
        this.a = null;
        if (this.h != null) {
            G();
            com.fyber.inneractive.sdk.click.r rVar = this.h;
            rVar.f = true;
            Iterator it = rVar.j.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).a();
            }
            rVar.j.clear();
            h1 h1Var = rVar.i;
            if (h1Var != null) {
                h1Var.a = true;
            }
            com.fyber.inneractive.sdk.util.z0 z0Var = rVar.a;
            z0Var.c = false;
            com.fyber.inneractive.sdk.config.e eVar = IAConfigManager.N.w.b;
            if (eVar != null) {
                eVar.a.remove(z0Var);
            }
            rVar.e = null;
            this.h = null;
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = inneractiveAdSpot.getAdContent();
        this.c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public final com.fyber.inneractive.sdk.ignite.m o() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.b;
        return (xVar == null || !xVar.c() || (eVar = this.b.b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.E;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        F();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.d) {
            this.d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.c.onAdWillCloseInternalBrowser(this.a);
        }
    }

    public void t() {
        E();
    }

    public void v() {
        View x = x();
        if (x == null || x.getParent() == null || !(x.getParent() instanceof ViewGroup) || this.j != null) {
            return;
        }
        View inflate = View.inflate(x.getContext(), R.layout.ia_layout_click_overlay, null);
        this.j = inflate;
        if (inflate != null) {
            ((ViewGroup) x.getParent()).addView(this.j, x.getLayoutParams());
            d(this.j);
        }
    }

    public Context w() {
        return com.fyber.inneractive.sdk.util.o.a(x());
    }

    public abstract View x();

    public int y() {
        return -1;
    }

    public int z() {
        return -1;
    }

    public void d(View view) {
    }

    public void e(View view) {
    }

    public final Context c(View view) {
        View view2;
        View[] viewArr = {view, x()};
        int i = 0;
        while (true) {
            if (i >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i];
            if (view2 != null) {
                break;
            }
            i++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        JSONArray jSONArray;
        com.fyber.inneractive.sdk.response.e eVar;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.b;
        if (xVar != null) {
            eVar = xVar.b;
            inneractiveAdRequest = xVar.a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar.c;
            jSONArray = rVar != null ? rVar.b() : null;
        } else {
            jSONArray = null;
            eVar = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.a : null, xVar != null ? xVar.b : null);
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.c.onAdEnteredErrorState(this.a, webViewRendererProcessHasGoneError);
        }
    }
}
