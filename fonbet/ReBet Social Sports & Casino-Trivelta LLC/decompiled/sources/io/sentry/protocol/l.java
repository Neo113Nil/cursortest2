package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class l implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Number f52404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52405b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52406c;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("unit")) {
                    str = interfaceC4809q1.a1();
                } else if (f02.equals(EventKeys.VALUE_KEY)) {
                    number = (Number) interfaceC4809q1.H1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            interfaceC4809q1.t();
            if (number != null) {
                l lVar = new l(number, str);
                lVar.a(concurrentHashMap);
                return lVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.b(EnumC4788n3.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public l(Number number, String str) {
        this.f52404a = number;
        this.f52405b = str;
    }

    public void a(Map map) {
        this.f52406c = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.VALUE_KEY).i(this.f52404a);
        if (this.f52405b != null) {
            interfaceC4813r1.d("unit").e(this.f52405b);
        }
        Map map = this.f52406c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52406c.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }
}
