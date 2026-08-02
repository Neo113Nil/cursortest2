package io.sentry.rrweb;

import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.rrweb.b;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class g extends b implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public String f52661c;

    /* renamed from: d, reason: collision with root package name */
    public int f52662d;

    /* renamed from: e, reason: collision with root package name */
    public int f52663e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52664f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52665g;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(gVar, interfaceC4809q1, iLogger);
                } else if (!aVar.a(gVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            gVar.m(hashMap);
            interfaceC4809q1.t();
            return gVar;
        }

        public final void c(g gVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "height":
                        Integer Q02 = interfaceC4809q1.Q0();
                        gVar.f52662d = Q02 != null ? Q02.intValue() : 0;
                        break;
                    case "href":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            a12 = "";
                        }
                        gVar.f52661c = a12;
                        break;
                    case "width":
                        Integer Q03 = interfaceC4809q1.Q0();
                        gVar.f52663e = Q03 != null ? Q03.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            interfaceC4809q1.t();
        }
    }

    public g() {
        super(c.Meta);
        this.f52661c = "";
    }

    private void j(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("href").e(this.f52661c);
        interfaceC4813r1.d("height").a(this.f52662d);
        interfaceC4813r1.d("width").a(this.f52663e);
        Map map = this.f52664f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52664f.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f52662d == gVar.f52662d && this.f52663e == gVar.f52663e && w.a(this.f52661c, gVar.f52661c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f52661c, Integer.valueOf(this.f52662d), Integer.valueOf(this.f52663e));
    }

    public void k(Map map) {
        this.f52665g = map;
    }

    public void l(int i10) {
        this.f52662d = i10;
    }

    public void m(Map map) {
        this.f52664f = map;
    }

    public void n(int i10) {
        this.f52663e = i10;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        j(interfaceC4813r1, iLogger);
        interfaceC4813r1.t();
    }
}
