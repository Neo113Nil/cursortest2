package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import io.sentry.C4793o3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class A implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Long f52265a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f52266b;

    /* renamed from: c, reason: collision with root package name */
    public String f52267c;

    /* renamed from: d, reason: collision with root package name */
    public String f52268d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f52269e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f52270f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f52271g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f52272h;

    /* renamed from: i, reason: collision with root package name */
    public z f52273i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52274j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52275k;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public A a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            A a10 = new A();
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "daemon":
                        a10.f52271g = interfaceC4809q1.p0();
                        break;
                    case "priority":
                        a10.f52266b = interfaceC4809q1.Q0();
                        break;
                    case "held_locks":
                        Map e12 = interfaceC4809q1.e1(iLogger, new C4793o3.a());
                        if (e12 == null) {
                            break;
                        } else {
                            a10.f52274j = new HashMap(e12);
                            break;
                        }
                    case "id":
                        a10.f52265a = interfaceC4809q1.U0();
                        break;
                    case "main":
                        a10.f52272h = interfaceC4809q1.p0();
                        break;
                    case "name":
                        a10.f52267c = interfaceC4809q1.a1();
                        break;
                    case "state":
                        a10.f52268d = interfaceC4809q1.a1();
                        break;
                    case "crashed":
                        a10.f52269e = interfaceC4809q1.p0();
                        break;
                    case "current":
                        a10.f52270f = interfaceC4809q1.p0();
                        break;
                    case "stacktrace":
                        a10.f52273i = (z) interfaceC4809q1.x0(iLogger, new z.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            a10.A(concurrentHashMap);
            interfaceC4809q1.t();
            return a10;
        }
    }

    public void A(Map map) {
        this.f52275k = map;
    }

    public Map k() {
        return this.f52274j;
    }

    public Long l() {
        return this.f52265a;
    }

    public String m() {
        return this.f52267c;
    }

    public z n() {
        return this.f52273i;
    }

    public Boolean o() {
        return this.f52270f;
    }

    public Boolean p() {
        return this.f52272h;
    }

    public void q(Boolean bool) {
        this.f52269e = bool;
    }

    public void r(Boolean bool) {
        this.f52270f = bool;
    }

    public void s(Boolean bool) {
        this.f52271g = bool;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52265a != null) {
            interfaceC4813r1.d(StackTraceHelper.ID_KEY).i(this.f52265a);
        }
        if (this.f52266b != null) {
            interfaceC4813r1.d(EventKeys.PRIORITY).i(this.f52266b);
        }
        if (this.f52267c != null) {
            interfaceC4813r1.d("name").e(this.f52267c);
        }
        if (this.f52268d != null) {
            interfaceC4813r1.d("state").e(this.f52268d);
        }
        if (this.f52269e != null) {
            interfaceC4813r1.d("crashed").k(this.f52269e);
        }
        if (this.f52270f != null) {
            interfaceC4813r1.d("current").k(this.f52270f);
        }
        if (this.f52271g != null) {
            interfaceC4813r1.d("daemon").k(this.f52271g);
        }
        if (this.f52272h != null) {
            interfaceC4813r1.d("main").k(this.f52272h);
        }
        if (this.f52273i != null) {
            interfaceC4813r1.d("stacktrace").j(iLogger, this.f52273i);
        }
        if (this.f52274j != null) {
            interfaceC4813r1.d("held_locks").j(iLogger, this.f52274j);
        }
        Map map = this.f52275k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52275k.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Map map) {
        this.f52274j = map;
    }

    public void u(Long l10) {
        this.f52265a = l10;
    }

    public void v(Boolean bool) {
        this.f52272h = bool;
    }

    public void w(String str) {
        this.f52267c = str;
    }

    public void x(Integer num) {
        this.f52266b = num;
    }

    public void y(z zVar) {
        this.f52273i = zVar;
    }

    public void z(String str) {
        this.f52268d = str;
    }
}
