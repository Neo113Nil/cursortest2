package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68290a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f68291b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f68292c;

    /* renamed from: d, reason: collision with root package name */
    private Long f68293d;

    /* renamed from: e, reason: collision with root package name */
    private Object f68294e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap f68295f;

    public static final class a implements InterfaceC7174n0<p> {
        @NotNull
        public static p b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "status_code":
                        pVar.f68292c = interfaceC7131c1.A1();
                        break;
                    case "data":
                        pVar.f68294e = interfaceC7131c1.U1();
                        break;
                    case "headers":
                        Map map = (Map) interfaceC7131c1.U1();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f68291b = io.sentry.util.c.a(map);
                            break;
                        }
                    case "cookies":
                        pVar.f68290a = interfaceC7131c1.k0();
                        break;
                    case "body_size":
                        pVar.f68293d = interfaceC7131c1.D1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            pVar.f(concurrentHashMap);
            interfaceC7131c1.endObject();
            return pVar;
        }
    }

    public p() {
    }

    public final void f(Map<String, Object> map) {
        this.f68295f = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68290a != null) {
            c7212v0.g("cookies");
            c7212v0.p(this.f68290a);
        }
        if (this.f68291b != null) {
            c7212v0.g("headers");
            c7212v0.m(iLogger, this.f68291b);
        }
        if (this.f68292c != null) {
            c7212v0.g("status_code");
            c7212v0.m(iLogger, this.f68292c);
        }
        if (this.f68293d != null) {
            c7212v0.g("body_size");
            c7212v0.m(iLogger, this.f68293d);
        }
        if (this.f68294e != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68294e);
        }
        ConcurrentHashMap concurrentHashMap = this.f68295f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68295f, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public p(@NotNull p pVar) {
        this.f68290a = pVar.f68290a;
        this.f68291b = io.sentry.util.c.a(pVar.f68291b);
        this.f68295f = io.sentry.util.c.a(pVar.f68295f);
        this.f68292c = pVar.f68292c;
        this.f68293d = pVar.f68293d;
        this.f68294e = pVar.f68294e;
    }
}
