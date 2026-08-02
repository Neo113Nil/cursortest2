package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class n implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52419a;

    /* renamed from: b, reason: collision with root package name */
    public String f52420b;

    /* renamed from: c, reason: collision with root package name */
    public List f52421c;

    /* renamed from: d, reason: collision with root package name */
    public Map f52422d;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "params":
                        List list = (List) interfaceC4809q1.H1();
                        if (list == null) {
                            break;
                        } else {
                            nVar.f52421c = list;
                            break;
                        }
                    case "message":
                        nVar.f52420b = interfaceC4809q1.a1();
                        break;
                    case "formatted":
                        nVar.f52419a = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            nVar.g(concurrentHashMap);
            interfaceC4809q1.t();
            return nVar;
        }
    }

    public String d() {
        return this.f52419a;
    }

    public String e() {
        return this.f52420b;
    }

    public void f(String str) {
        this.f52419a = str;
    }

    public void g(Map map) {
        this.f52422d = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52419a != null) {
            interfaceC4813r1.d("formatted").e(this.f52419a);
        }
        if (this.f52420b != null) {
            interfaceC4813r1.d("message").e(this.f52420b);
        }
        List list = this.f52421c;
        if (list != null && !list.isEmpty()) {
            interfaceC4813r1.d("params").j(iLogger, this.f52421c);
        }
        Map map = this.f52422d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52422d.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }
}
