package io.sentry.protocol;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements c2 {
    public String A;
    public String B;
    public String C;
    public Float D;
    public Integer E;
    public Double F;
    public String G;
    public String H;
    public ConcurrentHashMap I;

    /* renamed from: a, reason: collision with root package name */
    public String f16776a;

    /* renamed from: b, reason: collision with root package name */
    public String f16777b;

    /* renamed from: c, reason: collision with root package name */
    public String f16778c;

    /* renamed from: d, reason: collision with root package name */
    public String f16779d;

    /* renamed from: e, reason: collision with root package name */
    public String f16780e;

    /* renamed from: f, reason: collision with root package name */
    public String f16781f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f16782g;

    /* renamed from: h, reason: collision with root package name */
    public Float f16783h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f16784i;
    public Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public e f16785k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f16786l;

    /* renamed from: m, reason: collision with root package name */
    public Long f16787m;

    /* renamed from: n, reason: collision with root package name */
    public Long f16788n;

    /* renamed from: o, reason: collision with root package name */
    public Long f16789o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f16790p;
    public Long q;

    /* renamed from: r, reason: collision with root package name */
    public Long f16791r;

    /* renamed from: s, reason: collision with root package name */
    public Long f16792s;

    /* renamed from: t, reason: collision with root package name */
    public Long f16793t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f16794u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f16795v;

    /* renamed from: w, reason: collision with root package name */
    public Float f16796w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f16797x;

    /* renamed from: y, reason: collision with root package name */
    public Date f16798y;

    /* renamed from: z, reason: collision with root package name */
    public TimeZone f16799z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (y4.a.s(this.f16776a, fVar.f16776a) && y4.a.s(this.f16777b, fVar.f16777b) && y4.a.s(this.f16778c, fVar.f16778c) && y4.a.s(this.f16779d, fVar.f16779d) && y4.a.s(this.f16780e, fVar.f16780e) && y4.a.s(this.f16781f, fVar.f16781f) && Arrays.equals(this.f16782g, fVar.f16782g) && y4.a.s(this.f16783h, fVar.f16783h) && y4.a.s(this.f16784i, fVar.f16784i) && y4.a.s(this.j, fVar.j) && this.f16785k == fVar.f16785k && y4.a.s(this.f16786l, fVar.f16786l) && y4.a.s(this.f16787m, fVar.f16787m) && y4.a.s(this.f16788n, fVar.f16788n) && y4.a.s(this.f16789o, fVar.f16789o) && y4.a.s(this.f16790p, fVar.f16790p) && y4.a.s(this.q, fVar.q) && y4.a.s(this.f16791r, fVar.f16791r) && y4.a.s(this.f16792s, fVar.f16792s) && y4.a.s(this.f16793t, fVar.f16793t) && y4.a.s(this.f16794u, fVar.f16794u) && y4.a.s(this.f16795v, fVar.f16795v) && y4.a.s(this.f16796w, fVar.f16796w) && y4.a.s(this.f16797x, fVar.f16797x) && y4.a.s(this.f16798y, fVar.f16798y) && y4.a.s(this.A, fVar.A) && y4.a.s(this.B, fVar.B) && y4.a.s(this.C, fVar.C) && y4.a.s(this.D, fVar.D) && y4.a.s(this.E, fVar.E) && y4.a.s(this.F, fVar.F) && y4.a.s(this.G, fVar.G) && y4.a.s(this.H, fVar.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f16776a, this.f16777b, this.f16778c, this.f16779d, this.f16780e, this.f16781f, this.f16783h, this.f16784i, this.j, this.f16785k, this.f16786l, this.f16787m, this.f16788n, this.f16789o, this.f16790p, this.q, this.f16791r, this.f16792s, this.f16793t, this.f16794u, this.f16795v, this.f16796w, this.f16797x, this.f16798y, this.f16799z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H}) * 31) + Arrays.hashCode(this.f16782g);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16776a != null) {
            aVar.u("name");
            aVar.K(this.f16776a);
        }
        if (this.f16777b != null) {
            aVar.u(CommonUrlParts.MANUFACTURER);
            aVar.K(this.f16777b);
        }
        if (this.f16778c != null) {
            aVar.u("brand");
            aVar.K(this.f16778c);
        }
        if (this.f16779d != null) {
            aVar.u("family");
            aVar.K(this.f16779d);
        }
        if (this.f16780e != null) {
            aVar.u(CommonUrlParts.MODEL);
            aVar.K(this.f16780e);
        }
        if (this.f16781f != null) {
            aVar.u("model_id");
            aVar.K(this.f16781f);
        }
        if (this.f16782g != null) {
            aVar.u("archs");
            aVar.H(iLogger, this.f16782g);
        }
        if (this.f16783h != null) {
            aVar.u("battery_level");
            aVar.J(this.f16783h);
        }
        if (this.f16784i != null) {
            aVar.u("charging");
            aVar.I(this.f16784i);
        }
        if (this.j != null) {
            aVar.u("online");
            aVar.I(this.j);
        }
        if (this.f16785k != null) {
            aVar.u("orientation");
            aVar.H(iLogger, this.f16785k);
        }
        if (this.f16786l != null) {
            aVar.u("simulator");
            aVar.I(this.f16786l);
        }
        if (this.f16787m != null) {
            aVar.u("memory_size");
            aVar.J(this.f16787m);
        }
        if (this.f16788n != null) {
            aVar.u("free_memory");
            aVar.J(this.f16788n);
        }
        if (this.f16789o != null) {
            aVar.u("usable_memory");
            aVar.J(this.f16789o);
        }
        if (this.f16790p != null) {
            aVar.u("low_memory");
            aVar.I(this.f16790p);
        }
        if (this.q != null) {
            aVar.u("storage_size");
            aVar.J(this.q);
        }
        if (this.f16791r != null) {
            aVar.u("free_storage");
            aVar.J(this.f16791r);
        }
        if (this.f16792s != null) {
            aVar.u("external_storage_size");
            aVar.J(this.f16792s);
        }
        if (this.f16793t != null) {
            aVar.u("external_free_storage");
            aVar.J(this.f16793t);
        }
        if (this.f16794u != null) {
            aVar.u("screen_width_pixels");
            aVar.J(this.f16794u);
        }
        if (this.f16795v != null) {
            aVar.u("screen_height_pixels");
            aVar.J(this.f16795v);
        }
        if (this.f16796w != null) {
            aVar.u("screen_density");
            aVar.J(this.f16796w);
        }
        if (this.f16797x != null) {
            aVar.u(CommonUrlParts.SCREEN_DPI);
            aVar.J(this.f16797x);
        }
        if (this.f16798y != null) {
            aVar.u("boot_time");
            aVar.H(iLogger, this.f16798y);
        }
        if (this.f16799z != null) {
            aVar.u("timezone");
            aVar.H(iLogger, this.f16799z);
        }
        if (this.A != null) {
            aVar.u("id");
            aVar.K(this.A);
        }
        if (this.C != null) {
            aVar.u("connection_type");
            aVar.K(this.C);
        }
        if (this.D != null) {
            aVar.u("battery_temperature");
            aVar.J(this.D);
        }
        if (this.B != null) {
            aVar.u(CommonUrlParts.LOCALE);
            aVar.K(this.B);
        }
        if (this.E != null) {
            aVar.u("processor_count");
            aVar.J(this.E);
        }
        if (this.F != null) {
            aVar.u("processor_frequency");
            aVar.J(this.F);
        }
        if (this.G != null) {
            aVar.u("cpu_description");
            aVar.K(this.G);
        }
        if (this.H != null) {
            aVar.u("chipset");
            aVar.K(this.H);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.I, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
