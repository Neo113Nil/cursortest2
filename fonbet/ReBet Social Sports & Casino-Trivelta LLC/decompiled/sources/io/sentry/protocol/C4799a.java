package io.sentry.protocol;

import com.twilio.voice.PublisherMetadata;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4799a implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52310a;

    /* renamed from: b, reason: collision with root package name */
    public Date f52311b;

    /* renamed from: c, reason: collision with root package name */
    public String f52312c;

    /* renamed from: d, reason: collision with root package name */
    public String f52313d;

    /* renamed from: e, reason: collision with root package name */
    public String f52314e;

    /* renamed from: f, reason: collision with root package name */
    public String f52315f;

    /* renamed from: g, reason: collision with root package name */
    public String f52316g;

    /* renamed from: h, reason: collision with root package name */
    public Map f52317h;

    /* renamed from: i, reason: collision with root package name */
    public List f52318i;

    /* renamed from: j, reason: collision with root package name */
    public String f52319j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f52320k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f52321l;

    /* renamed from: m, reason: collision with root package name */
    public List f52322m;

    /* renamed from: n, reason: collision with root package name */
    public Map f52323n;

    /* renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0767a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4799a a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4799a c4799a = new C4799a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "split_names":
                        List list = (List) interfaceC4809q1.H1();
                        if (list == null) {
                            break;
                        } else {
                            c4799a.u(list);
                            break;
                        }
                    case "device_app_hash":
                        c4799a.f52312c = interfaceC4809q1.a1();
                        break;
                    case "start_type":
                        c4799a.f52319j = interfaceC4809q1.a1();
                        break;
                    case "view_names":
                        List list2 = (List) interfaceC4809q1.H1();
                        if (list2 == null) {
                            break;
                        } else {
                            c4799a.x(list2);
                            break;
                        }
                    case "app_version":
                        c4799a.f52315f = interfaceC4809q1.a1();
                        break;
                    case "in_foreground":
                        c4799a.f52320k = interfaceC4809q1.p0();
                        break;
                    case "build_type":
                        c4799a.f52313d = interfaceC4809q1.a1();
                        break;
                    case "app_identifier":
                        c4799a.f52310a = interfaceC4809q1.a1();
                        break;
                    case "app_start_time":
                        c4799a.f52311b = interfaceC4809q1.j0(iLogger);
                        break;
                    case "permissions":
                        c4799a.f52317h = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "app_name":
                        c4799a.f52314e = interfaceC4809q1.a1();
                        break;
                    case "app_build":
                        c4799a.f52316g = interfaceC4809q1.a1();
                        break;
                    case "is_split_apks":
                        c4799a.f52321l = interfaceC4809q1.p0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            c4799a.w(concurrentHashMap);
            interfaceC4809q1.t();
            return c4799a;
        }
    }

    public C4799a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4799a.class == obj.getClass()) {
            C4799a c4799a = (C4799a) obj;
            if (io.sentry.util.w.a(this.f52310a, c4799a.f52310a) && io.sentry.util.w.a(this.f52311b, c4799a.f52311b) && io.sentry.util.w.a(this.f52312c, c4799a.f52312c) && io.sentry.util.w.a(this.f52313d, c4799a.f52313d) && io.sentry.util.w.a(this.f52314e, c4799a.f52314e) && io.sentry.util.w.a(this.f52315f, c4799a.f52315f) && io.sentry.util.w.a(this.f52316g, c4799a.f52316g) && io.sentry.util.w.a(this.f52317h, c4799a.f52317h) && io.sentry.util.w.a(this.f52320k, c4799a.f52320k) && io.sentry.util.w.a(this.f52318i, c4799a.f52318i) && io.sentry.util.w.a(this.f52319j, c4799a.f52319j) && io.sentry.util.w.a(this.f52321l, c4799a.f52321l) && io.sentry.util.w.a(this.f52322m, c4799a.f52322m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52310a, this.f52311b, this.f52312c, this.f52313d, this.f52314e, this.f52315f, this.f52316g, this.f52317h, this.f52320k, this.f52318i, this.f52319j, this.f52321l, this.f52322m);
    }

    public Boolean l() {
        return this.f52320k;
    }

    public void m(String str) {
        this.f52316g = str;
    }

    public void n(String str) {
        this.f52310a = str;
    }

    public void o(String str) {
        this.f52314e = str;
    }

    public void p(Date date) {
        this.f52311b = date;
    }

    public void q(String str) {
        this.f52315f = str;
    }

    public void r(Boolean bool) {
        this.f52320k = bool;
    }

    public void s(Map map) {
        this.f52317h = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52310a != null) {
            interfaceC4813r1.d("app_identifier").e(this.f52310a);
        }
        if (this.f52311b != null) {
            interfaceC4813r1.d("app_start_time").j(iLogger, this.f52311b);
        }
        if (this.f52312c != null) {
            interfaceC4813r1.d("device_app_hash").e(this.f52312c);
        }
        if (this.f52313d != null) {
            interfaceC4813r1.d("build_type").e(this.f52313d);
        }
        if (this.f52314e != null) {
            interfaceC4813r1.d(PublisherMetadata.APP_NAME).e(this.f52314e);
        }
        if (this.f52315f != null) {
            interfaceC4813r1.d(PublisherMetadata.APP_VERSION).e(this.f52315f);
        }
        if (this.f52316g != null) {
            interfaceC4813r1.d("app_build").e(this.f52316g);
        }
        Map map = this.f52317h;
        if (map != null && !map.isEmpty()) {
            interfaceC4813r1.d("permissions").j(iLogger, this.f52317h);
        }
        if (this.f52320k != null) {
            interfaceC4813r1.d("in_foreground").k(this.f52320k);
        }
        if (this.f52318i != null) {
            interfaceC4813r1.d("view_names").j(iLogger, this.f52318i);
        }
        if (this.f52319j != null) {
            interfaceC4813r1.d("start_type").e(this.f52319j);
        }
        if (this.f52321l != null) {
            interfaceC4813r1.d("is_split_apks").k(this.f52321l);
        }
        List list = this.f52322m;
        if (list != null && !list.isEmpty()) {
            interfaceC4813r1.d("split_names").j(iLogger, this.f52322m);
        }
        Map map2 = this.f52323n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52323n.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Boolean bool) {
        this.f52321l = bool;
    }

    public void u(List list) {
        this.f52322m = list;
    }

    public void v(String str) {
        this.f52319j = str;
    }

    public void w(Map map) {
        this.f52323n = map;
    }

    public void x(List list) {
        this.f52318i = list;
    }

    public C4799a(C4799a c4799a) {
        this.f52316g = c4799a.f52316g;
        this.f52310a = c4799a.f52310a;
        this.f52314e = c4799a.f52314e;
        this.f52311b = c4799a.f52311b;
        this.f52315f = c4799a.f52315f;
        this.f52313d = c4799a.f52313d;
        this.f52312c = c4799a.f52312c;
        this.f52317h = AbstractC4845c.b(c4799a.f52317h);
        this.f52320k = c4799a.f52320k;
        this.f52318i = AbstractC4845c.a(c4799a.f52318i);
        this.f52319j = c4799a.f52319j;
        this.f52321l = c4799a.f52321l;
        this.f52322m = c4799a.f52322m;
        this.f52323n = AbstractC4845c.b(c4799a.f52323n);
    }
}
