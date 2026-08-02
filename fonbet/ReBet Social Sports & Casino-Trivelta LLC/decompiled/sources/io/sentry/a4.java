package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.d4;
import io.sentry.f4;
import io.sentry.protocol.u;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a4 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f50593a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f50594b;

    /* renamed from: c, reason: collision with root package name */
    public d4 f50595c;

    /* renamed from: d, reason: collision with root package name */
    public transient l4 f50596d;

    /* renamed from: e, reason: collision with root package name */
    public String f50597e;

    /* renamed from: f, reason: collision with root package name */
    public String f50598f;

    /* renamed from: g, reason: collision with root package name */
    public f4 f50599g;

    /* renamed from: h, reason: collision with root package name */
    public Map f50600h;

    /* renamed from: i, reason: collision with root package name */
    public String f50601i;

    /* renamed from: j, reason: collision with root package name */
    public Map f50602j;

    /* renamed from: k, reason: collision with root package name */
    public Map f50603k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC4832t0 f50604l;

    /* renamed from: m, reason: collision with root package name */
    public C4734d f50605m;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.featureflags.b f50606n;

    /* renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.u f50607o;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a4 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            String str = null;
            io.sentry.protocol.u uVar = null;
            d4 d4Var = null;
            d4 d4Var2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            f4 f4Var = null;
            String str3 = null;
            Map map = null;
            Map map2 = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "span_id":
                        d4Var = new d4.a().a(interfaceC4809q1, iLogger);
                        break;
                    case "parent_span_id":
                        d4Var2 = (d4) interfaceC4809q1.x0(iLogger, new d4.a());
                        break;
                    case "description":
                        str2 = interfaceC4809q1.M0();
                        break;
                    case "origin":
                        str3 = interfaceC4809q1.M0();
                        break;
                    case "status":
                        f4Var = (f4) interfaceC4809q1.x0(iLogger, new f4.a());
                        break;
                    case "op":
                        str = interfaceC4809q1.M0();
                        break;
                    case "data":
                        map2 = (Map) interfaceC4809q1.H1();
                        break;
                    case "tags":
                        map = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "trace_id":
                        uVar = new u.a().a(interfaceC4809q1, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            if (uVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (d4Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str == null) {
                str = "";
            }
            a4 a4Var = new a4(uVar, d4Var, str, d4Var2, null);
            a4Var.s(str2);
            a4Var.x(f4Var);
            a4Var.v(str3);
            if (map != null) {
                a4Var.f50600h = map;
            }
            if (map2 != null) {
                a4Var.f50602j = map2;
            }
            a4Var.y(concurrentHashMap);
            interfaceC4809q1.t();
            return a4Var;
        }
    }

    public a4(String str) {
        this(new io.sentry.protocol.u(), new d4(), str, null, null);
    }

    public a4 a(String str, d4 d4Var, d4 d4Var2) {
        io.sentry.protocol.u uVar = this.f50593a;
        if (d4Var2 == null) {
            d4Var2 = new d4();
        }
        return new a4(uVar, d4Var2, d4Var, str, null, this.f50596d, null, "manual");
    }

    public C4734d b() {
        return this.f50605m;
    }

    public Map c() {
        return this.f50602j;
    }

    public String d() {
        return this.f50598f;
    }

    public io.sentry.featureflags.b e() {
        return this.f50606n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.f50593a.equals(a4Var.f50593a) && this.f50594b.equals(a4Var.f50594b) && io.sentry.util.w.a(this.f50595c, a4Var.f50595c) && this.f50597e.equals(a4Var.f50597e) && io.sentry.util.w.a(this.f50598f, a4Var.f50598f) && o() == a4Var.o();
    }

    public EnumC4832t0 f() {
        return this.f50604l;
    }

    public String g() {
        return this.f50597e;
    }

    public String h() {
        return this.f50601i;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50593a, this.f50594b, this.f50595c, this.f50597e, this.f50598f, o());
    }

    public d4 i() {
        return this.f50595c;
    }

    public Boolean j() {
        l4 l4Var = this.f50596d;
        if (l4Var == null) {
            return null;
        }
        return l4Var.b();
    }

    public io.sentry.protocol.u k() {
        return this.f50607o;
    }

    public Boolean l() {
        l4 l4Var = this.f50596d;
        if (l4Var == null) {
            return null;
        }
        return l4Var.e();
    }

    public l4 m() {
        return this.f50596d;
    }

    public d4 n() {
        return this.f50594b;
    }

    public f4 o() {
        return this.f50599g;
    }

    public Map p() {
        return this.f50600h;
    }

    public io.sentry.protocol.u q() {
        return this.f50593a;
    }

    public void r(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f50602j.remove(str);
        } else {
            this.f50602j.put(str, obj);
        }
    }

    public void s(String str) {
        this.f50598f = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("trace_id");
        this.f50593a.serialize(interfaceC4813r1, iLogger);
        interfaceC4813r1.d("span_id");
        this.f50594b.serialize(interfaceC4813r1, iLogger);
        if (this.f50595c != null) {
            interfaceC4813r1.d("parent_span_id");
            this.f50595c.serialize(interfaceC4813r1, iLogger);
        }
        interfaceC4813r1.d("op").e(this.f50597e);
        if (this.f50598f != null) {
            interfaceC4813r1.d("description").e(this.f50598f);
        }
        if (o() != null) {
            interfaceC4813r1.d("status").j(iLogger, o());
        }
        if (this.f50601i != null) {
            interfaceC4813r1.d("origin").j(iLogger, this.f50601i);
        }
        if (!this.f50600h.isEmpty()) {
            interfaceC4813r1.d("tags").j(iLogger, this.f50600h);
        }
        if (!this.f50602j.isEmpty()) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f50602j);
        }
        Map map = this.f50603k;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f50603k.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public void t(EnumC4832t0 enumC4832t0) {
        this.f50604l = enumC4832t0;
    }

    public void u(String str) {
        this.f50597e = (String) io.sentry.util.w.c(str, "operation is required");
    }

    public void v(String str) {
        this.f50601i = str;
    }

    public void w(l4 l4Var) {
        this.f50596d = l4Var;
        C4734d c4734d = this.f50605m;
        if (c4734d != null) {
            c4734d.O(l4Var);
        }
    }

    public void x(f4 f4Var) {
        this.f50599g = f4Var;
    }

    public void y(Map map) {
        this.f50603k = map;
    }

    public a4(io.sentry.protocol.u uVar, d4 d4Var, String str, d4 d4Var2, l4 l4Var) {
        this(uVar, d4Var, d4Var2, str, null, l4Var, null, "manual");
    }

    public a4(io.sentry.protocol.u uVar, d4 d4Var, d4 d4Var2, String str, String str2, l4 l4Var, f4 f4Var, String str3) {
        this.f50600h = new ConcurrentHashMap();
        this.f50601i = "manual";
        this.f50602j = new ConcurrentHashMap();
        this.f50604l = EnumC4832t0.SENTRY;
        this.f50606n = io.sentry.featureflags.d.a();
        this.f50607o = io.sentry.protocol.u.f52477c;
        this.f50593a = (io.sentry.protocol.u) io.sentry.util.w.c(uVar, "traceId is required");
        this.f50594b = (d4) io.sentry.util.w.c(d4Var, "spanId is required");
        this.f50597e = (String) io.sentry.util.w.c(str, "operation is required");
        this.f50595c = d4Var2;
        this.f50598f = str2;
        this.f50599g = f4Var;
        this.f50601i = str3;
        w(l4Var);
        io.sentry.util.thread.a threadChecker = X1.D().i().getThreadChecker();
        this.f50602j.put("thread.id", String.valueOf(threadChecker.c()));
        this.f50602j.put("thread.name", threadChecker.b());
    }

    public a4(a4 a4Var) {
        this.f50600h = new ConcurrentHashMap();
        this.f50601i = "manual";
        this.f50602j = new ConcurrentHashMap();
        this.f50604l = EnumC4832t0.SENTRY;
        this.f50606n = io.sentry.featureflags.d.a();
        this.f50607o = io.sentry.protocol.u.f52477c;
        this.f50593a = a4Var.f50593a;
        this.f50594b = a4Var.f50594b;
        this.f50595c = a4Var.f50595c;
        w(a4Var.f50596d);
        this.f50597e = a4Var.f50597e;
        this.f50598f = a4Var.f50598f;
        this.f50599g = a4Var.f50599g;
        Map b10 = AbstractC4845c.b(a4Var.f50600h);
        if (b10 != null) {
            this.f50600h = b10;
        }
        Map b11 = AbstractC4845c.b(a4Var.f50603k);
        if (b11 != null) {
            this.f50603k = b11;
        }
        this.f50605m = a4Var.f50605m;
        Map b12 = AbstractC4845c.b(a4Var.f50602j);
        if (b12 != null) {
            this.f50602j = b12;
        }
    }
}
