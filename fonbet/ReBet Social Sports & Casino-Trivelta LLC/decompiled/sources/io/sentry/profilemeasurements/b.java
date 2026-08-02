package io.sentry.profilemeasurements;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.w;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class b implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f52261a;

    /* renamed from: b, reason: collision with root package name */
    public double f52262b;

    /* renamed from: c, reason: collision with root package name */
    public String f52263c;

    /* renamed from: d, reason: collision with root package name */
    public double f52264d;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            Double valueOf;
            interfaceC4809q1.m();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "elapsed_since_start_ns":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            break;
                        } else {
                            bVar.f52263c = a12;
                            break;
                        }
                    case "timestamp":
                        try {
                            valueOf = interfaceC4809q1.e0();
                        } catch (NumberFormatException unused) {
                            Date j02 = interfaceC4809q1.j0(iLogger);
                            valueOf = j02 != null ? Double.valueOf(AbstractC4779m.a(j02)) : null;
                        }
                        if (valueOf == null) {
                            break;
                        } else {
                            bVar.f52262b = valueOf.doubleValue();
                            break;
                        }
                    case "value":
                        Double e02 = interfaceC4809q1.e0();
                        if (e02 == null) {
                            break;
                        } else {
                            bVar.f52264d = e02.doubleValue();
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
            bVar.f(concurrentHashMap);
            interfaceC4809q1.t();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    public String d() {
        return this.f52263c;
    }

    public double e() {
        return this.f52264d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f52261a, bVar.f52261a) && this.f52263c.equals(bVar.f52263c) && this.f52264d == bVar.f52264d && this.f52262b == bVar.f52262b) {
                return true;
            }
        }
        return false;
    }

    public void f(Map map) {
        this.f52261a = map;
    }

    public int hashCode() {
        return w.b(this.f52261a, this.f52263c, Double.valueOf(this.f52264d));
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.VALUE_KEY).j(iLogger, Double.valueOf(this.f52264d));
        interfaceC4813r1.d("elapsed_since_start_ns").j(iLogger, this.f52263c);
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52262b));
        Map map = this.f52261a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52261a.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public b(Long l10, Number number, long j10) {
        this.f52263c = l10.toString();
        this.f52264d = number.doubleValue();
        this.f52262b = AbstractC4779m.m(j10);
    }
}
