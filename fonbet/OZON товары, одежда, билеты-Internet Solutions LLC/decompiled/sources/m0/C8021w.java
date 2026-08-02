package m0;

import Hj.C3143a;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8021w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a[][] f73875a;

    /* renamed from: m0.w$a */
    public static final class a {

        /* renamed from: s, reason: collision with root package name */
        private static float[] f73876s;

        /* renamed from: a, reason: collision with root package name */
        private final float f73877a;

        /* renamed from: b, reason: collision with root package name */
        private final float f73878b;

        /* renamed from: c, reason: collision with root package name */
        private final float f73879c;

        /* renamed from: d, reason: collision with root package name */
        private final float f73880d;

        /* renamed from: e, reason: collision with root package name */
        private final float f73881e;

        /* renamed from: f, reason: collision with root package name */
        private final float f73882f;

        /* renamed from: g, reason: collision with root package name */
        private float f73883g;

        /* renamed from: h, reason: collision with root package name */
        private float f73884h;

        /* renamed from: i, reason: collision with root package name */
        private float f73885i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final float[] f73886j;

        /* renamed from: k, reason: collision with root package name */
        private final float f73887k;

        /* renamed from: l, reason: collision with root package name */
        private final float f73888l;

        /* renamed from: m, reason: collision with root package name */
        private final float f73889m;

        /* renamed from: n, reason: collision with root package name */
        private final float f73890n;

        /* renamed from: o, reason: collision with root package name */
        private final float f73891o;

        /* renamed from: p, reason: collision with root package name */
        private final float f73892p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f73893q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f73894r;

        /* renamed from: m0.w$a$a, reason: collision with other inner class name */
        public static final class C1251a {
            public static final float[] a() {
                if (a.f73876s != null) {
                    float[] fArr = a.f73876s;
                    Intrinsics.f(fArr);
                    return fArr;
                }
                a.f73876s = new float[91];
                float[] fArr2 = a.f73876s;
                Intrinsics.f(fArr2);
                return fArr2;
            }
        }

        public a(float f7, float f11, float f12, float f13, float f14, float f15, int i11) {
            boolean z11;
            boolean z12;
            float f16;
            float f17 = f12;
            this.f73877a = f7;
            this.f73878b = f11;
            this.f73879c = f17;
            this.f73880d = f13;
            this.f73881e = f14;
            this.f73882f = f15;
            float f18 = f14 - f17;
            float f19 = f15 - f13;
            int i12 = 1;
            float f21 = 0.0f;
            boolean z13 = i11 == 1 || (i11 == 4 ? f19 > 0.0f : !(i11 != 5 || f19 >= 0.0f));
            this.f73893q = z13;
            float f22 = f11 - f7;
            float f23 = 1 / f22;
            this.f73887k = f23;
            boolean z14 = 3 == i11;
            if (z14 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
                float hypot = (float) Math.hypot(f19, f18);
                this.f73883g = hypot;
                this.f73892p = hypot * f23;
                this.f73890n = f18 / f22;
                this.f73891o = f19 / f22;
                this.f73886j = new float[101];
                this.f73888l = Float.NaN;
                this.f73889m = Float.NaN;
                z11 = true;
            } else {
                this.f73886j = new float[101];
                this.f73888l = (z13 ? -1 : 1) * f18;
                this.f73889m = f19 * (z13 ? 1 : -1);
                this.f73890n = z13 ? f14 : f17;
                this.f73891o = z13 ? f13 : f15;
                float f24 = f13 - f15;
                int length = C1251a.a().length;
                float f25 = 0.0f;
                float f26 = 0.0f;
                float f27 = 0.0f;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i12;
                    float f28 = f21;
                    double radians = (float) Math.toRadians((i13 * 90.0d) / (C1251a.a().length - i14));
                    float sin = ((float) Math.sin(radians)) * f18;
                    float cos = ((float) Math.cos(radians)) * f24;
                    if (i13 > 0) {
                        z12 = z14;
                        f16 = sin;
                        f25 += (float) Math.hypot(sin - f26, cos - f27);
                        C1251a.a()[i13] = f25;
                    } else {
                        z12 = z14;
                        f16 = sin;
                    }
                    i13++;
                    z14 = z12;
                    f26 = f16;
                    f27 = cos;
                    i12 = i14;
                    f21 = f28;
                }
                boolean z15 = z14;
                int i15 = i12;
                float f29 = f21;
                this.f73883g = f25;
                int length2 = C1251a.a().length;
                for (int i16 = 0; i16 < length2; i16++) {
                    float[] a11 = C1251a.a();
                    a11[i16] = a11[i16] / f25;
                }
                float[] fArr = this.f73886j;
                int length3 = fArr.length;
                for (int i17 = 0; i17 < length3; i17++) {
                    float length4 = i17 / (fArr.length - i15);
                    float[] a12 = C1251a.a();
                    int length5 = a12.length;
                    Intrinsics.checkNotNullParameter(a12, "<this>");
                    int binarySearch = Arrays.binarySearch(a12, 0, length5, length4);
                    if (binarySearch >= 0) {
                        fArr[i17] = binarySearch / (C1251a.a().length - i15);
                    } else if (binarySearch == -1) {
                        fArr[i17] = f29;
                    } else {
                        int i18 = -binarySearch;
                        int i19 = i18 - 2;
                        fArr[i17] = (((length4 - C1251a.a()[i19]) / (C1251a.a()[i18 - i15] - C1251a.a()[i19])) + i19) / (C1251a.a().length - i15);
                    }
                }
                this.f73892p = this.f73883g * this.f73887k;
                z11 = z15;
            }
            this.f73894r = z11;
        }

        public final float c() {
            float f7 = this.f73888l * this.f73885i;
            float hypot = this.f73892p / ((float) Math.hypot(f7, (-this.f73889m) * this.f73884h));
            return this.f73893q ? (-f7) * hypot : f7 * hypot;
        }

        public final float d() {
            float f7 = this.f73888l * this.f73885i;
            float f11 = (-this.f73889m) * this.f73884h;
            float hypot = this.f73892p / ((float) Math.hypot(f7, f11));
            return this.f73893q ? (-f11) * hypot : f11 * hypot;
        }

        public final float e() {
            return (this.f73888l * this.f73884h) + this.f73890n;
        }

        public final float f() {
            return (this.f73889m * this.f73885i) + this.f73891o;
        }

        public final float g() {
            return this.f73890n;
        }

        public final float h() {
            return this.f73891o;
        }

        public final float i(float f7) {
            float f11 = (f7 - this.f73877a) * this.f73887k;
            float f12 = this.f73881e;
            float f13 = this.f73879c;
            return C3143a.d(f12, f13, f11, f13);
        }

        public final float j(float f7) {
            float f11 = (f7 - this.f73877a) * this.f73887k;
            float f12 = this.f73882f;
            float f13 = this.f73880d;
            return C3143a.d(f12, f13, f11, f13);
        }

        public final float k() {
            return this.f73877a;
        }

        public final float l() {
            return this.f73878b;
        }

        public final boolean m() {
            return this.f73894r;
        }

        public final void n(float f7) {
            float f11 = (this.f73893q ? this.f73878b - f7 : f7 - this.f73877a) * this.f73887k;
            float f12 = 0.0f;
            if (f11 > 0.0f) {
                f12 = 1.0f;
                if (f11 < 1.0f) {
                    float[] fArr = this.f73886j;
                    float length = f11 * (fArr.length - 1);
                    int i11 = (int) length;
                    float f13 = fArr[i11];
                    f12 = C3143a.d(fArr[i11 + 1], f13, length - i11, f13);
                }
            }
            double d11 = f12 * 1.5707964f;
            this.f73884h = (float) Math.sin(d11);
            this.f73885i = (float) Math.cos(d11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[LOOP:1: B:14:0x003c->B:15:0x003e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8021w(@NotNull int[] iArr, @NotNull float[] fArr, @NotNull float[][] fArr2) {
        int i11;
        int length;
        int i12;
        int length2 = fArr.length - 1;
        a[][] aVarArr = new a[length2][];
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (i15 < length2) {
            int i16 = iArr[i15];
            int i17 = 3;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            i17 = 4;
                            if (i16 != 4) {
                                i17 = 5;
                                if (i16 != 5) {
                                    i11 = i14;
                                    float[] fArr3 = fArr2[i15];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    a[] aVarArr2 = new a[length];
                                    for (i12 = 0; i12 < length; i12++) {
                                        int i18 = i12 * 2;
                                        float f7 = fArr[i15];
                                        int i19 = i15 + 1;
                                        float f11 = fArr[i19];
                                        float[] fArr4 = fArr2[i15];
                                        float f12 = fArr4[i18];
                                        int i21 = i18 + 1;
                                        float f13 = fArr4[i21];
                                        float[] fArr5 = fArr2[i19];
                                        aVarArr2[i12] = new a(f7, f11, f12, f13, fArr5[i18], fArr5[i21], i11);
                                    }
                                    aVarArr[i15] = aVarArr2;
                                    i15++;
                                    i14 = i11;
                                }
                            }
                        }
                    }
                    i13 = 2;
                    i11 = i13;
                    float[] fArr32 = fArr2[i15];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    a[] aVarArr22 = new a[length];
                    while (i12 < length) {
                    }
                    aVarArr[i15] = aVarArr22;
                    i15++;
                    i14 = i11;
                }
                i13 = 1;
                i11 = i13;
                float[] fArr322 = fArr2[i15];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                a[] aVarArr222 = new a[length];
                while (i12 < length) {
                }
                aVarArr[i15] = aVarArr222;
                i15++;
                i14 = i11;
            }
            i11 = i17;
            float[] fArr3222 = fArr2[i15];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            a[] aVarArr2222 = new a[length];
            while (i12 < length) {
            }
            aVarArr[i15] = aVarArr2222;
            i15++;
            i14 = i11;
        }
        this.f73875a = aVarArr;
    }

    public final void a(float f7, @NotNull float[] fArr) {
        float k11;
        int i11;
        a[][] aVarArr = this.f73875a;
        int i12 = 0;
        if (f7 < aVarArr[0][0].k() || f7 > aVarArr[aVarArr.length - 1][0].l()) {
            if (f7 > aVarArr[aVarArr.length - 1][0].l()) {
                i11 = aVarArr.length - 1;
                k11 = aVarArr[aVarArr.length - 1][0].l();
            } else {
                k11 = aVarArr[0][0].k();
                i11 = 0;
            }
            float f11 = f7 - k11;
            int i13 = 0;
            while (i12 < fArr.length) {
                if (aVarArr[i11][i13].m()) {
                    fArr[i12] = (aVarArr[i11][i13].g() * f11) + aVarArr[i11][i13].i(k11);
                    fArr[i12 + 1] = (aVarArr[i11][i13].h() * f11) + aVarArr[i11][i13].j(k11);
                } else {
                    aVarArr[i11][i13].n(k11);
                    fArr[i12] = (aVarArr[i11][i13].c() * f11) + aVarArr[i11][i13].e();
                    fArr[i12 + 1] = (aVarArr[i11][i13].d() * f11) + aVarArr[i11][i13].f();
                }
                i12 += 2;
                i13++;
            }
            return;
        }
        int length = aVarArr.length;
        boolean z11 = false;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < fArr.length) {
                if (f7 <= aVarArr[i14][i16].l()) {
                    if (aVarArr[i14][i16].m()) {
                        fArr[i15] = aVarArr[i14][i16].i(f7);
                        fArr[i15 + 1] = aVarArr[i14][i16].j(f7);
                    } else {
                        aVarArr[i14][i16].n(f7);
                        fArr[i15] = aVarArr[i14][i16].e();
                        fArr[i15 + 1] = aVarArr[i14][i16].f();
                    }
                    z11 = true;
                }
                i15 += 2;
                i16++;
            }
            if (z11) {
                return;
            }
        }
    }

    public final void b(float f7, @NotNull float[] fArr) {
        a[][] aVarArr = this.f73875a;
        if (f7 < aVarArr[0][0].k()) {
            f7 = aVarArr[0][0].k();
        } else if (f7 > aVarArr[aVarArr.length - 1][0].l()) {
            f7 = aVarArr[aVarArr.length - 1][0].l();
        }
        int length = aVarArr.length;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < fArr.length) {
                if (f7 <= aVarArr[i11][i13].l()) {
                    if (aVarArr[i11][i13].m()) {
                        fArr[i12] = aVarArr[i11][i13].g();
                        fArr[i12 + 1] = aVarArr[i11][i13].h();
                    } else {
                        aVarArr[i11][i13].n(f7);
                        fArr[i12] = aVarArr[i11][i13].c();
                        fArr[i12 + 1] = aVarArr[i11][i13].d();
                    }
                    z11 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z11) {
                return;
            }
        }
    }
}
