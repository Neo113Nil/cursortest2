package io.sentry.rrweb;

import I1.w;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.rrweb.b;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends b implements InterfaceC7220x0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68410c;

    /* renamed from: d, reason: collision with root package name */
    private double f68411d;

    /* renamed from: e, reason: collision with root package name */
    private String f68412e;

    /* renamed from: f, reason: collision with root package name */
    private String f68413f;

    /* renamed from: g, reason: collision with root package name */
    private String f68414g;

    /* renamed from: h, reason: collision with root package name */
    private I2 f68415h;

    /* renamed from: i, reason: collision with root package name */
    private ConcurrentHashMap f68416i;

    /* renamed from: j, reason: collision with root package name */
    private HashMap f68417j;

    /* renamed from: k, reason: collision with root package name */
    private ConcurrentHashMap f68418k;

    /* renamed from: l, reason: collision with root package name */
    private ConcurrentHashMap f68419l;

    /* renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C1118a implements InterfaceC7174n0<a> {
        @NotNull
        public static a b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            a aVar = new a();
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
                                    case "data":
                                        ConcurrentHashMap a11 = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                                        if (a11 == null) {
                                            break;
                                        } else {
                                            aVar.f68416i = a11;
                                            break;
                                        }
                                    case "type":
                                        aVar.f68412e = interfaceC7131c1.k0();
                                        break;
                                    case "category":
                                        aVar.f68413f = interfaceC7131c1.k0();
                                        break;
                                    case "timestamp":
                                        aVar.f68411d = interfaceC7131c1.nextDouble();
                                        break;
                                    case "level":
                                        try {
                                            aVar.f68415h = I2.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
                                            break;
                                        } catch (Exception e11) {
                                            iLogger.b(I2.DEBUG, e11, "Error when deserializing SentryLevel", new Object[0]);
                                            break;
                                        }
                                    case "message":
                                        aVar.f68414g = interfaceC7131c1.k0();
                                        break;
                                    default:
                                        if (concurrentHashMap == null) {
                                            concurrentHashMap = new ConcurrentHashMap();
                                        }
                                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                                        break;
                                }
                            }
                            aVar.w(concurrentHashMap);
                            interfaceC7131c1.endObject();
                        } else if (nextName3.equals("tag")) {
                            String k02 = interfaceC7131c1.k0();
                            if (k02 == null) {
                                k02 = "";
                            }
                            aVar.f68410c = k02;
                        } else {
                            if (abstractMap2 == null) {
                                abstractMap2 = new ConcurrentHashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, abstractMap2, nextName3);
                        }
                    }
                    aVar.t(abstractMap2);
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(aVar, nextName2, interfaceC7131c1, iLogger)) {
                    if (abstractMap == null) {
                        abstractMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, abstractMap, nextName2);
                }
            }
            aVar.x(abstractMap);
            interfaceC7131c1.endObject();
            return aVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ a a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public a() {
        super(c.Custom);
        this.f68410c = "breadcrumb";
    }

    public final String n() {
        return this.f68413f;
    }

    public final Map<String, Object> o() {
        return this.f68416i;
    }

    public final void p(double d11) {
        this.f68411d = d11;
    }

    public final void q() {
        this.f68412e = "default";
    }

    public final void r(String str) {
        this.f68413f = str;
    }

    public final void s(Map<String, Object> map) {
        this.f68416i = new ConcurrentHashMap(map);
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        c7212v0.g("tag");
        c7212v0.p(this.f68410c);
        c7212v0.g("payload");
        c7212v0.b();
        if (this.f68412e != null) {
            c7212v0.g("type");
            c7212v0.p(this.f68412e);
        }
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f68411d));
        if (this.f68413f != null) {
            c7212v0.g("category");
            c7212v0.p(this.f68413f);
        }
        if (this.f68414g != null) {
            c7212v0.g("message");
            c7212v0.p(this.f68414g);
        }
        if (this.f68415h != null) {
            c7212v0.g("level");
            c7212v0.m(iLogger, this.f68415h);
        }
        if (this.f68416i != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68416i);
        }
        ConcurrentHashMap concurrentHashMap = this.f68418k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68418k, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        ConcurrentHashMap concurrentHashMap2 = this.f68419l;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C7137e.b(this.f68419l, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
        HashMap hashMap = this.f68417j;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                w.e(this.f68417j, str3, c7212v0, str3, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Map<String, Object> map) {
        this.f68419l = (ConcurrentHashMap) map;
    }

    public final void u(I2 i22) {
        this.f68415h = i22;
    }

    public final void v(String str) {
        this.f68414g = str;
    }

    public final void w(ConcurrentHashMap concurrentHashMap) {
        this.f68418k = concurrentHashMap;
    }

    public final void x(Map<String, Object> map) {
        this.f68417j = (HashMap) map;
    }
}
