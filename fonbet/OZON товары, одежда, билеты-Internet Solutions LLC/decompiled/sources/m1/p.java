package m1;

import cz.C5979a;
import ht.C6974a;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p extends AbstractC8032c {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final Pk0.a f73980r = new Pk0.a(5);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f73981d;

    /* renamed from: e, reason: collision with root package name */
    private final float f73982e;

    /* renamed from: f, reason: collision with root package name */
    private final float f73983f;

    /* renamed from: g, reason: collision with root package name */
    private final q f73984g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f73985h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final float[] f73986i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final float[] f73987j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC8038i f73988k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function1<Double, Double> f73989l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.google.gson.internal.d f73990m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC8038i f73991n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Function1<Double, Double> f73992o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final AY.a f73993p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f73994q;

    public static final class a {
        public static final void a(float f7, float f11, float[] fArr) {
            if (b(fArr) / b(C8034e.o()) > 0.9f) {
                C8034e.t();
                float f12 = fArr[0];
                float f13 = fArr[1];
                float f14 = fArr[2];
                float f15 = fArr[3];
                float f16 = fArr[4];
                float f17 = fArr[5];
            }
        }

        private static float b(float[] fArr) {
            float f7 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (((((f12 * f15) + ((f11 * f14) + (f7 * f13))) - (f13 * f14)) - (f11 * f12)) - (f7 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Double, Double> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d11) {
            double doubleValue = d11.doubleValue();
            return Double.valueOf(p.this.s().c(kotlin.ranges.h.c(doubleValue, r8.f73982e, r8.f73983f)));
        }
    }

    static final class c extends AbstractC7737t implements Function1<Double, Double> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d11) {
            return Double.valueOf(kotlin.ranges.h.c(p.this.w().c(d11.doubleValue()), r10.f73982e, r10.f73983f));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(@NotNull String str, @NotNull float[] fArr, @NotNull r rVar, float[] fArr2, @NotNull InterfaceC8038i interfaceC8038i, @NotNull InterfaceC8038i interfaceC8038i2, float f7, float f11, q qVar, int i11) {
        super(i11, r12, str);
        long j11;
        float f12;
        boolean z11 = false;
        j11 = C8031b.f73930a;
        this.f73981d = rVar;
        this.f73982e = f7;
        this.f73983f = f11;
        this.f73984g = qVar;
        this.f73988k = interfaceC8038i;
        this.f73989l = new c();
        this.f73990m = new com.google.gson.internal.d(this);
        this.f73991n = interfaceC8038i2;
        this.f73992o = new b();
        this.f73993p = new AY.a(this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f7 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f7 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] destination = new float[6];
        if (fArr.length == 9) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = f13 + f14 + fArr[2];
            destination[0] = f13 / f15;
            destination[1] = f14 / f15;
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = f16 + f17 + fArr[5];
            destination[2] = f16 / f18;
            destination[3] = f17 / f18;
            float f19 = fArr[6];
            float f21 = fArr[7];
            float f22 = f19 + f21 + fArr[8];
            destination[4] = f19 / f22;
            destination[5] = f21 / f22;
        } else {
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr, 0, destination, 0, 6);
        }
        this.f73985h = destination;
        if (fArr2 == null) {
            float f23 = destination[0];
            float f24 = destination[1];
            float f25 = destination[2];
            float f26 = destination[3];
            float f27 = destination[4];
            float f28 = destination[5];
            float a11 = rVar.a();
            float b11 = rVar.b();
            f12 = 1.0f;
            float f29 = 1;
            float f31 = (f29 - f23) / f24;
            float f32 = (f29 - f25) / f26;
            float f33 = (f29 - f27) / f28;
            float f34 = (f29 - a11) / b11;
            float f35 = f23 / f24;
            float f36 = (f25 / f26) - f35;
            float f37 = (a11 / b11) - f35;
            float f38 = f32 - f31;
            float f39 = (f27 / f28) - f35;
            float f41 = (((f34 - f31) * f36) - (f37 * f38)) / (((f33 - f31) * f36) - (f38 * f39));
            float f42 = (f37 - (f39 * f41)) / f36;
            float f43 = (1.0f - f42) - f41;
            float f44 = f43 / f24;
            float f45 = f42 / f26;
            float f46 = f41 / f28;
            this.f73986i = new float[]{f44 * f23, f43, ((1.0f - f23) - f24) * f44, f45 * f25, f42, ((1.0f - f25) - f26) * f45, f46 * f27, f41, ((1.0f - f27) - f28) * f46};
        } else {
            f12 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f73986i = fArr2;
        }
        this.f73987j = C8033d.f(this.f73986i);
        a.a(f7, f11, destination);
        if (i11 != 0) {
            float[] t2 = C8034e.t();
            if (destination != t2) {
                for (int i12 = 0; i12 < 6; i12++) {
                    if (Float.compare(destination[i12], t2[i12]) != 0 && Math.abs(destination[i12] - t2[i12]) > 0.001f) {
                        break;
                    }
                }
            }
            if (C8033d.c(rVar, j.e()) && f7 == 0.0f && f11 == f12) {
                p s11 = C8034e.s();
                for (double d11 = 0.0d; d11 <= 1.0d; d11 += 0.00392156862745098d) {
                    if (Math.abs(interfaceC8038i.c(d11) - s11.w().c(d11)) > 0.001d || Math.abs(interfaceC8038i2.c(d11) - s11.s().c(d11)) > 0.001d) {
                        break;
                    }
                }
            }
            this.f73994q = z11;
        }
        z11 = true;
        this.f73994q = z11;
    }

    public static double m(p pVar, double d11) {
        return pVar.f73991n.c(kotlin.ranges.h.c(d11, pVar.f73982e, pVar.f73983f));
    }

    public static double n(p pVar, double d11) {
        return kotlin.ranges.h.c(pVar.f73988k.c(d11), pVar.f73982e, pVar.f73983f);
    }

    @NotNull
    public final r A() {
        return this.f73981d;
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] a(@NotNull float[] fArr) {
        C8033d.h(this.f73987j, fArr);
        double d11 = fArr[0];
        com.google.gson.internal.d dVar = this.f73990m;
        fArr[0] = (float) n((p) dVar.f59957a, d11);
        fArr[1] = (float) n((p) dVar.f59957a, fArr[1]);
        fArr[2] = (float) n((p) dVar.f59957a, fArr[2]);
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float d(int i11) {
        return this.f73983f;
    }

    @Override // m1.AbstractC8032c
    public final float e(int i11) {
        return this.f73982e;
    }

    @Override // m1.AbstractC8032c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.compare(pVar.f73982e, this.f73982e) != 0 || Float.compare(pVar.f73983f, this.f73983f) != 0 || !Intrinsics.d(this.f73981d, pVar.f73981d) || !Arrays.equals(this.f73985h, pVar.f73985h)) {
            return false;
        }
        q qVar = pVar.f73984g;
        q qVar2 = this.f73984g;
        if (qVar2 != null) {
            return Intrinsics.d(qVar2, qVar);
        }
        if (qVar == null) {
            return true;
        }
        if (Intrinsics.d(this.f73988k, pVar.f73988k)) {
            return Intrinsics.d(this.f73991n, pVar.f73991n);
        }
        return false;
    }

    @Override // m1.AbstractC8032c
    public final boolean h() {
        return this.f73994q;
    }

    @Override // m1.AbstractC8032c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f73985h) + ((this.f73981d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f7 = this.f73982e;
        int floatToIntBits = (hashCode + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        float f11 = this.f73983f;
        int floatToIntBits2 = (floatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        q qVar = this.f73984g;
        int hashCode2 = floatToIntBits2 + (qVar != null ? qVar.hashCode() : 0);
        if (qVar == null) {
            return this.f73991n.hashCode() + ((this.f73988k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    @Override // m1.AbstractC8032c
    public final long i(float f7, float f11, float f12) {
        double d11 = f7;
        AY.a aVar = this.f73993p;
        float m11 = (float) m((p) aVar.f677a, d11);
        float m12 = (float) m((p) aVar.f677a, f11);
        float m13 = (float) m((p) aVar.f677a, f12);
        float[] fArr = this.f73986i;
        float f13 = (fArr[6] * m13) + (fArr[3] * m12) + (fArr[0] * m11);
        float f14 = (fArr[7] * m13) + (fArr[4] * m12) + (fArr[1] * m11);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] j(@NotNull float[] fArr) {
        double d11 = fArr[0];
        AY.a aVar = this.f73993p;
        fArr[0] = (float) m((p) aVar.f677a, d11);
        fArr[1] = (float) m((p) aVar.f677a, fArr[1]);
        fArr[2] = (float) m((p) aVar.f677a, fArr[2]);
        C8033d.h(this.f73986i, fArr);
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float k(float f7, float f11, float f12) {
        double d11 = f7;
        AY.a aVar = this.f73993p;
        float m11 = (float) m((p) aVar.f677a, d11);
        float m12 = (float) m((p) aVar.f677a, f11);
        float m13 = (float) m((p) aVar.f677a, f12);
        float[] fArr = this.f73986i;
        return (fArr[8] * m13) + (fArr[5] * m12) + (fArr[2] * m11);
    }

    @Override // m1.AbstractC8032c
    public final long l(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        float[] fArr = this.f73987j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f7);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f7);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f7);
        com.google.gson.internal.d dVar = this.f73990m;
        return C7811b0.a((float) n((p) dVar.f59957a, f14), (float) n((p) dVar.f59957a, f15), (float) n((p) dVar.f59957a, f16), f13, abstractC8032c);
    }

    @NotNull
    public final Function1<Double, Double> q() {
        return this.f73992o;
    }

    @NotNull
    public final AY.a r() {
        return this.f73993p;
    }

    @NotNull
    public final InterfaceC8038i s() {
        return this.f73991n;
    }

    @NotNull
    public final float[] t() {
        return this.f73987j;
    }

    @NotNull
    public final Function1<Double, Double> u() {
        return this.f73989l;
    }

    @NotNull
    public final com.google.gson.internal.d v() {
        return this.f73990m;
    }

    @NotNull
    public final InterfaceC8038i w() {
        return this.f73988k;
    }

    @NotNull
    public final float[] x() {
        return this.f73985h;
    }

    public final q y() {
        return this.f73984g;
    }

    @NotNull
    public final float[] z() {
        return this.f73986i;
    }

    public p(@NotNull String str, @NotNull float[] fArr, @NotNull r rVar, @NotNull q qVar, int i11) {
        this(str, fArr, rVar, null, (qVar.e() == 0.0d && qVar.f() == 0.0d) ? new Kl.b(qVar) : new C5979a(qVar), (qVar.e() == 0.0d && qVar.f() == 0.0d) ? new C6974a(qVar) : new o(qVar), 0.0f, 1.0f, qVar, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(@NotNull String str, @NotNull float[] fArr, @NotNull r rVar, final double d11, float f7, float f11, int i11) {
        this(str, fArr, rVar, null, d11 == 1.0d ? r3 : new InterfaceC8038i() { // from class: m1.m
            @Override // m1.InterfaceC8038i
            public final double c(double d12) {
                if (d12 < 0.0d) {
                    d12 = 0.0d;
                }
                return Math.pow(d12, 1.0d / d11);
            }
        }, d11 != 1.0d ? new InterfaceC8038i() { // from class: m1.n
            @Override // m1.InterfaceC8038i
            public final double c(double d12) {
                if (d12 < 0.0d) {
                    d12 = 0.0d;
                }
                return Math.pow(d12, d11);
            }
        } : r3, f7, f11, new q(d11, 1.0d, 0.0d, 0.0d, 0.0d), i11);
        InterfaceC8038i interfaceC8038i = f73980r;
    }

    public p(@NotNull p pVar, @NotNull float[] fArr, @NotNull r rVar) {
        this(pVar.g(), pVar.f73985h, rVar, fArr, pVar.f73988k, pVar.f73991n, pVar.f73982e, pVar.f73983f, pVar.f73984g, -1);
    }
}
