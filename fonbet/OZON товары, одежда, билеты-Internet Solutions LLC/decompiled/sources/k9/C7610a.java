package k9;

import Ql0.h;
import h9.m;
import h9.s;
import i9.C7022a;
import o9.C8660b;
import o9.C8664f;
import o9.C8667i;
import p9.C8873a;
import q9.C8999a;
import q9.c;
import q9.e;

/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7610a {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f71101g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f71102a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71103b;

    /* renamed from: c, reason: collision with root package name */
    private int f71104c;

    /* renamed from: d, reason: collision with root package name */
    private int f71105d;

    /* renamed from: e, reason: collision with root package name */
    private int f71106e;

    /* renamed from: f, reason: collision with root package name */
    private int f71107f;

    /* renamed from: k9.a$a, reason: collision with other inner class name */
    static final class C1160a {

        /* renamed from: a, reason: collision with root package name */
        private final int f71108a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71109b;

        C1160a(int i11, int i12) {
            this.f71108a = i11;
            this.f71109b = i12;
        }

        final int a() {
            return this.f71108a;
        }

        final int b() {
            return this.f71109b;
        }

        final s c() {
            return new s(this.f71108a, this.f71109b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(this.f71108a);
            sb2.append(' ');
            return Ek.a.d(sb2, this.f71109b, '>');
        }
    }

    public C7610a(C8660b c8660b) {
        this.f71102a = c8660b;
    }

    private static s[] b(s[] sVarArr, int i11, int i12) {
        float f7 = i12 / (i11 * 2.0f);
        float b11 = sVarArr[0].b() - sVarArr[2].b();
        float c11 = sVarArr[0].c() - sVarArr[2].c();
        float b12 = (sVarArr[2].b() + sVarArr[0].b()) / 2.0f;
        float c12 = (sVarArr[2].c() + sVarArr[0].c()) / 2.0f;
        float f11 = b11 * f7;
        float f12 = c11 * f7;
        s sVar = new s(b12 + f11, c12 + f12);
        s sVar2 = new s(b12 - f11, c12 - f12);
        float b13 = sVarArr[1].b() - sVarArr[3].b();
        float c13 = sVarArr[1].c() - sVarArr[3].c();
        float b14 = (sVarArr[3].b() + sVarArr[1].b()) / 2.0f;
        float c14 = (sVarArr[3].c() + sVarArr[1].c()) / 2.0f;
        float f13 = b13 * f7;
        float f14 = f7 * c13;
        return new s[]{sVar, new s(b14 + f13, c14 + f14), sVar2, new s(b14 - f13, c14 - f14)};
    }

    private int c(C1160a c1160a, C1160a c1160a2) {
        float c11 = h.c(c1160a.a(), c1160a.b(), c1160a2.a(), c1160a2.b());
        float a11 = (c1160a2.a() - c1160a.a()) / c11;
        float b11 = (c1160a2.b() - c1160a.b()) / c11;
        float a12 = c1160a.a();
        float b12 = c1160a.b();
        int a13 = c1160a.a();
        int b13 = c1160a.b();
        C8660b c8660b = this.f71102a;
        boolean d11 = c8660b.d(a13, b13);
        int ceil = (int) Math.ceil(c11);
        int i11 = 0;
        for (int i12 = 0; i12 < ceil; i12++) {
            a12 += a11;
            b12 += b11;
            if (c8660b.d(h.e(a12), h.e(b12)) != d11) {
                i11++;
            }
        }
        float f7 = i11 / c11;
        if (f7 <= 0.1f || f7 >= 0.9f) {
            return (f7 <= 0.1f) == d11 ? 1 : -1;
        }
        return 0;
    }

    private int d() {
        if (this.f71103b) {
            return (this.f71104c * 4) + 11;
        }
        int i11 = this.f71104c;
        if (i11 <= 4) {
            return (i11 * 4) + 15;
        }
        return ((((i11 - 4) / 8) + 1) * 2) + (i11 * 4) + 15;
    }

    private C1160a e(C1160a c1160a, boolean z11, int i11, int i12) {
        C8660b c8660b;
        int a11 = c1160a.a() + i11;
        int b11 = c1160a.b();
        while (true) {
            b11 += i12;
            boolean f7 = f(a11, b11);
            c8660b = this.f71102a;
            if (!f7 || c8660b.d(a11, b11) != z11) {
                break;
            }
            a11 += i11;
        }
        int i13 = a11 - i11;
        int i14 = b11 - i12;
        while (f(i13, i14) && c8660b.d(i13, i14) == z11) {
            i13 += i11;
        }
        int i15 = i13 - i11;
        while (f(i15, i14) && c8660b.d(i15, i14) == z11) {
            i14 += i12;
        }
        return new C1160a(i15, i14 - i12);
    }

    private boolean f(int i11, int i12) {
        if (i11 < 0) {
            return false;
        }
        C8660b c8660b = this.f71102a;
        return i11 < c8660b.j() && i12 > 0 && i12 < c8660b.g();
    }

    private boolean g(s sVar) {
        return f(h.e(sVar.b()), h.e(sVar.c()));
    }

    private int h(s sVar, s sVar2, int i11) {
        float b11 = h.b(sVar.b(), sVar.c(), sVar2.b(), sVar2.c());
        float f7 = b11 / i11;
        float b12 = sVar.b();
        float c11 = sVar.c();
        float b13 = ((sVar2.b() - sVar.b()) * f7) / b11;
        float c12 = ((sVar2.c() - sVar.c()) * f7) / b11;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f11 = i13;
            if (this.f71102a.d(h.e((f11 * b13) + b12), h.e((f11 * c12) + c11))) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7022a a(boolean z11) throws m {
        s c11;
        s sVar;
        s sVar2;
        s sVar3;
        s c12;
        s c13;
        s sVar4;
        s sVar5;
        int i11;
        char c14;
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        char c15;
        C8660b c8660b = this.f71102a;
        int i16 = -1;
        int i17 = 2;
        char c16 = 3;
        int i18 = 7;
        int i19 = 1;
        int i21 = 0;
        try {
            s[] b11 = new C8873a(c8660b).b();
            sVar2 = b11[0];
            sVar3 = b11[1];
            sVar = b11[2];
            c11 = b11[3];
        } catch (m unused) {
            int j12 = c8660b.j() / 2;
            int g10 = c8660b.g() / 2;
            int i22 = j12 + 7;
            int i23 = g10 - 7;
            s c17 = e(new C1160a(i22, i23), false, 1, -1).c();
            int i24 = g10 + 7;
            s c18 = e(new C1160a(i22, i24), false, 1, 1).c();
            int i25 = j12 - 7;
            s c19 = e(new C1160a(i25, i24), false, -1, 1).c();
            c11 = e(new C1160a(i25, i23), false, -1, -1).c();
            sVar = c19;
            sVar2 = c17;
            sVar3 = c18;
        }
        int e11 = h.e((sVar.b() + (sVar3.b() + (c11.b() + sVar2.b()))) / 4.0f);
        int e12 = h.e((sVar.c() + (sVar3.c() + (c11.c() + sVar2.c()))) / 4.0f);
        char c21 = 15;
        try {
            s[] b12 = new C8873a(c8660b, 15, e11, e12).b();
            sVar5 = b12[0];
            sVar4 = b12[1];
            c12 = b12[2];
            c13 = b12[3];
        } catch (m unused2) {
            int i26 = e11 + 7;
            int i27 = e12 - 7;
            s c22 = e(new C1160a(i26, i27), false, 1, -1).c();
            int i28 = e12 + 7;
            s c23 = e(new C1160a(i26, i28), false, 1, 1).c();
            int i29 = e11 - 7;
            c12 = e(new C1160a(i29, i28), false, -1, 1).c();
            c13 = e(new C1160a(i29, i27), false, -1, -1).c();
            sVar4 = c23;
            sVar5 = c22;
        }
        C1160a c1160a = new C1160a(h.e((c12.b() + (sVar4.b() + (c13.b() + sVar5.b()))) / 4.0f), h.e((c12.c() + (sVar4.c() + (c13.c() + sVar5.c()))) / 4.0f));
        this.f71106e = 1;
        boolean z12 = true;
        C1160a c1160a2 = c1160a;
        C1160a c1160a3 = c1160a2;
        C1160a c1160a4 = c1160a3;
        while (true) {
            if (this.f71106e >= 9) {
                i11 = i17;
                c14 = c16;
                i12 = i19;
                i13 = i21;
                break;
            }
            C1160a e13 = e(c1160a, z12, i19, i16);
            C1160a e14 = e(c1160a2, z12, i19, i19);
            C1160a e15 = e(c1160a3, z12, i16, i19);
            C1160a e16 = e(c1160a4, z12, i16, i16);
            if (this.f71106e > i17) {
                c14 = c16;
                i12 = i19;
                i13 = i21;
                c15 = c21;
                double c24 = (h.c(e16.a(), e16.b(), e13.a(), e13.b()) * this.f71106e) / (h.c(c1160a4.a(), c1160a4.b(), c1160a.a(), c1160a.b()) * (this.f71106e + i17));
                if (c24 < 0.75d || c24 > 1.25d) {
                    break;
                }
                C1160a c1160a5 = new C1160a(e13.a() - 3, e13.b() + 3);
                C1160a c1160a6 = new C1160a(e14.a() - 3, e14.b() - 3);
                C1160a c1160a7 = new C1160a(e15.a() + 3, e15.b() - 3);
                i11 = i17;
                C1160a c1160a8 = new C1160a(e16.a() + 3, e16.b() + 3);
                int c25 = c(c1160a8, c1160a5);
                if (c25 == 0 || c(c1160a5, c1160a6) != c25 || c(c1160a6, c1160a7) != c25 || c(c1160a7, c1160a8) != c25) {
                    break;
                }
            } else {
                i11 = i17;
                c14 = c16;
                i12 = i19;
                i13 = i21;
                c15 = c21;
            }
            z12 = !z12;
            this.f71106e++;
            c1160a = e13;
            c1160a2 = e14;
            c1160a3 = e15;
            c1160a4 = e16;
            c16 = c14;
            i19 = i12;
            i21 = i13;
            c21 = c15;
            i17 = i11;
            i16 = -1;
        }
        i11 = i17;
        int i31 = this.f71106e;
        if (i31 != 5 && i31 != 7) {
            throw m.a();
        }
        this.f71103b = i31 == 5 ? i12 : i13;
        s[] sVarArr = {new s(c1160a.a() + 0.5f, c1160a.b() - 0.5f), new s(c1160a2.a() + 0.5f, c1160a2.b() + 0.5f), new s(c1160a3.a() - 0.5f, c1160a3.b() + 0.5f), new s(c1160a4.a() - 0.5f, c1160a4.b() - 0.5f)};
        int i32 = this.f71106e * 2;
        s[] b13 = b(sVarArr, i32 - 3, i32);
        if (z11) {
            s sVar6 = b13[i13];
            b13[i13] = b13[i11];
            b13[i11] = sVar6;
        }
        if (!g(b13[i13]) || !g(b13[i12]) || !g(b13[i11]) || !g(b13[c14])) {
            throw m.a();
        }
        int i33 = this.f71106e * 2;
        int[] iArr = {h(b13[i13], b13[i12], i33), h(b13[i12], b13[i11], i33), h(b13[i11], b13[c14], i33), h(b13[c14], b13[i13], i33)};
        int i34 = i13;
        int i35 = i34;
        while (i34 < 4) {
            int i36 = iArr[i34];
            i35 = (i35 << 3) + ((i36 >> (i33 - 2)) << 1) + (i36 & 1);
            i34++;
        }
        int i37 = ((i35 & 1) << 11) + (i35 >> 1);
        for (int i38 = i13; i38 < 4; i38++) {
            int i39 = i11;
            if (Integer.bitCount(f71101g[i38] ^ i37) <= i39) {
                this.f71107f = i38;
                long j13 = 0;
                for (int i41 = i13; i41 < 4; i41++) {
                    int i42 = iArr[(this.f71107f + i41) % 4];
                    if (this.f71103b) {
                        j11 = j13 << 7;
                        i15 = (i42 >> 1) & 127;
                    } else {
                        j11 = j13 << 10;
                        i15 = ((i42 >> 2) & 992) + ((i42 >> 1) & 31);
                    }
                    j13 = j11 + i15;
                }
                if (this.f71103b) {
                    i14 = 2;
                } else {
                    i18 = 10;
                    i14 = 4;
                }
                int i43 = i18 - i14;
                int[] iArr2 = new int[i18];
                for (int i44 = i18 - 1; i44 >= 0; i44--) {
                    iArr2[i44] = ((int) j13) & 15;
                    j13 >>= 4;
                }
                try {
                    new c(C8999a.f81744k).a(iArr2, i43);
                    int i45 = i13;
                    for (int i46 = i45; i46 < i14; i46++) {
                        i45 = (i45 << 4) + iArr2[i46];
                    }
                    if (this.f71103b) {
                        this.f71104c = (i45 >> 6) + 1;
                        this.f71105d = (i45 & 63) + 1;
                    } else {
                        this.f71104c = (i45 >> 11) + 1;
                        this.f71105d = (i45 & 2047) + 1;
                    }
                    int i47 = this.f71107f;
                    s sVar7 = b13[i47 % 4];
                    s sVar8 = b13[(i47 + 1) % 4];
                    s sVar9 = b13[(i47 + 2) % 4];
                    s sVar10 = b13[(i47 + 3) % 4];
                    int d11 = d();
                    float f7 = d11 / 2.0f;
                    float f11 = this.f71106e;
                    float f12 = f7 - f11;
                    float f13 = f7 + f11;
                    return new C7022a(C8664f.a(c8660b, d11, d11, C8667i.a(f12, f12, f13, f12, f13, f13, f12, f13, sVar7.b(), sVar7.c(), sVar8.b(), sVar8.c(), sVar9.b(), sVar9.c(), sVar10.b(), sVar10.c())), b(b13, this.f71106e * 2, d()), this.f71103b, this.f71105d, this.f71104c);
                } catch (e unused3) {
                    throw m.a();
                }
            }
            i11 = i39;
        }
        throw m.a();
    }
}
