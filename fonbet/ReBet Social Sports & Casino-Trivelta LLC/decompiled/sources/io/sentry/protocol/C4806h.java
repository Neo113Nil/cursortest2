package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.C4805g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4806h implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public List f52381a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52382b;

    /* renamed from: io.sentry.protocol.h$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4806h a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            List list = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.VALUES_KEY)) {
                    list = interfaceC4809q1.P1(iLogger, new C4805g.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            if (list == null) {
                list = new ArrayList();
            }
            C4806h c4806h = new C4806h(list);
            c4806h.b(concurrentHashMap);
            interfaceC4809q1.t();
            return c4806h;
        }
    }

    public C4806h(List list) {
        this.f52381a = list;
    }

    public List a() {
        return this.f52381a;
    }

    public void b(Map map) {
        this.f52382b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4806h.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f52381a, ((C4806h) obj).f52381a);
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52381a);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.VALUES_KEY).j(iLogger, this.f52381a);
        Map map = this.f52382b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52382b.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
