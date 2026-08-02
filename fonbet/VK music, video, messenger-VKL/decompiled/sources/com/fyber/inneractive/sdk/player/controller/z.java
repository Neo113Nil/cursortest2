package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes12.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {
    public final com.fyber.inneractive.sdk.player.f a;
    public final s0 b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.player.ui.s d;
    public x e;
    public g0 g;
    public Runnable j;
    public boolean k;
    public u m;
    public final boolean n;
    public com.fyber.inneractive.sdk.player.ui.g u;
    public final String v;
    public int f = 0;
    public boolean h = false;
    public float i = -0.1f;
    public boolean l = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public com.fyber.inneractive.sdk.ignite.m t = com.fyber.inneractive.sdk.ignite.m.NONE;
    public boolean w = false;
    public boolean y = false;
    public final Skip x = null;

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, String str) {
        q qVar;
        this.a = fVar;
        this.b = s0Var;
        this.c = rVar;
        this.d = sVar;
        this.n = z;
        this.v = str;
        sVar.setListener(this);
        if (fVar == null || (qVar = fVar.a) == null) {
            return;
        }
        if (!qVar.b.contains(this)) {
            qVar.b.add(this);
        }
        q qVar2 = fVar.a;
        if (qVar2.c.contains(this)) {
            return;
        }
        qVar2.c.add(this);
    }

    public abstract boolean A();

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.b;
        boolean z = (s0Var == null || (t0Var = ((r0) s0Var).f) == null || t0Var.j != UnitDisplayType.REWARDED) ? false : true;
        boolean a = x0.a(this.a).a();
        if ((!InneractiveAdManager.isCurrentUserAChild() && !a) || !z || this.d == null || (fVar = this.a) == null || (qVar = fVar.a) == null) {
            return false;
        }
        int b = qVar.b() / 1000;
        return (this.a.a.c() / 1000) - b <= 0 || b < l();
    }

    public void C() {
        Boolean c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        com.fyber.inneractive.sdk.config.global.features.v vVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) : null;
        boolean booleanValue = (vVar == null || (c = vVar.c("show_cta")) == null) ? true : c.booleanValue();
        g0 g0Var = this.g;
        if (g0Var != null) {
            this.t = g0Var.o();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.t;
        this.d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? booleanValue : true, mVar);
    }

    public final void D() {
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        this.d.i();
        com.fyber.inneractive.sdk.flow.endcard.k j = j();
        com.fyber.inneractive.sdk.flow.endcard.b a = j != null ? j.a() : null;
        boolean z2 = x0.a(this.a).a >= 0;
        if (a == null) {
            if (e() || (g0Var = this.g) == null) {
                return;
            }
            g0Var.i();
            return;
        }
        a(a);
        if (n() == null || z2) {
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.b n = n();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = n.d;
        if (bVar == null || (cVar = bVar.c) == null || !(z = cVar.e)) {
            n.a.a();
            n.a();
            n.a((n.d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
            return;
        }
        bVar.i = j;
        if (!z || (cVar2 = bVar.d) == null || bVar.g) {
            return;
        }
        if (cVar2.b == null || (view2 = cVar2.a) == null || view2.getParent() == null || cVar2.b.getVisibility() != 0) {
            com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar.d;
            if (cVar4.b == null || cVar4.a == null) {
                IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                return;
            }
            cVar4.a();
            com.fyber.inneractive.sdk.util.v.a(cVar4.b);
            sVar.addView(cVar4.b);
            cVar4.a.setAnimation(cVar4.c);
            cVar4.b.setVisibility(0);
            com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = cVar4.f;
            if (bVar2 != null) {
                com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = bVar2.d;
                com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar4 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar3 == null || (cVar3 = bVar3.d) == null || cVar3.b == null || (view = cVar3.a) == null || view.getParent() == null || cVar3.b.getVisibility() != 0) ? false : true, bVar2.i);
                Iterator it = bVar2.h.iterator();
                while (it.hasNext()) {
                    ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar4);
                }
                JSONObject jSONObject = new JSONObject();
                Integer valueOf = Integer.valueOf(bVar2.g);
                try {
                    jSONObject.put("screenshots", valueOf);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", valueOf);
                }
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                InneractiveAdRequest inneractiveAdRequest = bVar2.c;
                com.fyber.inneractive.sdk.response.e eVar = bVar2.b;
                String str = bVar2.f;
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                try {
                    jSONObject.put("templateURL", str);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                }
                wVar.f.put(jSONObject);
                wVar.a((String) null);
            }
        }
    }

    public void E() {
        boolean z;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (((qVar2 = fVar.a) != null && qVar2.e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.q)) {
            fVar.a();
        }
        boolean a = IAConfigManager.N.t.b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.a;
        sVar.e((fVar2 == null || (qVar = fVar2.a) == null || qVar.e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z = this.q) && !a) || this.r || (z && a)));
    }

    public void a() {
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null) {
            return false;
        }
        if (this.h || fVar.a == null) {
            return true;
        }
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        if (sVar == null || !sVar.a()) {
            return com.fyber.inneractive.sdk.player.f.a(this.a) && !this.h && this.f == 0;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.o && !this.l) {
            this.l = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (qVar = fVar.a) != null) {
            qVar.b.remove(this);
            this.a.a.c.remove(this);
        }
        g();
        Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        this.g = null;
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k j = j();
        if (j != null) {
            com.fyber.inneractive.sdk.response.g gVar = j.a.d;
            if (!((gVar == null || (str = gVar.B) == null || !TextUtils.equals(str, "1")) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (qVar = fVar.a) != null) {
            qVar.b(z);
        }
        this.d.setMuteButtonState(true);
    }

    public void g() {
        if (this.u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    public void h(boolean z) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null) {
            if (!fVar.g) {
                E();
                return;
            }
            if (z && (qVar = fVar.a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (qVar = fVar.a) != null) {
            qVar.d(z);
        }
        this.d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).u;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final int l() {
        int i;
        try {
            i = Integer.parseInt(IAConfigManager.N.t.b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i = 30;
        }
        if (i < 1) {
            return 30;
        }
        return i;
    }

    public final float m() {
        try {
            return ((AudioManager) this.d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).w;
        }
        return null;
    }

    public abstract int o();

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        return (fVar == null || (qVar = fVar.a) == null || (!qVar.g() && ((double) m()) != ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) ? false : true;
    }

    public final void q() {
        this.d.a(true);
        this.d.e(false);
        Runnable runnable = this.j;
        if (runnable == null) {
            if (runnable == null) {
                this.j = new t(this);
            }
            int i = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i));
            this.d.postDelayed(this.j, i);
        }
    }

    public abstract void r();

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public abstract void t();

    public void u() {
        Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        this.d.a(false);
        E();
    }

    public abstract void v();

    public void x() {
        q qVar;
        this.d.a(false);
        this.d.e(false);
        Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && A() && !this.h && com.fyber.inneractive.sdk.player.f.a(fVar)) {
            if (this.f <= 0) {
                this.d.g(true);
                h();
            } else {
                com.fyber.inneractive.sdk.player.f fVar2 = this.a;
                if (fVar2 != null && (qVar = fVar2.a) != null) {
                    if (this.f >= qVar.c() / 1000) {
                        this.d.g(false);
                    }
                }
                if (!this.p) {
                    this.d.g(true);
                    b(this.f);
                    this.p = true;
                }
            }
        }
        g0 g0Var = this.g;
        if (g0Var != null && !this.k) {
            this.k = true;
            g0Var.j();
        }
        this.q = false;
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && fVar.a != null && (gVar = this.u) != null) {
            gVar.invalidate();
            this.u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null || (qVar = fVar.a) == null) {
            return;
        }
        if (qVar.e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.d);
        TextureView textureView = qVar.j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        i1 i1Var;
        IAlog.a("IAVideoUIControllerBase: showEndCard: dismiss time: %d sec.", Integer.valueOf(bVar.f));
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar2 = new com.fyber.inneractive.sdk.player.ui.b(a(cVar.d()));
            if (bVar2.a) {
                com.fyber.inneractive.sdk.web.b0 k = k();
                com.fyber.inneractive.sdk.flow.endcard.a aVar = (com.fyber.inneractive.sdk.flow.endcard.a) cVar.f();
                if ((aVar instanceof com.fyber.inneractive.sdk.flow.endcard.u) && (i1Var = ((com.fyber.inneractive.sdk.flow.endcard.u) aVar).e().a) != null) {
                    i1Var.setListener(k);
                }
                this.d.e(false);
                this.d.a(cVar, bVar2);
                ViewGroup viewGroup = this.d.m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.o) {
            com.fyber.inneractive.sdk.flow.endcard.o oVar = (com.fyber.inneractive.sdk.flow.endcard.o) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar3 = new com.fyber.inneractive.sdk.player.ui.b(a(oVar.d()));
            if (bVar3.a) {
                com.fyber.inneractive.sdk.web.b0 k2 = k();
                i1 i1Var2 = ((com.fyber.inneractive.sdk.flow.endcard.p) oVar.f()).e().a;
                if (i1Var2 != null) {
                    i1Var2.setListener(k2);
                }
                this.d.a(oVar, bVar3);
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.d) {
            com.fyber.inneractive.sdk.flow.endcard.d dVar = (com.fyber.inneractive.sdk.flow.endcard.d) bVar;
            com.fyber.inneractive.sdk.player.ui.c d = dVar.d();
            String str = this.v;
            if (str == null) {
                com.fyber.inneractive.sdk.config.global.r rVar = this.c;
                if (rVar != null) {
                    com.fyber.inneractive.sdk.config.global.features.d dVar2 = (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class);
                    dVar2.d(IAConfigManager.N.o);
                    com.fyber.inneractive.sdk.model.vast.a aVar2 = dVar2.e;
                    if (aVar2 != null && aVar2.d) {
                        str = aVar2.a;
                    }
                }
                str = null;
            }
            d.c = str;
            com.fyber.inneractive.sdk.player.ui.b bVar4 = new com.fyber.inneractive.sdk.player.ui.b(a(d));
            if (bVar4.a) {
                this.d.e(false);
                this.d.a(dVar, bVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0103, code lost:
    
        if (r1.e == com.fyber.inneractive.sdk.player.enums.b.Completed) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010a, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010e, code lost:
    
        if (r7.r != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        int i;
        com.fyber.inneractive.sdk.measurement.f fVar2;
        q qVar2;
        s0 s0Var;
        t0 t0Var2;
        boolean z2 = true;
        this.q = true;
        com.fyber.inneractive.sdk.config.x0 x0Var = IAConfigManager.N.w;
        if (z && x0Var != null && (s0Var = this.b) != null && (t0Var2 = ((r0) s0Var).f) != null) {
            x0Var.a(t0Var2.j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.a;
        if (fVar3 != null && (qVar2 = fVar3.a) != null) {
            qVar2.k();
            this.a.a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar4 = this.a;
        if (fVar4 != null && z && (fVar2 = fVar4.e) != null && fVar2.c != null) {
            IAlog.a("%s skipped", "OMVideo");
            try {
                fVar2.c.skipped();
            } catch (Throwable th) {
                fVar2.a(th);
            }
        }
        if (!this.d.c()) {
            this.d.a(false);
            Runnable runnable = this.j;
            if (runnable != null) {
                this.d.removeCallbacks(runnable);
                this.j = null;
            }
            this.k = false;
            this.h = true;
            s0 s0Var2 = this.b;
            if (s0Var2 != null && (t0Var = ((r0) s0Var2).f) != null && t0Var.j == UnitDisplayType.REWARDED && this.g != null) {
                com.fyber.inneractive.sdk.player.f fVar5 = this.a;
                q qVar3 = fVar5 != null ? fVar5.a : null;
                if ((fVar5 != null ? fVar5.a : null) != null) {
                    i = (fVar5 != null ? fVar5.a : null).b();
                } else {
                    i = -1;
                }
                boolean z3 = this.q;
                if (z3 && this.a != null && qVar3 != null) {
                    int b = qVar3.b();
                    int c = qVar3.c() - b;
                    int l = l() * 1000;
                    if (c > 0 && b < l) {
                        this.y = true;
                    } else {
                        this.g.a(i, this.q);
                    }
                } else {
                    this.g.a(i, z3);
                }
            }
        }
        if (z) {
            boolean a = IAConfigManager.N.t.b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
            x0 a2 = x0.a(this.a);
            boolean z4 = a2.a >= 0 && a2.b <= -1;
            if (!a && !z4) {
                z2 = false;
            }
            com.fyber.inneractive.sdk.player.f fVar6 = this.a;
            if (fVar6 != null) {
                q qVar4 = fVar6.a;
                if (qVar4 != null) {
                }
            }
            if (this.q) {
            }
        }
        D();
        g0 g0Var = this.g;
        if (g0Var != null && (this.f <= 0 || this.h || ((fVar = this.a) != null && (qVar = fVar.a) != null && qVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed))) {
            g0Var.a(z);
        }
        g();
    }

    public void g(boolean z) {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        Context context = this.d.getContext();
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new ArrayList(cVar2.c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
                new f0(context, cVar, new v(this, z)).b.show();
            }
        }
        cVar = null;
        new f0(context, cVar, new v(this, z)).b.show();
    }

    public final void e(boolean z) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null || (qVar = fVar.a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.e;
        if (z && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.d.c()) {
            h(false);
            return;
        }
        if (!z && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.d.c()) {
            int b = qVar.b();
            int c = qVar.c();
            if (b <= 0 || b > c) {
                return;
            }
            qVar.a(b - 1, false);
            qVar.a(b, false);
        }
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.d);
            this.u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.a;
            if (fVar2 != null && (fVar = fVar2.e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                AdSession adSession = fVar.a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (Throwable th) {
                        fVar.a(th);
                    }
                }
                if (fVar.a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th2) {
                                fVar.a(th2);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                if (this.d.getWatermarkView() != null) {
                    View watermarkView = this.d.getWatermarkView();
                    AdSession adSession2 = fVar.a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(watermarkView, FriendlyObstructionPurpose.NOT_VISIBLE, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark.name());
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.d.getTextureHost());
        if (this.u != null && this.d.getTextureHost().equals(this.u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.a;
        if (fVar3 != null && (qVar2 = fVar3.a) != null) {
            qVar2.a(this.u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.d.getTextureHost().addView(this.u, layoutParams);
        }
        this.l = false;
        x xVar = new x(this);
        this.e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.a;
        if (fVar4 == null || (qVar = fVar4.a) == null) {
            return;
        }
        qVar.d = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null || fVar.a == null) {
            return;
        }
        this.d.setUnitConfig(this.b);
        this.d.a(this.n, this.a.a.f(), this.a.a.e());
        if (A()) {
            this.f = o();
        } else {
            this.d.g(false);
        }
        if (!z) {
            a(this.a.a.b());
            a(this.a.a.e, false);
        }
        this.d.setMuteButtonState(p());
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.N.o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.b;
                }
            }
            if (TextUtils.isEmpty(this.v) && str != null) {
                this.d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.d.h();
            this.f = 0;
            g0 g0Var = this.g;
            if (g0Var != null) {
                g0Var.c();
            }
        }
    }

    public void w() {
    }

    public final void b(int i) {
        if (this.d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.N.o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.c;
                }
            }
            if (TextUtils.isEmpty(this.v) && str != null) {
                this.d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
            } else {
                this.d.setSkipText(String.valueOf(i));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).w) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.k) {
                bVar.h.remove(aVar);
            }
            return;
        }
        IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.h = this.a != null && com.fyber.inneractive.sdk.player.f.a(this.c, this.t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        com.fyber.inneractive.sdk.config.global.features.o oVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) : null;
        if (oVar != null) {
            string = oVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.i = string;
        cVar.g = this.t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z) {
        g0 g0Var;
        int i;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.a[bVar.ordinal()]) {
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z2));
                    q();
                    break;
                }
                break;
            case 2:
                if (this.o) {
                    E();
                    w();
                    break;
                }
                break;
            case 3:
                if (this.o) {
                    this.w = true;
                    q();
                    break;
                }
                break;
            case 4:
                if (this.w) {
                    this.w = false;
                }
                if (this.o) {
                    x();
                    break;
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.o || (!e() && !this.s)) {
                    this.s = true;
                    if (!this.d.c()) {
                        this.d.a(false);
                        Runnable runnable = this.j;
                        if (runnable != null) {
                            this.d.removeCallbacks(runnable);
                            this.j = null;
                        }
                        E();
                        D();
                        this.k = false;
                        this.h = true;
                    }
                    if (z && (g0Var = this.g) != null) {
                        boolean z3 = this.q;
                        com.fyber.inneractive.sdk.player.f fVar = this.a;
                        if ((fVar != null ? fVar.a : null) != null) {
                            i = (fVar != null ? fVar.a : null).b();
                        } else {
                            i = -1;
                        }
                        g0Var.a(i, z3);
                        break;
                    }
                }
                break;
            case 7:
                if (this.o || ((sVar = this.d) != null && sVar.isShown())) {
                    s();
                    break;
                }
                break;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i) {
        s0 s0Var;
        t0 t0Var;
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null || fVar.a == null) {
            return;
        }
        float m = m();
        com.fyber.inneractive.sdk.player.f fVar2 = this.a;
        if (fVar2 != null && (qVar = fVar2.a) != null && qVar.h()) {
            float f = this.i;
            if (m != f) {
                if (m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && p()) {
                    i(true);
                } else if (m == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    f(true);
                }
            }
            this.d.setMuteButtonState(p());
        }
        this.i = m;
        int c = this.a.a.c();
        int b = this.a.a.b();
        int i2 = b / 1000;
        int i3 = c / 1000;
        int i4 = i3 - i2;
        if (i4 < 0 || (!this.a.a.h() && b == c)) {
            i4 = 0;
        }
        g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.onProgress(c, b);
        }
        if (this.d.l()) {
            return;
        }
        this.d.setRemainingTime(Integer.toString(i4));
        if (this.f < i3) {
            com.fyber.inneractive.sdk.player.f fVar3 = this.a;
            if (A() && !this.h && com.fyber.inneractive.sdk.player.f.a(fVar3)) {
                int i5 = this.f;
                if (i2 < i5) {
                    b(i5 - i2);
                } else {
                    this.f = 0;
                    h();
                }
                this.d.g(true);
            } else {
                this.d.g(false);
            }
        } else {
            this.d.g(false);
            b(i4);
        }
        if (this.a.a.e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            this.d.a(c, b);
            int l = l();
            if (i3 <= l || i2 <= l || (s0Var = this.b) == null || (t0Var = ((r0) s0Var).f) == null || t0Var.j != UnitDisplayType.REWARDED) {
                return;
            }
            h();
            this.d.g(true);
        }
    }

    public final void a(String str) {
        t0 t0Var;
        com.fyber.inneractive.sdk.config.x0 x0Var = IAConfigManager.N.w;
        s0 s0Var = this.b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f) == null) {
            return;
        }
        x0Var.a(t0Var.j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        int i;
        Application application;
        if (this.o == z || (fVar = this.a) == null || fVar.a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z), this.d);
        if (z) {
            this.o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.a.a.e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.d.c()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.a;
                        if (!fVar2.j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.q, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.j = true;
                        }
                        f();
                        if (this.m != null || (application = com.fyber.inneractive.sdk.util.o.a) == null) {
                            return;
                        }
                        u uVar = new u(this);
                        this.m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.s) {
                this.s = true;
                if (!this.y) {
                    if (!this.d.c()) {
                        this.d.a(false);
                        Runnable runnable = this.j;
                        if (runnable != null) {
                            this.d.removeCallbacks(runnable);
                            this.j = null;
                        }
                        E();
                        D();
                        this.k = false;
                        this.h = true;
                    }
                    g0 g0Var = this.g;
                    if (g0Var != null) {
                        boolean z2 = this.q;
                        com.fyber.inneractive.sdk.player.f fVar3 = this.a;
                        if ((fVar3 != null ? fVar3.a : null) != null) {
                            i = (fVar3 != null ? fVar3.a : null).b();
                        } else {
                            i = -1;
                        }
                        g0Var.a(i, z2);
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.o = false;
        com.fyber.inneractive.sdk.player.f fVar4 = this.a;
        if (fVar4 != null && (qVar = fVar4.a) != null && (xVar = qVar.d) != null && xVar.equals(this.e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            z();
            if (this.a.a.e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.d) != null && sVar.c())) {
                this.d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.d;
        if (sVar3 == null || !sVar3.h) {
            g();
        }
    }

    public final void a(int i, g1 g1Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.q, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.q, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b a = nVar3.u.b.a();
                    if (a instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) a;
                        String str2 = cVar.g.g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.q;
                            if (bVar != null) {
                                str = bVar.b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                if (sVar != null) {
                    sVar.g();
                }
                g0 g0Var = this.g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                    break;
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                    break;
                } else {
                    d(true);
                    break;
                }
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.a;
                if (fVar4 != null && !this.d.h) {
                    fVar4.g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        if (sVar != null) {
            sVar.g();
        }
        g0 g0Var = this.g;
        boolean z2 = false;
        if (g0Var != null) {
            if (z) {
                com.fyber.inneractive.sdk.player.f fVar = this.a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).q;
                    g0Var.a(bVar != null ? bVar.b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.a;
                    nVar.a(nVar.q, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i = y.b[videoClickOrigin.ordinal()];
                if (i == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 a = this.g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.q, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.a.e;
                    if (fVar3 != null && fVar3.c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th) {
                            fVar3.a(th);
                        }
                    }
                }
                if (a.a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z2 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z2;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).w) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.k) {
                bVar.h.add(aVar);
            }
            return true;
        }
        IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }
}
