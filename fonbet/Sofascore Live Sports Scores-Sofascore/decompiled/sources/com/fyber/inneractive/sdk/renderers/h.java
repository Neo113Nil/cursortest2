package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.g0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h implements g0 {
    public final /* synthetic */ n a;

    public h(n nVar) {
        this.a = nVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z) {
        s0 s0Var;
        l0 l0Var;
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(nVar), Boolean.valueOf(z));
        n nVar2 = this.a;
        if (!z) {
            d dVar = nVar2.y;
            if (dVar != null && dVar.g) {
                dVar.g = false;
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
            }
            this.a.d(false);
            return;
        }
        if (nVar2.o) {
            d dVar2 = nVar2.y;
            if (dVar2 != null && !dVar2.h && !dVar2.g && dVar2.f != 0) {
                dVar2.f = 0L;
                dVar2.g = true;
                dVar2.a();
            }
            this.a.N();
            return;
        }
        IAlog.a("%sonShownForTheFirstTime called", IAlog.a(nVar2));
        com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).b : null;
        if (eVar != null) {
            IAmraidWebViewController iAmraidWebViewController = nVar2.m;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.l();
            }
            String str = eVar.k;
            if (str != null && str.trim().length() > 0) {
                IAlog.e("%sfiring impression!", IAlog.a(nVar2));
                IAlog.d("AD_IMPRESSION", new Object[0]);
                z0.b(str);
            }
            nVar2.E();
        }
        long K = nVar2.K();
        nVar2.k = K;
        if (K != 0) {
            nVar2.a(true, K);
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = nVar2.b;
        if (xVar2 != null && (s0Var = ((q0) xVar2).d) != null && (l0Var = ((r0) s0Var).c) != null) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = l0Var.b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
            com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.N.w.a;
            if (eVar2 != null) {
                com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
            }
        }
        this.a.o = true;
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        this.a.d(true);
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(nVar));
        n nVar2 = this.a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(nVar2.a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar));
        n nVar2 = this.a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(nVar2.a);
        }
        n nVar3 = this.a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar3));
        this.a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        n nVar = this.a;
        nVar.w();
        nVar.c(false);
        this.a.F();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar));
        n nVar2 = this.a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(nVar2.a);
        }
        this.a.N();
        n nVar3 = this.a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        String str2;
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(nVar));
        ViewGroup viewGroup = this.a.p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.a : this.a.p.getContext();
        if (context != null) {
            n nVar2 = this.a;
            if (nVar2.f) {
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).b : null;
                if (eVar != null && (str2 = eVar.l) != null && str2.trim().length() > 0) {
                    IAlog.d("AD_CLICKED", new Object[0]);
                    z0.b(str2);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.a.b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).d) != null && (l0Var = ((r0) s0Var).c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                    if (l0Var.b == UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.N.w.a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                }
                return this.a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        n nVar = this.a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(nVar));
        ViewGroup viewGroup = this.a.p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        n nVar2 = this.a;
        if (!nVar2.v) {
            com.fyber.inneractive.sdk.network.b0.a(nVar2.p.getContext(), str, str2, this.a.b);
            n nVar3 = this.a;
            nVar3.v = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(nVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(nVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(com.fyber.inneractive.sdk.util.o.a(this.a.x()), str);
        if (startRichMediaIntent) {
            n nVar = this.a;
            if (nVar.c != null) {
                nVar.c(false);
            }
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        n nVar = this.a;
        InneractiveUnitController.EventsListener eventsListener = nVar.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(nVar.a, mraidVideoFailedToDisplayError);
        }
    }
}
