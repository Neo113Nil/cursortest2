package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.ccj;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.luj;
import defpackage.q41;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.uci;
import defpackage.un0;
import defpackage.v98;
import defpackage.weh;
import defpackage.xw3;
import defpackage.yf4;
import defpackage.z45;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m implements s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final List a;
    public final com.moloco.sdk.internal.publisher.nativead.n b;
    public final ad2 c;
    public final fdi d;
    public final jof e;
    public final jof f;
    public final com.facebook.internal.t g;
    public final aeh h;
    public final aeh i;

    public m(List list, com.moloco.sdk.internal.publisher.nativead.n nVar) {
        v98 v98Var;
        v98 v98Var2;
        this.a = list;
        this.b = nVar;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.c = c;
        rq3 rq3Var = null;
        fdi a = gdi.a(null);
        this.d = a;
        this.e = un0.K(new j(a, this), c, weh.a(3), null);
        int i = 0;
        l lVar = new l(a, i);
        uci a2 = weh.a(3);
        Boolean bool = Boolean.FALSE;
        this.f = un0.K(lVar, c, a2, bool);
        fdi a3 = gdi.a(null);
        int i2 = 9;
        xw3.L(c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(a, a3, rq3Var, i2), 3);
        int i3 = 1;
        un0.K(new yf4(a, a3, new q41(this, rq3Var, 6), i3), c, weh.a(3), bool);
        this.g = new com.facebook.internal.t(a, c);
        xw3.L(c, null, null, new luj(this, rq3Var, 25), 3);
        aeh b = beh.b(0, 0, null, 7);
        this.h = b;
        this.i = b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar instanceof t) {
                t tVar = (t) xVar;
                v98Var2 = new v98((aeh) tVar.a.m, new ccj(this, tVar, rq3Var, i2), 3);
            } else {
                if (xVar instanceof v) {
                    v98Var = new v98(((v) xVar).a.k, new f(this, rq3Var, i), 3);
                } else if (xVar instanceof u) {
                    v98Var = new v98(((u) xVar).a.g, new f(this, rq3Var, i3), 3);
                } else {
                    if (!(xVar instanceof w)) {
                        zzl.b();
                        throw null;
                    }
                    v98Var = new v98(((w) xVar).a.g, new f(this, rq3Var, 2), 3);
                }
                v98Var2 = v98Var;
            }
            fcp.m0(v98Var2, this.c);
        }
    }

    public final void a() {
        if (this.g.l().getValue() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c) {
            Object value = this.d.getValue();
            v vVar = value instanceof v ? (v) value : null;
            if (vVar == null) {
                e();
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = vVar.a;
            eVar.D = true;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = eVar.B;
            Integer valueOf = Integer.valueOf(eVar.E);
            String str = eVar.l;
            List list = hVar.h;
            if (list != null) {
                hVar.k.a(list, null, valueOf, str);
            }
            String str2 = eVar.a.e;
            if (str2 != null) {
                eVar.d.c(str2);
            }
            eVar.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.d);
            if (eVar.b) {
                eVar.g(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a);
            }
        }
    }

    public final void b() {
        x xVar = (x) this.d.getValue();
        if (xVar instanceof t) {
            ((t) xVar).a.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a);
            return;
        }
        if (xVar instanceof v) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = ((v) xVar).a;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a;
            gVar.getClass();
            eVar.g(true, gVar);
            return;
        }
        if (xVar instanceof u) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA DEC playlist item reached", null, false, 12, null);
            return;
        }
        if (xVar instanceof w) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else if (xVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA playlist item reached", null, false, 12, null);
        } else {
            zzl.b();
        }
    }

    public final void d() {
        x xVar = (x) CollectionsKt.firstOrNull(this.a);
        if (xVar == null) {
            return;
        }
        g(xVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.c, null);
        for (x xVar : this.a) {
            if (xVar instanceof t) {
                ((t) xVar).a.destroy();
            } else if (xVar instanceof v) {
                ((v) xVar).a.destroy();
            } else if (xVar instanceof u) {
                ((u) xVar).a.destroy();
            } else {
                if (!(xVar instanceof w)) {
                    zzl.b();
                    return;
                }
                ((w) xVar).a.destroy();
            }
        }
        g(null);
    }

    public final void e() {
        List list;
        fdi fdiVar = this.d;
        x xVar = (x) fdiVar.getValue();
        List list2 = this.a;
        x xVar2 = (x) CollectionsKt.a0(list2.indexOf(xVar) + 1, list2);
        u uVar = xVar2 instanceof u ? (u) xVar2 : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar = uVar != null ? uVar.a : null;
        if (bVar != null) {
            com.moloco.sdk.acm.eventprocessing.f fVar = bVar.e;
            List list3 = (List) fVar.d;
            if (list3 != null) {
                ((f1) fVar.f).a(list3, null, null, null);
                fVar.d = null;
            }
        }
        x xVar3 = (x) CollectionsKt.a0(list2.indexOf(fdiVar.getValue()) + 1, list2);
        if (xVar3 != null) {
            g(xVar3);
            return;
        }
        com.moloco.sdk.internal.publisher.nativead.n nVar = this.b;
        if (nVar != null && (list = (List) nVar.b) != null) {
            ((f1) nVar.d).a(list, null, null, null);
            nVar.b = null;
        }
        f(b.d);
    }

    public final void f(d dVar) {
        xw3.L(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(dVar, this, null, 7), 3);
    }

    public final void g(x xVar) {
        this.d.l(xVar);
        if (xVar instanceof v) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = ((v) xVar).a;
            fdi fdiVar = eVar.o;
            if (!((Boolean) eVar.A.getValue()).booleanValue() && ((Number) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) fdiVar.getValue()).a).longValue() == 0 && eVar.E == 0) {
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u(0L);
            fdiVar.getClass();
            fdiVar.m(null, uVar);
            fdi fdiVar2 = eVar.q;
            Boolean bool = Boolean.FALSE;
            fdiVar2.getClass();
            fdiVar2.m(null, bool);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = eVar.B;
            Integer valueOf = Integer.valueOf(eVar.E);
            String str = eVar.l;
            List list = hVar.g;
            if (list != null) {
                hVar.k.a(list, null, valueOf, str);
            }
            eVar.D = false;
            eVar.E = 0;
            ((fdi) eVar.C.f).m(null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.a);
            fdi fdiVar3 = eVar.x;
            fdiVar3.getClass();
            fdiVar3.m(null, bool);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar;
        x xVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar2 = dVar;
        fdi fdiVar = this.d;
        x xVar2 = (x) fdiVar.getValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar2 = dVar2.a;
        if (cVar2 == com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.b) {
            List list = this.a;
            x xVar3 = (x) CollectionsKt.a0(list.indexOf(xVar2) + 1, list);
            u uVar = xVar3 instanceof u ? (u) xVar3 : null;
            if ((uVar != null ? uVar.a : null) != null) {
                cVar = com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.c;
                if (cVar != cVar2) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = dVar2.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h hVar = dVar2.c;
                    gVar.getClass();
                    hVar.getClass();
                    dVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, gVar, hVar);
                }
                xVar = (x) fdiVar.getValue();
                if (!(xVar instanceof v)) {
                    ((v) xVar).a.f(dVar2);
                    return;
                }
                if (xVar instanceof t) {
                    com.moloco.sdk.internal.ilrd.n nVar = (com.moloco.sdk.internal.ilrd.n) ((t) xVar).a.k;
                    nVar.getClass();
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n) nVar.b).a(dVar2);
                    return;
                }
                if (xVar instanceof u) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n) ((u) xVar).a.e.e).a(dVar2);
                    return;
                }
                if (xVar instanceof w) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
                    return;
                }
                if (xVar != null) {
                    zzl.b();
                    return;
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Displaying " + dVar2.a + " at position: " + dVar2.b + " of size: " + dVar2.c + " in unknown playlist item type", null, false, 12, null);
                return;
            }
        }
        cVar = cVar2;
        if (cVar != cVar2) {
        }
        xVar = (x) fdiVar.getValue();
        if (!(xVar instanceof v)) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final ddi l() {
        return this.g.l();
    }
}
