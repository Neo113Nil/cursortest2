package io.sentry.rrweb;

import com.twilio.voice.EventKeys;
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
public final class i extends b implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public String f52670c;

    /* renamed from: d, reason: collision with root package name */
    public String f52671d;

    /* renamed from: e, reason: collision with root package name */
    public String f52672e;

    /* renamed from: f, reason: collision with root package name */
    public double f52673f;

    /* renamed from: g, reason: collision with root package name */
    public double f52674g;

    /* renamed from: h, reason: collision with root package name */
    public Map f52675h;

    /* renamed from: i, reason: collision with root package name */
    public Map f52676i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52677j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52678k;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(iVar, interfaceC4809q1, iLogger);
                } else if (!aVar.a(iVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            iVar.v(hashMap);
            interfaceC4809q1.t();
            return iVar;
        }

        public final void c(i iVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.PAYLOAD)) {
                    d(iVar, interfaceC4809q1, iLogger);
                } else if (f02.equals("tag")) {
                    String a12 = interfaceC4809q1.a1();
                    if (a12 == null) {
                        a12 = "";
                    }
                    iVar.f52670c = a12;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            iVar.p(concurrentHashMap);
            interfaceC4809q1.t();
        }

        public final void d(i iVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "description":
                        iVar.f52672e = interfaceC4809q1.a1();
                        break;
                    case "endTimestamp":
                        iVar.f52674g = interfaceC4809q1.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f52673f = interfaceC4809q1.nextDouble();
                        break;
                    case "op":
                        iVar.f52671d = interfaceC4809q1.a1();
                        break;
                    case "data":
                        Map b10 = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        if (b10 == null) {
                            break;
                        } else {
                            iVar.f52675h = b10;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            iVar.t(concurrentHashMap);
            interfaceC4809q1.t();
        }
    }

    public i() {
        super(c.Custom);
        this.f52670c = "performanceSpan";
    }

    private void m(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("tag").e(this.f52670c);
        interfaceC4813r1.d(EventKeys.PAYLOAD);
        n(interfaceC4813r1, iLogger);
        Map map = this.f52678k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52678k.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    private void n(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52671d != null) {
            interfaceC4813r1.d("op").e(this.f52671d);
        }
        if (this.f52672e != null) {
            interfaceC4813r1.d("description").e(this.f52672e);
        }
        interfaceC4813r1.d("startTimestamp").j(iLogger, BigDecimal.valueOf(this.f52673f));
        interfaceC4813r1.d("endTimestamp").j(iLogger, BigDecimal.valueOf(this.f52674g));
        if (this.f52675h != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52675h);
        }
        Map map = this.f52677j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52677j.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void o(Map map) {
        this.f52675h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map map) {
        this.f52678k = map;
    }

    public void q(String str) {
        this.f52672e = str;
    }

    public void r(double d10) {
        this.f52674g = d10;
    }

    public void s(String str) {
        this.f52671d = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        m(interfaceC4813r1, iLogger);
        Map map = this.f52676i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52676i.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Map map) {
        this.f52677j = map;
    }

    public void u(double d10) {
        this.f52673f = d10;
    }

    public void v(Map map) {
        this.f52676i = map;
    }
}
