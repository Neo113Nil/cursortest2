package io.sentry.protocol;

import com.twilio.voice.EventGroupType;
import io.sentry.C4875z1;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.a4;
import io.sentry.protocol.C;
import io.sentry.protocol.C4799a;
import io.sentry.protocol.C4800b;
import io.sentry.protocol.C4801c;
import io.sentry.protocol.C4804f;
import io.sentry.protocol.C4806h;
import io.sentry.protocol.i;
import io.sentry.protocol.k;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import io.sentry.protocol.w;
import io.sentry.util.AbstractC4845c;
import io.sentry.util.C4843a;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4802d implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f52339a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52340b = new C4843a();

    /* renamed from: io.sentry.protocol.d$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4802d a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            C4802d c4802d = new C4802d();
            interfaceC4809q1.m();
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "device":
                        c4802d.r(new C4804f.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "spring":
                        c4802d.z(new C.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "response":
                        c4802d.x(new q.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "profile":
                        c4802d.w(new C4875z1.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "feedback":
                        c4802d.t(new i.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "os":
                        c4802d.v(new o.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "app":
                        c4802d.o(new C4799a.C0767a().a(interfaceC4809q1, iLogger));
                        break;
                    case "art":
                        c4802d.p(new C4800b.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "gpu":
                        c4802d.u(new k.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "flags":
                        c4802d.s(new C4806h.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "trace":
                        c4802d.A(new a4.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "browser":
                        c4802d.q(new C4801c.a().a(interfaceC4809q1, iLogger));
                        break;
                    case "runtime":
                        c4802d.y(new w.a().a(interfaceC4809q1, iLogger));
                        break;
                    default:
                        Object H12 = interfaceC4809q1.H1();
                        if (H12 == null) {
                            break;
                        } else {
                            c4802d.l(f02, H12);
                            break;
                        }
                }
            }
            interfaceC4809q1.t();
            return c4802d;
        }
    }

    public C4802d() {
    }

    public void A(a4 a4Var) {
        io.sentry.util.w.c(a4Var, "traceContext is required");
        l("trace", a4Var);
    }

    public final Object B(String str, Class cls) {
        Object c10 = c(str);
        if (cls.isInstance(c10)) {
            return cls.cast(c10);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f52339a.containsKey(obj);
    }

    public Set b() {
        return this.f52339a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f52339a.get(obj);
    }

    public C4799a d() {
        return (C4799a) B("app", C4799a.class);
    }

    public C4804f e() {
        return (C4804f) B("device", C4804f.class);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4802d) {
            return this.f52339a.equals(((C4802d) obj).f52339a);
        }
        return false;
    }

    public C4806h f() {
        return (C4806h) B("flags", C4806h.class);
    }

    public i g() {
        return (i) B(EventGroupType.FEEDBACK_EVENT_GROUP, i.class);
    }

    public o h() {
        return (o) B("os", o.class);
    }

    public int hashCode() {
        return this.f52339a.hashCode();
    }

    public w i() {
        return (w) B("runtime", w.class);
    }

    public a4 j() {
        return (a4) B("trace", a4.class);
    }

    public Enumeration k() {
        return this.f52339a.keys();
    }

    public Object l(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f52339a.remove(str) : this.f52339a.put(str, obj);
    }

    public void m(C4802d c4802d) {
        if (c4802d == null) {
            return;
        }
        this.f52339a.putAll(c4802d.f52339a);
    }

    public Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f52339a.remove(obj);
    }

    public void o(C4799a c4799a) {
        l("app", c4799a);
    }

    public void p(C4800b c4800b) {
        l("art", c4800b);
    }

    public void q(C4801c c4801c) {
        l("browser", c4801c);
    }

    public void r(C4804f c4804f) {
        l("device", c4804f);
    }

    public void s(C4806h c4806h) {
        l("flags", c4806h);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        for (String str : AbstractC4845c.f(k(), this.f52339a.size())) {
            Object c10 = c(str);
            if (c10 != null) {
                interfaceC4813r1.d(str).j(iLogger, c10);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(i iVar) {
        l(EventGroupType.FEEDBACK_EVENT_GROUP, iVar);
    }

    public void u(k kVar) {
        l("gpu", kVar);
    }

    public void v(o oVar) {
        l("os", oVar);
    }

    public void w(C4875z1 c4875z1) {
        io.sentry.util.w.c(c4875z1, "profileContext is required");
        l("profile", c4875z1);
    }

    public void x(q qVar) {
        InterfaceC4765j0 d10 = this.f52340b.d();
        try {
            l("response", qVar);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void y(w wVar) {
        l("runtime", wVar);
    }

    public void z(C c10) {
        l("spring", c10);
    }

    public C4802d(C4802d c4802d) {
        for (Map.Entry entry : c4802d.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C4799a)) {
                    o(new C4799a((C4799a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C4801c)) {
                    q(new C4801c((C4801c) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C4804f)) {
                    r(new C4804f((C4804f) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof o)) {
                    v(new o((o) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof w)) {
                    y(new w((w) value));
                } else if (EventGroupType.FEEDBACK_EVENT_GROUP.equals(entry.getKey()) && (value instanceof i)) {
                    t(new i((i) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof k)) {
                    u(new k((k) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof a4)) {
                    A(new a4((a4) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C4875z1)) {
                    w(new C4875z1((C4875z1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof q)) {
                    x(new q((q) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof C)) {
                    z(new C((C) value));
                } else if ("art".equals(entry.getKey()) && (value instanceof C4800b)) {
                    p(new C4800b((C4800b) value));
                } else {
                    l((String) entry.getKey(), value);
                }
            }
        }
    }
}
