package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7165l;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.O1;
import io.sentry.e3;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.protocol.C;
import io.sentry.protocol.k;
import io.sentry.protocol.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A extends O1 implements InterfaceC7220x0 {

    /* renamed from: p, reason: collision with root package name */
    private String f68136p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private Double f68137q;

    /* renamed from: r, reason: collision with root package name */
    private Double f68138r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ArrayList f68139s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final HashMap f68140t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private C f68141u;

    /* renamed from: v, reason: collision with root package name */
    private ConcurrentHashMap f68142v;

    public static final class a implements InterfaceC7174n0<A> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final A a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            A a11 = new A(new ArrayList(), new HashMap(), new C(D.CUSTOM.apiName()));
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "start_timestamp":
                        try {
                            Double g12 = interfaceC7131c1.g1();
                            if (g12 == null) {
                                break;
                            } else {
                                a11.f68137q = g12;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            if (interfaceC7131c1.M(iLogger) == null) {
                                break;
                            } else {
                                a11.f68137q = Double.valueOf(r2.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case "measurements":
                        HashMap G12 = interfaceC7131c1.G1(iLogger, new k.a());
                        if (G12 == null) {
                            break;
                        } else {
                            ((HashMap) a11.f68140t).putAll(G12);
                            break;
                        }
                    case "type":
                        interfaceC7131c1.nextString();
                        break;
                    case "timestamp":
                        try {
                            Double g13 = interfaceC7131c1.g1();
                            if (g13 == null) {
                                break;
                            } else {
                                a11.f68138r = g13;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            if (interfaceC7131c1.M(iLogger) == null) {
                                break;
                            } else {
                                a11.f68138r = Double.valueOf(r2.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case "spans":
                        ArrayList J02 = interfaceC7131c1.J0(iLogger, new w.a());
                        if (J02 == null) {
                            break;
                        } else {
                            ((ArrayList) a11.f68139s).addAll(J02);
                            break;
                        }
                    case "transaction_info":
                        a11.f68141u = C.a.b(interfaceC7131c1, iLogger);
                        break;
                    case "transaction":
                        a11.f68136p = interfaceC7131c1.k0();
                        break;
                    default:
                        if (!O1.a.a(a11, nextName, interfaceC7131c1, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                            break;
                        } else {
                            break;
                        }
                }
            }
            a11.o0(concurrentHashMap);
            interfaceC7131c1.endObject();
            return a11;
        }
    }

    public A(@NotNull e3 e3Var) {
        super(e3Var.k());
        this.f68139s = new ArrayList();
        this.f68140t = new HashMap();
        this.f68137q = Double.valueOf(e3Var.s().d() / 1.0E9d);
        this.f68138r = Double.valueOf(e3Var.s().c(e3Var.r()) / 1.0E9d);
        this.f68136p = e3Var.getName();
        Iterator it = ((CopyOnWriteArrayList) e3Var.A()).iterator();
        while (it.hasNext()) {
            i3 i3Var = (i3) it.next();
            if (Boolean.TRUE.equals(i3Var.E())) {
                this.f68139s.add(new w(i3Var));
            }
        }
        C7187c C11 = C();
        C11.m(e3Var.B());
        j3 e11 = e3Var.e();
        Map<String, Object> C12 = e3Var.C();
        j3 j3Var = new j3(e11.o(), e11.l(), e11.g(), e11.e(), e11.b(), e11.k(), e11.m(), e11.f());
        for (Map.Entry<String, String> entry : e11.n().entrySet()) {
            b0(entry.getKey(), entry.getValue());
        }
        if (C12 != null) {
            for (Map.Entry entry2 : ((ConcurrentHashMap) C12).entrySet()) {
                j3Var.p(entry2.getValue(), (String) entry2.getKey());
            }
        }
        C7191g featureFlags = ((io.sentry.featureflags.d) e11.c()).getFeatureFlags();
        if (featureFlags != null) {
            for (C7190f c7190f : featureFlags.a()) {
                j3Var.p(c7190f.b(), "flag.evaluation." + c7190f.a());
            }
        }
        C11.x(j3Var);
        this.f68141u = new C(e3Var.G().apiName());
    }

    @NotNull
    public final Map<String, k> k0() {
        return this.f68140t;
    }

    @NotNull
    public final List<w> l0() {
        return this.f68139s;
    }

    public final String m0() {
        return this.f68136p;
    }

    public final boolean n0() {
        return this.f68138r != null;
    }

    public final void o0(Map<String, Object> map) {
        this.f68142v = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68136p != null) {
            c7212v0.g("transaction");
            c7212v0.p(this.f68136p);
        }
        c7212v0.g("start_timestamp");
        c7212v0.m(iLogger, C7165l.a(this.f68137q));
        if (this.f68138r != null) {
            c7212v0.g("timestamp");
            c7212v0.m(iLogger, C7165l.a(this.f68138r));
        }
        ArrayList arrayList = this.f68139s;
        if (!arrayList.isEmpty()) {
            c7212v0.g("spans");
            c7212v0.m(iLogger, arrayList);
        }
        c7212v0.g("type");
        c7212v0.p("transaction");
        HashMap hashMap = this.f68140t;
        if (!hashMap.isEmpty()) {
            c7212v0.g("measurements");
            c7212v0.m(iLogger, hashMap);
        }
        c7212v0.g("transaction_info");
        c7212v0.m(iLogger, this.f68141u);
        O1.b.a(this, c7212v0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f68142v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68142v, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public A(@NotNull ArrayList arrayList, @NotNull HashMap hashMap, @NotNull C c11) {
        Double valueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f68139s = arrayList2;
        HashMap hashMap2 = new HashMap();
        this.f68140t = hashMap2;
        this.f68136p = "";
        this.f68137q = valueOf;
        this.f68138r = null;
        arrayList2.addAll(arrayList);
        hashMap2.putAll(hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f68140t.putAll(((w) it.next()).b());
        }
        this.f68141u = c11;
    }
}
