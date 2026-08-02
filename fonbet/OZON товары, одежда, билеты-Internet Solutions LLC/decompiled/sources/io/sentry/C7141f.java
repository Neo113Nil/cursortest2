package io.sentry;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7141f implements InterfaceC7220x0, Comparable<C7141f> {

    /* renamed from: a, reason: collision with root package name */
    private final Long f67892a;

    /* renamed from: b, reason: collision with root package name */
    private Date f67893b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Long f67894c;

    /* renamed from: d, reason: collision with root package name */
    private String f67895d;

    /* renamed from: e, reason: collision with root package name */
    private String f67896e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap f67897f;

    /* renamed from: g, reason: collision with root package name */
    private String f67898g;

    /* renamed from: h, reason: collision with root package name */
    private String f67899h;

    /* renamed from: i, reason: collision with root package name */
    private I2 f67900i;

    /* renamed from: j, reason: collision with root package name */
    private ConcurrentHashMap f67901j;

    /* renamed from: io.sentry.f$a */
    public static final class a implements InterfaceC7174n0<C7141f> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7141f a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            Date b11 = C7165l.b();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            I2 i22 = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "origin":
                        str4 = interfaceC7131c1.k0();
                        break;
                    case "data":
                        ConcurrentHashMap a11 = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        if (a11 == null) {
                            break;
                        } else {
                            concurrentHashMap = a11;
                            break;
                        }
                    case "type":
                        str2 = interfaceC7131c1.k0();
                        break;
                    case "category":
                        str3 = interfaceC7131c1.k0();
                        break;
                    case "timestamp":
                        Date M11 = interfaceC7131c1.M(iLogger);
                        if (M11 == null) {
                            break;
                        } else {
                            b11 = M11;
                            break;
                        }
                    case "level":
                        try {
                            i22 = I2.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
                            break;
                        } catch (Exception e11) {
                            iLogger.b(I2.ERROR, e11, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        str = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap2, nextName);
                        break;
                }
            }
            C7141f c7141f = new C7141f(b11);
            c7141f.f67895d = str;
            c7141f.f67896e = str2;
            c7141f.f67897f = concurrentHashMap;
            c7141f.f67898g = str3;
            c7141f.f67899h = str4;
            c7141f.f67900i = i22;
            c7141f.s(concurrentHashMap2);
            interfaceC7131c1.endObject();
            return c7141f;
        }
    }

    public C7141f(@NotNull Date date) {
        this.f67897f = new ConcurrentHashMap();
        this.f67894c = Long.valueOf(System.nanoTime());
        this.f67893b = date;
        this.f67892a = null;
    }

    private static boolean g(@NotNull C7141f c7141f, @NotNull C7141f c7141f2) {
        return c7141f.l().getTime() == c7141f2.l().getTime() && io.sentry.util.p.a(c7141f.f67895d, c7141f2.f67895d) && io.sentry.util.p.a(c7141f.f67896e, c7141f2.f67896e) && io.sentry.util.p.a(c7141f.f67898g, c7141f2.f67898g) && io.sentry.util.p.a(c7141f.f67899h, c7141f2.f67899h) && c7141f.f67900i == c7141f2.f67900i;
    }

    @NotNull
    public static C7141f t(@NotNull String str, String str2, String str3, String str4, @NotNull Map<String, Object> map) {
        C7141f c7141f = new C7141f();
        c7141f.f67896e = "user";
        c7141f.f67898g = "ui.".concat(str);
        if (str2 != null) {
            c7141f.o(str2, "view.id");
        }
        if (str3 != null) {
            c7141f.o(str3, "view.class");
        }
        if (str4 != null) {
            c7141f.o(str4, "view.tag");
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            c7141f.f67897f.put(entry.getKey(), entry.getValue());
        }
        c7141f.f67900i = I2.INFO;
        return c7141f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NotNull C7141f c7141f) {
        return this.f67894c.compareTo(c7141f.f67894c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7141f.class != obj.getClass()) {
            return false;
        }
        C7141f c7141f = (C7141f) obj;
        return "http".equals(this.f67896e) ? g(this, c7141f) && io.sentry.util.p.a(this.f67897f.get("status_code"), c7141f.f67897f.get("status_code")) && io.sentry.util.p.a(this.f67897f.get(ImagesContract.URL), c7141f.f67897f.get(ImagesContract.URL)) && io.sentry.util.p.a(this.f67897f.get("method"), c7141f.f67897f.get("method")) && io.sentry.util.p.a(this.f67897f.get("http.fragment"), c7141f.f67897f.get("http.fragment")) && io.sentry.util.p.a(this.f67897f.get("http.query"), c7141f.f67897f.get("http.query")) : g(this, c7141f);
    }

    public final String h() {
        return this.f67898g;
    }

    public final int hashCode() {
        return "http".equals(this.f67896e) ? Arrays.hashCode(new Object[]{Long.valueOf(l().getTime()), this.f67895d, this.f67896e, this.f67898g, this.f67899h, this.f67900i, this.f67897f.get("status_code"), this.f67897f.get(ImagesContract.URL), this.f67897f.get("method"), this.f67897f.get("http.fragment"), this.f67897f.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(l().getTime()), this.f67895d, this.f67896e, this.f67898g, this.f67899h, this.f67900i});
    }

    @NotNull
    public final Map<String, Object> i() {
        return this.f67897f;
    }

    public final I2 j() {
        return this.f67900i;
    }

    public final String k() {
        return this.f67895d;
    }

    @NotNull
    public final Date l() {
        Date date = this.f67893b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l11 = this.f67892a;
        if (l11 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date c11 = C7165l.c(l11.longValue());
        this.f67893b = c11;
        return c11;
    }

    public final String m() {
        return this.f67896e;
    }

    public final void n(String str) {
        this.f67898g = str;
    }

    public final void o(Object obj, String str) {
        if (obj == null) {
            this.f67897f.remove(str);
        } else {
            this.f67897f.put(str, obj);
        }
    }

    public final void p(I2 i22) {
        this.f67900i = i22;
    }

    public final void q(String str) {
        this.f67895d = str;
    }

    public final void r(String str) {
        this.f67896e = str;
    }

    public final void s(Map<String, Object> map) {
        this.f67901j = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, l());
        if (this.f67895d != null) {
            c7212v0.g("message");
            c7212v0.p(this.f67895d);
        }
        if (this.f67896e != null) {
            c7212v0.g("type");
            c7212v0.p(this.f67896e);
        }
        c7212v0.g("data");
        c7212v0.m(iLogger, this.f67897f);
        if (this.f67898g != null) {
            c7212v0.g("category");
            c7212v0.p(this.f67898g);
        }
        if (this.f67899h != null) {
            c7212v0.g("origin");
            c7212v0.p(this.f67899h);
        }
        if (this.f67900i != null) {
            c7212v0.g("level");
            c7212v0.m(iLogger, this.f67900i);
        }
        ConcurrentHashMap concurrentHashMap = this.f67901j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f67901j, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public C7141f(long j11) {
        this.f67897f = new ConcurrentHashMap();
        this.f67894c = Long.valueOf(System.nanoTime());
        this.f67892a = Long.valueOf(j11);
        this.f67893b = null;
    }

    C7141f(@NotNull C7141f c7141f) {
        this.f67897f = new ConcurrentHashMap();
        this.f67894c = Long.valueOf(System.nanoTime());
        this.f67893b = c7141f.f67893b;
        this.f67892a = c7141f.f67892a;
        this.f67895d = c7141f.f67895d;
        this.f67896e = c7141f.f67896e;
        this.f67898g = c7141f.f67898g;
        this.f67899h = c7141f.f67899h;
        ConcurrentHashMap a11 = io.sentry.util.c.a(c7141f.f67897f);
        if (a11 != null) {
            this.f67897f = a11;
        }
        this.f67901j = io.sentry.util.c.a(c7141f.f67901j);
        this.f67900i = c7141f.f67900i;
    }

    public C7141f() {
        this(System.currentTimeMillis());
    }

    public C7141f(String str) {
        this();
        this.f67895d = str;
    }
}
