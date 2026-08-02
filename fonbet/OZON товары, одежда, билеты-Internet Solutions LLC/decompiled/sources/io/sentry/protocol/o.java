package io.sentry.protocol;

import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68278a;

    /* renamed from: b, reason: collision with root package name */
    private String f68279b;

    /* renamed from: c, reason: collision with root package name */
    private String f68280c;

    /* renamed from: d, reason: collision with root package name */
    private Object f68281d;

    /* renamed from: e, reason: collision with root package name */
    private String f68282e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap f68283f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap f68284g;

    /* renamed from: h, reason: collision with root package name */
    private Long f68285h;

    /* renamed from: i, reason: collision with root package name */
    private ConcurrentHashMap f68286i;

    /* renamed from: j, reason: collision with root package name */
    private String f68287j;

    /* renamed from: k, reason: collision with root package name */
    private String f68288k;

    /* renamed from: l, reason: collision with root package name */
    private ConcurrentHashMap f68289l;

    public static final class a implements InterfaceC7174n0<o> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final o a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "fragment":
                        oVar.f68287j = interfaceC7131c1.k0();
                        break;
                    case "method":
                        oVar.f68279b = interfaceC7131c1.k0();
                        break;
                    case "env":
                        Map map = (Map) interfaceC7131c1.U1();
                        if (map == null) {
                            break;
                        } else {
                            oVar.f68284g = io.sentry.util.c.a(map);
                            break;
                        }
                    case "url":
                        oVar.f68278a = interfaceC7131c1.k0();
                        break;
                    case "data":
                        oVar.f68281d = interfaceC7131c1.U1();
                        break;
                    case "other":
                        Map map2 = (Map) interfaceC7131c1.U1();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.f68286i = io.sentry.util.c.a(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) interfaceC7131c1.U1();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.f68283f = io.sentry.util.c.a(map3);
                            break;
                        }
                    case "cookies":
                        oVar.f68282e = interfaceC7131c1.k0();
                        break;
                    case "body_size":
                        oVar.f68285h = interfaceC7131c1.D1();
                        break;
                    case "query_string":
                        oVar.f68280c = interfaceC7131c1.k0();
                        break;
                    case "api_target":
                        oVar.f68288k = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            oVar.m(concurrentHashMap);
            interfaceC7131c1.endObject();
            return oVar;
        }
    }

    public o() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return io.sentry.util.p.a(this.f68278a, oVar.f68278a) && io.sentry.util.p.a(this.f68279b, oVar.f68279b) && io.sentry.util.p.a(this.f68280c, oVar.f68280c) && io.sentry.util.p.a(this.f68282e, oVar.f68282e) && io.sentry.util.p.a(this.f68283f, oVar.f68283f) && io.sentry.util.p.a(this.f68284g, oVar.f68284g) && io.sentry.util.p.a(this.f68285h, oVar.f68285h) && io.sentry.util.p.a(this.f68287j, oVar.f68287j) && io.sentry.util.p.a(this.f68288k, oVar.f68288k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68278a, this.f68279b, this.f68280c, this.f68282e, this.f68283f, this.f68284g, this.f68285h, this.f68287j, this.f68288k});
    }

    public final Map<String, String> l() {
        return this.f68283f;
    }

    public final void m(Map<String, Object> map) {
        this.f68289l = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68278a != null) {
            c7212v0.g(ImagesContract.URL);
            c7212v0.p(this.f68278a);
        }
        if (this.f68279b != null) {
            c7212v0.g("method");
            c7212v0.p(this.f68279b);
        }
        if (this.f68280c != null) {
            c7212v0.g("query_string");
            c7212v0.p(this.f68280c);
        }
        if (this.f68281d != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68281d);
        }
        if (this.f68282e != null) {
            c7212v0.g("cookies");
            c7212v0.p(this.f68282e);
        }
        if (this.f68283f != null) {
            c7212v0.g("headers");
            c7212v0.m(iLogger, this.f68283f);
        }
        if (this.f68284g != null) {
            c7212v0.g("env");
            c7212v0.m(iLogger, this.f68284g);
        }
        if (this.f68286i != null) {
            c7212v0.g("other");
            c7212v0.m(iLogger, this.f68286i);
        }
        if (this.f68287j != null) {
            c7212v0.g("fragment");
            c7212v0.m(iLogger, this.f68287j);
        }
        if (this.f68285h != null) {
            c7212v0.g("body_size");
            c7212v0.m(iLogger, this.f68285h);
        }
        if (this.f68288k != null) {
            c7212v0.g("api_target");
            c7212v0.m(iLogger, this.f68288k);
        }
        ConcurrentHashMap concurrentHashMap = this.f68289l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68289l, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public o(@NotNull o oVar) {
        this.f68278a = oVar.f68278a;
        this.f68282e = oVar.f68282e;
        this.f68279b = oVar.f68279b;
        this.f68280c = oVar.f68280c;
        this.f68283f = io.sentry.util.c.a(oVar.f68283f);
        this.f68284g = io.sentry.util.c.a(oVar.f68284g);
        this.f68286i = io.sentry.util.c.a(oVar.f68286i);
        this.f68289l = io.sentry.util.c.a(oVar.f68289l);
        this.f68281d = oVar.f68281d;
        this.f68287j = oVar.f68287j;
        this.f68285h = oVar.f68285h;
        this.f68288k = oVar.f68288k;
    }
}
