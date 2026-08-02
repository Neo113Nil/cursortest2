package io.sentry.protocol;

import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7189e implements InterfaceC7220x0 {

    /* renamed from: A, reason: collision with root package name */
    private String f68192A;

    /* renamed from: B, reason: collision with root package name */
    private String f68193B;

    /* renamed from: C, reason: collision with root package name */
    private String f68194C;

    /* renamed from: D, reason: collision with root package name */
    private Float f68195D;

    /* renamed from: E, reason: collision with root package name */
    private Integer f68196E;

    /* renamed from: F, reason: collision with root package name */
    private Double f68197F;

    /* renamed from: G, reason: collision with root package name */
    private String f68198G;

    /* renamed from: H, reason: collision with root package name */
    private String f68199H;

    /* renamed from: I, reason: collision with root package name */
    private ConcurrentHashMap f68200I;

    /* renamed from: a, reason: collision with root package name */
    private String f68201a;

    /* renamed from: b, reason: collision with root package name */
    private String f68202b;

    /* renamed from: c, reason: collision with root package name */
    private String f68203c;

    /* renamed from: d, reason: collision with root package name */
    private String f68204d;

    /* renamed from: e, reason: collision with root package name */
    private String f68205e;

    /* renamed from: f, reason: collision with root package name */
    private String f68206f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f68207g;

    /* renamed from: h, reason: collision with root package name */
    private Float f68208h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f68209i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f68210j;

    /* renamed from: k, reason: collision with root package name */
    private b f68211k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f68212l;

    /* renamed from: m, reason: collision with root package name */
    private Long f68213m;

    /* renamed from: n, reason: collision with root package name */
    private Long f68214n;

    /* renamed from: o, reason: collision with root package name */
    private Long f68215o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f68216p;

    /* renamed from: q, reason: collision with root package name */
    private Long f68217q;

    /* renamed from: r, reason: collision with root package name */
    private Long f68218r;

    /* renamed from: s, reason: collision with root package name */
    private Long f68219s;

    /* renamed from: t, reason: collision with root package name */
    private Long f68220t;

    /* renamed from: u, reason: collision with root package name */
    private Integer f68221u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f68222v;

    /* renamed from: w, reason: collision with root package name */
    private Float f68223w;

    /* renamed from: x, reason: collision with root package name */
    private Integer f68224x;

    /* renamed from: y, reason: collision with root package name */
    private Date f68225y;

    /* renamed from: z, reason: collision with root package name */
    private TimeZone f68226z;

    /* renamed from: io.sentry.protocol.e$a */
    public static final class a implements InterfaceC7174n0<C7189e> {
        @NotNull
        public static C7189e b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7189e c7189e = new C7189e();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "timezone":
                        c7189e.f68226z = interfaceC7131c1.X0(iLogger);
                        break;
                    case "boot_time":
                        if (interfaceC7131c1.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            c7189e.f68225y = interfaceC7131c1.M(iLogger);
                            break;
                        }
                    case "simulator":
                        c7189e.f68212l = interfaceC7131c1.P();
                        break;
                    case "manufacturer":
                        c7189e.f68202b = interfaceC7131c1.k0();
                        break;
                    case "processor_count":
                        c7189e.f68196E = interfaceC7131c1.A1();
                        break;
                    case "orientation":
                        c7189e.f68211k = (b) interfaceC7131c1.S(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        c7189e.f68195D = interfaceC7131c1.A0();
                        break;
                    case "family":
                        c7189e.f68204d = interfaceC7131c1.k0();
                        break;
                    case "locale":
                        c7189e.f68193B = interfaceC7131c1.k0();
                        break;
                    case "online":
                        c7189e.f68210j = interfaceC7131c1.P();
                        break;
                    case "battery_level":
                        c7189e.f68208h = interfaceC7131c1.A0();
                        break;
                    case "model_id":
                        c7189e.f68206f = interfaceC7131c1.k0();
                        break;
                    case "screen_density":
                        c7189e.f68223w = interfaceC7131c1.A0();
                        break;
                    case "screen_dpi":
                        c7189e.f68224x = interfaceC7131c1.A1();
                        break;
                    case "free_memory":
                        c7189e.f68214n = interfaceC7131c1.D1();
                        break;
                    case "id":
                        c7189e.f68192A = interfaceC7131c1.k0();
                        break;
                    case "name":
                        c7189e.f68201a = interfaceC7131c1.k0();
                        break;
                    case "low_memory":
                        c7189e.f68216p = interfaceC7131c1.P();
                        break;
                    case "archs":
                        List list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c7189e.f68207g = strArr;
                            break;
                        }
                    case "brand":
                        c7189e.f68203c = interfaceC7131c1.k0();
                        break;
                    case "model":
                        c7189e.f68205e = interfaceC7131c1.k0();
                        break;
                    case "cpu_description":
                        c7189e.f68198G = interfaceC7131c1.k0();
                        break;
                    case "processor_frequency":
                        c7189e.f68197F = interfaceC7131c1.g1();
                        break;
                    case "connection_type":
                        c7189e.f68194C = interfaceC7131c1.k0();
                        break;
                    case "chipset":
                        c7189e.f68199H = interfaceC7131c1.k0();
                        break;
                    case "screen_width_pixels":
                        c7189e.f68221u = interfaceC7131c1.A1();
                        break;
                    case "external_storage_size":
                        c7189e.f68219s = interfaceC7131c1.D1();
                        break;
                    case "storage_size":
                        c7189e.f68217q = interfaceC7131c1.D1();
                        break;
                    case "usable_memory":
                        c7189e.f68215o = interfaceC7131c1.D1();
                        break;
                    case "memory_size":
                        c7189e.f68213m = interfaceC7131c1.D1();
                        break;
                    case "charging":
                        c7189e.f68209i = interfaceC7131c1.P();
                        break;
                    case "external_free_storage":
                        c7189e.f68220t = interfaceC7131c1.D1();
                        break;
                    case "free_storage":
                        c7189e.f68218r = interfaceC7131c1.D1();
                        break;
                    case "screen_height_pixels":
                        c7189e.f68222v = interfaceC7131c1.A1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            c7189e.q0(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7189e;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ C7189e a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    /* renamed from: io.sentry.protocol.e$b */
    public enum b implements InterfaceC7220x0 {
        PORTRAIT,
        LANDSCAPE;

        /* renamed from: io.sentry.protocol.e$b$a */
        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                return b.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC7220x0
        public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            ((C7212v0) interfaceC7135d1).p(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C7189e() {
    }

    public final String I() {
        return this.f68194C;
    }

    public final String J() {
        return this.f68192A;
    }

    public final String K() {
        return this.f68193B;
    }

    public final void L(String[] strArr) {
        this.f68207g = strArr;
    }

    public final void M(Float f7) {
        this.f68208h = f7;
    }

    public final void N(Float f7) {
        this.f68195D = f7;
    }

    public final void O(Date date) {
        this.f68225y = date;
    }

    public final void P() {
        this.f68203c = Build.BRAND;
    }

    public final void Q(Boolean bool) {
        this.f68209i = bool;
    }

    public final void R(String str) {
        this.f68199H = str;
    }

    public final void S(String str) {
        this.f68194C = str;
    }

    public final void T(Long l11) {
        this.f68220t = l11;
    }

    public final void U(Long l11) {
        this.f68219s = l11;
    }

    public final void V(String str) {
        this.f68204d = str;
    }

    public final void W(Long l11) {
        this.f68214n = l11;
    }

    public final void X(Long l11) {
        this.f68218r = l11;
    }

    public final void Y(String str) {
        this.f68192A = str;
    }

    public final void Z(String str) {
        this.f68193B = str;
    }

    public final void a0(Boolean bool) {
        this.f68216p = bool;
    }

    public final void b0() {
        this.f68202b = Build.MANUFACTURER;
    }

    public final void c0(Long l11) {
        this.f68213m = l11;
    }

    public final void d0() {
        this.f68205e = Build.MODEL;
    }

    public final void e0() {
        this.f68206f = Build.ID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7189e.class == obj.getClass()) {
            C7189e c7189e = (C7189e) obj;
            if (io.sentry.util.p.a(this.f68201a, c7189e.f68201a) && io.sentry.util.p.a(this.f68202b, c7189e.f68202b) && io.sentry.util.p.a(this.f68203c, c7189e.f68203c) && io.sentry.util.p.a(this.f68204d, c7189e.f68204d) && io.sentry.util.p.a(this.f68205e, c7189e.f68205e) && io.sentry.util.p.a(this.f68206f, c7189e.f68206f) && Arrays.equals(this.f68207g, c7189e.f68207g) && io.sentry.util.p.a(this.f68208h, c7189e.f68208h) && io.sentry.util.p.a(this.f68209i, c7189e.f68209i) && io.sentry.util.p.a(this.f68210j, c7189e.f68210j) && this.f68211k == c7189e.f68211k && io.sentry.util.p.a(this.f68212l, c7189e.f68212l) && io.sentry.util.p.a(this.f68213m, c7189e.f68213m) && io.sentry.util.p.a(this.f68214n, c7189e.f68214n) && io.sentry.util.p.a(this.f68215o, c7189e.f68215o) && io.sentry.util.p.a(this.f68216p, c7189e.f68216p) && io.sentry.util.p.a(this.f68217q, c7189e.f68217q) && io.sentry.util.p.a(this.f68218r, c7189e.f68218r) && io.sentry.util.p.a(this.f68219s, c7189e.f68219s) && io.sentry.util.p.a(this.f68220t, c7189e.f68220t) && io.sentry.util.p.a(this.f68221u, c7189e.f68221u) && io.sentry.util.p.a(this.f68222v, c7189e.f68222v) && io.sentry.util.p.a(this.f68223w, c7189e.f68223w) && io.sentry.util.p.a(this.f68224x, c7189e.f68224x) && io.sentry.util.p.a(this.f68225y, c7189e.f68225y) && io.sentry.util.p.a(this.f68192A, c7189e.f68192A) && io.sentry.util.p.a(this.f68193B, c7189e.f68193B) && io.sentry.util.p.a(this.f68194C, c7189e.f68194C) && io.sentry.util.p.a(this.f68195D, c7189e.f68195D) && io.sentry.util.p.a(this.f68196E, c7189e.f68196E) && io.sentry.util.p.a(this.f68197F, c7189e.f68197F) && io.sentry.util.p.a(this.f68198G, c7189e.f68198G) && io.sentry.util.p.a(this.f68199H, c7189e.f68199H)) {
                return true;
            }
        }
        return false;
    }

    public final void f0(Boolean bool) {
        this.f68210j = bool;
    }

    public final void g0(b bVar) {
        this.f68211k = bVar;
    }

    public final void h0(Integer num) {
        this.f68196E = num;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f68201a, this.f68202b, this.f68203c, this.f68204d, this.f68205e, this.f68206f, this.f68208h, this.f68209i, this.f68210j, this.f68211k, this.f68212l, this.f68213m, this.f68214n, this.f68215o, this.f68216p, this.f68217q, this.f68218r, this.f68219s, this.f68220t, this.f68221u, this.f68222v, this.f68223w, this.f68224x, this.f68225y, this.f68226z, this.f68192A, this.f68193B, this.f68194C, this.f68195D, this.f68196E, this.f68197F, this.f68198G, this.f68199H}) * 31) + Arrays.hashCode(this.f68207g);
    }

    public final void i0(Double d11) {
        this.f68197F = d11;
    }

    public final void j0(Float f7) {
        this.f68223w = f7;
    }

    public final void k0(Integer num) {
        this.f68224x = num;
    }

    public final void l0(Integer num) {
        this.f68222v = num;
    }

    public final void m0(Integer num) {
        this.f68221u = num;
    }

    public final void n0(Boolean bool) {
        this.f68212l = bool;
    }

    public final void o0(Long l11) {
        this.f68217q = l11;
    }

    public final void p0(TimeZone timeZone) {
        this.f68226z = timeZone;
    }

    public final void q0(Map<String, Object> map) {
        this.f68200I = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68201a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68201a);
        }
        if (this.f68202b != null) {
            c7212v0.g("manufacturer");
            c7212v0.p(this.f68202b);
        }
        if (this.f68203c != null) {
            c7212v0.g("brand");
            c7212v0.p(this.f68203c);
        }
        if (this.f68204d != null) {
            c7212v0.g("family");
            c7212v0.p(this.f68204d);
        }
        if (this.f68205e != null) {
            c7212v0.g("model");
            c7212v0.p(this.f68205e);
        }
        if (this.f68206f != null) {
            c7212v0.g("model_id");
            c7212v0.p(this.f68206f);
        }
        if (this.f68207g != null) {
            c7212v0.g("archs");
            c7212v0.m(iLogger, this.f68207g);
        }
        if (this.f68208h != null) {
            c7212v0.g("battery_level");
            c7212v0.o(this.f68208h);
        }
        if (this.f68209i != null) {
            c7212v0.g("charging");
            c7212v0.n(this.f68209i);
        }
        if (this.f68210j != null) {
            c7212v0.g("online");
            c7212v0.n(this.f68210j);
        }
        if (this.f68211k != null) {
            c7212v0.g("orientation");
            c7212v0.m(iLogger, this.f68211k);
        }
        if (this.f68212l != null) {
            c7212v0.g("simulator");
            c7212v0.n(this.f68212l);
        }
        if (this.f68213m != null) {
            c7212v0.g("memory_size");
            c7212v0.o(this.f68213m);
        }
        if (this.f68214n != null) {
            c7212v0.g("free_memory");
            c7212v0.o(this.f68214n);
        }
        if (this.f68215o != null) {
            c7212v0.g("usable_memory");
            c7212v0.o(this.f68215o);
        }
        if (this.f68216p != null) {
            c7212v0.g("low_memory");
            c7212v0.n(this.f68216p);
        }
        if (this.f68217q != null) {
            c7212v0.g("storage_size");
            c7212v0.o(this.f68217q);
        }
        if (this.f68218r != null) {
            c7212v0.g("free_storage");
            c7212v0.o(this.f68218r);
        }
        if (this.f68219s != null) {
            c7212v0.g("external_storage_size");
            c7212v0.o(this.f68219s);
        }
        if (this.f68220t != null) {
            c7212v0.g("external_free_storage");
            c7212v0.o(this.f68220t);
        }
        if (this.f68221u != null) {
            c7212v0.g("screen_width_pixels");
            c7212v0.o(this.f68221u);
        }
        if (this.f68222v != null) {
            c7212v0.g("screen_height_pixels");
            c7212v0.o(this.f68222v);
        }
        if (this.f68223w != null) {
            c7212v0.g("screen_density");
            c7212v0.o(this.f68223w);
        }
        if (this.f68224x != null) {
            c7212v0.g("screen_dpi");
            c7212v0.o(this.f68224x);
        }
        if (this.f68225y != null) {
            c7212v0.g("boot_time");
            c7212v0.m(iLogger, this.f68225y);
        }
        if (this.f68226z != null) {
            c7212v0.g("timezone");
            c7212v0.m(iLogger, this.f68226z);
        }
        if (this.f68192A != null) {
            c7212v0.g("id");
            c7212v0.p(this.f68192A);
        }
        if (this.f68194C != null) {
            c7212v0.g("connection_type");
            c7212v0.p(this.f68194C);
        }
        if (this.f68195D != null) {
            c7212v0.g("battery_temperature");
            c7212v0.o(this.f68195D);
        }
        if (this.f68193B != null) {
            c7212v0.g("locale");
            c7212v0.p(this.f68193B);
        }
        if (this.f68196E != null) {
            c7212v0.g("processor_count");
            c7212v0.o(this.f68196E);
        }
        if (this.f68197F != null) {
            c7212v0.g("processor_frequency");
            c7212v0.o(this.f68197F);
        }
        if (this.f68198G != null) {
            c7212v0.g("cpu_description");
            c7212v0.p(this.f68198G);
        }
        if (this.f68199H != null) {
            c7212v0.g("chipset");
            c7212v0.p(this.f68199H);
        }
        ConcurrentHashMap concurrentHashMap = this.f68200I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68200I, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    C7189e(@NotNull C7189e c7189e) {
        this.f68201a = c7189e.f68201a;
        this.f68202b = c7189e.f68202b;
        this.f68203c = c7189e.f68203c;
        this.f68204d = c7189e.f68204d;
        this.f68205e = c7189e.f68205e;
        this.f68206f = c7189e.f68206f;
        this.f68209i = c7189e.f68209i;
        this.f68210j = c7189e.f68210j;
        this.f68211k = c7189e.f68211k;
        this.f68212l = c7189e.f68212l;
        this.f68213m = c7189e.f68213m;
        this.f68214n = c7189e.f68214n;
        this.f68215o = c7189e.f68215o;
        this.f68216p = c7189e.f68216p;
        this.f68217q = c7189e.f68217q;
        this.f68218r = c7189e.f68218r;
        this.f68219s = c7189e.f68219s;
        this.f68220t = c7189e.f68220t;
        this.f68221u = c7189e.f68221u;
        this.f68222v = c7189e.f68222v;
        this.f68223w = c7189e.f68223w;
        this.f68224x = c7189e.f68224x;
        this.f68225y = c7189e.f68225y;
        this.f68192A = c7189e.f68192A;
        this.f68194C = c7189e.f68194C;
        this.f68195D = c7189e.f68195D;
        this.f68208h = c7189e.f68208h;
        String[] strArr = c7189e.f68207g;
        this.f68207g = strArr != null ? (String[]) strArr.clone() : null;
        this.f68193B = c7189e.f68193B;
        TimeZone timeZone = c7189e.f68226z;
        this.f68226z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f68196E = c7189e.f68196E;
        this.f68197F = c7189e.f68197F;
        this.f68198G = c7189e.f68198G;
        this.f68199H = c7189e.f68199H;
        this.f68200I = io.sentry.util.c.a(c7189e.f68200I);
    }
}
