package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.J2;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f68347a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f68348b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f68349c;

    /* renamed from: d, reason: collision with root package name */
    private String f68350d;

    /* renamed from: e, reason: collision with root package name */
    private String f68351e;

    /* renamed from: f, reason: collision with root package name */
    private String f68352f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f68353g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f68354h;

    /* renamed from: i, reason: collision with root package name */
    private String f68355i;

    /* renamed from: j, reason: collision with root package name */
    private String f68356j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f68357k;

    /* renamed from: l, reason: collision with root package name */
    private String f68358l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f68359m;

    /* renamed from: n, reason: collision with root package name */
    private String f68360n;

    /* renamed from: o, reason: collision with root package name */
    private String f68361o;

    /* renamed from: p, reason: collision with root package name */
    private String f68362p;

    /* renamed from: q, reason: collision with root package name */
    private String f68363q;

    /* renamed from: r, reason: collision with root package name */
    private String f68364r;

    /* renamed from: s, reason: collision with root package name */
    private String f68365s;

    /* renamed from: t, reason: collision with root package name */
    private ConcurrentHashMap f68366t;

    /* renamed from: u, reason: collision with root package name */
    private String f68367u;

    /* renamed from: v, reason: collision with root package name */
    private J2 f68368v;

    public static final class a implements InterfaceC7174n0<x> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final x a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            x xVar = new x();
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "post_context":
                        xVar.f68348b = (List) interfaceC7131c1.U1();
                        break;
                    case "image_addr":
                        xVar.f68361o = interfaceC7131c1.k0();
                        break;
                    case "in_app":
                        xVar.f68357k = interfaceC7131c1.P();
                        break;
                    case "raw_function":
                        xVar.f68367u = interfaceC7131c1.k0();
                        break;
                    case "lineno":
                        xVar.f68353g = interfaceC7131c1.A1();
                        break;
                    case "module":
                        xVar.f68352f = interfaceC7131c1.k0();
                        break;
                    case "native":
                        xVar.f68359m = interfaceC7131c1.P();
                        break;
                    case "symbol":
                        xVar.f68365s = interfaceC7131c1.k0();
                        break;
                    case "package":
                        xVar.f68358l = interfaceC7131c1.k0();
                        break;
                    case "filename":
                        xVar.f68350d = interfaceC7131c1.k0();
                        break;
                    case "symbol_addr":
                        xVar.f68362p = interfaceC7131c1.k0();
                        break;
                    case "lock":
                        xVar.f68368v = (J2) interfaceC7131c1.S(iLogger, new J2.a());
                        break;
                    case "vars":
                        xVar.f68349c = (Map) interfaceC7131c1.U1();
                        break;
                    case "colno":
                        xVar.f68354h = interfaceC7131c1.A1();
                        break;
                    case "instruction_addr":
                        xVar.f68363q = interfaceC7131c1.k0();
                        break;
                    case "pre_context":
                        xVar.f68347a = (List) interfaceC7131c1.U1();
                        break;
                    case "addr_mode":
                        xVar.f68364r = interfaceC7131c1.k0();
                        break;
                    case "context_line":
                        xVar.f68356j = interfaceC7131c1.k0();
                        break;
                    case "function":
                        xVar.f68351e = interfaceC7131c1.k0();
                        break;
                    case "abs_path":
                        xVar.f68355i = interfaceC7131c1.k0();
                        break;
                    case "platform":
                        xVar.f68360n = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            xVar.H(concurrentHashMap);
            interfaceC7131c1.endObject();
            return xVar;
        }
    }

    public final void A(String str) {
        this.f68363q = str;
    }

    public final void B(Integer num) {
        this.f68353g = num;
    }

    public final void C(J2 j22) {
        this.f68368v = j22;
    }

    public final void D(String str) {
        this.f68352f = str;
    }

    public final void E(Boolean bool) {
        this.f68359m = bool;
    }

    public final void F(String str) {
        this.f68358l = str;
    }

    public final void G(String str) {
        this.f68360n = "native";
    }

    public final void H(Map<String, Object> map) {
        this.f68366t = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return Objects.equals(this.f68347a, xVar.f68347a) && Objects.equals(this.f68348b, xVar.f68348b) && Objects.equals(this.f68349c, xVar.f68349c) && Objects.equals(this.f68350d, xVar.f68350d) && Objects.equals(this.f68351e, xVar.f68351e) && Objects.equals(this.f68352f, xVar.f68352f) && Objects.equals(this.f68353g, xVar.f68353g) && Objects.equals(this.f68354h, xVar.f68354h) && Objects.equals(this.f68355i, xVar.f68355i) && Objects.equals(this.f68356j, xVar.f68356j) && Objects.equals(this.f68357k, xVar.f68357k) && Objects.equals(this.f68358l, xVar.f68358l) && Objects.equals(this.f68359m, xVar.f68359m) && Objects.equals(this.f68360n, xVar.f68360n) && Objects.equals(this.f68361o, xVar.f68361o) && Objects.equals(this.f68362p, xVar.f68362p) && Objects.equals(this.f68363q, xVar.f68363q) && Objects.equals(this.f68364r, xVar.f68364r) && Objects.equals(this.f68365s, xVar.f68365s) && Objects.equals(this.f68366t, xVar.f68366t) && Objects.equals(this.f68367u, xVar.f68367u) && Objects.equals(this.f68368v, xVar.f68368v);
    }

    public final int hashCode() {
        return Objects.hash(this.f68347a, this.f68348b, this.f68349c, null, this.f68350d, this.f68351e, this.f68352f, this.f68353g, this.f68354h, this.f68355i, this.f68356j, this.f68357k, this.f68358l, this.f68359m, this.f68360n, this.f68361o, this.f68362p, this.f68363q, this.f68364r, this.f68365s, this.f68366t, this.f68367u, this.f68368v);
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68350d != null) {
            c7212v0.g("filename");
            c7212v0.p(this.f68350d);
        }
        if (this.f68351e != null) {
            c7212v0.g("function");
            c7212v0.p(this.f68351e);
        }
        if (this.f68352f != null) {
            c7212v0.g("module");
            c7212v0.p(this.f68352f);
        }
        if (this.f68353g != null) {
            c7212v0.g("lineno");
            c7212v0.o(this.f68353g);
        }
        if (this.f68354h != null) {
            c7212v0.g("colno");
            c7212v0.o(this.f68354h);
        }
        if (this.f68355i != null) {
            c7212v0.g("abs_path");
            c7212v0.p(this.f68355i);
        }
        if (this.f68356j != null) {
            c7212v0.g("context_line");
            c7212v0.p(this.f68356j);
        }
        if (this.f68357k != null) {
            c7212v0.g("in_app");
            c7212v0.n(this.f68357k);
        }
        if (this.f68358l != null) {
            c7212v0.g("package");
            c7212v0.p(this.f68358l);
        }
        if (this.f68359m != null) {
            c7212v0.g("native");
            c7212v0.n(this.f68359m);
        }
        if (this.f68360n != null) {
            c7212v0.g("platform");
            c7212v0.p(this.f68360n);
        }
        if (this.f68361o != null) {
            c7212v0.g("image_addr");
            c7212v0.p(this.f68361o);
        }
        if (this.f68362p != null) {
            c7212v0.g("symbol_addr");
            c7212v0.p(this.f68362p);
        }
        if (this.f68363q != null) {
            c7212v0.g("instruction_addr");
            c7212v0.p(this.f68363q);
        }
        if (this.f68364r != null) {
            c7212v0.g("addr_mode");
            c7212v0.p(this.f68364r);
        }
        if (this.f68367u != null) {
            c7212v0.g("raw_function");
            c7212v0.p(this.f68367u);
        }
        if (this.f68365s != null) {
            c7212v0.g("symbol");
            c7212v0.p(this.f68365s);
        }
        if (this.f68368v != null) {
            c7212v0.g("lock");
            c7212v0.m(iLogger, this.f68368v);
        }
        List<String> list = this.f68347a;
        if (list != null && !list.isEmpty()) {
            c7212v0.g("pre_context");
            c7212v0.m(iLogger, this.f68347a);
        }
        List<String> list2 = this.f68348b;
        if (list2 != null && !list2.isEmpty()) {
            c7212v0.g("post_context");
            c7212v0.m(iLogger, this.f68348b);
        }
        Map<String, Object> map = this.f68349c;
        if (map != null && !map.isEmpty()) {
            c7212v0.g("vars");
            c7212v0.m(iLogger, this.f68349c);
        }
        ConcurrentHashMap concurrentHashMap = this.f68366t;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68366t, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final String v() {
        return this.f68352f;
    }

    public final void w(String str) {
        this.f68364r = str;
    }

    public final void x(String str) {
        this.f68350d = str;
    }

    public final void y(String str) {
        this.f68351e = str;
    }

    public final void z(Boolean bool) {
        this.f68357k = bool;
    }
}
