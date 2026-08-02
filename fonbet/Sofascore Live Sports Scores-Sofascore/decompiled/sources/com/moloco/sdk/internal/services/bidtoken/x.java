package com.moloco.sdk.internal.services.bidtoken;

import com.facebook.c0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.y;
import defpackage.a70;
import defpackage.ad2;
import defpackage.fzh;
import defpackage.g9i;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x {
    public final c0 a;
    public final ad2 b;
    public final com.facebook.login.i c;
    public boolean d = true;
    public final j2d e = new j2d();
    public g9i f;

    public x(c0 c0Var, ad2 ad2Var, com.facebook.login.i iVar) {
        this.a = c0Var;
        this.b = ad2Var;
        this.c = iVar;
    }

    public static void c(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }

    public static void d(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.acm.recorder.c cVar, m mVar, boolean z, boolean z2, sq3 sq3Var) {
        w wVar;
        int i;
        com.moloco.sdk.acm.h c;
        m mVar2;
        Object R;
        x xVar;
        boolean z3;
        com.moloco.sdk.acm.recorder.b bVar;
        boolean z4;
        l0 l0Var;
        l0 l0Var2;
        x xVar2;
        if (sq3Var instanceof w) {
            wVar = (w) sq3Var;
            int i2 = wVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.z = i2 - Integer.MIN_VALUE;
                Object obj = wVar.x;
                lu3 lu3Var = lu3.a;
                i = wVar.z;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    c = cVar.c("sbt_fetch_time_ms");
                    d("[Thread: " + Thread.currentThread().getName() + "] fetchServerBidToken");
                    wVar.r = this;
                    wVar.s = cVar;
                    mVar2 = mVar;
                    wVar.t = mVar2;
                    wVar.u = c;
                    wVar.v = z;
                    wVar.w = z2;
                    wVar.z = 1;
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new d(this.a, cVar, null), wVar);
                    if (R != lu3Var) {
                        xVar = this;
                        z3 = z2;
                        bVar = cVar;
                        z4 = z;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l0Var2 = (l0) wVar.s;
                    xVar2 = wVar.r;
                    y6a.M(obj);
                    m mVar3 = (m) ((k0) l0Var2).a;
                    xVar2.d = false;
                    return mVar3;
                }
                z3 = wVar.w;
                z4 = wVar.v;
                c = wVar.u;
                m mVar4 = wVar.t;
                bVar = (com.moloco.sdk.acm.recorder.b) wVar.s;
                xVar = wVar.r;
                y6a.M(obj);
                R = obj;
                mVar2 = mVar4;
                l0Var = (l0) R;
                if (!(l0Var instanceof j0)) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("sbt_fetch");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar.a("result", "failure");
                    y yVar = (y) ((j0) l0Var).a;
                    dVar.a("reason", String.valueOf(yVar.b));
                    dVar.a("initial_fetch", String.valueOf(xVar.d));
                    dVar.a("was_expiring", String.valueOf(z3));
                    dVar.a("async", String.valueOf(z4));
                    com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
                    cVar2.a(dVar);
                    c.a("result", "failure");
                    c.a("reason", String.valueOf(yVar.b));
                    c.a("initial_fetch", String.valueOf(xVar.d));
                    c.a("was_expiring", String.valueOf(z3));
                    c.a("async", String.valueOf(z4));
                    cVar2.b(c);
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "bidtoken request failed: " + yVar.b + ", details: " + yVar.a, null, false, 12, null);
                    return mVar2;
                }
                if (!(l0Var instanceof k0)) {
                    zzl.b();
                    return null;
                }
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("sbt_fetch");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar2.a("result", "success");
                dVar2.a("initial_fetch", String.valueOf(xVar.d));
                dVar2.a("was_expiring", String.valueOf(z3));
                dVar2.a("async", String.valueOf(z4));
                com.moloco.sdk.acm.recorder.c cVar3 = (com.moloco.sdk.acm.recorder.c) bVar;
                cVar3.a(dVar2);
                c.a("result", "success");
                c.a("initial_fetch", String.valueOf(xVar.d));
                c.a("was_expiring", String.valueOf(z3));
                c.a("async", String.valueOf(z4));
                cVar3.b(c);
                com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("sbt_cached");
                dVar3.a("result", "false");
                dVar3.a("initial_fetch", String.valueOf(xVar.d));
                dVar3.a("async", String.valueOf(z4));
                cVar3.a(dVar3);
                d("[Thread: " + Thread.currentThread().getName() + "] bidtoken request success");
                j2d j2dVar = xVar.e;
                fzh fzhVar = new fzh(xVar, (k0) l0Var, null, 16);
                wVar.r = xVar;
                wVar.s = l0Var;
                wVar.t = null;
                wVar.u = null;
                wVar.z = 2;
                if (h0.d(j2dVar, fzhVar, wVar) != lu3Var) {
                    l0Var2 = l0Var;
                    xVar2 = xVar;
                    m mVar32 = (m) ((k0) l0Var2).a;
                    xVar2.d = false;
                    return mVar32;
                }
                return lu3Var;
            }
        }
        wVar = new w(this, sq3Var);
        Object obj2 = wVar.x;
        lu3 lu3Var2 = lu3.a;
        i = wVar.z;
        if (i != 0) {
        }
        l0Var = (l0) R;
        if (!(l0Var instanceof j0)) {
        }
    }

    public final Object b(com.moloco.sdk.acm.recorder.c cVar, n nVar) {
        d("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return h0.d(this.e, new fzh(this, cVar, null, 15), nVar);
    }
}
