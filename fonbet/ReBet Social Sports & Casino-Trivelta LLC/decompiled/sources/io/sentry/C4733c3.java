package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4810q2;
import io.sentry.EnumC4788n3;
import io.sentry.protocol.A;
import io.sentry.protocol.n;
import io.sentry.protocol.t;
import io.sentry.util.AbstractC4845c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4733c3 extends AbstractC4810q2 implements G0 {

    /* renamed from: p, reason: collision with root package name */
    public Date f51911p;

    /* renamed from: q, reason: collision with root package name */
    public io.sentry.protocol.n f51912q;

    /* renamed from: r, reason: collision with root package name */
    public String f51913r;

    /* renamed from: s, reason: collision with root package name */
    public U3 f51914s;

    /* renamed from: t, reason: collision with root package name */
    public U3 f51915t;

    /* renamed from: u, reason: collision with root package name */
    public EnumC4788n3 f51916u;

    /* renamed from: v, reason: collision with root package name */
    public String f51917v;

    /* renamed from: w, reason: collision with root package name */
    public List f51918w;

    /* renamed from: x, reason: collision with root package name */
    public Map f51919x;

    /* renamed from: y, reason: collision with root package name */
    public Map f51920y;

    /* renamed from: io.sentry.c3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4733c3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4733c3 c4733c3 = new C4733c3();
            AbstractC4810q2.a aVar = new AbstractC4810q2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "fingerprint":
                        List list = (List) interfaceC4809q1.H1();
                        if (list == null) {
                            break;
                        } else {
                            c4733c3.f51918w = list;
                            break;
                        }
                    case "threads":
                        interfaceC4809q1.m();
                        interfaceC4809q1.f0();
                        c4733c3.f51914s = new U3(interfaceC4809q1.P1(iLogger, new A.a()));
                        interfaceC4809q1.t();
                        break;
                    case "logger":
                        c4733c3.f51913r = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        Date j02 = interfaceC4809q1.j0(iLogger);
                        if (j02 == null) {
                            break;
                        } else {
                            c4733c3.f51911p = j02;
                            break;
                        }
                    case "level":
                        c4733c3.f51916u = (EnumC4788n3) interfaceC4809q1.x0(iLogger, new EnumC4788n3.a());
                        break;
                    case "message":
                        c4733c3.f51912q = (io.sentry.protocol.n) interfaceC4809q1.x0(iLogger, new n.a());
                        break;
                    case "modules":
                        c4733c3.f51920y = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "exception":
                        interfaceC4809q1.m();
                        interfaceC4809q1.f0();
                        c4733c3.f51915t = new U3(interfaceC4809q1.P1(iLogger, new t.a()));
                        interfaceC4809q1.t();
                        break;
                    case "transaction":
                        c4733c3.f51917v = interfaceC4809q1.a1();
                        break;
                    default:
                        if (!aVar.a(c4733c3, f02, interfaceC4809q1, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c4733c3.I0(concurrentHashMap);
            interfaceC4809q1.t();
            return c4733c3;
        }
    }

    public C4733c3(io.sentry.protocol.u uVar, Date date) {
        super(uVar);
        this.f51911p = date;
    }

    public void A0(List list) {
        this.f51915t = new U3(list);
    }

    public void B0(List list) {
        this.f51918w = list != null ? new ArrayList(list) : null;
    }

    public void C0(EnumC4788n3 enumC4788n3) {
        this.f51916u = enumC4788n3;
    }

    public void D0(io.sentry.protocol.n nVar) {
        this.f51912q = nVar;
    }

    public void E0(Map map) {
        this.f51920y = AbstractC4845c.c(map);
    }

    public void F0(List list) {
        this.f51914s = new U3(list);
    }

    public void G0(Date date) {
        this.f51911p = date;
    }

    public void H0(String str) {
        this.f51917v = str;
    }

    public void I0(Map map) {
        this.f51919x = map;
    }

    public List p0() {
        U3 u32 = this.f51915t;
        if (u32 == null) {
            return null;
        }
        return u32.a();
    }

    public List q0() {
        return this.f51918w;
    }

    public EnumC4788n3 r0() {
        return this.f51916u;
    }

    public io.sentry.protocol.n s0() {
        return this.f51912q;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, this.f51911p);
        if (this.f51912q != null) {
            interfaceC4813r1.d("message").j(iLogger, this.f51912q);
        }
        if (this.f51913r != null) {
            interfaceC4813r1.d("logger").e(this.f51913r);
        }
        U3 u32 = this.f51914s;
        if (u32 != null && !u32.a().isEmpty()) {
            interfaceC4813r1.d("threads");
            interfaceC4813r1.m();
            interfaceC4813r1.d(EventKeys.VALUES_KEY).j(iLogger, this.f51914s.a());
            interfaceC4813r1.t();
        }
        U3 u33 = this.f51915t;
        if (u33 != null && !u33.a().isEmpty()) {
            interfaceC4813r1.d("exception");
            interfaceC4813r1.m();
            interfaceC4813r1.d(EventKeys.VALUES_KEY).j(iLogger, this.f51915t.a());
            interfaceC4813r1.t();
        }
        if (this.f51916u != null) {
            interfaceC4813r1.d("level").j(iLogger, this.f51916u);
        }
        if (this.f51917v != null) {
            interfaceC4813r1.d("transaction").e(this.f51917v);
        }
        if (this.f51918w != null) {
            interfaceC4813r1.d("fingerprint").j(iLogger, this.f51918w);
        }
        if (this.f51920y != null) {
            interfaceC4813r1.d("modules").j(iLogger, this.f51920y);
        }
        new AbstractC4810q2.b().a(this, interfaceC4813r1, iLogger);
        Map map = this.f51919x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51919x.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public Map t0() {
        return this.f51920y;
    }

    public List u0() {
        U3 u32 = this.f51914s;
        if (u32 != null) {
            return u32.a();
        }
        return null;
    }

    public Date v0() {
        return this.f51911p;
    }

    public String w0() {
        return this.f51917v;
    }

    public io.sentry.protocol.t x0() {
        U3 u32 = this.f51915t;
        if (u32 == null) {
            return null;
        }
        for (io.sentry.protocol.t tVar : u32.a()) {
            if (tVar.g() != null && tVar.g().l() != null && !tVar.g().l().booleanValue()) {
                return tVar;
            }
        }
        return null;
    }

    public boolean y0() {
        return x0() != null;
    }

    public boolean z0() {
        U3 u32 = this.f51915t;
        return (u32 == null || u32.a().isEmpty()) ? false : true;
    }

    public C4733c3(Throwable th2) {
        this();
        this.f52537j = th2;
    }

    public C4733c3() {
        this(new io.sentry.protocol.u(), AbstractC4779m.c());
    }
}
