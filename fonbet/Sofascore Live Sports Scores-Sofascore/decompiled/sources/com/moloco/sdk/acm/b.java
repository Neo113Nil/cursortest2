package com.moloco.sdk.acm;

import defpackage.a70;
import defpackage.ad2;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.luj;
import defpackage.mqi;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.tz9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public static com.facebook.login.i b;
    public static com.facebook.login.i c;
    public static j d;
    public static i e;
    public static final ad2 g;
    public static final AtomicReference h;
    public static final CopyOnWriteArrayList i;
    public static final CopyOnWriteArrayList j;
    public static com.moloco.sdk.acm.eventprocessing.f k;
    public static final b a = new b();
    public static final j2d f = new j2d();

    static {
        hs4 hs4Var = z45.a;
        g = s9a.c(hq4.c.plus(tz9.o()));
        h = new AtomicReference(k.c);
        i = new CopyOnWriteArrayList();
        j = new CopyOnWriteArrayList();
    }

    public static void a(d dVar) {
        dVar.getClass();
        if (h.get() != k.a) {
            j.add(dVar);
            mqi mqiVar = com.moloco.sdk.acm.services.c.a;
            com.moloco.sdk.acm.services.c.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            xw3.L(g, null, null, new luj(dVar, null, 13), 3);
        }
    }

    public static void b(h hVar) {
        hVar.getClass();
        if (hVar.b == 0) {
            hVar.b = System.currentTimeMillis() - ((AtomicLong) hVar.a.b).get();
        }
        if (h.get() != k.a) {
            i.add(hVar);
            mqi mqiVar = com.moloco.sdk.acm.services.c.a;
            com.moloco.sdk.acm.services.c.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            xw3.L(g, null, null, new luj(hVar, null, 14), 3);
        }
    }

    public static Object d(i iVar, sq3 sq3Var) {
        String str = iVar.a;
        if (str != null) {
            j jVar = d;
            if (jVar == null) {
                Intrinsics.i("opsConfig");
                throw null;
            }
            jVar.b = str;
        }
        long longValue = iVar.b.longValue();
        j jVar2 = d;
        if (jVar2 == null) {
            Intrinsics.i("opsConfig");
            throw null;
        }
        jVar2.c = longValue;
        com.moloco.sdk.acm.eventprocessing.f fVar = k;
        if (fVar != null) {
            Object a2 = fVar.a(sq3Var);
            return a2 == lu3.a ? a2 : Unit.a;
        }
        Intrinsics.i("requestScheduler");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r6.e(r0) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (d(r7, r0) == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i iVar, rq3 rq3Var) {
        a aVar;
        int i2;
        j2d j2dVar;
        if (rq3Var instanceof a) {
            aVar = (a) rq3Var;
            int i3 = aVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.v = i3 - Integer.MIN_VALUE;
                Object obj = aVar.t;
                lu3 lu3Var = lu3.a;
                i2 = aVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (h.get() != k.a) {
                        mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                        com.moloco.sdk.acm.services.c.h("AndroidClientMetrics", "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first.", 12);
                        aVar.r = iVar;
                        j2dVar = f;
                        aVar.s = j2dVar;
                        aVar.v = 1;
                    } else {
                        mqi mqiVar2 = com.moloco.sdk.acm.services.c.a;
                        com.moloco.sdk.acm.services.c.g("AndroidClientMetrics", "ACM update called. ACM initialized already, proceeding with update");
                        aVar.v = 2;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2d j2dVar2 = aVar.s;
                i iVar2 = aVar.r;
                y6a.M(obj);
                j2dVar = j2dVar2;
                iVar = iVar2;
                try {
                    e = iVar;
                    return Unit.a;
                } finally {
                    j2dVar.f(null);
                }
            }
        }
        aVar = new a(this, rq3Var);
        Object obj2 = aVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = aVar.v;
        if (i2 != 0) {
        }
    }
}
