package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.C4744f;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.F;
import io.sentry.protocol.p;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import io.sentry.util.AbstractC4845c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4810q2 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f52528a;

    /* renamed from: b, reason: collision with root package name */
    public final C4802d f52529b;

    /* renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.s f52530c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.p f52531d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52532e;

    /* renamed from: f, reason: collision with root package name */
    public String f52533f;

    /* renamed from: g, reason: collision with root package name */
    public String f52534g;

    /* renamed from: h, reason: collision with root package name */
    public String f52535h;

    /* renamed from: i, reason: collision with root package name */
    public io.sentry.protocol.F f52536i;

    /* renamed from: j, reason: collision with root package name */
    public transient Throwable f52537j;

    /* renamed from: k, reason: collision with root package name */
    public String f52538k;

    /* renamed from: l, reason: collision with root package name */
    public String f52539l;

    /* renamed from: m, reason: collision with root package name */
    public List f52540m;

    /* renamed from: n, reason: collision with root package name */
    public C4803e f52541n;

    /* renamed from: o, reason: collision with root package name */
    public Map f52542o;

    /* renamed from: io.sentry.q2$a */
    public static final class a {
        public boolean a(AbstractC4810q2 abstractC4810q2, String str, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    abstractC4810q2.f52541n = (C4803e) interfaceC4809q1.x0(iLogger, new C4803e.a());
                    return true;
                case "server_name":
                    abstractC4810q2.f52538k = interfaceC4809q1.a1();
                    return true;
                case "contexts":
                    abstractC4810q2.f52529b.m(new C4802d.a().a(interfaceC4809q1, iLogger));
                    return true;
                case "environment":
                    abstractC4810q2.f52534g = interfaceC4809q1.a1();
                    return true;
                case "breadcrumbs":
                    abstractC4810q2.f52540m = interfaceC4809q1.P1(iLogger, new C4744f.a());
                    return true;
                case "sdk":
                    abstractC4810q2.f52530c = (io.sentry.protocol.s) interfaceC4809q1.x0(iLogger, new s.a());
                    return true;
                case "dist":
                    abstractC4810q2.f52539l = interfaceC4809q1.a1();
                    return true;
                case "tags":
                    abstractC4810q2.f52532e = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                    return true;
                case "user":
                    abstractC4810q2.f52536i = (io.sentry.protocol.F) interfaceC4809q1.x0(iLogger, new F.a());
                    return true;
                case "extra":
                    abstractC4810q2.f52542o = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                    return true;
                case "event_id":
                    abstractC4810q2.f52528a = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                    return true;
                case "release":
                    abstractC4810q2.f52533f = interfaceC4809q1.a1();
                    return true;
                case "request":
                    abstractC4810q2.f52531d = (io.sentry.protocol.p) interfaceC4809q1.x0(iLogger, new p.a());
                    return true;
                case "platform":
                    abstractC4810q2.f52535h = interfaceC4809q1.a1();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: io.sentry.q2$b */
    public static final class b {
        public void a(AbstractC4810q2 abstractC4810q2, InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
            if (abstractC4810q2.f52528a != null) {
                interfaceC4813r1.d("event_id").j(iLogger, abstractC4810q2.f52528a);
            }
            interfaceC4813r1.d("contexts").j(iLogger, abstractC4810q2.f52529b);
            if (abstractC4810q2.f52530c != null) {
                interfaceC4813r1.d("sdk").j(iLogger, abstractC4810q2.f52530c);
            }
            if (abstractC4810q2.f52531d != null) {
                interfaceC4813r1.d("request").j(iLogger, abstractC4810q2.f52531d);
            }
            if (abstractC4810q2.f52532e != null && !abstractC4810q2.f52532e.isEmpty()) {
                interfaceC4813r1.d("tags").j(iLogger, abstractC4810q2.f52532e);
            }
            if (abstractC4810q2.f52533f != null) {
                interfaceC4813r1.d("release").e(abstractC4810q2.f52533f);
            }
            if (abstractC4810q2.f52534g != null) {
                interfaceC4813r1.d("environment").e(abstractC4810q2.f52534g);
            }
            if (abstractC4810q2.f52535h != null) {
                interfaceC4813r1.d(EventKeys.PLATFORM).e(abstractC4810q2.f52535h);
            }
            if (abstractC4810q2.f52536i != null) {
                interfaceC4813r1.d("user").j(iLogger, abstractC4810q2.f52536i);
            }
            if (abstractC4810q2.f52538k != null) {
                interfaceC4813r1.d("server_name").e(abstractC4810q2.f52538k);
            }
            if (abstractC4810q2.f52539l != null) {
                interfaceC4813r1.d("dist").e(abstractC4810q2.f52539l);
            }
            if (abstractC4810q2.f52540m != null && !abstractC4810q2.f52540m.isEmpty()) {
                interfaceC4813r1.d("breadcrumbs").j(iLogger, abstractC4810q2.f52540m);
            }
            if (abstractC4810q2.f52541n != null) {
                interfaceC4813r1.d("debug_meta").j(iLogger, abstractC4810q2.f52541n);
            }
            if (abstractC4810q2.f52542o == null || abstractC4810q2.f52542o.isEmpty()) {
                return;
            }
            interfaceC4813r1.d("extra").j(iLogger, abstractC4810q2.f52542o);
        }
    }

    public AbstractC4810q2(io.sentry.protocol.u uVar) {
        this.f52529b = new C4802d();
        this.f52528a = uVar;
    }

    public List B() {
        return this.f52540m;
    }

    public C4802d C() {
        return this.f52529b;
    }

    public C4803e D() {
        return this.f52541n;
    }

    public String E() {
        return this.f52539l;
    }

    public String F() {
        return this.f52534g;
    }

    public io.sentry.protocol.u G() {
        return this.f52528a;
    }

    public Map H() {
        return this.f52542o;
    }

    public String I() {
        return this.f52535h;
    }

    public String J() {
        return this.f52533f;
    }

    public io.sentry.protocol.p K() {
        return this.f52531d;
    }

    public io.sentry.protocol.s L() {
        return this.f52530c;
    }

    public String M() {
        return this.f52538k;
    }

    public Map N() {
        return this.f52532e;
    }

    public Throwable O() {
        Throwable th2 = this.f52537j;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).c() : th2;
    }

    public Throwable P() {
        return this.f52537j;
    }

    public io.sentry.protocol.F Q() {
        return this.f52536i;
    }

    public void R(String str) {
        Map map = this.f52532e;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(List list) {
        this.f52540m = AbstractC4845c.a(list);
    }

    public void T(C4803e c4803e) {
        this.f52541n = c4803e;
    }

    public void U(String str) {
        this.f52539l = str;
    }

    public void V(String str) {
        this.f52534g = str;
    }

    public void W(io.sentry.protocol.u uVar) {
        this.f52528a = uVar;
    }

    public void X(Map map) {
        this.f52542o = AbstractC4845c.c(map);
    }

    public void Y(String str) {
        this.f52535h = str;
    }

    public void Z(String str) {
        this.f52533f = str;
    }

    public void a0(io.sentry.protocol.p pVar) {
        this.f52531d = pVar;
    }

    public void b0(io.sentry.protocol.s sVar) {
        this.f52530c = sVar;
    }

    public void c0(String str) {
        this.f52538k = str;
    }

    public void d0(String str, String str2) {
        if (this.f52532e == null) {
            this.f52532e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            R(str);
        } else {
            this.f52532e.put(str, str2);
        }
    }

    public void e0(Map map) {
        this.f52532e = AbstractC4845c.c(map);
    }

    public void f0(io.sentry.protocol.F f10) {
        this.f52536i = f10;
    }

    public AbstractC4810q2() {
        this(new io.sentry.protocol.u());
    }
}
