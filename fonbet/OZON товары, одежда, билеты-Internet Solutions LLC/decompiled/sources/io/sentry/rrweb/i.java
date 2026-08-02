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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i extends b implements InterfaceC7220x0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68446c;

    /* renamed from: d, reason: collision with root package name */
    private String f68447d;

    /* renamed from: e, reason: collision with root package name */
    private String f68448e;

    /* renamed from: f, reason: collision with root package name */
    private double f68449f;

    /* renamed from: g, reason: collision with root package name */
    private double f68450g;

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap f68451h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f68452i;

    /* renamed from: j, reason: collision with root package name */
    private ConcurrentHashMap f68453j;

    /* renamed from: k, reason: collision with root package name */
    private ConcurrentHashMap f68454k;

    public static final class a implements InterfaceC7174n0<i> {
        @NotNull
        public static i b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            i iVar = new i();
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
                                    case "description":
                                        iVar.f68448e = interfaceC7131c1.k0();
                                        break;
                                    case "endTimestamp":
                                        iVar.f68450g = interfaceC7131c1.nextDouble();
                                        break;
                                    case "startTimestamp":
                                        iVar.f68449f = interfaceC7131c1.nextDouble();
                                        break;
                                    case "op":
                                        iVar.f68447d = interfaceC7131c1.k0();
                                        break;
                                    case "data":
                                        ConcurrentHashMap a11 = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                                        if (a11 == null) {
                                            break;
                                        } else {
                                            iVar.f68451h = a11;
                                            break;
                                        }
                                    default:
                                        if (concurrentHashMap == null) {
                                            concurrentHashMap = new ConcurrentHashMap();
                                        }
                                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                                        break;
                                }
                            }
                            iVar.r(concurrentHashMap);
                            interfaceC7131c1.endObject();
                        } else if (nextName3.equals("tag")) {
                            String k02 = interfaceC7131c1.k0();
                            if (k02 == null) {
                                k02 = "";
                            }
                            iVar.f68446c = k02;
                        } else {
                            if (abstractMap2 == null) {
                                abstractMap2 = new ConcurrentHashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, abstractMap2, nextName3);
                        }
                    }
                    iVar.n(abstractMap2);
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(iVar, nextName2, interfaceC7131c1, iLogger)) {
                    if (abstractMap == null) {
                        abstractMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, abstractMap, nextName2);
                }
            }
            iVar.t(abstractMap);
            interfaceC7131c1.endObject();
            return iVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ i a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public i() {
        super(c.Custom);
        this.f68446c = "performanceSpan";
    }

    public final void m(Map<String, Object> map) {
        this.f68451h = new ConcurrentHashMap(map);
    }

    public final void n(Map<String, Object> map) {
        this.f68454k = (ConcurrentHashMap) map;
    }

    public final void o(String str) {
        this.f68448e = str;
    }

    public final void p(double d11) {
        this.f68450g = d11;
    }

    public final void q() {
        this.f68447d = "resource.http";
    }

    public final void r(ConcurrentHashMap concurrentHashMap) {
        this.f68453j = concurrentHashMap;
    }

    public final void s(double d11) {
        this.f68449f = d11;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        c7212v0.g("tag");
        c7212v0.p(this.f68446c);
        c7212v0.g("payload");
        c7212v0.b();
        if (this.f68447d != null) {
            c7212v0.g("op");
            c7212v0.p(this.f68447d);
        }
        if (this.f68448e != null) {
            c7212v0.g("description");
            c7212v0.p(this.f68448e);
        }
        c7212v0.g("startTimestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f68449f));
        c7212v0.g("endTimestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f68450g));
        if (this.f68451h != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68451h);
        }
        ConcurrentHashMap concurrentHashMap = this.f68453j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68453j, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        ConcurrentHashMap concurrentHashMap2 = this.f68454k;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                C7137e.b(this.f68454k, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
        HashMap hashMap = this.f68452i;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                w.e(this.f68452i, str3, c7212v0, str3, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Map<String, Object> map) {
        this.f68452i = (HashMap) map;
    }
}
