package io.sentry;

import io.sentry.C7141f;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.E;
import io.sentry.protocol.o;
import io.sentry.protocol.r;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class O1 {

    /* renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.t f66695a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7187c f66696b;

    /* renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.r f66697c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.o f66698d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractMap f66699e;

    /* renamed from: f, reason: collision with root package name */
    private String f66700f;

    /* renamed from: g, reason: collision with root package name */
    private String f66701g;

    /* renamed from: h, reason: collision with root package name */
    private String f66702h;

    /* renamed from: i, reason: collision with root package name */
    private io.sentry.protocol.E f66703i;

    /* renamed from: j, reason: collision with root package name */
    protected transient Throwable f66704j;

    /* renamed from: k, reason: collision with root package name */
    private String f66705k;

    /* renamed from: l, reason: collision with root package name */
    private String f66706l;

    /* renamed from: m, reason: collision with root package name */
    private List<C7141f> f66707m;

    /* renamed from: n, reason: collision with root package name */
    private C7188d f66708n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractMap f66709o;

    /* loaded from: classes10.dex */
    public static final class a {
        public static boolean a(@NotNull O1 o12, @NotNull String str, @NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            switch (str) {
                case "debug_meta":
                    o12.f66708n = (C7188d) interfaceC7131c1.S(iLogger, new C7188d.a());
                    return true;
                case "server_name":
                    o12.f66705k = interfaceC7131c1.k0();
                    return true;
                case "contexts":
                    o12.f66696b.m(C7187c.a.b(interfaceC7131c1, iLogger));
                    return true;
                case "environment":
                    o12.f66701g = interfaceC7131c1.k0();
                    return true;
                case "breadcrumbs":
                    o12.f66707m = interfaceC7131c1.J0(iLogger, new C7141f.a());
                    return true;
                case "sdk":
                    o12.f66697c = (io.sentry.protocol.r) interfaceC7131c1.S(iLogger, new r.a());
                    return true;
                case "dist":
                    o12.f66706l = interfaceC7131c1.k0();
                    return true;
                case "tags":
                    o12.f66699e = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                    return true;
                case "user":
                    o12.f66703i = (io.sentry.protocol.E) interfaceC7131c1.S(iLogger, new E.a());
                    return true;
                case "extra":
                    o12.f66709o = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                    return true;
                case "event_id":
                    o12.f66695a = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                    return true;
                case "release":
                    o12.f66700f = interfaceC7131c1.k0();
                    return true;
                case "request":
                    o12.f66698d = (io.sentry.protocol.o) interfaceC7131c1.S(iLogger, new o.a());
                    return true;
                case "platform":
                    o12.f66702h = interfaceC7131c1.k0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class b {
        public static void a(@NotNull O1 o12, @NotNull C7212v0 c7212v0, @NotNull ILogger iLogger) throws IOException {
            if (o12.f66695a != null) {
                c7212v0.g("event_id");
                c7212v0.m(iLogger, o12.f66695a);
            }
            c7212v0.g("contexts");
            c7212v0.m(iLogger, o12.f66696b);
            if (o12.f66697c != null) {
                c7212v0.g("sdk");
                c7212v0.m(iLogger, o12.f66697c);
            }
            if (o12.f66698d != null) {
                c7212v0.g("request");
                c7212v0.m(iLogger, o12.f66698d);
            }
            if (o12.f66699e != null && !o12.f66699e.isEmpty()) {
                c7212v0.g("tags");
                c7212v0.m(iLogger, o12.f66699e);
            }
            if (o12.f66700f != null) {
                c7212v0.g("release");
                c7212v0.p(o12.f66700f);
            }
            if (o12.f66701g != null) {
                c7212v0.g("environment");
                c7212v0.p(o12.f66701g);
            }
            if (o12.f66702h != null) {
                c7212v0.g("platform");
                c7212v0.p(o12.f66702h);
            }
            if (o12.f66703i != null) {
                c7212v0.g("user");
                c7212v0.m(iLogger, o12.f66703i);
            }
            if (o12.f66705k != null) {
                c7212v0.g("server_name");
                c7212v0.p(o12.f66705k);
            }
            if (o12.f66706l != null) {
                c7212v0.g("dist");
                c7212v0.p(o12.f66706l);
            }
            if (o12.f66707m != null && !o12.f66707m.isEmpty()) {
                c7212v0.g("breadcrumbs");
                c7212v0.m(iLogger, o12.f66707m);
            }
            if (o12.f66708n != null) {
                c7212v0.g("debug_meta");
                c7212v0.m(iLogger, o12.f66708n);
            }
            if (o12.f66709o == null || o12.f66709o.isEmpty()) {
                return;
            }
            c7212v0.g("extra");
            c7212v0.m(iLogger, o12.f66709o);
        }
    }

    protected O1(@NotNull io.sentry.protocol.t tVar) {
        this.f66696b = new C7187c();
        this.f66695a = tVar;
    }

    public final List<C7141f> B() {
        return this.f66707m;
    }

    @NotNull
    public final C7187c C() {
        return this.f66696b;
    }

    public final C7188d D() {
        return this.f66708n;
    }

    public final String E() {
        return this.f66706l;
    }

    public final String F() {
        return this.f66701g;
    }

    public final io.sentry.protocol.t G() {
        return this.f66695a;
    }

    public final Map<String, Object> H() {
        return this.f66709o;
    }

    public final String I() {
        return this.f66702h;
    }

    public final String J() {
        return this.f66700f;
    }

    public final io.sentry.protocol.o K() {
        return this.f66698d;
    }

    public final io.sentry.protocol.r L() {
        return this.f66697c;
    }

    public final String M() {
        return this.f66705k;
    }

    public final Map<String, String> N() {
        return this.f66699e;
    }

    public final Throwable O() {
        Throwable th2 = this.f66704j;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).d() : th2;
    }

    public final io.sentry.protocol.E P() {
        return this.f66703i;
    }

    public final void Q(List<C7141f> list) {
        this.f66707m = list != null ? new ArrayList(list) : null;
    }

    public final void R(C7188d c7188d) {
        this.f66708n = c7188d;
    }

    public final void S(String str) {
        this.f66706l = str;
    }

    public final void T(String str) {
        this.f66701g = str;
    }

    public final void U(io.sentry.protocol.t tVar) {
        this.f66695a = tVar;
    }

    public final void V(HashMap hashMap) {
        this.f66709o = new HashMap(hashMap);
    }

    public final void W(String str) {
        this.f66702h = str;
    }

    public final void X(String str) {
        this.f66700f = str;
    }

    public final void Y(io.sentry.protocol.o oVar) {
        this.f66698d = oVar;
    }

    public final void Z(io.sentry.protocol.r rVar) {
        this.f66697c = rVar;
    }

    public final void a0(String str) {
        this.f66705k = str;
    }

    public final void b0(String str, String str2) {
        if (this.f66699e == null) {
            this.f66699e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f66699e.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f66699e;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public final void c0(Map<String, String> map) {
        this.f66699e = map != null ? new HashMap(map) : null;
    }

    public final void d0(io.sentry.protocol.E e11) {
        this.f66703i = e11;
    }

    protected O1() {
        this(new io.sentry.protocol.t());
    }
}
