package io.sentry.rrweb;

import I1.w;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.rrweb.b;
import io.sentry.util.p;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j extends b implements InterfaceC7220x0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68455c;

    /* renamed from: d, reason: collision with root package name */
    private int f68456d;

    /* renamed from: e, reason: collision with root package name */
    private long f68457e;

    /* renamed from: f, reason: collision with root package name */
    private long f68458f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f68459g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f68460h;

    /* renamed from: i, reason: collision with root package name */
    private int f68461i;

    /* renamed from: j, reason: collision with root package name */
    private int f68462j;

    /* renamed from: k, reason: collision with root package name */
    private int f68463k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private String f68464l;

    /* renamed from: m, reason: collision with root package name */
    private int f68465m;

    /* renamed from: n, reason: collision with root package name */
    private int f68466n;

    /* renamed from: o, reason: collision with root package name */
    private int f68467o;

    /* renamed from: p, reason: collision with root package name */
    private HashMap f68468p;

    /* renamed from: q, reason: collision with root package name */
    private ConcurrentHashMap f68469q;

    /* renamed from: r, reason: collision with root package name */
    private ConcurrentHashMap f68470r;

    public static final class a implements InterfaceC7174n0<j> {
        @NotNull
        public static j b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            j jVar = new j();
            AbstractMap abstractMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName2 = interfaceC7131c1.nextName();
                nextName2.getClass();
                if (nextName2.equals("data")) {
                    interfaceC7131c1.beginObject();
                    AbstractMap abstractMap2 = null;
                    while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String nextName3 = interfaceC7131c1.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("payload")) {
                            interfaceC7131c1.beginObject();
                            ConcurrentHashMap concurrentHashMap = null;
                            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                nextName = interfaceC7131c1.nextName();
                                nextName.getClass();
                                switch (nextName) {
                                    case "duration":
                                        jVar.f68458f = interfaceC7131c1.nextLong();
                                        break;
                                    case "segmentId":
                                        jVar.f68456d = interfaceC7131c1.nextInt();
                                        break;
                                    case "height":
                                        Integer A12 = interfaceC7131c1.A1();
                                        jVar.f68461i = A12 == null ? 0 : A12.intValue();
                                        break;
                                    case "container":
                                        String k02 = interfaceC7131c1.k0();
                                        if (k02 == null) {
                                            k02 = "";
                                        }
                                        jVar.f68460h = k02;
                                        break;
                                    case "frameCount":
                                        Integer A13 = interfaceC7131c1.A1();
                                        jVar.f68463k = A13 == null ? 0 : A13.intValue();
                                        break;
                                    case "top":
                                        Integer A14 = interfaceC7131c1.A1();
                                        jVar.f68467o = A14 == null ? 0 : A14.intValue();
                                        break;
                                    case "left":
                                        Integer A15 = interfaceC7131c1.A1();
                                        jVar.f68466n = A15 == null ? 0 : A15.intValue();
                                        break;
                                    case "size":
                                        Long D12 = interfaceC7131c1.D1();
                                        jVar.f68457e = D12 == null ? 0L : D12.longValue();
                                        break;
                                    case "width":
                                        Integer A16 = interfaceC7131c1.A1();
                                        jVar.f68462j = A16 == null ? 0 : A16.intValue();
                                        break;
                                    case "frameRate":
                                        Integer A17 = interfaceC7131c1.A1();
                                        jVar.f68465m = A17 == null ? 0 : A17.intValue();
                                        break;
                                    case "encoding":
                                        String k03 = interfaceC7131c1.k0();
                                        if (k03 == null) {
                                            k03 = "";
                                        }
                                        jVar.f68459g = k03;
                                        break;
                                    case "frameRateType":
                                        String k04 = interfaceC7131c1.k0();
                                        if (k04 == null) {
                                            k04 = "";
                                        }
                                        jVar.f68464l = k04;
                                        break;
                                    default:
                                        if (concurrentHashMap == null) {
                                            concurrentHashMap = new ConcurrentHashMap();
                                        }
                                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                                        break;
                                }
                            }
                            jVar.z(concurrentHashMap);
                            interfaceC7131c1.endObject();
                        } else if (nextName3.equals("tag")) {
                            String k05 = interfaceC7131c1.k0();
                            jVar.f68455c = k05 != null ? k05 : "";
                        } else {
                            if (abstractMap2 == null) {
                                abstractMap2 = new ConcurrentHashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, abstractMap2, nextName3);
                        }
                    }
                    jVar.t(abstractMap2);
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(jVar, nextName2, interfaceC7131c1, iLogger)) {
                    if (abstractMap == null) {
                        abstractMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, abstractMap, nextName2);
                }
            }
            jVar.D(abstractMap);
            interfaceC7131c1.endObject();
            return jVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ j a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public j() {
        super(c.Custom);
        this.f68459g = "h264";
        this.f68460h = "mp4";
        this.f68464l = "constant";
        this.f68455c = "video";
    }

    public final void A(int i11) {
        this.f68456d = i11;
    }

    public final void B(long j11) {
        this.f68457e = j11;
    }

    public final void C() {
        this.f68467o = 0;
    }

    public final void D(Map<String, Object> map) {
        this.f68468p = (HashMap) map;
    }

    public final void E(int i11) {
        this.f68462j = i11;
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f68456d == jVar.f68456d && this.f68457e == jVar.f68457e && this.f68458f == jVar.f68458f && this.f68461i == jVar.f68461i && this.f68462j == jVar.f68462j && this.f68463k == jVar.f68463k && this.f68465m == jVar.f68465m && this.f68466n == jVar.f68466n && this.f68467o == jVar.f68467o && p.a(this.f68455c, jVar.f68455c) && p.a(this.f68459g, jVar.f68459g) && p.a(this.f68460h, jVar.f68460h) && p.a(this.f68464l, jVar.f68464l);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f68455c, Integer.valueOf(this.f68456d), Long.valueOf(this.f68457e), Long.valueOf(this.f68458f), this.f68459g, this.f68460h, Integer.valueOf(this.f68461i), Integer.valueOf(this.f68462j), Integer.valueOf(this.f68463k), this.f68464l, Integer.valueOf(this.f68465m), Integer.valueOf(this.f68466n), Integer.valueOf(this.f68467o)});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        c7212v0.g("tag");
        c7212v0.p(this.f68455c);
        c7212v0.g("payload");
        c7212v0.b();
        c7212v0.g("segmentId");
        c7212v0.l(this.f68456d);
        c7212v0.g("size");
        c7212v0.l(this.f68457e);
        c7212v0.g("duration");
        c7212v0.l(this.f68458f);
        c7212v0.g("encoding");
        c7212v0.p(this.f68459g);
        c7212v0.g("container");
        c7212v0.p(this.f68460h);
        c7212v0.g("height");
        c7212v0.l(this.f68461i);
        c7212v0.g("width");
        c7212v0.l(this.f68462j);
        c7212v0.g("frameCount");
        c7212v0.l(this.f68463k);
        c7212v0.g("frameRate");
        c7212v0.l(this.f68465m);
        c7212v0.g("frameRateType");
        c7212v0.p(this.f68464l);
        c7212v0.g("left");
        c7212v0.l(this.f68466n);
        c7212v0.g("top");
        c7212v0.l(this.f68467o);
        ConcurrentHashMap concurrentHashMap = this.f68469q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68469q, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        ConcurrentHashMap concurrentHashMap2 = this.f68470r;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C7137e.b(this.f68470r, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
        HashMap hashMap = this.f68468p;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                w.e(this.f68468p, str3, c7212v0, str3, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Map<String, Object> map) {
        this.f68470r = (ConcurrentHashMap) map;
    }

    public final void u(long j11) {
        this.f68458f = j11;
    }

    public final void v(int i11) {
        this.f68463k = i11;
    }

    public final void w(int i11) {
        this.f68465m = i11;
    }

    public final void x(int i11) {
        this.f68461i = i11;
    }

    public final void y() {
        this.f68466n = 0;
    }

    public final void z(ConcurrentHashMap concurrentHashMap) {
        this.f68469q = concurrentHashMap;
    }
}
