package io.sentry.rrweb;

import com.facebook.react.uimanager.ViewProps;
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
public final class j extends b implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public String f52679c;

    /* renamed from: d, reason: collision with root package name */
    public int f52680d;

    /* renamed from: e, reason: collision with root package name */
    public long f52681e;

    /* renamed from: f, reason: collision with root package name */
    public long f52682f;

    /* renamed from: g, reason: collision with root package name */
    public String f52683g;

    /* renamed from: h, reason: collision with root package name */
    public String f52684h;

    /* renamed from: i, reason: collision with root package name */
    public int f52685i;

    /* renamed from: j, reason: collision with root package name */
    public int f52686j;

    /* renamed from: k, reason: collision with root package name */
    public int f52687k;

    /* renamed from: l, reason: collision with root package name */
    public String f52688l;

    /* renamed from: m, reason: collision with root package name */
    public int f52689m;

    /* renamed from: n, reason: collision with root package name */
    public int f52690n;

    /* renamed from: o, reason: collision with root package name */
    public int f52691o;

    /* renamed from: p, reason: collision with root package name */
    public Map f52692p;

    /* renamed from: q, reason: collision with root package name */
    public Map f52693q;

    /* renamed from: r, reason: collision with root package name */
    public Map f52694r;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(jVar, interfaceC4809q1, iLogger);
                } else if (!aVar.a(jVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            jVar.F(hashMap);
            interfaceC4809q1.t();
            return jVar;
        }

        public final void c(j jVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.PAYLOAD)) {
                    d(jVar, interfaceC4809q1, iLogger);
                } else if (f02.equals("tag")) {
                    String a12 = interfaceC4809q1.a1();
                    if (a12 == null) {
                        a12 = "";
                    }
                    jVar.f52679c = a12;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            jVar.v(concurrentHashMap);
            interfaceC4809q1.t();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(j jVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                char c10 = 65535;
                switch (f02.hashCode()) {
                    case -1992012396:
                        if (f02.equals("duration")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1627805778:
                        if (f02.equals("segmentId")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1221029593:
                        if (f02.equals("height")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -410956671:
                        if (f02.equals("container")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -296512606:
                        if (f02.equals("frameCount")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 115029:
                        if (f02.equals(ViewProps.TOP)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 3317767:
                        if (f02.equals(ViewProps.LEFT)) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 3530753:
                        if (f02.equals("size")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 113126854:
                        if (f02.equals("width")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 545057773:
                        if (f02.equals("frameRate")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1711222099:
                        if (f02.equals("encoding")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 2135109831:
                        if (f02.equals("frameRateType")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        jVar.f52682f = interfaceC4809q1.nextLong();
                        break;
                    case 1:
                        jVar.f52680d = interfaceC4809q1.nextInt();
                        break;
                    case 2:
                        Integer Q02 = interfaceC4809q1.Q0();
                        jVar.f52685i = Q02 != null ? Q02.intValue() : 0;
                        break;
                    case 3:
                        String a12 = interfaceC4809q1.a1();
                        jVar.f52684h = a12 != null ? a12 : "";
                        break;
                    case 4:
                        Integer Q03 = interfaceC4809q1.Q0();
                        jVar.f52687k = Q03 != null ? Q03.intValue() : 0;
                        break;
                    case 5:
                        Integer Q04 = interfaceC4809q1.Q0();
                        jVar.f52691o = Q04 != null ? Q04.intValue() : 0;
                        break;
                    case 6:
                        Integer Q05 = interfaceC4809q1.Q0();
                        jVar.f52690n = Q05 != null ? Q05.intValue() : 0;
                        break;
                    case 7:
                        Long U02 = interfaceC4809q1.U0();
                        jVar.f52681e = U02 == null ? 0L : U02.longValue();
                        break;
                    case '\b':
                        Integer Q06 = interfaceC4809q1.Q0();
                        jVar.f52686j = Q06 != null ? Q06.intValue() : 0;
                        break;
                    case '\t':
                        Integer Q07 = interfaceC4809q1.Q0();
                        jVar.f52689m = Q07 != null ? Q07.intValue() : 0;
                        break;
                    case '\n':
                        String a13 = interfaceC4809q1.a1();
                        jVar.f52683g = a13 != null ? a13 : "";
                        break;
                    case 11:
                        String a14 = interfaceC4809q1.a1();
                        jVar.f52688l = a14 != null ? a14 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            interfaceC4809q1.t();
        }
    }

    public j() {
        super(c.Custom);
        this.f52683g = "h264";
        this.f52684h = "mp4";
        this.f52688l = "constant";
        this.f52679c = "video";
    }

    private void t(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("tag").e(this.f52679c);
        interfaceC4813r1.d(EventKeys.PAYLOAD);
        u(interfaceC4813r1, iLogger);
        Map map = this.f52694r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52694r.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    private void u(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("segmentId").a(this.f52680d);
        interfaceC4813r1.d("size").a(this.f52681e);
        interfaceC4813r1.d("duration").a(this.f52682f);
        interfaceC4813r1.d("encoding").e(this.f52683g);
        interfaceC4813r1.d("container").e(this.f52684h);
        interfaceC4813r1.d("height").a(this.f52685i);
        interfaceC4813r1.d("width").a(this.f52686j);
        interfaceC4813r1.d("frameCount").a(this.f52687k);
        interfaceC4813r1.d("frameRate").a(this.f52689m);
        interfaceC4813r1.d("frameRateType").e(this.f52688l);
        interfaceC4813r1.d(ViewProps.LEFT).a(this.f52690n);
        interfaceC4813r1.d(ViewProps.TOP).a(this.f52691o);
        Map map = this.f52693q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52693q.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void A(int i10) {
        this.f52690n = i10;
    }

    public void B(Map map) {
        this.f52693q = map;
    }

    public void C(int i10) {
        this.f52680d = i10;
    }

    public void D(long j10) {
        this.f52681e = j10;
    }

    public void E(int i10) {
        this.f52691o = i10;
    }

    public void F(Map map) {
        this.f52692p = map;
    }

    public void G(int i10) {
        this.f52686j = i10;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f52680d == jVar.f52680d && this.f52681e == jVar.f52681e && this.f52682f == jVar.f52682f && this.f52685i == jVar.f52685i && this.f52686j == jVar.f52686j && this.f52687k == jVar.f52687k && this.f52689m == jVar.f52689m && this.f52690n == jVar.f52690n && this.f52691o == jVar.f52691o && w.a(this.f52679c, jVar.f52679c) && w.a(this.f52683g, jVar.f52683g) && w.a(this.f52684h, jVar.f52684h) && w.a(this.f52688l, jVar.f52688l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f52679c, Integer.valueOf(this.f52680d), Long.valueOf(this.f52681e), Long.valueOf(this.f52682f), this.f52683g, this.f52684h, Integer.valueOf(this.f52685i), Integer.valueOf(this.f52686j), Integer.valueOf(this.f52687k), this.f52688l, Integer.valueOf(this.f52689m), Integer.valueOf(this.f52690n), Integer.valueOf(this.f52691o));
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        t(interfaceC4813r1, iLogger);
        Map map = this.f52692p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52692p.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void v(Map map) {
        this.f52694r = map;
    }

    public void w(long j10) {
        this.f52682f = j10;
    }

    public void x(int i10) {
        this.f52687k = i10;
    }

    public void y(int i10) {
        this.f52689m = i10;
    }

    public void z(int i10) {
        this.f52685i = i10;
    }
}
