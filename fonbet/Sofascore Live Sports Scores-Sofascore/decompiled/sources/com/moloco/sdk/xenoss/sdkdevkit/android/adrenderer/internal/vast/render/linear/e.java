package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.jy0;
import defpackage.k13;
import defpackage.llf;
import defpackage.mp1;
import defpackage.ng2;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.uci;
import defpackage.un0;
import defpackage.v24;
import defpackage.v98;
import defpackage.vdf;
import defpackage.x7k;
import defpackage.xw3;
import defpackage.y7k;
import defpackage.yf4;
import defpackage.z45;
import defpackage.zzl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g {
    public final fdi A;
    public final h B;
    public final jy0 C;
    public boolean D;
    public int E;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i a;
    public final boolean b;
    public final boolean c;
    public final k d;
    public final boolean e;
    public final float f;
    public final int g;
    public final int h;
    public final ad2 i;
    public final aeh j;
    public final aeh k;
    public final String l;
    public final fdi m;
    public final fdi n;
    public final fdi o;
    public final jof p;
    public final fdi q;
    public int r;
    public final boolean s;
    public final String t;
    public final boolean u;
    public final com.facebook.login.i v;
    public final ng2 w;
    public final fdi x;
    public final jof y;
    public final fdi z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y] */
    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, boolean z, Boolean bool, int i, boolean z2, boolean z3, Context context, com.moloco.sdk.internal.services.events.c cVar, t0 t0Var, k kVar, j jVar) {
        context.getClass();
        cVar.getClass();
        t0Var.getClass();
        this.a = iVar;
        this.b = z2;
        this.c = z3;
        this.d = kVar;
        this.e = jVar.a;
        this.f = jVar.b;
        this.g = jVar.c;
        this.h = jVar.d;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.i = c;
        x xVar = null;
        aeh b = beh.b(0, 0, null, 7);
        this.j = b;
        this.k = b;
        String str = iVar.d;
        File file = iVar.b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar = iVar.g;
        this.l = str;
        fdi a = gdi.a(Boolean.valueOf(z));
        this.m = a;
        this.n = a;
        fdi a2 = gdi.a(new u(0L));
        this.o = a2;
        this.p = un0.u(a2);
        Boolean bool2 = Boolean.FALSE;
        this.q = gdi.a(bool2);
        boolean z4 = com.moloco.sdk.service_locator.g.b().b;
        this.s = z4;
        if (!z4) {
            str = file.getAbsolutePath();
            str.getClass();
        }
        this.t = str;
        file.getAbsolutePath().getClass();
        int i2 = 1;
        this.u = iVar.e != null;
        this.v = new com.facebook.login.i(hVar != null ? hVar.e : null, hVar != null ? hVar.f : null);
        ng2 ng2Var = new ng2(hVar != null ? hVar.a : null, hVar != null ? Integer.valueOf(hVar.b) : null, hVar != null ? Integer.valueOf(hVar.c) : null, hVar != null ? hVar.d : null, c, context, cVar, t0Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o(this, i2), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o(this, 2));
        this.w = ng2Var;
        fdi a3 = gdi.a(bool2);
        this.x = a3;
        int i3 = 3;
        this.y = un0.K(new yf4(a3, (jof) ng2Var.h, new v24(i3, 0 == true ? 1 : 0, 6), 1), c, new uci(0L, Long.MAX_VALUE), null);
        fdi a4 = gdi.a(bool2);
        this.z = a4;
        this.A = a4;
        vdf vdfVar = iVar.f;
        this.B = new h(cVar, (List) vdfVar.a, (List) vdfVar.b, (List) vdfVar.c, (List) vdfVar.d, (List) vdfVar.e, (List) vdfVar.f, (List) vdfVar.g, (List) vdfVar.h, (List) vdfVar.i, (List) vdfVar.j, (List) vdfVar.k, (List) vdfVar.l, (List) vdfVar.m, (List) vdfVar.n, (List) vdfVar.o);
        fcp.m0(new v98(a4, new mp1(this, (rq3) (0 == true ? 1 : 0), 15), i3), c);
        ?? r1 = iVar.a;
        if (!Intrinsics.c(bool, bool2)) {
            if (Intrinsics.c(bool, Boolean.TRUE)) {
                xVar = new x(i * 1000);
            } else {
                if (bool != null) {
                    zzl.b();
                    throw null;
                }
                xVar = r1;
            }
        }
        jy0 jy0Var = new jy0();
        jy0Var.b = xVar;
        hs4 hs4Var2 = z45.a;
        jy0Var.c = s9a.c(rob.a);
        jy0Var.f = gdi.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.a);
        this.C = jy0Var;
    }

    public final void a() {
        int i;
        jy0 jy0Var = this.C;
        jy0Var.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", "Canceling timer", null, false, 12, null);
        g9i g9iVar = (g9i) jy0Var.e;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        u uVar = new u(Long.valueOf((!((Boolean) this.q.getValue()).booleanValue() || (i = this.r) <= 0) ? this.E : i - 10));
        fdi fdiVar = this.o;
        fdiVar.getClass();
        fdiVar.m(null, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0266, code lost:
    
        if (r3 >= r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0278, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        if (r3 <= r1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar) {
        Pair pair;
        double d;
        int i;
        boolean z = oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
        if (z) {
            int i2 = (int) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) oVar).a;
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i2));
        } else if (oVar instanceof m) {
            m mVar = (m) oVar;
            pair = new Pair(Integer.valueOf((int) mVar.a), Integer.valueOf((int) mVar.b));
        } else {
            if (!(oVar instanceof n)) {
                if (oVar.equals(l.a)) {
                    return;
                }
                zzl.b();
                return;
            }
            pair = new Pair(Integer.valueOf(this.E), Integer.valueOf((int) ((n) oVar).a));
        }
        int intValue = ((Number) pair.a).intValue();
        int intValue2 = ((Number) pair.b).intValue();
        this.E = intValue;
        double d2 = 100.0d;
        if (this.D || (oVar instanceof n)) {
            d = 100.0d;
        } else {
            h hVar = this.B;
            f1 f1Var = hVar.k;
            double d3 = (intValue / intValue2) * 100.0d;
            ArrayList arrayList = hVar.n;
            List subList = arrayList.subList(hVar.o, arrayList.size());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : subList) {
                if (((i) obj).b > d3) {
                    break;
                } else {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((i) it.next()).a);
            }
            Integer valueOf = Integer.valueOf(intValue);
            String str = this.l;
            f1Var.a(arrayList3, null, valueOf, str);
            hVar.o = arrayList2.size() + hVar.o;
            ArrayList arrayList4 = hVar.l;
            List subList2 = arrayList4.subList(hVar.m, arrayList4.size());
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = subList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    d = d2;
                    break;
                }
                Object next = it2.next();
                d = d2;
                if (((a) next).b > intValue) {
                    break;
                }
                arrayList5.add(next);
                d2 = d;
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((a) it3.next()).a);
            }
            f1Var.a(arrayList6, null, Integer.valueOf(intValue), str);
            hVar.m = arrayList5.size() + hVar.m;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = this.a;
        boolean z2 = false;
        if (z) {
            this.r = intValue2;
            fdi fdiVar = this.q;
            boolean booleanValue = ((Boolean) fdiVar.getValue()).booleanValue();
            Boolean bool = Boolean.TRUE;
            fdiVar.getClass();
            fdiVar.m(null, bool);
            if (!this.D && !booleanValue) {
                d(b.b);
                String str2 = iVar.e;
                if (str2 != null) {
                    this.d.b(str2);
                }
                if (this.c) {
                    g(false, f.a);
                }
            }
            this.D = false;
        }
        jy0 jy0Var = this.C;
        fdi fdiVar2 = (fdi) jy0Var.f;
        y yVar = (y) jy0Var.b;
        double d4 = (intValue / intValue2) * d;
        if (intValue >= intValue2) {
            fdiVar2.m(null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c.a);
        } else if (yVar == null) {
            fdiVar2.m(null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.a);
        } else if (((g9i) jy0Var.e) == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Starting timer", null, false, 12, null);
            if (yVar instanceof w) {
                MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Offset Percents detected", null, false, 12, null);
                int i3 = (int) d4;
                int i4 = new IntRange(i3, ((w) yVar).a, 1).b - i3;
                if (i4 < 0) {
                    i4 = 0;
                }
                double d5 = ((i4 * intValue2) / d) / 1000.0d;
                if (d5 < 0.0d) {
                    d5 = 0.0d;
                }
                if (Double.isNaN(d5) || d5 <= 0.0d) {
                    i = 0;
                } else if (d5 >= 4.294967295E9d) {
                    i = -1;
                } else if (d5 <= 2.147483647E9d) {
                    i = (int) d5;
                    x7k x7kVar = y7k.b;
                } else {
                    x7k x7kVar2 = y7k.b;
                    i = ((int) (d5 - 2.147483647E9d)) + Integer.MAX_VALUE;
                }
                jy0Var.a(i & 4294967295L);
            } else if (!(yVar instanceof x)) {
                zzl.b();
                return;
            } else {
                MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Offset Millis detected", null, false, 12, null);
                jy0Var.a(((x) yVar).a / 1000);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar2 = iVar.g;
        if (hVar2 == null) {
            return;
        }
        y yVar2 = hVar2.h;
        Long l = hVar2.g;
        int d6 = llf.d(yVar2 instanceof w ? (intValue2 / 100) * ((w) yVar2).a : yVar2 instanceof x ? (int) ((x) yVar2).a : 0, new IntRange(0, intValue2, 1));
        if (l != null) {
            long j = d6;
            long longValue = l.longValue() + j;
            long j2 = intValue;
            if (j <= j2) {
            }
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        fdi fdiVar3 = this.x;
        fdiVar3.getClass();
        fdiVar3.m(null, valueOf2);
    }

    public final void d(d dVar) {
        xw3.L(this.i, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, dVar, null, 19), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.i, null);
        this.w.destroy();
    }

    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        h hVar = this.B;
        hVar.getClass();
        hVar.j.a.remove(cVar);
    }

    public final void f(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        h hVar = this.B;
        hVar.getClass();
        hVar.j.a(dVar);
    }

    public final void g(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        String str = this.a.e;
        if (str != null) {
            if (z) {
                Integer valueOf = Integer.valueOf(this.E);
                h hVar = this.B;
                hVar.getClass();
                gVar.getClass();
                List list = hVar.b;
                if (list != null) {
                    f1 f1Var = hVar.k;
                    ArrayList b = hVar.j.b();
                    com.moloco.sdk.internal.services.events.c cVar = hVar.a;
                    cVar.getClass();
                    if (!list.isEmpty()) {
                        xw3.L(f1Var.b, null, null, new e1(list, cVar, gVar, f1Var, b, null, valueOf, this.l, null), 3);
                    }
                    hVar.b = null;
                }
            }
            this.d.a(str);
            d(b.a);
        }
    }

    public final void h(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        fdi fdiVar = this.m;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
        int i = this.E;
        String str = this.l;
        h hVar = this.B;
        if (z) {
            Integer valueOf2 = Integer.valueOf(i);
            List list = hVar.c;
            if (list != null) {
                hVar.k.a(list, null, valueOf2, str);
                return;
            }
            return;
        }
        Integer valueOf3 = Integer.valueOf(i);
        List list2 = hVar.d;
        if (list2 != null) {
            hVar.k.a(list2, null, valueOf3, str);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final ddi l() {
        throw null;
    }
}
