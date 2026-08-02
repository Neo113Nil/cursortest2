package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7155i1;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.j3;
import io.sentry.protocol.B;
import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7189e;
import io.sentry.protocol.C7191g;
import io.sentry.protocol.h;
import io.sentry.protocol.j;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7187c implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f68187a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f68188b = new io.sentry.util.a();

    /* renamed from: io.sentry.protocol.c$a */
    public static final class a implements InterfaceC7174n0<C7187c> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @NotNull
        public static C7187c b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            char c11;
            boolean z11;
            C7187c c7187c = new C7187c();
            interfaceC7131c1.beginObject();
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                ConcurrentHashMap concurrentHashMap = null;
                switch (nextName.hashCode()) {
                    case -1335157162:
                        if (nextName.equals("device")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -895679987:
                        if (nextName.equals("spring")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -340323263:
                        if (nextName.equals("response")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -309425751:
                        if (nextName.equals(Scopes.PROFILE)) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -191501435:
                        if (nextName.equals("feedback")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3556:
                        if (nextName.equals("os")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 96801:
                        if (nextName.equals("app")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 102572:
                        if (nextName.equals("gpu")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 97513095:
                        if (nextName.equals("flags")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 110620997:
                        if (nextName.equals("trace")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 150940456:
                        if (nextName.equals("browser")) {
                            c11 = '\n';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1550962648:
                        if (nextName.equals("runtime")) {
                            c11 = 11;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        c7187c.q(C7189e.a.b(interfaceC7131c1, iLogger));
                        break;
                    case 1:
                        c7187c.w(B.a.b(interfaceC7131c1, iLogger));
                        break;
                    case 2:
                        c7187c.u(p.a.b(interfaceC7131c1, iLogger));
                        break;
                    case 3:
                        c7187c.l(C7155i1.a.b(interfaceC7131c1, iLogger), Scopes.PROFILE);
                        break;
                    case 4:
                        c7187c.l(h.a.b(interfaceC7131c1, iLogger), "feedback");
                        break;
                    case 5:
                        c7187c.t(n.a.b(interfaceC7131c1, iLogger));
                        break;
                    case 6:
                        c7187c.o(C7185a.C1116a.b(interfaceC7131c1, iLogger));
                        break;
                    case 7:
                        c7187c.s(j.a.b(interfaceC7131c1, iLogger));
                        break;
                    case '\b':
                        c7187c.r(C7191g.a.b(interfaceC7131c1, iLogger));
                        break;
                    case '\t':
                        c7187c.x(j3.a.b(interfaceC7131c1, iLogger));
                        break;
                    case '\n':
                        interfaceC7131c1.beginObject();
                        C7186b c7186b = new C7186b();
                        while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String nextName2 = interfaceC7131c1.nextName();
                            nextName2.getClass();
                            if (nextName2.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                c7186b.f68184a = interfaceC7131c1.k0();
                            } else if (nextName2.equals("version")) {
                                c7186b.f68185b = interfaceC7131c1.k0();
                            } else {
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName2);
                            }
                        }
                        c7186b.c(concurrentHashMap);
                        interfaceC7131c1.endObject();
                        c7187c.p(c7186b);
                        break;
                    case 11:
                        interfaceC7131c1.beginObject();
                        v vVar = new v();
                        while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String nextName3 = interfaceC7131c1.nextName();
                            nextName3.getClass();
                            switch (nextName3.hashCode()) {
                                case -339173787:
                                    if (nextName3.equals("raw_description")) {
                                        z11 = false;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                case 3373707:
                                    if (nextName3.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                case 351608024:
                                    if (nextName3.equals("version")) {
                                        z11 = 2;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                default:
                                    z11 = -1;
                                    break;
                            }
                            switch (z11) {
                                case false:
                                    vVar.f68332c = interfaceC7131c1.k0();
                                    break;
                                case true:
                                    vVar.f68330a = interfaceC7131c1.k0();
                                    break;
                                case true:
                                    vVar.f68331b = interfaceC7131c1.k0();
                                    break;
                                default:
                                    if (concurrentHashMap == null) {
                                        concurrentHashMap = new ConcurrentHashMap();
                                    }
                                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName3);
                                    break;
                            }
                        }
                        vVar.g(concurrentHashMap);
                        interfaceC7131c1.endObject();
                        c7187c.v(vVar);
                        break;
                    default:
                        Object U12 = interfaceC7131c1.U1();
                        if (U12 == null) {
                            break;
                        } else {
                            c7187c.l(U12, nextName);
                            break;
                        }
                }
            }
            interfaceC7131c1.endObject();
            return c7187c;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ C7187c a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public C7187c() {
    }

    private Object y(@NotNull Class cls, @NotNull String str) {
        Object c11 = c(str);
        if (cls.isInstance(c11)) {
            return cls.cast(c11);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f68187a.containsKey(obj);
    }

    @NotNull
    public Set<Map.Entry<String, Object>> b() {
        return this.f68187a.entrySet();
    }

    public Object c(String str) {
        if (str == null) {
            return null;
        }
        return this.f68187a.get(str);
    }

    public C7185a d() {
        return (C7185a) y(C7185a.class, "app");
    }

    public C7189e e() {
        return (C7189e) y(C7189e.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7187c)) {
            return false;
        }
        return this.f68187a.equals(((C7187c) obj).f68187a);
    }

    public C7191g f() {
        return (C7191g) y(C7191g.class, "flags");
    }

    public final h g() {
        return (h) y(h.class, "feedback");
    }

    public n h() {
        return (n) y(n.class, "os");
    }

    public final int hashCode() {
        return this.f68187a.hashCode();
    }

    public v i() {
        return (v) y(v.class, "runtime");
    }

    public j3 j() {
        return (j3) y(j3.class, "trace");
    }

    @NotNull
    public Enumeration<String> k() {
        return this.f68187a.keys();
    }

    public Object l(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f68187a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void m(C7187c c7187c) {
        if (c7187c == null) {
            return;
        }
        this.f68187a.putAll(c7187c.f68187a);
    }

    public Object n() {
        return this.f68187a.remove("replay_id");
    }

    public void o(@NotNull C7185a c7185a) {
        l(c7185a, "app");
    }

    public void p(@NotNull C7186b c7186b) {
        l(c7186b, "browser");
    }

    public void q(@NotNull C7189e c7189e) {
        l(c7189e, "device");
    }

    public void r(@NotNull C7191g c7191g) {
        l(c7191g, "flags");
    }

    public void s(@NotNull j jVar) {
        l(jVar, "gpu");
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object c11 = c(str);
            if (c11 != null) {
                c7212v0.g(str);
                c7212v0.m(iLogger, c11);
            }
        }
        c7212v0.d();
    }

    public void t(@NotNull n nVar) {
        l(nVar, "os");
    }

    public void u(@NotNull p pVar) {
        InterfaceC7097a0 a11 = this.f68188b.a();
        try {
            l(pVar, "response");
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void v(@NotNull v vVar) {
        l(vVar, "runtime");
    }

    public void w(@NotNull B b11) {
        l(b11, "spring");
    }

    public void x(@NotNull j3 j3Var) {
        io.sentry.util.p.b(j3Var, "traceContext is required");
        l(j3Var, "trace");
    }

    public C7187c(@NotNull C7187c c7187c) {
        for (Map.Entry<String, Object> entry : c7187c.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C7185a)) {
                    o(new C7185a((C7185a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C7186b)) {
                    p(new C7186b((C7186b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C7189e)) {
                    q(new C7189e((C7189e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    t(new n((n) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof v)) {
                    v(new v((v) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof h)) {
                    l(new h((h) value), "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof j)) {
                    s(new j((j) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof j3)) {
                    x(new j3((j3) value));
                } else if (Scopes.PROFILE.equals(entry.getKey()) && (value instanceof C7155i1)) {
                    l(new C7155i1((C7155i1) value), Scopes.PROFILE);
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    u(new p((p) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof B)) {
                    w(new B((B) value));
                } else {
                    l(value, entry.getKey());
                }
            }
        }
    }
}
