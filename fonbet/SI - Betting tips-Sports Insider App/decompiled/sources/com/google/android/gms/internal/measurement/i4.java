package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i4 extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5084c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5085d;

    public i4(androidx.appcompat.app.v0 v0Var) {
        super("internal.eventLogger");
        this.f5085d = v0Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n j(com.google.firebase.messaging.x xVar, List list) {
        TreeMap treeMap;
        switch (this.f5084c) {
            case 0:
                ci.c.f0(this.f5067a, list, 3);
                String h10 = ((t) xVar.f6183b).c(xVar, (n) list.get(0)).h();
                n nVar = (n) list.get(1);
                t tVar = (t) xVar.f6183b;
                long m02 = (long) ci.c.m0(tVar.c(xVar, nVar).d().doubleValue());
                n c2 = tVar.c(xVar, (n) list.get(2));
                HashMap o02 = c2 instanceof k ? ci.c.o0((k) c2) : new HashMap();
                androidx.appcompat.app.v0 v0Var = (androidx.appcompat.app.v0) this.f5085d;
                v0Var.getClass();
                HashMap hashMap = new HashMap();
                for (String str : o02.keySet()) {
                    HashMap hashMap2 = ((b) v0Var.f364b).f4927c;
                    hashMap.put(str, b.b(hashMap2.containsKey(str) ? hashMap2.get(str) : null, o02.get(str), str));
                }
                ((ArrayList) v0Var.f366d).add(new b(h10, m02, hashMap));
                return n.S;
            case 1:
                ci.c.f0("getValue", list, 2);
                n c8 = ((t) xVar.f6183b).c(xVar, (n) list.get(0));
                n c10 = ((t) xVar.f6183b).c(xVar, (n) list.get(1));
                String h11 = c8.h();
                io.sentry.util.network.b bVar = (io.sentry.util.network.b) this.f5085d;
                Map map = (Map) ((s7.z0) bVar.f17177c).f23264d.get((String) bVar.f17176b);
                String str2 = (map == null || !map.containsKey(h11)) ? null : (String) map.get(h11);
                return str2 != null ? new q(str2) : c10;
            case 2:
                return n.S;
            case 3:
                try {
                    return y3.D(((s7.y0) this.f5085d).call());
                } catch (Exception unused) {
                    return n.S;
                }
            default:
                ci.c.f0(this.f5067a, list, 3);
                ((t) xVar.f6183b).c(xVar, (n) list.get(0)).h();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) xVar.f6183b;
                n c11 = tVar2.c(xVar, nVar2);
                if (!(c11 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n c12 = tVar2.c(xVar, (n) list.get(2));
                if (!(c12 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) c12;
                HashMap hashMap3 = kVar.f5108a;
                if (!hashMap3.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String h12 = kVar.a("type").h();
                int l02 = hashMap3.containsKey("priority") ? ci.c.l0(kVar.a("priority").d().doubleValue()) : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                t tVar3 = (t) this.f5085d;
                m mVar = (m) c11;
                tVar3.getClass();
                if ("create".equals(h12)) {
                    treeMap = (TreeMap) tVar3.f5244b;
                } else {
                    if (!"edit".equals(h12)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(h12)));
                    }
                    treeMap = (TreeMap) tVar3.f5243a;
                }
                if (treeMap.containsKey(Integer.valueOf(l02))) {
                    l02 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(l02), mVar);
                return n.S;
        }
    }

    public i4(t tVar) {
        super("internal.registerCallback");
        this.f5085d = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(s5 s5Var, io.sentry.util.network.b bVar) {
        super("getValue");
        this.f5085d = bVar;
    }

    public i4(r7.a aVar) {
        super("internal.logger");
        this.f5085d = aVar;
        this.f5068b.put("log", new s9(this, false, true));
        this.f5068b.put("silent", new s5("silent", 1));
        ((h) this.f5068b.get("silent")).b("log", new s9(this, true, true));
        this.f5068b.put("unmonitored", new s5("unmonitored", 2));
        ((h) this.f5068b.get("unmonitored")).b("log", new s9(this, false, false));
    }

    public i4(s7.y0 y0Var) {
        super("internal.appMetadata");
        this.f5085d = y0Var;
    }
}
