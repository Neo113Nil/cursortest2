package O;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w extends O.c {

    /* renamed from: q, reason: collision with root package name */
    public static final a f8217q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final i f8218r = new i() { // from class: O.p
        @Override // O.i
        public final double a(double d10) {
            double t10;
            t10 = w.t(d10);
            return t10;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final y f8219e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8220f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8221g;

    /* renamed from: h, reason: collision with root package name */
    public final x f8222h;

    /* renamed from: i, reason: collision with root package name */
    public final i f8223i;

    @NotNull
    private final float[] inverseTransform;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f8224j;

    /* renamed from: k, reason: collision with root package name */
    public final i f8225k;

    /* renamed from: l, reason: collision with root package name */
    public final i f8226l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f8227m;

    /* renamed from: n, reason: collision with root package name */
    public final i f8228n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8229o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8230p;

    @NotNull
    private final float[] primaries;

    @NotNull
    private final float[] transform;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        public final boolean f(double d10, i iVar, i iVar2) {
            return Math.abs(iVar.a(d10) - iVar2.a(d10)) <= 0.001d;
        }

        public final float[] g(float[] fArr, y yVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float a10 = yVar.a();
            float b10 = yVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - a10) / b10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (a10 / b10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        public final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2] - fArr2[2];
            float f15 = fArr[3] - fArr2[3];
            float f16 = fArr[4];
            float f17 = fArr2[4];
            float f18 = fArr[5];
            float f19 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14, f15, f16 - f17, f18 - f19};
            return i(fArr3[0], fArr3[1], f11 - f17, f13 - f19) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        public final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public final boolean j(float[] fArr, y yVar, i iVar, i iVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            g gVar = g.f8158a;
            if (!d.g(fArr, gVar.i()) || !d.f(yVar, j.f8190a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            w h10 = gVar.h();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, iVar, h10.H()) || !f(d10, iVar2, h10.E())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean k(float[] fArr, float f10, float f11) {
            float e10 = e(fArr);
            g gVar = g.f8158a;
            if (e10 / e(gVar.f()) <= 0.9f || !h(fArr, gVar.i())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                ArraysKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(w.this.E().a(RangesKt.coerceIn(d10, w.this.f8220f, w.this.f8221g)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(RangesKt.coerceIn(w.this.H().a(d10), w.this.f8220f, w.this.f8221g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String name, float[] primaries, y whitePoint, float[] fArr, i oetf, i eotf, float f10, float f11, x xVar, int i10) {
        super(name, O.b.f8149a.b(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.f8219e = whitePoint;
        this.f8220f = f10;
        this.f8221g = f11;
        this.f8222h = xVar;
        this.f8223i = oetf;
        this.f8224j = new c();
        this.f8225k = new i() { // from class: O.n
            @Override // O.i
            public final double a(double d10) {
                double K10;
                K10 = w.K(w.this, d10);
                return K10;
            }
        };
        this.f8226l = eotf;
        this.f8227m = new b();
        this.f8228n = new i() { // from class: O.o
            @Override // O.i
            public final double a(double d10) {
                double C10;
                C10 = w.C(w.this, d10);
                return C10;
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f8217q;
        float[] l10 = aVar.l(primaries);
        this.primaries = l10;
        if (fArr == null) {
            this.transform = aVar.g(l10, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        }
        this.inverseTransform = d.j(this.transform);
        this.f8229o = aVar.k(l10, f10, f11);
        this.f8230p = aVar.j(l10, whitePoint, oetf, eotf, f10, f11, i10);
    }

    public static final double C(w this$0, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f8226l.a(RangesKt.coerceIn(d10, this$0.f8220f, this$0.f8221g));
    }

    public static final double K(w this$0, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return RangesKt.coerceIn(this$0.f8223i.a(d10), this$0.f8220f, this$0.f8221g);
    }

    public static final double u(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    public static final double v(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public static final double w(x function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return d.q(d10, function.a(), function.b(), function.c(), function.d(), function.g());
    }

    public static final double x(x function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return d.r(d10, function.a(), function.b(), function.c(), function.d(), function.e(), function.f(), function.g());
    }

    public static final double y(x function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return d.s(d10, function.a(), function.b(), function.c(), function.d(), function.g());
    }

    public static final double z(x function, double d10) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return d.t(d10, function.a(), function.b(), function.c(), function.d(), function.e(), function.f(), function.g());
    }

    public final i D() {
        return this.f8228n;
    }

    public final i E() {
        return this.f8226l;
    }

    public final float[] F() {
        return this.inverseTransform;
    }

    public final i G() {
        return this.f8225k;
    }

    public final i H() {
        return this.f8223i;
    }

    public final float[] I() {
        return this.transform;
    }

    public final y J() {
        return this.f8219e;
    }

    @Override // O.c
    public float c(int i10) {
        return this.f8221g;
    }

    @Override // O.c
    public float d(int i10) {
        return this.f8220f;
    }

    @Override // O.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(wVar.f8220f, this.f8220f) != 0 || Float.compare(wVar.f8221g, this.f8221g) != 0 || !Intrinsics.areEqual(this.f8219e, wVar.f8219e) || !Arrays.equals(this.primaries, wVar.primaries)) {
            return false;
        }
        x xVar = this.f8222h;
        if (xVar != null) {
            return Intrinsics.areEqual(xVar, wVar.f8222h);
        }
        if (wVar.f8222h == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.f8223i, wVar.f8223i)) {
            return Intrinsics.areEqual(this.f8226l, wVar.f8226l);
        }
        return false;
    }

    @Override // O.c
    public boolean g() {
        return this.f8230p;
    }

    @Override // O.c
    public long h(float f10, float f11, float f12) {
        float a10 = (float) this.f8228n.a(f10);
        float a11 = (float) this.f8228n.a(f11);
        float a12 = (float) this.f8228n.a(f12);
        float n10 = d.n(this.transform, a10, a11, a12);
        float o10 = d.o(this.transform, a10, a11, a12);
        return (Float.floatToIntBits(n10) << 32) | (Float.floatToIntBits(o10) & BodyPartID.bodyIdMax);
    }

    @Override // O.c
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f8219e.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.f8220f;
        int floatToIntBits = (hashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f8221g;
        int floatToIntBits2 = (floatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        x xVar = this.f8222h;
        int hashCode2 = floatToIntBits2 + (xVar != null ? xVar.hashCode() : 0);
        return this.f8222h == null ? (((hashCode2 * 31) + this.f8223i.hashCode()) * 31) + this.f8226l.hashCode() : hashCode2;
    }

    @Override // O.c
    public float i(float f10, float f11, float f12) {
        return d.p(this.transform, (float) this.f8228n.a(f10), (float) this.f8228n.a(f11), (float) this.f8228n.a(f12));
    }

    @Override // O.c
    public long j(float f10, float f11, float f12, float f13, O.c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return N.f.a((float) this.f8225k.a(d.n(this.inverseTransform, f10, f11, f12)), (float) this.f8225k.a(d.o(this.inverseTransform, f10, f11, f12)), (float) this.f8225k.a(d.p(this.inverseTransform, f10, f11, f12)), f13, colorSpace);
    }

    public static final double t(double d10) {
        return d10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(String name, float[] primaries, y whitePoint, final x function, int i10) {
        this(name, primaries, whitePoint, null, (function.e() == 0.0d && function.f() == 0.0d) ? new i() { // from class: O.s
            @Override // O.i
            public final double a(double d10) {
                double w10;
                w10 = w.w(x.this, d10);
                return w10;
            }
        } : new i() { // from class: O.t
            @Override // O.i
            public final double a(double d10) {
                double x10;
                x10 = w.x(x.this, d10);
                return x10;
            }
        }, (function.e() == 0.0d && function.f() == 0.0d) ? new i() { // from class: O.u
            @Override // O.i
            public final double a(double d10) {
                double y10;
                y10 = w.y(x.this, d10);
                return y10;
            }
        } : new i() { // from class: O.v
            @Override // O.i
            public final double a(double d10) {
                double z10;
                z10 = w.z(x.this, d10);
                return z10;
            }
        }, 0.0f, 1.0f, function, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(String name, float[] primaries, y whitePoint, final double d10, float f10, float f11, int i10) {
        this(name, primaries, whitePoint, null, r17, r0, f10, f11, new x(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
        i iVar;
        i iVar2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        if (d10 == 1.0d) {
            iVar = f8218r;
        } else {
            iVar = new i() { // from class: O.q
                @Override // O.i
                public final double a(double d11) {
                    double u10;
                    u10 = w.u(d10, d11);
                    return u10;
                }
            };
        }
        i iVar3 = iVar;
        if (d10 == 1.0d) {
            iVar2 = f8218r;
        } else {
            iVar2 = new i() { // from class: O.r
                @Override // O.i
                public final double a(double d11) {
                    double v10;
                    v10 = w.v(d10, d11);
                    return v10;
                }
            };
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(w colorSpace, float[] transform, y whitePoint) {
        this(colorSpace.f(), colorSpace.primaries, whitePoint, transform, colorSpace.f8223i, colorSpace.f8226l, colorSpace.f8220f, colorSpace.f8221g, colorSpace.f8222h, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
