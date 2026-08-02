package io.sentry;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class D1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f50245a;

    /* renamed from: b, reason: collision with root package name */
    public String f50246b;

    /* renamed from: c, reason: collision with root package name */
    public String f50247c;

    /* renamed from: d, reason: collision with root package name */
    public Long f50248d;

    /* renamed from: e, reason: collision with root package name */
    public Long f50249e;

    /* renamed from: f, reason: collision with root package name */
    public Long f50250f;

    /* renamed from: g, reason: collision with root package name */
    public Long f50251g;

    /* renamed from: h, reason: collision with root package name */
    public Map f50252h;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public D1 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            D1 d12 = new D1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "relative_start_ns":
                        Long U02 = interfaceC4809q1.U0();
                        if (U02 == null) {
                            break;
                        } else {
                            d12.f50248d = U02;
                            break;
                        }
                    case "relative_end_ns":
                        Long U03 = interfaceC4809q1.U0();
                        if (U03 == null) {
                            break;
                        } else {
                            d12.f50249e = U03;
                            break;
                        }
                    case "id":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            break;
                        } else {
                            d12.f50245a = a12;
                            break;
                        }
                    case "name":
                        String a13 = interfaceC4809q1.a1();
                        if (a13 == null) {
                            break;
                        } else {
                            d12.f50247c = a13;
                            break;
                        }
                    case "trace_id":
                        String a14 = interfaceC4809q1.a1();
                        if (a14 == null) {
                            break;
                        } else {
                            d12.f50246b = a14;
                            break;
                        }
                    case "relative_cpu_end_ms":
                        Long U04 = interfaceC4809q1.U0();
                        if (U04 == null) {
                            break;
                        } else {
                            d12.f50251g = U04;
                            break;
                        }
                    case "relative_cpu_start_ms":
                        Long U05 = interfaceC4809q1.U0();
                        if (U05 == null) {
                            break;
                        } else {
                            d12.f50250f = U05;
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
            d12.l(concurrentHashMap);
            interfaceC4809q1.t();
            return d12;
        }
    }

    public D1() {
        this(C4781m1.v(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D1.class == obj.getClass()) {
            D1 d12 = (D1) obj;
            if (this.f50245a.equals(d12.f50245a) && this.f50246b.equals(d12.f50246b) && this.f50247c.equals(d12.f50247c) && this.f50248d.equals(d12.f50248d) && this.f50250f.equals(d12.f50250f) && io.sentry.util.w.a(this.f50251g, d12.f50251g) && io.sentry.util.w.a(this.f50249e, d12.f50249e) && io.sentry.util.w.a(this.f50252h, d12.f50252h)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f50245a;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50245a, this.f50246b, this.f50247c, this.f50248d, this.f50249e, this.f50250f, this.f50251g, this.f50252h);
    }

    public String i() {
        return this.f50247c;
    }

    public String j() {
        return this.f50246b;
    }

    public void k(Long l10, Long l11, Long l12, Long l13) {
        if (this.f50249e == null) {
            this.f50249e = Long.valueOf(l10.longValue() - l11.longValue());
            this.f50248d = Long.valueOf(this.f50248d.longValue() - l11.longValue());
            this.f50251g = Long.valueOf(l12.longValue() - l13.longValue());
            this.f50250f = Long.valueOf(this.f50250f.longValue() - l13.longValue());
        }
    }

    public void l(Map map) {
        this.f50252h = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(StackTraceHelper.ID_KEY).j(iLogger, this.f50245a);
        interfaceC4813r1.d("trace_id").j(iLogger, this.f50246b);
        interfaceC4813r1.d("name").j(iLogger, this.f50247c);
        interfaceC4813r1.d("relative_start_ns").j(iLogger, this.f50248d);
        interfaceC4813r1.d("relative_end_ns").j(iLogger, this.f50249e);
        interfaceC4813r1.d("relative_cpu_start_ms").j(iLogger, this.f50250f);
        interfaceC4813r1.d("relative_cpu_end_ms").j(iLogger, this.f50251g);
        Map map = this.f50252h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50252h.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public D1(InterfaceC4790o0 interfaceC4790o0, Long l10, Long l11) {
        this.f50245a = interfaceC4790o0.h().toString();
        this.f50246b = interfaceC4790o0.a().q().toString();
        this.f50247c = interfaceC4790o0.getName().isEmpty() ? "unknown" : interfaceC4790o0.getName();
        this.f50248d = l10;
        this.f50250f = l11;
    }
}
