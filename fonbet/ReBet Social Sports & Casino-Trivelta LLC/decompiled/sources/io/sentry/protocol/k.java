package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class k implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52394a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f52395b;

    /* renamed from: c, reason: collision with root package name */
    public String f52396c;

    /* renamed from: d, reason: collision with root package name */
    public String f52397d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f52398e;

    /* renamed from: f, reason: collision with root package name */
    public String f52399f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f52400g;

    /* renamed from: h, reason: collision with root package name */
    public String f52401h;

    /* renamed from: i, reason: collision with root package name */
    public String f52402i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52403j;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "npot_support":
                        kVar.f52402i = interfaceC4809q1.a1();
                        break;
                    case "vendor_id":
                        kVar.f52396c = interfaceC4809q1.a1();
                        break;
                    case "multi_threaded_rendering":
                        kVar.f52400g = interfaceC4809q1.p0();
                        break;
                    case "id":
                        kVar.f52395b = interfaceC4809q1.Q0();
                        break;
                    case "name":
                        kVar.f52394a = interfaceC4809q1.a1();
                        break;
                    case "vendor_name":
                        kVar.f52397d = interfaceC4809q1.a1();
                        break;
                    case "version":
                        kVar.f52401h = interfaceC4809q1.a1();
                        break;
                    case "api_type":
                        kVar.f52399f = interfaceC4809q1.a1();
                        break;
                    case "memory_size":
                        kVar.f52398e = interfaceC4809q1.Q0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            kVar.j(concurrentHashMap);
            interfaceC4809q1.t();
            return kVar;
        }
    }

    public k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (io.sentry.util.w.a(this.f52394a, kVar.f52394a) && io.sentry.util.w.a(this.f52395b, kVar.f52395b) && io.sentry.util.w.a(this.f52396c, kVar.f52396c) && io.sentry.util.w.a(this.f52397d, kVar.f52397d) && io.sentry.util.w.a(this.f52398e, kVar.f52398e) && io.sentry.util.w.a(this.f52399f, kVar.f52399f) && io.sentry.util.w.a(this.f52400g, kVar.f52400g) && io.sentry.util.w.a(this.f52401h, kVar.f52401h) && io.sentry.util.w.a(this.f52402i, kVar.f52402i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52394a, this.f52395b, this.f52396c, this.f52397d, this.f52398e, this.f52399f, this.f52400g, this.f52401h, this.f52402i);
    }

    public void j(Map map) {
        this.f52403j = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52394a != null) {
            interfaceC4813r1.d("name").e(this.f52394a);
        }
        if (this.f52395b != null) {
            interfaceC4813r1.d(StackTraceHelper.ID_KEY).i(this.f52395b);
        }
        if (this.f52396c != null) {
            interfaceC4813r1.d("vendor_id").e(this.f52396c);
        }
        if (this.f52397d != null) {
            interfaceC4813r1.d("vendor_name").e(this.f52397d);
        }
        if (this.f52398e != null) {
            interfaceC4813r1.d("memory_size").i(this.f52398e);
        }
        if (this.f52399f != null) {
            interfaceC4813r1.d("api_type").e(this.f52399f);
        }
        if (this.f52400g != null) {
            interfaceC4813r1.d("multi_threaded_rendering").k(this.f52400g);
        }
        if (this.f52401h != null) {
            interfaceC4813r1.d("version").e(this.f52401h);
        }
        if (this.f52402i != null) {
            interfaceC4813r1.d("npot_support").e(this.f52402i);
        }
        Map map = this.f52403j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52403j.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public k(k kVar) {
        this.f52394a = kVar.f52394a;
        this.f52395b = kVar.f52395b;
        this.f52396c = kVar.f52396c;
        this.f52397d = kVar.f52397d;
        this.f52398e = kVar.f52398e;
        this.f52399f = kVar.f52399f;
        this.f52400g = kVar.f52400g;
        this.f52401h = kVar.f52401h;
        this.f52402i = kVar.f52402i;
        this.f52403j = AbstractC4845c.b(kVar.f52403j);
    }
}
