package l9;

import T7.E;
import o9.C8659a;
import o9.C8660b;
import q9.C8999a;

/* renamed from: l9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7899c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f73118a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static void a(C8660b c8660b, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    c8660b.l(i15, i14);
                    c8660b.l(i15, i16);
                    c8660b.l(i14, i15);
                    c8660b.l(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        c8660b.l(i17, i17);
        int i18 = i17 + 1;
        c8660b.l(i18, i17);
        c8660b.l(i17, i18);
        int i19 = i11 + i12;
        c8660b.l(i19, i17);
        c8660b.l(i19, i18);
        c8660b.l(i19, i19 - 1);
    }

    public static C7897a b(int i11, int i12, byte[] bArr) {
        int i13;
        int i14;
        C8659a d11;
        C8659a c8659a;
        int i15;
        int i16;
        C8659a c11;
        int i17;
        C8659a a11 = new C7900d(bArr).a();
        int j11 = ((a11.j() * i11) / 100) + 11;
        int j12 = a11.j() + j11;
        int[] iArr = f73118a;
        int i18 = 1;
        if (i12 == 0) {
            C8659a c8659a2 = null;
            int i19 = 0;
            int i21 = 0;
            while (i19 <= r8) {
                int i22 = i19 <= 3 ? i18 : 0;
                int i23 = i22 != 0 ? i19 + 1 : i19;
                i13 = ((i22 != 0 ? 88 : 112) + (i23 << 4)) * i23;
                if (j12 <= i13) {
                    if (c8659a2 == null || i21 != iArr[i23]) {
                        i14 = iArr[i23];
                        d11 = d(i14, a11);
                    } else {
                        d11 = c8659a2;
                        i14 = i21;
                    }
                    int i24 = i13 - (i13 % i14);
                    if ((i22 == 0 || d11.j() <= (i14 << 6)) && d11.j() + j11 <= i24) {
                        c8659a = d11;
                        i15 = i22;
                        i16 = i23;
                    } else {
                        i21 = i14;
                        c8659a2 = d11;
                    }
                }
                i19++;
                i18 = i18;
                r8 = 32;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        i15 = i12 < 0 ? 1 : 0;
        i16 = Math.abs(i12);
        if (i16 > (i15 != 0 ? 4 : 32)) {
            throw new IllegalArgumentException(E.a(i12, "Illegal value ", " for layers"));
        }
        i13 = ((i15 != 0 ? 88 : 112) + (i16 << 4)) * i16;
        i14 = iArr[i16];
        int i25 = i13 - (i13 % i14);
        c8659a = d(i14, a11);
        if (c8659a.j() + j11 > i25) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (i15 != 0 && c8659a.j() > (i14 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        C8659a c12 = c(i13, i14, c8659a);
        int j13 = c8659a.j() / i14;
        C8659a c8659a3 = new C8659a();
        int i26 = 2;
        if (i15 != 0) {
            c8659a3.c(i16 - 1, 2);
            c8659a3.c(j13 - i18, 6);
            c11 = c(28, 4, c8659a3);
        } else {
            c8659a3.c(i16 - 1, 5);
            c8659a3.c(j13 - i18, 11);
            c11 = c(40, 4, c8659a3);
        }
        int i27 = (i15 == 0 ? 14 : 11) + (i16 << 2);
        int[] iArr2 = new int[i27];
        if (i15 != 0) {
            for (int i28 = 0; i28 < i27; i28++) {
                iArr2[i28] = i28;
            }
            i17 = i27;
        } else {
            int i29 = i27 / 2;
            i17 = (((i29 - 1) / 15) * 2) + i27 + 1;
            int i31 = i17 / 2;
            for (int i32 = 0; i32 < i29; i32++) {
                int i33 = (i32 / 15) + i32;
                iArr2[(i29 - i32) - i18] = (i31 - i33) - i18;
                iArr2[i29 + i32] = i33 + i31 + i18;
            }
        }
        C8660b c8660b = new C8660b(i17, i17);
        int i34 = 0;
        int i35 = 0;
        while (i34 < i16) {
            int i36 = ((i16 - i34) << i26) + (i15 != 0 ? 9 : 12);
            int i37 = 0;
            while (i37 < i36) {
                int i38 = i37 << 1;
                int i39 = i18;
                int i41 = 0;
                while (i41 < i26) {
                    int i42 = i26;
                    if (c12.f(i35 + i38 + i41)) {
                        int i43 = i34 << 1;
                        c8660b.l(iArr2[i43 + i41], iArr2[i43 + i37]);
                    }
                    if (c12.f((i36 << 1) + i35 + i38 + i41)) {
                        int i44 = i34 << 1;
                        c8660b.l(iArr2[i44 + i37], iArr2[((i27 - 1) - i44) - i41]);
                    }
                    if (c12.f((i36 << 2) + i35 + i38 + i41)) {
                        int i45 = (i27 - 1) - (i34 << 1);
                        c8660b.l(iArr2[i45 - i41], iArr2[i45 - i37]);
                    }
                    if (c12.f((i36 * 6) + i35 + i38 + i41)) {
                        int i46 = i34 << 1;
                        c8660b.l(iArr2[((i27 - 1) - i46) - i37], iArr2[i46 + i41]);
                    }
                    i41++;
                    i26 = i42;
                }
                i37++;
                i18 = i39;
            }
            i35 += i36 << 3;
            i34++;
            i26 = i26;
        }
        int i47 = i17 / 2;
        if (i15 != 0) {
            for (int i48 = 0; i48 < 7; i48++) {
                int i49 = (i47 - 3) + i48;
                if (c11.f(i48)) {
                    c8660b.l(i49, i47 - 5);
                }
                if (c11.f(i48 + 7)) {
                    c8660b.l(i47 + 5, i49);
                }
                if (c11.f(20 - i48)) {
                    c8660b.l(i49, i47 + 5);
                }
                if (c11.f(27 - i48)) {
                    c8660b.l(i47 - 5, i49);
                }
            }
        } else {
            for (int i51 = 0; i51 < 10; i51++) {
                int i52 = (i51 / 5) + (i47 - 5) + i51;
                if (c11.f(i51)) {
                    c8660b.l(i52, i47 - 7);
                }
                if (c11.f(i51 + 10)) {
                    c8660b.l(i47 + 7, i52);
                }
                if (c11.f(29 - i51)) {
                    c8660b.l(i52, i47 + 7);
                }
                if (c11.f(39 - i51)) {
                    c8660b.l(i47 - 7, i52);
                }
            }
        }
        if (i15 != 0) {
            a(c8660b, i47, 5);
        } else {
            a(c8660b, i47, 7);
            int i53 = 0;
            int i54 = 0;
            while (i53 < (i27 / 2) - 1) {
                for (int i55 = i47 & 1; i55 < i17; i55 += 2) {
                    int i56 = i47 - i54;
                    c8660b.l(i56, i55);
                    int i57 = i47 + i54;
                    c8660b.l(i57, i55);
                    c8660b.l(i55, i56);
                    c8660b.l(i55, i57);
                }
                i53 += 15;
                i54 += 16;
            }
        }
        C7897a c7897a = new C7897a();
        c7897a.b(c8660b);
        return c7897a;
    }

    private static C8659a c(int i11, int i12, C8659a c8659a) {
        C8999a c8999a;
        int j11 = c8659a.j() / i12;
        if (i12 == 4) {
            c8999a = C8999a.f81744k;
        } else if (i12 == 6) {
            c8999a = C8999a.f81743j;
        } else if (i12 == 8) {
            c8999a = C8999a.f81747n;
        } else if (i12 == 10) {
            c8999a = C8999a.f81742i;
        } else {
            if (i12 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i12)));
            }
            c8999a = C8999a.f81741h;
        }
        q9.d dVar = new q9.d(c8999a);
        int i13 = i11 / i12;
        int[] iArr = new int[i13];
        int j12 = c8659a.j() / i12;
        for (int i14 = 0; i14 < j12; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 |= c8659a.f((i14 * i12) + i16) ? 1 << ((i12 - i16) - 1) : 0;
            }
            iArr[i14] = i15;
        }
        dVar.a(iArr, i13 - j11);
        C8659a c8659a2 = new C8659a();
        c8659a2.c(0, i11 % i12);
        for (int i17 = 0; i17 < i13; i17++) {
            c8659a2.c(iArr[i17], i12);
        }
        return c8659a2;
    }

    static C8659a d(int i11, C8659a c8659a) {
        C8659a c8659a2 = new C8659a();
        int j11 = c8659a.j();
        int i12 = (1 << i11) - 2;
        int i13 = 0;
        while (i13 < j11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = i13 + i15;
                if (i16 >= j11 || c8659a.f(i16)) {
                    i14 |= 1 << ((i11 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                c8659a2.c(i17, i11);
            } else if (i17 == 0) {
                c8659a2.c(i14 | 1, i11);
            } else {
                c8659a2.c(i14, i11);
                i13 += i11;
            }
            i13--;
            i13 += i11;
        }
        return c8659a2;
    }
}
