package io.sentry.profilemeasurements;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.profilemeasurements.b;
import io.sentry.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f52258a;

    /* renamed from: b, reason: collision with root package name */
    public String f52259b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f52260c;

    /* renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C0766a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.VALUES_KEY)) {
                    List P12 = interfaceC4809q1.P1(iLogger, new b.a());
                    if (P12 != null) {
                        aVar.f52260c = P12;
                    }
                } else if (f02.equals("unit")) {
                    String a12 = interfaceC4809q1.a1();
                    if (a12 != null) {
                        aVar.f52259b = a12;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            aVar.e(concurrentHashMap);
            interfaceC4809q1.t();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public String c() {
        return this.f52259b;
    }

    public Collection d() {
        return this.f52260c;
    }

    public void e(Map map) {
        this.f52258a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (w.a(this.f52258a, aVar.f52258a) && this.f52259b.equals(aVar.f52259b) && new ArrayList(this.f52260c).equals(new ArrayList(aVar.f52260c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f52258a, this.f52259b, this.f52260c);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("unit").j(iLogger, this.f52259b);
        interfaceC4813r1.d(EventKeys.VALUES_KEY).j(iLogger, this.f52260c);
        Map map = this.f52258a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52258a.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public a(String str, Collection collection) {
        this.f52259b = str;
        this.f52260c = collection;
    }
}
