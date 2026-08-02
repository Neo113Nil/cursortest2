package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.j;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class F implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52287a;

    /* renamed from: b, reason: collision with root package name */
    public String f52288b;

    /* renamed from: c, reason: collision with root package name */
    public String f52289c;

    /* renamed from: d, reason: collision with root package name */
    public String f52290d;

    /* renamed from: e, reason: collision with root package name */
    public String f52291e;

    /* renamed from: f, reason: collision with root package name */
    public j f52292f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52293g;

    /* renamed from: h, reason: collision with root package name */
    public Map f52294h;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            F f10 = new F();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "username":
                        f10.f52289c = interfaceC4809q1.a1();
                        break;
                    case "id":
                        f10.f52288b = interfaceC4809q1.a1();
                        break;
                    case "geo":
                        f10.f52292f = new j.a().a(interfaceC4809q1, iLogger);
                        break;
                    case "data":
                        f10.f52293g = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "name":
                        f10.f52291e = interfaceC4809q1.a1();
                        break;
                    case "email":
                        f10.f52287a = interfaceC4809q1.a1();
                        break;
                    case "ip_address":
                        f10.f52290d = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            f10.o(concurrentHashMap);
            interfaceC4809q1.t();
            return f10;
        }
    }

    public F() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f10 = (F) obj;
            if (io.sentry.util.w.a(this.f52287a, f10.f52287a) && io.sentry.util.w.a(this.f52288b, f10.f52288b) && io.sentry.util.w.a(this.f52289c, f10.f52289c) && io.sentry.util.w.a(this.f52290d, f10.f52290d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f52287a;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52287a, this.f52288b, this.f52289c, this.f52290d);
    }

    public String i() {
        return this.f52288b;
    }

    public String j() {
        return this.f52290d;
    }

    public String k() {
        return this.f52289c;
    }

    public void l(Map map) {
        this.f52293g = AbstractC4845c.b(map);
    }

    public void m(String str) {
        this.f52288b = str;
    }

    public void n(String str) {
        this.f52290d = str;
    }

    public void o(Map map) {
        this.f52294h = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52287a != null) {
            interfaceC4813r1.d("email").e(this.f52287a);
        }
        if (this.f52288b != null) {
            interfaceC4813r1.d(StackTraceHelper.ID_KEY).e(this.f52288b);
        }
        if (this.f52289c != null) {
            interfaceC4813r1.d("username").e(this.f52289c);
        }
        if (this.f52290d != null) {
            interfaceC4813r1.d("ip_address").e(this.f52290d);
        }
        if (this.f52291e != null) {
            interfaceC4813r1.d("name").e(this.f52291e);
        }
        if (this.f52292f != null) {
            interfaceC4813r1.d("geo");
            this.f52292f.serialize(interfaceC4813r1, iLogger);
        }
        if (this.f52293g != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52293g);
        }
        Map map = this.f52294h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52294h.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public F(F f10) {
        this.f52287a = f10.f52287a;
        this.f52289c = f10.f52289c;
        this.f52288b = f10.f52288b;
        this.f52290d = f10.f52290d;
        this.f52291e = f10.f52291e;
        this.f52292f = f10.f52292f;
        this.f52293g = AbstractC4845c.b(f10.f52293g);
        this.f52294h = AbstractC4845c.b(f10.f52294h);
    }
}
