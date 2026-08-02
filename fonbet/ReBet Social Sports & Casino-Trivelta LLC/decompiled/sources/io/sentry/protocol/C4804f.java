package io.sentry.protocol;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4804f implements G0 {

    /* renamed from: A, reason: collision with root package name */
    public String f52344A;

    /* renamed from: B, reason: collision with root package name */
    public String f52345B;

    /* renamed from: C, reason: collision with root package name */
    public Float f52346C;

    /* renamed from: D, reason: collision with root package name */
    public Integer f52347D;

    /* renamed from: E, reason: collision with root package name */
    public Double f52348E;

    /* renamed from: F, reason: collision with root package name */
    public String f52349F;

    /* renamed from: G, reason: collision with root package name */
    public String f52350G;

    /* renamed from: H, reason: collision with root package name */
    public Map f52351H;

    /* renamed from: a, reason: collision with root package name */
    public String f52352a;

    @Nullable
    private String[] archs;

    /* renamed from: b, reason: collision with root package name */
    public String f52353b;

    /* renamed from: c, reason: collision with root package name */
    public String f52354c;

    /* renamed from: d, reason: collision with root package name */
    public String f52355d;

    /* renamed from: e, reason: collision with root package name */
    public String f52356e;

    /* renamed from: f, reason: collision with root package name */
    public String f52357f;

    /* renamed from: g, reason: collision with root package name */
    public Float f52358g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f52359h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f52360i;

    /* renamed from: j, reason: collision with root package name */
    public b f52361j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f52362k;

    /* renamed from: l, reason: collision with root package name */
    public Long f52363l;

    /* renamed from: m, reason: collision with root package name */
    public Long f52364m;

    /* renamed from: n, reason: collision with root package name */
    public Long f52365n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f52366o;

    /* renamed from: p, reason: collision with root package name */
    public Long f52367p;

    /* renamed from: q, reason: collision with root package name */
    public Long f52368q;

    /* renamed from: r, reason: collision with root package name */
    public Long f52369r;

    /* renamed from: s, reason: collision with root package name */
    public Long f52370s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f52371t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f52372u;

    /* renamed from: v, reason: collision with root package name */
    public Float f52373v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f52374w;

    /* renamed from: x, reason: collision with root package name */
    public Date f52375x;

    /* renamed from: y, reason: collision with root package name */
    public TimeZone f52376y;

    /* renamed from: z, reason: collision with root package name */
    public String f52377z;

    /* renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4804f a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4804f c4804f = new C4804f();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "timezone":
                        c4804f.f52376y = interfaceC4809q1.P(iLogger);
                        break;
                    case "boot_time":
                        if (interfaceC4809q1.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            c4804f.f52375x = interfaceC4809q1.j0(iLogger);
                            break;
                        }
                    case "simulator":
                        c4804f.f52362k = interfaceC4809q1.p0();
                        break;
                    case "manufacturer":
                        c4804f.f52353b = interfaceC4809q1.a1();
                        break;
                    case "processor_count":
                        c4804f.f52347D = interfaceC4809q1.Q0();
                        break;
                    case "orientation":
                        c4804f.f52361j = (b) interfaceC4809q1.x0(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        c4804f.f52346C = interfaceC4809q1.B1();
                        break;
                    case "family":
                        c4804f.f52355d = interfaceC4809q1.a1();
                        break;
                    case "locale":
                        c4804f.f52344A = interfaceC4809q1.a1();
                        break;
                    case "online":
                        c4804f.f52360i = interfaceC4809q1.p0();
                        break;
                    case "battery_level":
                        c4804f.f52358g = interfaceC4809q1.B1();
                        break;
                    case "model_id":
                        c4804f.f52357f = interfaceC4809q1.a1();
                        break;
                    case "screen_density":
                        c4804f.f52373v = interfaceC4809q1.B1();
                        break;
                    case "screen_dpi":
                        c4804f.f52374w = interfaceC4809q1.Q0();
                        break;
                    case "free_memory":
                        c4804f.f52364m = interfaceC4809q1.U0();
                        break;
                    case "id":
                        c4804f.f52377z = interfaceC4809q1.a1();
                        break;
                    case "name":
                        c4804f.f52352a = interfaceC4809q1.a1();
                        break;
                    case "low_memory":
                        c4804f.f52366o = interfaceC4809q1.p0();
                        break;
                    case "archs":
                        List list = (List) interfaceC4809q1.H1();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c4804f.archs = strArr;
                            break;
                        }
                    case "brand":
                        c4804f.f52354c = interfaceC4809q1.a1();
                        break;
                    case "model":
                        c4804f.f52356e = interfaceC4809q1.a1();
                        break;
                    case "cpu_description":
                        c4804f.f52349F = interfaceC4809q1.a1();
                        break;
                    case "processor_frequency":
                        c4804f.f52348E = interfaceC4809q1.e0();
                        break;
                    case "connection_type":
                        c4804f.f52345B = interfaceC4809q1.a1();
                        break;
                    case "chipset":
                        c4804f.f52350G = interfaceC4809q1.a1();
                        break;
                    case "screen_width_pixels":
                        c4804f.f52371t = interfaceC4809q1.Q0();
                        break;
                    case "external_storage_size":
                        c4804f.f52369r = interfaceC4809q1.U0();
                        break;
                    case "storage_size":
                        c4804f.f52367p = interfaceC4809q1.U0();
                        break;
                    case "usable_memory":
                        c4804f.f52365n = interfaceC4809q1.U0();
                        break;
                    case "memory_size":
                        c4804f.f52363l = interfaceC4809q1.U0();
                        break;
                    case "charging":
                        c4804f.f52359h = interfaceC4809q1.p0();
                        break;
                    case "external_free_storage":
                        c4804f.f52370s = interfaceC4809q1.U0();
                        break;
                    case "free_storage":
                        c4804f.f52368q = interfaceC4809q1.U0();
                        break;
                    case "screen_height_pixels":
                        c4804f.f52372u = interfaceC4809q1.Q0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            c4804f.q0(concurrentHashMap);
            interfaceC4809q1.t();
            return c4804f;
        }
    }

    /* renamed from: io.sentry.protocol.f$b */
    public enum b implements G0 {
        PORTRAIT,
        LANDSCAPE;

        /* renamed from: io.sentry.protocol.f$b$a */
        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                return b.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.G0
        public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
            interfaceC4813r1.e(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C4804f() {
    }

    public String I() {
        return this.f52345B;
    }

    public String J() {
        return this.f52377z;
    }

    public String K() {
        return this.f52344A;
    }

    public void L(String[] strArr) {
        this.archs = strArr;
    }

    public void M(Float f10) {
        this.f52358g = f10;
    }

    public void N(Float f10) {
        this.f52346C = f10;
    }

    public void O(Date date) {
        this.f52375x = date;
    }

    public void P(String str) {
        this.f52354c = str;
    }

    public void Q(Boolean bool) {
        this.f52359h = bool;
    }

    public void R(String str) {
        this.f52350G = str;
    }

    public void S(String str) {
        this.f52345B = str;
    }

    public void T(Long l10) {
        this.f52370s = l10;
    }

    public void U(Long l10) {
        this.f52369r = l10;
    }

    public void V(String str) {
        this.f52355d = str;
    }

    public void W(Long l10) {
        this.f52364m = l10;
    }

    public void X(Long l10) {
        this.f52368q = l10;
    }

    public void Y(String str) {
        this.f52377z = str;
    }

    public void Z(String str) {
        this.f52344A = str;
    }

    public void a0(Boolean bool) {
        this.f52366o = bool;
    }

    public void b0(String str) {
        this.f52353b = str;
    }

    public void c0(Long l10) {
        this.f52363l = l10;
    }

    public void d0(String str) {
        this.f52356e = str;
    }

    public void e0(String str) {
        this.f52357f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4804f.class == obj.getClass()) {
            C4804f c4804f = (C4804f) obj;
            if (io.sentry.util.w.a(this.f52352a, c4804f.f52352a) && io.sentry.util.w.a(this.f52353b, c4804f.f52353b) && io.sentry.util.w.a(this.f52354c, c4804f.f52354c) && io.sentry.util.w.a(this.f52355d, c4804f.f52355d) && io.sentry.util.w.a(this.f52356e, c4804f.f52356e) && io.sentry.util.w.a(this.f52357f, c4804f.f52357f) && Arrays.equals(this.archs, c4804f.archs) && io.sentry.util.w.a(this.f52358g, c4804f.f52358g) && io.sentry.util.w.a(this.f52359h, c4804f.f52359h) && io.sentry.util.w.a(this.f52360i, c4804f.f52360i) && this.f52361j == c4804f.f52361j && io.sentry.util.w.a(this.f52362k, c4804f.f52362k) && io.sentry.util.w.a(this.f52363l, c4804f.f52363l) && io.sentry.util.w.a(this.f52364m, c4804f.f52364m) && io.sentry.util.w.a(this.f52365n, c4804f.f52365n) && io.sentry.util.w.a(this.f52366o, c4804f.f52366o) && io.sentry.util.w.a(this.f52367p, c4804f.f52367p) && io.sentry.util.w.a(this.f52368q, c4804f.f52368q) && io.sentry.util.w.a(this.f52369r, c4804f.f52369r) && io.sentry.util.w.a(this.f52370s, c4804f.f52370s) && io.sentry.util.w.a(this.f52371t, c4804f.f52371t) && io.sentry.util.w.a(this.f52372u, c4804f.f52372u) && io.sentry.util.w.a(this.f52373v, c4804f.f52373v) && io.sentry.util.w.a(this.f52374w, c4804f.f52374w) && io.sentry.util.w.a(this.f52375x, c4804f.f52375x) && io.sentry.util.w.a(this.f52377z, c4804f.f52377z) && io.sentry.util.w.a(this.f52344A, c4804f.f52344A) && io.sentry.util.w.a(this.f52345B, c4804f.f52345B) && io.sentry.util.w.a(this.f52346C, c4804f.f52346C) && io.sentry.util.w.a(this.f52347D, c4804f.f52347D) && io.sentry.util.w.a(this.f52348E, c4804f.f52348E) && io.sentry.util.w.a(this.f52349F, c4804f.f52349F) && io.sentry.util.w.a(this.f52350G, c4804f.f52350G)) {
                return true;
            }
        }
        return false;
    }

    public void f0(Boolean bool) {
        this.f52360i = bool;
    }

    public void g0(b bVar) {
        this.f52361j = bVar;
    }

    public void h0(Integer num) {
        this.f52347D = num;
    }

    public int hashCode() {
        return (io.sentry.util.w.b(this.f52352a, this.f52353b, this.f52354c, this.f52355d, this.f52356e, this.f52357f, this.f52358g, this.f52359h, this.f52360i, this.f52361j, this.f52362k, this.f52363l, this.f52364m, this.f52365n, this.f52366o, this.f52367p, this.f52368q, this.f52369r, this.f52370s, this.f52371t, this.f52372u, this.f52373v, this.f52374w, this.f52375x, this.f52376y, this.f52377z, this.f52344A, this.f52345B, this.f52346C, this.f52347D, this.f52348E, this.f52349F, this.f52350G) * 31) + Arrays.hashCode(this.archs);
    }

    public void i0(Double d10) {
        this.f52348E = d10;
    }

    public void j0(Float f10) {
        this.f52373v = f10;
    }

    public void k0(Integer num) {
        this.f52374w = num;
    }

    public void l0(Integer num) {
        this.f52372u = num;
    }

    public void m0(Integer num) {
        this.f52371t = num;
    }

    public void n0(Boolean bool) {
        this.f52362k = bool;
    }

    public void o0(Long l10) {
        this.f52367p = l10;
    }

    public void p0(TimeZone timeZone) {
        this.f52376y = timeZone;
    }

    public void q0(Map map) {
        this.f52351H = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52352a != null) {
            interfaceC4813r1.d("name").e(this.f52352a);
        }
        if (this.f52353b != null) {
            interfaceC4813r1.d("manufacturer").e(this.f52353b);
        }
        if (this.f52354c != null) {
            interfaceC4813r1.d("brand").e(this.f52354c);
        }
        if (this.f52355d != null) {
            interfaceC4813r1.d("family").e(this.f52355d);
        }
        if (this.f52356e != null) {
            interfaceC4813r1.d("model").e(this.f52356e);
        }
        if (this.f52357f != null) {
            interfaceC4813r1.d("model_id").e(this.f52357f);
        }
        if (this.archs != null) {
            interfaceC4813r1.d("archs").j(iLogger, this.archs);
        }
        if (this.f52358g != null) {
            interfaceC4813r1.d("battery_level").i(this.f52358g);
        }
        if (this.f52359h != null) {
            interfaceC4813r1.d("charging").k(this.f52359h);
        }
        if (this.f52360i != null) {
            interfaceC4813r1.d("online").k(this.f52360i);
        }
        if (this.f52361j != null) {
            interfaceC4813r1.d("orientation").j(iLogger, this.f52361j);
        }
        if (this.f52362k != null) {
            interfaceC4813r1.d("simulator").k(this.f52362k);
        }
        if (this.f52363l != null) {
            interfaceC4813r1.d("memory_size").i(this.f52363l);
        }
        if (this.f52364m != null) {
            interfaceC4813r1.d("free_memory").i(this.f52364m);
        }
        if (this.f52365n != null) {
            interfaceC4813r1.d("usable_memory").i(this.f52365n);
        }
        if (this.f52366o != null) {
            interfaceC4813r1.d("low_memory").k(this.f52366o);
        }
        if (this.f52367p != null) {
            interfaceC4813r1.d("storage_size").i(this.f52367p);
        }
        if (this.f52368q != null) {
            interfaceC4813r1.d("free_storage").i(this.f52368q);
        }
        if (this.f52369r != null) {
            interfaceC4813r1.d("external_storage_size").i(this.f52369r);
        }
        if (this.f52370s != null) {
            interfaceC4813r1.d("external_free_storage").i(this.f52370s);
        }
        if (this.f52371t != null) {
            interfaceC4813r1.d("screen_width_pixels").i(this.f52371t);
        }
        if (this.f52372u != null) {
            interfaceC4813r1.d("screen_height_pixels").i(this.f52372u);
        }
        if (this.f52373v != null) {
            interfaceC4813r1.d("screen_density").i(this.f52373v);
        }
        if (this.f52374w != null) {
            interfaceC4813r1.d("screen_dpi").i(this.f52374w);
        }
        if (this.f52375x != null) {
            interfaceC4813r1.d("boot_time").j(iLogger, this.f52375x);
        }
        if (this.f52376y != null) {
            interfaceC4813r1.d("timezone").j(iLogger, this.f52376y);
        }
        if (this.f52377z != null) {
            interfaceC4813r1.d(StackTraceHelper.ID_KEY).e(this.f52377z);
        }
        if (this.f52345B != null) {
            interfaceC4813r1.d("connection_type").e(this.f52345B);
        }
        if (this.f52346C != null) {
            interfaceC4813r1.d("battery_temperature").i(this.f52346C);
        }
        if (this.f52344A != null) {
            interfaceC4813r1.d(Constants.LOCALE).e(this.f52344A);
        }
        if (this.f52347D != null) {
            interfaceC4813r1.d("processor_count").i(this.f52347D);
        }
        if (this.f52348E != null) {
            interfaceC4813r1.d("processor_frequency").i(this.f52348E);
        }
        if (this.f52349F != null) {
            interfaceC4813r1.d("cpu_description").e(this.f52349F);
        }
        if (this.f52350G != null) {
            interfaceC4813r1.d("chipset").e(this.f52350G);
        }
        Map map = this.f52351H;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52351H.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public C4804f(C4804f c4804f) {
        this.f52352a = c4804f.f52352a;
        this.f52353b = c4804f.f52353b;
        this.f52354c = c4804f.f52354c;
        this.f52355d = c4804f.f52355d;
        this.f52356e = c4804f.f52356e;
        this.f52357f = c4804f.f52357f;
        this.f52359h = c4804f.f52359h;
        this.f52360i = c4804f.f52360i;
        this.f52361j = c4804f.f52361j;
        this.f52362k = c4804f.f52362k;
        this.f52363l = c4804f.f52363l;
        this.f52364m = c4804f.f52364m;
        this.f52365n = c4804f.f52365n;
        this.f52366o = c4804f.f52366o;
        this.f52367p = c4804f.f52367p;
        this.f52368q = c4804f.f52368q;
        this.f52369r = c4804f.f52369r;
        this.f52370s = c4804f.f52370s;
        this.f52371t = c4804f.f52371t;
        this.f52372u = c4804f.f52372u;
        this.f52373v = c4804f.f52373v;
        this.f52374w = c4804f.f52374w;
        this.f52375x = c4804f.f52375x;
        this.f52377z = c4804f.f52377z;
        this.f52345B = c4804f.f52345B;
        this.f52346C = c4804f.f52346C;
        this.f52358g = c4804f.f52358g;
        String[] strArr = c4804f.archs;
        this.archs = strArr != null ? (String[]) strArr.clone() : null;
        this.f52344A = c4804f.f52344A;
        TimeZone timeZone = c4804f.f52376y;
        this.f52376y = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f52347D = c4804f.f52347D;
        this.f52348E = c4804f.f52348E;
        this.f52349F = c4804f.f52349F;
        this.f52350G = c4804f.f52350G;
        this.f52351H = AbstractC4845c.b(c4804f.f52351H);
    }
}
