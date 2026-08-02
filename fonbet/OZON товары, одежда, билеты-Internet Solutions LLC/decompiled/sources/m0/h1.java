package m0;

import J0.C3354v2;
import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h1<V extends AbstractC8015t> implements b1<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.B f73770a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.C f73771b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73772c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73773d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3354v2 f73774e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f73775f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f73776g;

    /* renamed from: h, reason: collision with root package name */
    private V f73777h;

    /* renamed from: i, reason: collision with root package name */
    private V f73778i;

    /* renamed from: j, reason: collision with root package name */
    private V f73779j;

    /* renamed from: k, reason: collision with root package name */
    private V f73780k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f73781l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f73782m;

    /* renamed from: n, reason: collision with root package name */
    private C8021w f73783n;

    public h1(androidx.collection.B b11, androidx.collection.C c11, int i11, int i12, C3354v2 c3354v2) {
        this.f73770a = b11;
        this.f73771b = c11;
        this.f73772c = i11;
        this.f73773d = i12;
        this.f73774e = c3354v2;
    }

    private final int h(int i11) {
        int i12;
        androidx.collection.B b11 = this.f73770a;
        int i13 = b11.f38715b;
        if (i13 < 0) {
            C7985d0.a("fromIndex(0) > toIndex(" + i13 + ')');
            throw null;
        }
        int i14 = i13 - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= i14) {
                i12 = (i15 + i14) >>> 1;
                int a11 = b11.a(i12);
                if (a11 >= i11) {
                    if (a11 <= i11) {
                        break;
                    }
                    i14 = i12 - 1;
                } else {
                    i15 = i12 + 1;
                }
            } else {
                i12 = -(i15 + 1);
                break;
            }
        }
        return i12 < -1 ? -(i12 + 2) : i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float i(int i11, int i12, boolean z11) {
        E e11;
        float f7;
        androidx.collection.B b11 = this.f73770a;
        if (i11 >= b11.f38715b - 1) {
            f7 = i12;
        } else {
            int a11 = b11.a(i11);
            int a12 = b11.a(i11 + 1);
            if (i12 == a11) {
                f7 = a11;
            } else {
                int i13 = a12 - a11;
                g1 g1Var = (g1) this.f73771b.c(a11);
                if (g1Var == null || (e11 = g1Var.b()) == null) {
                    e11 = this.f73774e;
                }
                float f11 = i13;
                float a13 = e11.a((i12 - a11) / f11);
                if (z11) {
                    return a13;
                }
                f7 = (f11 * a13) + a11;
            }
        }
        return f7 / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(V v11, V v12, V v13) {
        float[] fArr;
        float[] fArr2;
        boolean z11 = this.f73783n != null;
        V v14 = this.f73777h;
        androidx.collection.C c11 = this.f73771b;
        androidx.collection.B b11 = this.f73770a;
        if (v14 == null) {
            this.f73777h = (V) v11.c();
            this.f73778i = (V) v13.c();
            int i11 = b11.f38715b;
            float[] fArr3 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr3[i12] = b11.a(i12) / 1000;
            }
            this.f73776g = fArr3;
            int i13 = b11.f38715b;
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                g1 g1Var = (g1) c11.c(b11.a(i14));
                int a11 = g1Var != null ? g1Var.a() : 0;
                if (a11 != 0) {
                    z11 = true;
                }
                iArr[i14] = a11;
            }
            this.f73775f = iArr;
        }
        if (z11) {
            if (this.f73783n != null) {
                V v15 = this.f73779j;
                if (v15 == null) {
                    Intrinsics.n("lastInitialValue");
                    throw null;
                }
                if (v15.equals(v11)) {
                    V v16 = this.f73780k;
                    if (v16 == null) {
                        Intrinsics.n("lastTargetValue");
                        throw null;
                    }
                    if (v16.equals(v12)) {
                        return;
                    }
                }
            }
            this.f73779j = v11;
            this.f73780k = v12;
            int b12 = v11.b() + (v11.b() % 2);
            this.f73781l = new float[b12];
            this.f73782m = new float[b12];
            int i15 = b11.f38715b;
            float[][] fArr4 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int a12 = b11.a(i16);
                if (a12 != 0) {
                    if (a12 != this.f73772c) {
                        fArr = new float[b12];
                        V c12 = c11.c(a12);
                        Intrinsics.f(c12);
                        AbstractC8015t c13 = ((g1) c12).c();
                        for (int i17 = 0; i17 < b12; i17++) {
                            fArr[i17] = c13.a(i17);
                        }
                    } else if (c11.a(a12)) {
                        fArr = new float[b12];
                        V c14 = c11.c(a12);
                        Intrinsics.f(c14);
                        AbstractC8015t c15 = ((g1) c14).c();
                        for (int i18 = 0; i18 < b12; i18++) {
                            fArr[i18] = c15.a(i18);
                        }
                    } else {
                        fArr2 = new float[b12];
                        for (int i19 = 0; i19 < b12; i19++) {
                            fArr2[i19] = v12.a(i19);
                        }
                    }
                    fArr2 = fArr;
                } else if (c11.a(a12)) {
                    fArr = new float[b12];
                    V c16 = c11.c(a12);
                    Intrinsics.f(c16);
                    AbstractC8015t c17 = ((g1) c16).c();
                    for (int i21 = 0; i21 < b12; i21++) {
                        fArr[i21] = c17.a(i21);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b12];
                    for (int i22 = 0; i22 < b12; i22++) {
                        fArr2[i22] = v11.a(i22);
                    }
                }
                fArr4[i16] = fArr2;
            }
            int[] iArr2 = this.f73775f;
            if (iArr2 == null) {
                Intrinsics.n("modes");
                throw null;
            }
            float[] fArr5 = this.f73776g;
            if (fArr5 == null) {
                Intrinsics.n("times");
                throw null;
            }
            this.f73783n = new C8021w(iArr2, fArr5, fArr4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        int g10 = (int) kotlin.ranges.h.g((j11 / 1000000) - f(), 0L, g());
        androidx.collection.C c11 = this.f73771b;
        if (c11.a(g10)) {
            V c12 = c11.c(g10);
            Intrinsics.f(c12);
            return (V) ((g1) c12).c();
        }
        if (g10 >= this.f73772c) {
            return v12;
        }
        if (g10 <= 0) {
            return v11;
        }
        j(v11, v12, v13);
        int i11 = 0;
        if (this.f73783n != null) {
            float i12 = i(h(g10), g10, false);
            C8021w c8021w = this.f73783n;
            if (c8021w == null) {
                Intrinsics.n("arcSpline");
                throw null;
            }
            float[] fArr = this.f73781l;
            if (fArr == null) {
                Intrinsics.n("posArray");
                throw null;
            }
            c8021w.a(i12, fArr);
            float[] fArr2 = this.f73781l;
            if (fArr2 == null) {
                Intrinsics.n("posArray");
                throw null;
            }
            int length = fArr2.length;
            while (i11 < length) {
                V v14 = this.f73777h;
                if (v14 == null) {
                    Intrinsics.n("valueVector");
                    throw null;
                }
                float[] fArr3 = this.f73781l;
                if (fArr3 == null) {
                    Intrinsics.n("posArray");
                    throw null;
                }
                v14.e(fArr3[i11], i11);
                i11++;
            }
            V v15 = this.f73777h;
            if (v15 != null) {
                return v15;
            }
            Intrinsics.n("valueVector");
            throw null;
        }
        int h11 = h(g10);
        float i13 = i(h11, g10, true);
        androidx.collection.B b11 = this.f73770a;
        int a11 = b11.a(h11);
        if (c11.a(a11)) {
            V c13 = c11.c(a11);
            Intrinsics.f(c13);
            v11 = (V) ((g1) c13).c();
        }
        int a12 = b11.a(h11 + 1);
        if (c11.a(a12)) {
            V c14 = c11.c(a12);
            Intrinsics.f(c14);
            v12 = (V) ((g1) c14).c();
        }
        V v16 = this.f73777h;
        if (v16 == null) {
            Intrinsics.n("valueVector");
            throw null;
        }
        int b12 = v16.b();
        while (i11 < b12) {
            V v17 = this.f73777h;
            if (v17 == null) {
                Intrinsics.n("valueVector");
                throw null;
            }
            float a13 = v11.a(i11);
            float a14 = v12.a(i11);
            int i14 = W0.f73625j;
            v17.e((a14 * i13) + ((1 - i13) * a13), i11);
            i11++;
        }
        V v18 = this.f73777h;
        if (v18 != null) {
            return v18;
        }
        Intrinsics.n("valueVector");
        throw null;
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        long g10 = kotlin.ranges.h.g((j11 / 1000000) - f(), 0L, g());
        if (g10 < 0) {
            return v13;
        }
        j(v11, v12, v13);
        int i11 = 0;
        if (this.f73783n == null) {
            V c11 = c((g10 - 1) * 1000000, v11, v12, v13);
            V c12 = c(g10 * 1000000, v11, v12, v13);
            int b11 = c11.b();
            while (i11 < b11) {
                V v14 = this.f73778i;
                if (v14 == null) {
                    Intrinsics.n("velocityVector");
                    throw null;
                }
                v14.e((c11.a(i11) - c12.a(i11)) * 1000.0f, i11);
                i11++;
            }
            V v15 = this.f73778i;
            if (v15 != null) {
                return v15;
            }
            Intrinsics.n("velocityVector");
            throw null;
        }
        int i12 = (int) g10;
        float i13 = i(h(i12), i12, false);
        C8021w c8021w = this.f73783n;
        if (c8021w == null) {
            Intrinsics.n("arcSpline");
            throw null;
        }
        float[] fArr = this.f73782m;
        if (fArr == null) {
            Intrinsics.n("slopeArray");
            throw null;
        }
        c8021w.b(i13, fArr);
        float[] fArr2 = this.f73782m;
        if (fArr2 == null) {
            Intrinsics.n("slopeArray");
            throw null;
        }
        int length = fArr2.length;
        while (i11 < length) {
            V v16 = this.f73778i;
            if (v16 == null) {
                Intrinsics.n("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f73782m;
            if (fArr3 == null) {
                Intrinsics.n("slopeArray");
                throw null;
            }
            v16.e(fArr3[i11], i11);
            i11++;
        }
        V v17 = this.f73778i;
        if (v17 != null) {
            return v17;
        }
        Intrinsics.n("velocityVector");
        throw null;
    }

    @Override // m0.b1
    public final int f() {
        return this.f73773d;
    }

    @Override // m0.b1
    public final int g() {
        return this.f73772c;
    }
}
