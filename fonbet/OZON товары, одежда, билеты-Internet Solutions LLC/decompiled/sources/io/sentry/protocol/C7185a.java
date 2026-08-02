package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7185a implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68170a;

    /* renamed from: b, reason: collision with root package name */
    private Date f68171b;

    /* renamed from: c, reason: collision with root package name */
    private String f68172c;

    /* renamed from: d, reason: collision with root package name */
    private String f68173d;

    /* renamed from: e, reason: collision with root package name */
    private String f68174e;

    /* renamed from: f, reason: collision with root package name */
    private String f68175f;

    /* renamed from: g, reason: collision with root package name */
    private String f68176g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractMap f68177h;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f68178i;

    /* renamed from: j, reason: collision with root package name */
    private String f68179j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f68180k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f68181l;

    /* renamed from: m, reason: collision with root package name */
    private List<String> f68182m;

    /* renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap f68183n;

    /* renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C1116a implements InterfaceC7174n0<C7185a> {
        @NotNull
        public static C7185a b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7185a c7185a = new C7185a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "split_names":
                        List<String> list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            c7185a.u(list);
                            break;
                        }
                    case "device_app_hash":
                        c7185a.f68172c = interfaceC7131c1.k0();
                        break;
                    case "start_type":
                        c7185a.f68179j = interfaceC7131c1.k0();
                        break;
                    case "view_names":
                        List<String> list2 = (List) interfaceC7131c1.U1();
                        if (list2 == null) {
                            break;
                        } else {
                            c7185a.x(list2);
                            break;
                        }
                    case "app_version":
                        c7185a.f68175f = interfaceC7131c1.k0();
                        break;
                    case "in_foreground":
                        c7185a.f68180k = interfaceC7131c1.P();
                        break;
                    case "build_type":
                        c7185a.f68173d = interfaceC7131c1.k0();
                        break;
                    case "app_identifier":
                        c7185a.f68170a = interfaceC7131c1.k0();
                        break;
                    case "app_start_time":
                        c7185a.f68171b = interfaceC7131c1.M(iLogger);
                        break;
                    case "permissions":
                        c7185a.f68177h = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "app_name":
                        c7185a.f68174e = interfaceC7131c1.k0();
                        break;
                    case "app_build":
                        c7185a.f68176g = interfaceC7131c1.k0();
                        break;
                    case "is_split_apks":
                        c7185a.f68181l = interfaceC7131c1.P();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            c7185a.w(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7185a;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ C7185a a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public C7185a() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7185a.class != obj.getClass()) {
            return false;
        }
        C7185a c7185a = (C7185a) obj;
        return io.sentry.util.p.a(this.f68170a, c7185a.f68170a) && io.sentry.util.p.a(this.f68171b, c7185a.f68171b) && io.sentry.util.p.a(this.f68172c, c7185a.f68172c) && io.sentry.util.p.a(this.f68173d, c7185a.f68173d) && io.sentry.util.p.a(this.f68174e, c7185a.f68174e) && io.sentry.util.p.a(this.f68175f, c7185a.f68175f) && io.sentry.util.p.a(this.f68176g, c7185a.f68176g) && io.sentry.util.p.a(this.f68177h, c7185a.f68177h) && io.sentry.util.p.a(this.f68180k, c7185a.f68180k) && io.sentry.util.p.a(this.f68178i, c7185a.f68178i) && io.sentry.util.p.a(this.f68179j, c7185a.f68179j) && io.sentry.util.p.a(this.f68181l, c7185a.f68181l) && io.sentry.util.p.a(this.f68182m, c7185a.f68182m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68170a, this.f68171b, this.f68172c, this.f68173d, this.f68174e, this.f68175f, this.f68176g, this.f68177h, this.f68180k, this.f68178i, this.f68179j, this.f68181l, this.f68182m});
    }

    public final Boolean l() {
        return this.f68180k;
    }

    public final void m(String str) {
        this.f68176g = str;
    }

    public final void n(String str) {
        this.f68170a = str;
    }

    public final void o(String str) {
        this.f68174e = str;
    }

    public final void p(Date date) {
        this.f68171b = date;
    }

    public final void q(String str) {
        this.f68175f = str;
    }

    public final void r(Boolean bool) {
        this.f68180k = bool;
    }

    public final void s(HashMap hashMap) {
        this.f68177h = hashMap;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68170a != null) {
            c7212v0.g("app_identifier");
            c7212v0.p(this.f68170a);
        }
        if (this.f68171b != null) {
            c7212v0.g("app_start_time");
            c7212v0.m(iLogger, this.f68171b);
        }
        if (this.f68172c != null) {
            c7212v0.g("device_app_hash");
            c7212v0.p(this.f68172c);
        }
        if (this.f68173d != null) {
            c7212v0.g("build_type");
            c7212v0.p(this.f68173d);
        }
        if (this.f68174e != null) {
            c7212v0.g("app_name");
            c7212v0.p(this.f68174e);
        }
        if (this.f68175f != null) {
            c7212v0.g("app_version");
            c7212v0.p(this.f68175f);
        }
        if (this.f68176g != null) {
            c7212v0.g("app_build");
            c7212v0.p(this.f68176g);
        }
        AbstractMap abstractMap = this.f68177h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c7212v0.g("permissions");
            c7212v0.m(iLogger, this.f68177h);
        }
        if (this.f68180k != null) {
            c7212v0.g("in_foreground");
            c7212v0.n(this.f68180k);
        }
        if (this.f68178i != null) {
            c7212v0.g("view_names");
            c7212v0.m(iLogger, this.f68178i);
        }
        if (this.f68179j != null) {
            c7212v0.g("start_type");
            c7212v0.p(this.f68179j);
        }
        if (this.f68181l != null) {
            c7212v0.g("is_split_apks");
            c7212v0.n(this.f68181l);
        }
        List<String> list = this.f68182m;
        if (list != null && !list.isEmpty()) {
            c7212v0.g("split_names");
            c7212v0.m(iLogger, this.f68182m);
        }
        ConcurrentHashMap concurrentHashMap = this.f68183n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68183n, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Boolean bool) {
        this.f68181l = bool;
    }

    public final void u(List<String> list) {
        this.f68182m = list;
    }

    public final void v(String str) {
        this.f68179j = str;
    }

    public final void w(Map<String, Object> map) {
        this.f68183n = (ConcurrentHashMap) map;
    }

    public final void x(List<String> list) {
        this.f68178i = list;
    }

    C7185a(@NotNull C7185a c7185a) {
        this.f68176g = c7185a.f68176g;
        this.f68170a = c7185a.f68170a;
        this.f68174e = c7185a.f68174e;
        this.f68171b = c7185a.f68171b;
        this.f68175f = c7185a.f68175f;
        this.f68173d = c7185a.f68173d;
        this.f68172c = c7185a.f68172c;
        this.f68177h = io.sentry.util.c.a(c7185a.f68177h);
        this.f68180k = c7185a.f68180k;
        List<String> list = c7185a.f68178i;
        this.f68178i = list != null ? new ArrayList(list) : null;
        this.f68179j = c7185a.f68179j;
        this.f68181l = c7185a.f68181l;
        this.f68182m = c7185a.f68182m;
        this.f68183n = io.sentry.util.c.a(c7185a.f68183n);
    }
}
