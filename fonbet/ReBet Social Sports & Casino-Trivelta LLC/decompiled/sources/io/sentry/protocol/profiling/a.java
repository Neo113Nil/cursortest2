package io.sentry.protocol.profiling;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.profiling.b;
import io.sentry.protocol.profiling.c;
import io.sentry.protocol.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public List f52442a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public List f52443b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List f52444c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Map f52445d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Map f52446e;

    public static final class b implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "frames":
                        List P12 = interfaceC4809q1.P1(iLogger, new y.a());
                        if (P12 == null) {
                            break;
                        } else {
                            aVar.f52444c = P12;
                            break;
                        }
                    case "stacks":
                        List list = (List) interfaceC4809q1.x0(iLogger, new c());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f52443b = list;
                            break;
                        }
                    case "samples":
                        List P13 = interfaceC4809q1.P1(iLogger, new b.a());
                        if (P13 == null) {
                            break;
                        } else {
                            aVar.f52442a = P13;
                            break;
                        }
                    case "thread_metadata":
                        Map e12 = interfaceC4809q1.e1(iLogger, new c.a());
                        if (e12 == null) {
                            break;
                        } else {
                            aVar.f52445d = e12;
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
            aVar.i(concurrentHashMap);
            interfaceC4809q1.t();
            return aVar;
        }
    }

    public static final class c implements InterfaceC4859w0 {
        public c() {
        }

        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            interfaceC4809q1.p();
            while (interfaceC4809q1.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                interfaceC4809q1.p();
                while (interfaceC4809q1.hasNext()) {
                    arrayList2.add(Integer.valueOf(interfaceC4809q1.nextInt()));
                }
                interfaceC4809q1.n();
                arrayList.add(arrayList2);
            }
            interfaceC4809q1.n();
            return arrayList;
        }
    }

    public List e() {
        return this.f52442a;
    }

    public void f(List list) {
        this.f52444c = list;
    }

    public void g(List list) {
        this.f52443b = list;
    }

    public void h(Map map) {
        this.f52445d = map;
    }

    public void i(Map map) {
        this.f52446e = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("samples").j(iLogger, this.f52442a);
        interfaceC4813r1.d("stacks").j(iLogger, this.f52443b);
        interfaceC4813r1.d("frames").j(iLogger, this.f52444c);
        interfaceC4813r1.d("thread_metadata").j(iLogger, this.f52445d);
        Map map = this.f52446e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52446e.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
