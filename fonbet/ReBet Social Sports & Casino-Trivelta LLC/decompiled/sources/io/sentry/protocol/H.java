package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lb.C5444x;

/* loaded from: classes3.dex */
public final class H implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52298a;

    /* renamed from: b, reason: collision with root package name */
    public String f52299b;

    /* renamed from: c, reason: collision with root package name */
    public String f52300c;

    /* renamed from: d, reason: collision with root package name */
    public String f52301d;

    /* renamed from: e, reason: collision with root package name */
    public Double f52302e;

    /* renamed from: f, reason: collision with root package name */
    public Double f52303f;

    /* renamed from: g, reason: collision with root package name */
    public Double f52304g;

    /* renamed from: h, reason: collision with root package name */
    public Double f52305h;

    /* renamed from: i, reason: collision with root package name */
    public String f52306i;

    /* renamed from: j, reason: collision with root package name */
    public Double f52307j;

    /* renamed from: k, reason: collision with root package name */
    public List f52308k;

    /* renamed from: l, reason: collision with root package name */
    public Map f52309l;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public H a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            H h10 = new H();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "rendering_system":
                        h10.f52298a = interfaceC4809q1.a1();
                        break;
                    case "identifier":
                        h10.f52300c = interfaceC4809q1.a1();
                        break;
                    case "height":
                        h10.f52303f = interfaceC4809q1.e0();
                        break;
                    case "x":
                        h10.f52304g = interfaceC4809q1.e0();
                        break;
                    case "y":
                        h10.f52305h = interfaceC4809q1.e0();
                        break;
                    case "tag":
                        h10.f52301d = interfaceC4809q1.a1();
                        break;
                    case "type":
                        h10.f52299b = interfaceC4809q1.a1();
                        break;
                    case "alpha":
                        h10.f52307j = interfaceC4809q1.e0();
                        break;
                    case "width":
                        h10.f52302e = interfaceC4809q1.e0();
                        break;
                    case "children":
                        h10.f52308k = interfaceC4809q1.P1(iLogger, this);
                        break;
                    case "visibility":
                        h10.f52306i = interfaceC4809q1.a1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            interfaceC4809q1.t();
            h10.q(hashMap);
            return h10;
        }
    }

    public void l(Double d10) {
        this.f52307j = d10;
    }

    public void m(List list) {
        this.f52308k = list;
    }

    public void n(Double d10) {
        this.f52303f = d10;
    }

    public void o(String str) {
        this.f52300c = str;
    }

    public void p(String str) {
        this.f52299b = str;
    }

    public void q(Map map) {
        this.f52309l = map;
    }

    public void r(String str) {
        this.f52306i = str;
    }

    public void s(Double d10) {
        this.f52302e = d10;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52298a != null) {
            interfaceC4813r1.d("rendering_system").e(this.f52298a);
        }
        if (this.f52299b != null) {
            interfaceC4813r1.d("type").e(this.f52299b);
        }
        if (this.f52300c != null) {
            interfaceC4813r1.d("identifier").e(this.f52300c);
        }
        if (this.f52301d != null) {
            interfaceC4813r1.d("tag").e(this.f52301d);
        }
        if (this.f52302e != null) {
            interfaceC4813r1.d("width").i(this.f52302e);
        }
        if (this.f52303f != null) {
            interfaceC4813r1.d("height").i(this.f52303f);
        }
        if (this.f52304g != null) {
            interfaceC4813r1.d(C5444x.f55808b).i(this.f52304g);
        }
        if (this.f52305h != null) {
            interfaceC4813r1.d("y").i(this.f52305h);
        }
        if (this.f52306i != null) {
            interfaceC4813r1.d("visibility").e(this.f52306i);
        }
        if (this.f52307j != null) {
            interfaceC4813r1.d("alpha").i(this.f52307j);
        }
        List list = this.f52308k;
        if (list != null && !list.isEmpty()) {
            interfaceC4813r1.d("children").j(iLogger, this.f52308k);
        }
        Map map = this.f52309l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52309l.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Double d10) {
        this.f52304g = d10;
    }

    public void u(Double d10) {
        this.f52305h = d10;
    }
}
