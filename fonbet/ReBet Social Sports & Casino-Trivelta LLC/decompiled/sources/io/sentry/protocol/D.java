package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class D implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f52285a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52286b;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public D a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("source")) {
                    str = interfaceC4809q1.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            D d10 = new D(str);
            d10.a(concurrentHashMap);
            interfaceC4809q1.t();
            return d10;
        }
    }

    public D(String str) {
        this.f52285a = str;
    }

    public void a(Map map) {
        this.f52286b = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52285a != null) {
            interfaceC4813r1.d("source").j(iLogger, this.f52285a);
        }
        Map map = this.f52286b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52286b.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }
}
