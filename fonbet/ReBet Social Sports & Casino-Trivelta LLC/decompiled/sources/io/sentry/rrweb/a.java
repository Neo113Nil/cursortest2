package io.sentry.rrweb;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.rrweb.b;
import io.sentry.util.AbstractC4845c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a extends b implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public String f52631c;

    /* renamed from: d, reason: collision with root package name */
    public double f52632d;

    /* renamed from: e, reason: collision with root package name */
    public String f52633e;

    /* renamed from: f, reason: collision with root package name */
    public String f52634f;

    /* renamed from: g, reason: collision with root package name */
    public String f52635g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC4788n3 f52636h;

    /* renamed from: i, reason: collision with root package name */
    public Map f52637i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52638j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52639k;

    /* renamed from: l, reason: collision with root package name */
    public Map f52640l;

    /* renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C0769a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(aVar, interfaceC4809q1, iLogger);
                } else if (!aVar2.a(aVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            aVar.z(hashMap);
            interfaceC4809q1.t();
            return aVar;
        }

        public final void c(a aVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.PAYLOAD)) {
                    d(aVar, interfaceC4809q1, iLogger);
                } else if (f02.equals("tag")) {
                    String a12 = interfaceC4809q1.a1();
                    if (a12 == null) {
                        a12 = "";
                    }
                    aVar.f52631c = a12;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            aVar.v(concurrentHashMap);
            interfaceC4809q1.t();
        }

        public final void d(a aVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "data":
                        Map b10 = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        if (b10 == null) {
                            break;
                        } else {
                            aVar.f52637i = b10;
                            break;
                        }
                    case "type":
                        aVar.f52633e = interfaceC4809q1.a1();
                        break;
                    case "category":
                        aVar.f52634f = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        aVar.f52632d = interfaceC4809q1.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f52636h = new EnumC4788n3.a().a(interfaceC4809q1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC4788n3.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        aVar.f52635g = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            interfaceC4809q1.t();
        }
    }

    public a() {
        super(c.Custom);
        this.f52631c = "breadcrumb";
    }

    public String n() {
        return this.f52634f;
    }

    public Map o() {
        return this.f52637i;
    }

    public final void p(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("tag").e(this.f52631c);
        interfaceC4813r1.d(EventKeys.PAYLOAD);
        q(interfaceC4813r1, iLogger);
        Map map = this.f52640l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52640l.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public final void q(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52633e != null) {
            interfaceC4813r1.d("type").e(this.f52633e);
        }
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, BigDecimal.valueOf(this.f52632d));
        if (this.f52634f != null) {
            interfaceC4813r1.d("category").e(this.f52634f);
        }
        if (this.f52635g != null) {
            interfaceC4813r1.d("message").e(this.f52635g);
        }
        if (this.f52636h != null) {
            interfaceC4813r1.d("level").j(iLogger, this.f52636h);
        }
        if (this.f52637i != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52637i);
        }
        Map map = this.f52639k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52639k.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void r(double d10) {
        this.f52632d = d10;
    }

    public void s(String str) {
        this.f52633e = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        p(interfaceC4813r1, iLogger);
        Map map = this.f52638j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52638j.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(String str) {
        this.f52634f = str;
    }

    public void u(Map map) {
        this.f52637i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map map) {
        this.f52640l = map;
    }

    public void w(EnumC4788n3 enumC4788n3) {
        this.f52636h = enumC4788n3;
    }

    public void x(String str) {
        this.f52635g = str;
    }

    public void y(Map map) {
        this.f52639k = map;
    }

    public void z(Map map) {
        this.f52638j = map;
    }
}
