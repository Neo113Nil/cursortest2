package io.sentry.rrweb;

import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lb.C5444x;

/* loaded from: classes3.dex */
public final class f extends d implements G0 {

    /* renamed from: d, reason: collision with root package name */
    public int f52652d;

    /* renamed from: e, reason: collision with root package name */
    public List f52653e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52654f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52655g;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            f fVar = new f();
            b.a aVar = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(fVar, interfaceC4809q1, iLogger);
                } else if (!aVar.a(fVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            fVar.o(hashMap);
            interfaceC4809q1.t();
            return fVar;
        }

        public final void c(f fVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            d.a aVar = new d.a();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("pointerId")) {
                    fVar.f52652d = interfaceC4809q1.nextInt();
                } else if (f02.equals("positions")) {
                    fVar.f52653e = interfaceC4809q1.P1(iLogger, new b.a());
                } else if (!aVar.a(fVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            fVar.l(hashMap);
            interfaceC4809q1.t();
        }
    }

    public static final class b implements G0 {

        /* renamed from: a, reason: collision with root package name */
        public int f52656a;

        /* renamed from: b, reason: collision with root package name */
        public float f52657b;

        /* renamed from: c, reason: collision with root package name */
        public float f52658c;

        /* renamed from: d, reason: collision with root package name */
        public long f52659d;

        /* renamed from: e, reason: collision with root package name */
        public Map f52660e;

        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                String f02;
                interfaceC4809q1.m();
                b bVar = new b();
                HashMap hashMap = null;
                while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    f02 = interfaceC4809q1.f0();
                    f02.getClass();
                    switch (f02) {
                        case "x":
                            bVar.f52657b = interfaceC4809q1.nextFloat();
                            break;
                        case "y":
                            bVar.f52658c = interfaceC4809q1.nextFloat();
                            break;
                        case "id":
                            bVar.f52656a = interfaceC4809q1.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f52659d = interfaceC4809q1.nextLong();
                            break;
                        default:
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            interfaceC4809q1.g1(iLogger, hashMap, f02);
                            break;
                    }
                }
                bVar.h(hashMap);
                interfaceC4809q1.t();
                return bVar;
            }
        }

        public long e() {
            return this.f52659d;
        }

        public void f(int i10) {
            this.f52656a = i10;
        }

        public void g(long j10) {
            this.f52659d = j10;
        }

        public void h(Map map) {
            this.f52660e = map;
        }

        public void i(float f10) {
            this.f52657b = f10;
        }

        public void j(float f10) {
            this.f52658c = f10;
        }

        @Override // io.sentry.G0
        public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
            interfaceC4813r1.m();
            interfaceC4813r1.d(StackTraceHelper.ID_KEY).a(this.f52656a);
            interfaceC4813r1.d(C5444x.f55808b).b(this.f52657b);
            interfaceC4813r1.d("y").b(this.f52658c);
            interfaceC4813r1.d("timeOffset").a(this.f52659d);
            Map map = this.f52660e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f52660e.get(str);
                    interfaceC4813r1.d(str);
                    interfaceC4813r1.j(iLogger, obj);
                }
            }
            interfaceC4813r1.t();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new d.c().a(this, interfaceC4813r1, iLogger);
        List list = this.f52653e;
        if (list != null && !list.isEmpty()) {
            interfaceC4813r1.d("positions").j(iLogger, this.f52653e);
        }
        interfaceC4813r1.d("pointerId").a(this.f52652d);
        Map map = this.f52655g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52655g.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void l(Map map) {
        this.f52655g = map;
    }

    public void m(int i10) {
        this.f52652d = i10;
    }

    public void n(List list) {
        this.f52653e = list;
    }

    public void o(Map map) {
        this.f52654f = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        k(interfaceC4813r1, iLogger);
        Map map = this.f52654f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52654f.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }
}
