package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class o implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52423a;

    /* renamed from: b, reason: collision with root package name */
    public String f52424b;

    /* renamed from: c, reason: collision with root package name */
    public String f52425c;

    /* renamed from: d, reason: collision with root package name */
    public String f52426d;

    /* renamed from: e, reason: collision with root package name */
    public String f52427e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f52428f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52429g;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "rooted":
                        oVar.f52428f = interfaceC4809q1.p0();
                        break;
                    case "raw_description":
                        oVar.f52425c = interfaceC4809q1.a1();
                        break;
                    case "name":
                        oVar.f52423a = interfaceC4809q1.a1();
                        break;
                    case "build":
                        oVar.f52426d = interfaceC4809q1.a1();
                        break;
                    case "version":
                        oVar.f52424b = interfaceC4809q1.a1();
                        break;
                    case "kernel_version":
                        oVar.f52427e = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            oVar.l(concurrentHashMap);
            interfaceC4809q1.t();
            return oVar;
        }
    }

    public o() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (io.sentry.util.w.a(this.f52423a, oVar.f52423a) && io.sentry.util.w.a(this.f52424b, oVar.f52424b) && io.sentry.util.w.a(this.f52425c, oVar.f52425c) && io.sentry.util.w.a(this.f52426d, oVar.f52426d) && io.sentry.util.w.a(this.f52427e, oVar.f52427e) && io.sentry.util.w.a(this.f52428f, oVar.f52428f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f52423a;
    }

    public void h(String str) {
        this.f52426d = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52423a, this.f52424b, this.f52425c, this.f52426d, this.f52427e, this.f52428f);
    }

    public void i(String str) {
        this.f52427e = str;
    }

    public void j(String str) {
        this.f52423a = str;
    }

    public void k(Boolean bool) {
        this.f52428f = bool;
    }

    public void l(Map map) {
        this.f52429g = map;
    }

    public void m(String str) {
        this.f52424b = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52423a != null) {
            interfaceC4813r1.d("name").e(this.f52423a);
        }
        if (this.f52424b != null) {
            interfaceC4813r1.d("version").e(this.f52424b);
        }
        if (this.f52425c != null) {
            interfaceC4813r1.d("raw_description").e(this.f52425c);
        }
        if (this.f52426d != null) {
            interfaceC4813r1.d("build").e(this.f52426d);
        }
        if (this.f52427e != null) {
            interfaceC4813r1.d("kernel_version").e(this.f52427e);
        }
        if (this.f52428f != null) {
            interfaceC4813r1.d("rooted").k(this.f52428f);
        }
        Map map = this.f52429g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52429g.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public o(o oVar) {
        this.f52423a = oVar.f52423a;
        this.f52424b = oVar.f52424b;
        this.f52425c = oVar.f52425c;
        this.f52426d = oVar.f52426d;
        this.f52427e = oVar.f52427e;
        this.f52428f = oVar.f52428f;
        this.f52429g = AbstractC4845c.b(oVar.f52429g);
    }
}
