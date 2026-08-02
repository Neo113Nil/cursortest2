package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class p implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52430a;

    /* renamed from: b, reason: collision with root package name */
    public String f52431b;

    /* renamed from: c, reason: collision with root package name */
    public String f52432c;

    /* renamed from: d, reason: collision with root package name */
    public Object f52433d;

    /* renamed from: e, reason: collision with root package name */
    public String f52434e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52435f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52436g;

    /* renamed from: h, reason: collision with root package name */
    public Long f52437h;

    /* renamed from: i, reason: collision with root package name */
    public Map f52438i;

    /* renamed from: j, reason: collision with root package name */
    public String f52439j;

    /* renamed from: k, reason: collision with root package name */
    public String f52440k;

    /* renamed from: l, reason: collision with root package name */
    public Map f52441l;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "fragment":
                        pVar.f52439j = interfaceC4809q1.a1();
                        break;
                    case "method":
                        pVar.f52431b = interfaceC4809q1.a1();
                        break;
                    case "env":
                        Map map = (Map) interfaceC4809q1.H1();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f52436g = AbstractC4845c.b(map);
                            break;
                        }
                    case "url":
                        pVar.f52430a = interfaceC4809q1.a1();
                        break;
                    case "data":
                        pVar.f52433d = interfaceC4809q1.H1();
                        break;
                    case "other":
                        Map map2 = (Map) interfaceC4809q1.H1();
                        if (map2 == null) {
                            break;
                        } else {
                            pVar.f52438i = AbstractC4845c.b(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) interfaceC4809q1.H1();
                        if (map3 == null) {
                            break;
                        } else {
                            pVar.f52435f = AbstractC4845c.b(map3);
                            break;
                        }
                    case "cookies":
                        pVar.f52434e = interfaceC4809q1.a1();
                        break;
                    case "body_size":
                        pVar.f52437h = interfaceC4809q1.U0();
                        break;
                    case "query_string":
                        pVar.f52432c = interfaceC4809q1.a1();
                        break;
                    case "api_target":
                        pVar.f52440k = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            pVar.m(concurrentHashMap);
            interfaceC4809q1.t();
            return pVar;
        }
    }

    public p() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (io.sentry.util.w.a(this.f52430a, pVar.f52430a) && io.sentry.util.w.a(this.f52431b, pVar.f52431b) && io.sentry.util.w.a(this.f52432c, pVar.f52432c) && io.sentry.util.w.a(this.f52434e, pVar.f52434e) && io.sentry.util.w.a(this.f52435f, pVar.f52435f) && io.sentry.util.w.a(this.f52436g, pVar.f52436g) && io.sentry.util.w.a(this.f52437h, pVar.f52437h) && io.sentry.util.w.a(this.f52439j, pVar.f52439j) && io.sentry.util.w.a(this.f52440k, pVar.f52440k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52430a, this.f52431b, this.f52432c, this.f52434e, this.f52435f, this.f52436g, this.f52437h, this.f52439j, this.f52440k);
    }

    public Map l() {
        return this.f52435f;
    }

    public void m(Map map) {
        this.f52441l = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52430a != null) {
            interfaceC4813r1.d(EventKeys.URL).e(this.f52430a);
        }
        if (this.f52431b != null) {
            interfaceC4813r1.d("method").e(this.f52431b);
        }
        if (this.f52432c != null) {
            interfaceC4813r1.d("query_string").e(this.f52432c);
        }
        if (this.f52433d != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52433d);
        }
        if (this.f52434e != null) {
            interfaceC4813r1.d("cookies").e(this.f52434e);
        }
        if (this.f52435f != null) {
            interfaceC4813r1.d("headers").j(iLogger, this.f52435f);
        }
        if (this.f52436g != null) {
            interfaceC4813r1.d("env").j(iLogger, this.f52436g);
        }
        if (this.f52438i != null) {
            interfaceC4813r1.d("other").j(iLogger, this.f52438i);
        }
        if (this.f52439j != null) {
            interfaceC4813r1.d("fragment").j(iLogger, this.f52439j);
        }
        if (this.f52437h != null) {
            interfaceC4813r1.d("body_size").j(iLogger, this.f52437h);
        }
        if (this.f52440k != null) {
            interfaceC4813r1.d("api_target").j(iLogger, this.f52440k);
        }
        Map map = this.f52441l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52441l.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public p(p pVar) {
        this.f52430a = pVar.f52430a;
        this.f52434e = pVar.f52434e;
        this.f52431b = pVar.f52431b;
        this.f52432c = pVar.f52432c;
        this.f52435f = AbstractC4845c.b(pVar.f52435f);
        this.f52436g = AbstractC4845c.b(pVar.f52436g);
        this.f52438i = AbstractC4845c.b(pVar.f52438i);
        this.f52441l = AbstractC4845c.b(pVar.f52441l);
        this.f52433d = pVar.f52433d;
        this.f52439j = pVar.f52439j;
        this.f52437h = pVar.f52437h;
        this.f52440k = pVar.f52440k;
    }
}
