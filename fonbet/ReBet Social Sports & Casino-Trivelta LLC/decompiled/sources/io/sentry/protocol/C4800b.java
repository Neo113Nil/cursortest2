package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4800b implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Long f52324a;

    /* renamed from: b, reason: collision with root package name */
    public Double f52325b;

    /* renamed from: c, reason: collision with root package name */
    public Long f52326c;

    /* renamed from: d, reason: collision with root package name */
    public Double f52327d;

    /* renamed from: e, reason: collision with root package name */
    public Long f52328e;

    /* renamed from: f, reason: collision with root package name */
    public Double f52329f;

    /* renamed from: g, reason: collision with root package name */
    public Long f52330g;

    /* renamed from: h, reason: collision with root package name */
    public Long f52331h;

    /* renamed from: i, reason: collision with root package name */
    public Long f52332i;

    /* renamed from: j, reason: collision with root package name */
    public Long f52333j;

    /* renamed from: k, reason: collision with root package name */
    public Long f52334k;

    /* renamed from: l, reason: collision with root package name */
    public Map f52335l;

    /* renamed from: io.sentry.protocol.b$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4800b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4800b c4800b = new C4800b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "gc.total_time":
                        c4800b.f52325b = interfaceC4809q1.e0();
                        break;
                    case "memory.free_until_gc":
                        c4800b.f52331h = interfaceC4809q1.U0();
                        break;
                    case "gc.blocking_time":
                        c4800b.f52327d = interfaceC4809q1.e0();
                        break;
                    case "gc.waiting_time":
                        c4800b.f52329f = interfaceC4809q1.e0();
                        break;
                    case "memory.free_until_oome":
                        c4800b.f52332i = interfaceC4809q1.U0();
                        break;
                    case "memory.total":
                        c4800b.f52333j = interfaceC4809q1.U0();
                        break;
                    case "gc.pre_oome_count":
                        c4800b.f52328e = interfaceC4809q1.U0();
                        break;
                    case "memory.free":
                        c4800b.f52330g = interfaceC4809q1.U0();
                        break;
                    case "gc.blocking_count":
                        c4800b.f52326c = interfaceC4809q1.U0();
                        break;
                    case "gc.total_count":
                        c4800b.f52324a = interfaceC4809q1.U0();
                        break;
                    case "memory.max":
                        c4800b.f52334k = interfaceC4809q1.U0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            c4800b.w(concurrentHashMap);
            interfaceC4809q1.t();
            return c4800b;
        }
    }

    public C4800b() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4800b.class == obj.getClass()) {
            C4800b c4800b = (C4800b) obj;
            if (io.sentry.util.w.a(this.f52324a, c4800b.f52324a) && io.sentry.util.w.a(this.f52325b, c4800b.f52325b) && io.sentry.util.w.a(this.f52326c, c4800b.f52326c) && io.sentry.util.w.a(this.f52327d, c4800b.f52327d) && io.sentry.util.w.a(this.f52328e, c4800b.f52328e) && io.sentry.util.w.a(this.f52329f, c4800b.f52329f) && io.sentry.util.w.a(this.f52330g, c4800b.f52330g) && io.sentry.util.w.a(this.f52331h, c4800b.f52331h) && io.sentry.util.w.a(this.f52332i, c4800b.f52332i) && io.sentry.util.w.a(this.f52333j, c4800b.f52333j) && io.sentry.util.w.a(this.f52334k, c4800b.f52334k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52324a, this.f52325b, this.f52326c, this.f52327d, this.f52328e, this.f52329f, this.f52330g, this.f52331h, this.f52332i, this.f52333j, this.f52334k);
    }

    public void l(Long l10) {
        this.f52330g = l10;
    }

    public void m(Long l10) {
        this.f52331h = l10;
    }

    public void n(Long l10) {
        this.f52332i = l10;
    }

    public void o(Long l10) {
        this.f52326c = l10;
    }

    public void p(Double d10) {
        this.f52327d = d10;
    }

    public void q(Long l10) {
        this.f52328e = l10;
    }

    public void r(Long l10) {
        this.f52324a = l10;
    }

    public void s(Double d10) {
        this.f52325b = d10;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52324a != null) {
            interfaceC4813r1.d("gc.total_count").i(this.f52324a);
        }
        if (this.f52325b != null) {
            interfaceC4813r1.d("gc.total_time").i(this.f52325b);
        }
        if (this.f52326c != null) {
            interfaceC4813r1.d("gc.blocking_count").i(this.f52326c);
        }
        if (this.f52327d != null) {
            interfaceC4813r1.d("gc.blocking_time").i(this.f52327d);
        }
        if (this.f52328e != null) {
            interfaceC4813r1.d("gc.pre_oome_count").i(this.f52328e);
        }
        if (this.f52329f != null) {
            interfaceC4813r1.d("gc.waiting_time").i(this.f52329f);
        }
        if (this.f52330g != null) {
            interfaceC4813r1.d("memory.free").i(this.f52330g);
        }
        if (this.f52331h != null) {
            interfaceC4813r1.d("memory.free_until_gc").i(this.f52331h);
        }
        if (this.f52332i != null) {
            interfaceC4813r1.d("memory.free_until_oome").i(this.f52332i);
        }
        if (this.f52333j != null) {
            interfaceC4813r1.d("memory.total").i(this.f52333j);
        }
        if (this.f52334k != null) {
            interfaceC4813r1.d("memory.max").i(this.f52334k);
        }
        Map map = this.f52335l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52335l.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Double d10) {
        this.f52329f = d10;
    }

    public void u(Long l10) {
        this.f52334k = l10;
    }

    public void v(Long l10) {
        this.f52333j = l10;
    }

    public void w(Map map) {
        this.f52335l = map;
    }

    public C4800b(C4800b c4800b) {
        this.f52324a = c4800b.f52324a;
        this.f52325b = c4800b.f52325b;
        this.f52326c = c4800b.f52326c;
        this.f52327d = c4800b.f52327d;
        this.f52328e = c4800b.f52328e;
        this.f52329f = c4800b.f52329f;
        this.f52330g = c4800b.f52330g;
        this.f52331h = c4800b.f52331h;
        this.f52332i = c4800b.f52332i;
        this.f52333j = c4800b.f52333j;
        this.f52334k = c4800b.f52334k;
        this.f52335l = AbstractC4845c.b(c4800b.f52335l);
    }
}
