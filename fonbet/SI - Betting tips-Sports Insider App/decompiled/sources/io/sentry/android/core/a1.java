package io.sentry.android.core;

import androidx.appcompat.widget.q4;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.f2;
import io.sentry.n6;
import io.sentry.p6;
import io.sentry.q6;
import io.sentry.t4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final q4 f15538a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f15539b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f15540c = new io.sentry.util.a();

    public a1(SentryAndroidOptions sentryAndroidOptions, q4 q4Var) {
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15539b = sentryAndroidOptions;
        this.f15538a = q4Var;
    }

    public static void a(io.sentry.android.core.performance.f fVar, io.sentry.protocol.e0 e0Var) {
        p6 p6Var;
        if (fVar.f15802a != io.sentry.android.core.performance.e.COLD) {
            return;
        }
        io.sentry.protocol.c cVar = e0Var.f16456b;
        ArrayList arrayList = e0Var.f16772s;
        n6 i5 = cVar.i();
        if (i5 == null) {
            return;
        }
        io.sentry.protocol.v vVar = i5.f16667a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                p6Var = null;
                break;
            }
            io.sentry.protocol.y yVar = (io.sentry.protocol.y) it.next();
            if (yVar.f16936f.contentEquals("app.start.cold")) {
                p6Var = yVar.f16934d;
                break;
            }
        }
        io.sentry.android.core.performance.g gVar = new io.sentry.android.core.performance.g();
        io.sentry.android.core.performance.g gVar2 = fVar.f15804c;
        long j = gVar2.f15813b;
        long j6 = gVar2.f15814c;
        long j10 = io.sentry.android.core.performance.f.f15799l;
        gVar.f15812a = "Process Initialization";
        gVar.f15813b = j;
        gVar.f15814c = j6;
        gVar.f15815d = j10;
        if (gVar.b() && Math.abs(gVar.a()) <= 10000) {
            arrayList.add(e(gVar, p6Var, vVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(fVar.f15807f.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(e((io.sentry.android.core.performance.g) it2.next(), p6Var, vVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.g gVar3 = fVar.f15806e;
        if (gVar3.f15815d != 0) {
            arrayList.add(e(gVar3, p6Var, vVar, "application.load"));
        }
    }

    public static boolean b(io.sentry.protocol.e0 e0Var) {
        Iterator it = e0Var.f16772s.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.y yVar = (io.sentry.protocol.y) it.next();
            if (yVar.f16936f.contentEquals("app.start.cold") || yVar.f16936f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        n6 i5 = e0Var.f16456b.i();
        if (i5 == null) {
            return false;
        }
        String str = i5.f16671e;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(io.sentry.protocol.e0 e0Var) {
        boolean z5;
        Map map;
        Double d10;
        Double d11;
        Object obj;
        ArrayList arrayList = e0Var.f16772s;
        Iterator it = arrayList.iterator();
        io.sentry.protocol.y yVar = null;
        io.sentry.protocol.y yVar2 = null;
        while (it.hasNext()) {
            io.sentry.protocol.y yVar3 = (io.sentry.protocol.y) it.next();
            if ("ui.load.initial_display".equals(yVar3.f16936f)) {
                yVar = yVar3;
            } else if ("ui.load.full_display".equals(yVar3.f16936f)) {
                yVar2 = yVar3;
            }
            if (yVar != null && yVar2 != null) {
                break;
            }
        }
        if (yVar == null && yVar2 == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            io.sentry.protocol.y yVar4 = (io.sentry.protocol.y) it2.next();
            if (yVar4 != yVar && yVar4 != yVar2) {
                Map map2 = yVar4.f16940k;
                Double d12 = yVar4.f16931a;
                boolean z7 = false;
                boolean z10 = map2 == null || (obj = map2.get("thread.name")) == null || "main".equals(obj);
                if (yVar != null) {
                    double doubleValue = d12.doubleValue();
                    if (doubleValue >= yVar.f16931a.doubleValue() && (((d11 = yVar.f16932b) == null || doubleValue <= d11.doubleValue()) && z10)) {
                        z5 = true;
                        if (yVar2 != null) {
                            double doubleValue2 = d12.doubleValue();
                            if (doubleValue2 >= yVar2.f16931a.doubleValue() && ((d10 = yVar2.f16932b) == null || doubleValue2 <= d10.doubleValue())) {
                                z7 = true;
                            }
                        }
                        if (!z5 || z7) {
                            map = yVar4.f16940k;
                            if (map == null) {
                                map = new ConcurrentHashMap();
                                yVar4.f16940k = map;
                            }
                            if (z5) {
                                map.put("ui.contributes_to_ttid", Boolean.TRUE);
                            }
                            if (!z7) {
                                map.put("ui.contributes_to_ttfd", Boolean.TRUE);
                            }
                        }
                    }
                }
                z5 = false;
                if (yVar2 != null) {
                }
                if (!z5) {
                }
                map = yVar4.f16940k;
                if (map == null) {
                }
                if (z5) {
                }
                if (!z7) {
                }
            }
        }
    }

    public static io.sentry.protocol.y e(io.sentry.android.core.performance.g gVar, p6 p6Var, io.sentry.protocol.v vVar, String str) {
        long j;
        HashMap hashMap = new HashMap(2);
        hashMap.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.e.f15713b));
        hashMap.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        hashMap.put("ui.contributes_to_ttid", bool);
        hashMap.put("ui.contributes_to_ttfd", bool);
        Double valueOf = Double.valueOf(gVar.f15813b / 1000.0d);
        if (gVar.b()) {
            j = gVar.a() + gVar.f15813b;
        } else {
            j = 0;
        }
        return new io.sentry.protocol.y(valueOf, Double.valueOf(j / 1000.0d), vVar, new p6(), p6Var, str, gVar.f15812a, q6.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), hashMap);
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.f15539b;
        io.sentry.r a7 = this.f15540c.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                a7.close();
                return e0Var;
            }
            io.sentry.android.core.performance.f b10 = io.sentry.android.core.performance.f.b();
            boolean b11 = b(e0Var);
            HashMap hashMap = e0Var.f16773t;
            io.sentry.protocol.c cVar = e0Var.f16456b;
            if (b11) {
                if (b10.f15810i && b10.f15803b) {
                    long a10 = b10.a(sentryAndroidOptions).a();
                    if (a10 != 0) {
                        hashMap.put(b10.f15802a == io.sentry.android.core.performance.e.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.l((Number) Float.valueOf(a10), f2.MILLISECOND.apiName()));
                        a(b10, e0Var);
                        b10.f15810i = false;
                        b10.f15807f.clear();
                        b10.f15808g.clear();
                    }
                }
                io.sentry.protocol.a d10 = cVar.d();
                if (d10 == null) {
                    d10 = new io.sentry.protocol.a();
                    cVar.m(d10);
                }
                d10.j = b10.f15802a == io.sentry.android.core.performance.e.COLD ? "cold" : "warm";
            }
            d(e0Var);
            io.sentry.protocol.v vVar = e0Var.f16455a;
            n6 i5 = cVar.i();
            if (vVar != null && i5 != null && i5.f16671e.contentEquals("ui.load")) {
                q4 q4Var = this.f15538a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) q4Var.f894d;
                io.sentry.r a11 = ((io.sentry.util.a) q4Var.f897g).a();
                try {
                    if (q4Var.c()) {
                        Map map2 = (Map) concurrentHashMap.get(vVar);
                        concurrentHashMap.remove(vVar);
                        a11.close();
                        map = map2;
                    } else {
                        a11.close();
                        map = null;
                    }
                    if (map != null) {
                        hashMap.putAll(map);
                    }
                } finally {
                }
            }
            a7.close();
            return e0Var;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        return d5Var;
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, io.sentry.h0 h0Var) {
        return d6Var;
    }

    @Override // io.sentry.c0
    public final t4 k(t4 t4Var, io.sentry.h0 h0Var) {
        return t4Var;
    }
}
