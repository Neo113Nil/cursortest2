package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class j implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52390a;

    /* renamed from: b, reason: collision with root package name */
    public String f52391b;

    /* renamed from: c, reason: collision with root package name */
    public String f52392c;

    /* renamed from: d, reason: collision with root package name */
    public Map f52393d;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "region":
                        jVar.f52392c = interfaceC4809q1.a1();
                        break;
                    case "city":
                        jVar.f52390a = interfaceC4809q1.a1();
                        break;
                    case "country_code":
                        jVar.f52391b = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            jVar.d(concurrentHashMap);
            interfaceC4809q1.t();
            return jVar;
        }
    }

    public void d(Map map) {
        this.f52393d = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52390a != null) {
            interfaceC4813r1.d("city").e(this.f52390a);
        }
        if (this.f52391b != null) {
            interfaceC4813r1.d("country_code").e(this.f52391b);
        }
        if (this.f52392c != null) {
            interfaceC4813r1.d(EventKeys.REGION).e(this.f52392c);
        }
        Map map = this.f52393d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52393d.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }
}
