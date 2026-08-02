package io.sentry;

import io.sentry.l3;
import io.sentry.n3;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class j3 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.t f68016a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l3 f68017b;

    /* renamed from: c, reason: collision with root package name */
    private l3 f68018c;

    /* renamed from: d, reason: collision with root package name */
    private transient s3 f68019d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    protected String f68020e;

    /* renamed from: f, reason: collision with root package name */
    protected String f68021f;

    /* renamed from: g, reason: collision with root package name */
    protected n3 f68022g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    protected ConcurrentHashMap f68023h;

    /* renamed from: i, reason: collision with root package name */
    protected String f68024i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    protected Map<String, Object> f68025j;

    /* renamed from: k, reason: collision with root package name */
    private ConcurrentHashMap f68026k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private EnumC7162k0 f68027l;

    /* renamed from: m, reason: collision with root package name */
    protected C7133d f68028m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    protected io.sentry.featureflags.d f68029n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f68030o;

    public static final class a implements InterfaceC7174n0<j3> {
        @NotNull
        public static j3 b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            io.sentry.protocol.t tVar = null;
            l3 l3Var = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            l3 l3Var2 = null;
            String str2 = null;
            n3 n3Var = null;
            String str3 = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            Map<String, Object> map = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "span_id":
                        l3Var = new l3(interfaceC7131c1.nextString());
                        break;
                    case "parent_span_id":
                        l3Var2 = (l3) interfaceC7131c1.S(iLogger, new l3.a());
                        break;
                    case "description":
                        str2 = interfaceC7131c1.nextString();
                        break;
                    case "origin":
                        str3 = interfaceC7131c1.nextString();
                        break;
                    case "status":
                        n3Var = (n3) interfaceC7131c1.S(iLogger, new n3.a());
                        break;
                    case "op":
                        str = interfaceC7131c1.nextString();
                        break;
                    case "data":
                        map = (Map) interfaceC7131c1.U1();
                        break;
                    case "tags":
                        concurrentHashMap2 = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "trace_id":
                        tVar = t.a.b(interfaceC7131c1);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (tVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(I2.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (l3Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.a(I2.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str == null) {
                str = "";
            }
            j3 j3Var = new j3(tVar, l3Var, str, l3Var2);
            j3Var.f68021f = str2;
            j3Var.f68022g = n3Var;
            j3Var.f68024i = str3;
            if (concurrentHashMap2 != null) {
                j3Var.f68023h = concurrentHashMap2;
            }
            if (map != null) {
                j3Var.f68025j = map;
            }
            j3Var.s(concurrentHashMap);
            interfaceC7131c1.endObject();
            return j3Var;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ j3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public j3(@NotNull io.sentry.protocol.t tVar, @NotNull l3 l3Var, @NotNull String str, l3 l3Var2) {
        this(tVar, l3Var, l3Var2, str, null, null, null, "manual");
    }

    public final j3 a(@NotNull String str, l3 l3Var) {
        return new j3(this.f68016a, new l3(), l3Var, str, null, this.f68019d, null, "manual");
    }

    public final String b() {
        return this.f68021f;
    }

    @NotNull
    public final io.sentry.featureflags.b c() {
        return this.f68029n;
    }

    @NotNull
    public final EnumC7162k0 d() {
        return this.f68027l;
    }

    @NotNull
    public final String e() {
        return this.f68020e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f68016a.equals(j3Var.f68016a) && this.f68017b.equals(j3Var.f68017b) && io.sentry.util.p.a(this.f68018c, j3Var.f68018c) && this.f68020e.equals(j3Var.f68020e) && io.sentry.util.p.a(this.f68021f, j3Var.f68021f) && this.f68022g == j3Var.f68022g;
    }

    public final String f() {
        return this.f68024i;
    }

    public final l3 g() {
        return this.f68018c;
    }

    public final Boolean h() {
        s3 s3Var = this.f68019d;
        if (s3Var == null) {
            return null;
        }
        return s3Var.b();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68016a, this.f68017b, this.f68018c, this.f68020e, this.f68021f, this.f68022g});
    }

    @NotNull
    public final io.sentry.protocol.t i() {
        return this.f68030o;
    }

    public final Boolean j() {
        s3 s3Var = this.f68019d;
        if (s3Var == null) {
            return null;
        }
        return s3Var.e();
    }

    public final s3 k() {
        return this.f68019d;
    }

    @NotNull
    public final l3 l() {
        return this.f68017b;
    }

    public final n3 m() {
        return this.f68022g;
    }

    @NotNull
    public final Map<String, String> n() {
        return this.f68023h;
    }

    @NotNull
    public final io.sentry.protocol.t o() {
        return this.f68016a;
    }

    public final void p(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f68025j.remove(str);
        } else {
            this.f68025j.put(str, obj);
        }
    }

    public final void q(@NotNull EnumC7162k0 enumC7162k0) {
        this.f68027l = enumC7162k0;
    }

    public final void r(s3 s3Var) {
        this.f68019d = s3Var;
        C7133d c7133d = this.f68028m;
        if (c7133d != null) {
            c7133d.i(s3Var);
        }
    }

    public final void s(Map<String, Object> map) {
        this.f68026k = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("trace_id");
        this.f68016a.serialize(c7212v0, iLogger);
        c7212v0.g("span_id");
        this.f68017b.serialize(c7212v0, iLogger);
        l3 l3Var = this.f68018c;
        if (l3Var != null) {
            c7212v0.g("parent_span_id");
            l3Var.serialize(c7212v0, iLogger);
        }
        c7212v0.g("op");
        c7212v0.p(this.f68020e);
        if (this.f68021f != null) {
            c7212v0.g("description");
            c7212v0.p(this.f68021f);
        }
        if (this.f68022g != null) {
            c7212v0.g("status");
            c7212v0.m(iLogger, this.f68022g);
        }
        if (this.f68024i != null) {
            c7212v0.g("origin");
            c7212v0.m(iLogger, this.f68024i);
        }
        if (!this.f68023h.isEmpty()) {
            c7212v0.g("tags");
            c7212v0.m(iLogger, this.f68023h);
        }
        if (!this.f68025j.isEmpty()) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68025j);
        }
        ConcurrentHashMap concurrentHashMap = this.f68026k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68026k, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public j3(@NotNull io.sentry.protocol.t tVar, @NotNull l3 l3Var, l3 l3Var2, @NotNull String str, String str2, s3 s3Var, n3 n3Var, String str3) {
        this.f68023h = new ConcurrentHashMap();
        this.f68024i = "manual";
        this.f68025j = new ConcurrentHashMap();
        this.f68027l = EnumC7162k0.SENTRY;
        this.f68029n = io.sentry.featureflags.d.a();
        this.f68030o = io.sentry.protocol.t.f68325b;
        io.sentry.util.p.b(tVar, "traceId is required");
        this.f68016a = tVar;
        io.sentry.util.p.b(l3Var, "spanId is required");
        this.f68017b = l3Var;
        io.sentry.util.p.b(str, "operation is required");
        this.f68020e = str;
        this.f68018c = l3Var2;
        this.f68021f = str2;
        this.f68022g = n3Var;
        this.f68024i = str3;
        r(s3Var);
        io.sentry.util.thread.a threadChecker = A1.C().getOptions().getThreadChecker();
        this.f68025j.put("thread.id", String.valueOf(threadChecker.c()));
        this.f68025j.put("thread.name", threadChecker.b());
    }

    public j3(@NotNull j3 j3Var) {
        this.f68023h = new ConcurrentHashMap();
        this.f68024i = "manual";
        this.f68025j = new ConcurrentHashMap();
        this.f68027l = EnumC7162k0.SENTRY;
        this.f68029n = io.sentry.featureflags.d.a();
        this.f68030o = io.sentry.protocol.t.f68325b;
        this.f68016a = j3Var.f68016a;
        this.f68017b = j3Var.f68017b;
        this.f68018c = j3Var.f68018c;
        r(j3Var.f68019d);
        this.f68020e = j3Var.f68020e;
        this.f68021f = j3Var.f68021f;
        this.f68022g = j3Var.f68022g;
        ConcurrentHashMap a11 = io.sentry.util.c.a(j3Var.f68023h);
        if (a11 != null) {
            this.f68023h = a11;
        }
        ConcurrentHashMap a12 = io.sentry.util.c.a(j3Var.f68026k);
        if (a12 != null) {
            this.f68026k = a12;
        }
        this.f68028m = j3Var.f68028m;
        ConcurrentHashMap a13 = io.sentry.util.c.a(j3Var.f68025j);
        if (a13 != null) {
            this.f68025j = a13;
        }
    }
}
