package io.sentry;

import io.sentry.I2;
import io.sentry.O1;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.protocol.z;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7230z2 extends O1 implements InterfaceC7220x0 {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private Date f68694p;

    /* renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.m f68695q;

    /* renamed from: r, reason: collision with root package name */
    private String f68696r;

    /* renamed from: s, reason: collision with root package name */
    private g3<io.sentry.protocol.z> f68697s;

    /* renamed from: t, reason: collision with root package name */
    private g3<io.sentry.protocol.s> f68698t;

    /* renamed from: u, reason: collision with root package name */
    private I2 f68699u;

    /* renamed from: v, reason: collision with root package name */
    private String f68700v;

    /* renamed from: w, reason: collision with root package name */
    private List<String> f68701w;

    /* renamed from: x, reason: collision with root package name */
    private ConcurrentHashMap f68702x;

    /* renamed from: y, reason: collision with root package name */
    private AbstractMap f68703y;

    /* renamed from: io.sentry.z2$a */
    public static final class a implements InterfaceC7174n0<C7230z2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7230z2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7230z2 c7230z2 = new C7230z2();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "fingerprint":
                        List list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            c7230z2.f68701w = list;
                            break;
                        }
                    case "threads":
                        interfaceC7131c1.beginObject();
                        interfaceC7131c1.nextName();
                        c7230z2.f68697s = new g3(interfaceC7131c1.J0(iLogger, new z.a()));
                        interfaceC7131c1.endObject();
                        break;
                    case "logger":
                        c7230z2.f68696r = interfaceC7131c1.k0();
                        break;
                    case "timestamp":
                        Date M11 = interfaceC7131c1.M(iLogger);
                        if (M11 == null) {
                            break;
                        } else {
                            c7230z2.f68694p = M11;
                            break;
                        }
                    case "level":
                        c7230z2.f68699u = (I2) interfaceC7131c1.S(iLogger, new I2.a());
                        break;
                    case "message":
                        c7230z2.f68695q = (io.sentry.protocol.m) interfaceC7131c1.S(iLogger, new m.a());
                        break;
                    case "modules":
                        c7230z2.f68703y = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "exception":
                        interfaceC7131c1.beginObject();
                        interfaceC7131c1.nextName();
                        c7230z2.f68698t = new g3(interfaceC7131c1.J0(iLogger, new s.a()));
                        interfaceC7131c1.endObject();
                        break;
                    case "transaction":
                        c7230z2.f68700v = interfaceC7131c1.k0();
                        break;
                    default:
                        if (!O1.a.a(c7230z2, nextName, interfaceC7131c1, iLogger)) {
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
            c7230z2.G0(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7230z2;
        }
    }

    public C7230z2(Throwable th2) {
        this();
        this.f66704j = th2;
    }

    public final void A0(String str) {
        this.f68696r = str;
    }

    public final void B0(io.sentry.protocol.m mVar) {
        this.f68695q = mVar;
    }

    public final void C0(Map<String, String> map) {
        this.f68703y = new HashMap(map);
    }

    public final void D0(ArrayList arrayList) {
        this.f68697s = new g3<>(arrayList);
    }

    public final void E0(@NotNull Date date) {
        this.f68694p = date;
    }

    public final void F0(String str) {
        this.f68700v = str;
    }

    public final void G0(Map<String, Object> map) {
        this.f68702x = (ConcurrentHashMap) map;
    }

    public final ArrayList n0() {
        g3<io.sentry.protocol.s> g3Var = this.f68698t;
        if (g3Var == null) {
            return null;
        }
        return g3Var.a();
    }

    public final List<String> o0() {
        return this.f68701w;
    }

    public final I2 p0() {
        return this.f68699u;
    }

    public final io.sentry.protocol.m q0() {
        return this.f68695q;
    }

    final Map<String, String> r0() {
        return this.f68703y;
    }

    public final ArrayList s0() {
        g3<io.sentry.protocol.z> g3Var = this.f68697s;
        if (g3Var != null) {
            return g3Var.a();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, this.f68694p);
        if (this.f68695q != null) {
            c7212v0.g("message");
            c7212v0.m(iLogger, this.f68695q);
        }
        if (this.f68696r != null) {
            c7212v0.g("logger");
            c7212v0.p(this.f68696r);
        }
        g3<io.sentry.protocol.z> g3Var = this.f68697s;
        if (g3Var != null && !g3Var.a().isEmpty()) {
            c7212v0.g("threads");
            c7212v0.b();
            c7212v0.g("values");
            c7212v0.m(iLogger, this.f68697s.a());
            c7212v0.d();
        }
        g3<io.sentry.protocol.s> g3Var2 = this.f68698t;
        if (g3Var2 != null && !g3Var2.a().isEmpty()) {
            c7212v0.g("exception");
            c7212v0.b();
            c7212v0.g("values");
            c7212v0.m(iLogger, this.f68698t.a());
            c7212v0.d();
        }
        if (this.f68699u != null) {
            c7212v0.g("level");
            c7212v0.m(iLogger, this.f68699u);
        }
        if (this.f68700v != null) {
            c7212v0.g("transaction");
            c7212v0.p(this.f68700v);
        }
        if (this.f68701w != null) {
            c7212v0.g("fingerprint");
            c7212v0.m(iLogger, this.f68701w);
        }
        if (this.f68703y != null) {
            c7212v0.g("modules");
            c7212v0.m(iLogger, this.f68703y);
        }
        O1.b.a(this, c7212v0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f68702x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68702x, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final Date t0() {
        return (Date) this.f68694p.clone();
    }

    public final String u0() {
        return this.f68700v;
    }

    public final io.sentry.protocol.s v0() {
        g3<io.sentry.protocol.s> g3Var = this.f68698t;
        if (g3Var == null) {
            return null;
        }
        Iterator it = g3Var.a().iterator();
        while (it.hasNext()) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) it.next();
            if (sVar.g() != null && sVar.g().l() != null && !sVar.g().l().booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public final boolean w0() {
        g3<io.sentry.protocol.s> g3Var = this.f68698t;
        return (g3Var == null || g3Var.a().isEmpty()) ? false : true;
    }

    public final void x0(ArrayList arrayList) {
        this.f68698t = new g3<>(arrayList);
    }

    public final void y0(List<String> list) {
        this.f68701w = list != null ? new ArrayList(list) : null;
    }

    public final void z0(I2 i22) {
        this.f68699u = i22;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7230z2() {
        super(r0);
        io.sentry.protocol.t tVar = new io.sentry.protocol.t();
        Date b11 = C7165l.b();
        this.f68694p = b11;
    }
}
