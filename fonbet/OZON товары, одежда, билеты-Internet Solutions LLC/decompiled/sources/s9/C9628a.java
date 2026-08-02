package s9;

import h9.h;
import o9.C8660b;

/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9628a {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f98361a;

    /* renamed from: b, reason: collision with root package name */
    private final C8660b f98362b;

    /* renamed from: c, reason: collision with root package name */
    private final e f98363c;

    C9628a(C8660b c8660b) throws h {
        int g10 = c8660b.g();
        if (g10 < 8 || g10 > 144 || (g10 & 1) != 0) {
            throw h.a();
        }
        e g11 = e.g(c8660b.g(), c8660b.j());
        this.f98363c = g11;
        int e11 = g11.e();
        int d11 = g11.d();
        if (c8660b.g() != e11) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int b11 = g11.b();
        int a11 = g11.a();
        int i11 = e11 / b11;
        int i12 = d11 / a11;
        C8660b c8660b2 = new C8660b(i12 * a11, i11 * b11);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 * b11;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = i15 * a11;
                for (int i17 = 0; i17 < b11; i17++) {
                    int i18 = ((b11 + 2) * i13) + 1 + i17;
                    int i19 = i14 + i17;
                    for (int i21 = 0; i21 < a11; i21++) {
                        if (c8660b.d(((a11 + 2) * i15) + 1 + i21, i18)) {
                            c8660b2.l(i16 + i21, i19);
                        }
                    }
                }
            }
        }
        this.f98361a = c8660b2;
        this.f98362b = new C8660b(c8660b2.j(), c8660b2.g());
    }

    private boolean c(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            i11 += i13;
            i12 += 4 - ((i13 + 4) & 7);
        }
        if (i12 < 0) {
            i12 += i14;
            i11 += 4 - ((i14 + 4) & 7);
        }
        this.f98362b.l(i12, i11);
        return this.f98361a.d(i12, i11);
    }

    private int d(int i11, int i12, int i13, int i14) {
        int i15 = i11 - 2;
        int i16 = i12 - 2;
        int i17 = (c(i15, i16, i13, i14) ? 1 : 0) << 1;
        int i18 = i12 - 1;
        if (c(i15, i18, i13, i14)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        int i21 = i11 - 1;
        if (c(i21, i16, i13, i14)) {
            i19 |= 1;
        }
        int i22 = i19 << 1;
        if (c(i21, i18, i13, i14)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (c(i21, i12, i13, i14)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        if (c(i11, i16, i13, i14)) {
            i24 |= 1;
        }
        int i25 = i24 << 1;
        if (c(i11, i18, i13, i14)) {
            i25 |= 1;
        }
        int i26 = i25 << 1;
        return c(i11, i12, i13, i14) ? i26 | 1 : i26;
    }

    final e a() {
        return this.f98363c;
    }

    final byte[] b() throws h {
        e eVar;
        int i11;
        C8660b c8660b;
        boolean z11;
        boolean z12;
        e eVar2 = this.f98363c;
        byte[] bArr = new byte[eVar2.f()];
        C8660b c8660b2 = this.f98361a;
        int g10 = c8660b2.g();
        int j11 = c8660b2.j();
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i15 = 4;
        while (true) {
            if (i15 == g10 && i13 == 0 && !z13) {
                int i16 = i14 + 1;
                int i17 = g10 - 1;
                int i18 = (c(i17, i12, g10, j11) ? 1 : 0) << 1;
                if (c(i17, 1, g10, j11)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                if (c(i17, 2, g10, j11)) {
                    i19 |= 1;
                }
                int i21 = i19 << 1;
                if (c(i12, j11 - 2, g10, j11)) {
                    i21 |= 1;
                }
                int i22 = i21 << 1;
                int i23 = j11 - 1;
                if (c(i12, i23, g10, j11)) {
                    i22 |= 1;
                }
                int i24 = i22 << 1;
                if (c(1, i23, g10, j11)) {
                    i24 |= 1;
                }
                int i25 = i24 << 1;
                if (c(2, i23, g10, j11)) {
                    i25 |= 1;
                }
                int i26 = i25 << 1;
                if (c(3, i23, g10, j11)) {
                    i26 |= 1;
                }
                bArr[i14] = (byte) i26;
                i15 -= 2;
                i13 += 2;
                eVar = eVar2;
                i11 = i12;
                i14 = i16;
                z12 = true;
                z11 = z16;
            } else {
                int i27 = g10 - 2;
                if (i15 == i27 && i13 == 0 && (j11 & 3) != 0 && !z14) {
                    int i28 = i14 + 1;
                    int i29 = (c(g10 + (-3), i12, g10, j11) ? 1 : 0) << 1;
                    if (c(i27, i12, g10, j11)) {
                        i29 |= 1;
                    }
                    int i31 = i29 << 1;
                    if (c(g10 - 1, i12, g10, j11)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    if (c(i12, j11 - 4, g10, j11)) {
                        i32 |= 1;
                    }
                    int i33 = i32 << 1;
                    if (c(i12, j11 - 3, g10, j11)) {
                        i33 |= 1;
                    }
                    int i34 = i33 << 1;
                    if (c(i12, j11 - 2, g10, j11)) {
                        i34 |= 1;
                    }
                    int i35 = i34 << 1;
                    int i36 = j11 - 1;
                    if (c(i12, i36, g10, j11)) {
                        i35 |= 1;
                    }
                    int i37 = i35 << 1;
                    if (c(1, i36, g10, j11)) {
                        i37 |= 1;
                    }
                    bArr[i14] = (byte) i37;
                    i15 -= 2;
                    i13 += 2;
                    eVar = eVar2;
                    i11 = i12;
                    i14 = i28;
                    z14 = true;
                    z12 = z13;
                    z11 = z16;
                } else if (i15 == g10 + 4 && i13 == 2 && (j11 & 7) == 0 && !z15) {
                    int i38 = i14 + 1;
                    int i39 = g10 - 1;
                    int i41 = (c(i39, i12, g10, j11) ? 1 : 0) << 1;
                    int i42 = j11 - 1;
                    if (c(i39, i42, g10, j11)) {
                        i41 |= 1;
                    }
                    int i43 = i41 << 1;
                    int i44 = j11 - 3;
                    if (c(i12, i44, g10, j11)) {
                        i43 |= 1;
                    }
                    int i45 = i43 << 1;
                    eVar = eVar2;
                    int i46 = j11 - 2;
                    if (c(i12, i46, g10, j11)) {
                        i45 |= 1;
                    }
                    int i47 = i45 << 1;
                    if (c(i12, i42, g10, j11)) {
                        i47 |= 1;
                    }
                    int i48 = i47 << 1;
                    if (c(1, i44, g10, j11)) {
                        i48 |= 1;
                    }
                    int i49 = i48 << 1;
                    if (c(1, i46, g10, j11)) {
                        i49 |= 1;
                    }
                    int i51 = i49 << 1;
                    if (c(1, i42, g10, j11)) {
                        i51 |= 1;
                    }
                    bArr[i14] = (byte) i51;
                    i15 -= 2;
                    i13 += 2;
                    i14 = i38;
                    z15 = true;
                    i11 = 0;
                    z12 = z13;
                    z11 = z16;
                } else {
                    eVar = eVar2;
                    if (i15 == i27 && i13 == 0 && (j11 & 7) == 4 && !z16) {
                        int i52 = i14 + 1;
                        i11 = 0;
                        int i53 = (c(g10 + (-3), 0, g10, j11) ? 1 : 0) << 1;
                        if (c(i27, 0, g10, j11)) {
                            i53 |= 1;
                        }
                        int i54 = i53 << 1;
                        if (c(g10 - 1, 0, g10, j11)) {
                            i54 |= 1;
                        }
                        int i55 = i54 << 1;
                        if (c(0, j11 - 2, g10, j11)) {
                            i55 |= 1;
                        }
                        int i56 = i55 << 1;
                        int i57 = j11 - 1;
                        if (c(0, i57, g10, j11)) {
                            i56 |= 1;
                        }
                        int i58 = i56 << 1;
                        if (c(1, i57, g10, j11)) {
                            i58 |= 1;
                        }
                        int i59 = i58 << 1;
                        if (c(2, i57, g10, j11)) {
                            i59 |= 1;
                        }
                        int i61 = i59 << 1;
                        if (c(3, i57, g10, j11)) {
                            i61 |= 1;
                        }
                        bArr[i14] = (byte) i61;
                        i15 -= 2;
                        i13 += 2;
                        i14 = i52;
                        z11 = true;
                        z12 = z13;
                    } else {
                        i11 = 0;
                        while (true) {
                            c8660b = this.f98362b;
                            if (i15 < g10 && i13 >= 0 && !c8660b.d(i13, i15)) {
                                bArr[i14] = (byte) d(i15, i13, g10, j11);
                                i14++;
                            }
                            int i62 = i15 - 2;
                            int i63 = i13 + 2;
                            if (i62 < 0 || i63 >= j11) {
                                break;
                            }
                            i15 = i62;
                            i13 = i63;
                        }
                        int i64 = i15 - 1;
                        int i65 = i13 + 5;
                        while (true) {
                            if (i64 >= 0 && i65 < j11 && !c8660b.d(i65, i64)) {
                                bArr[i14] = (byte) d(i64, i65, g10, j11);
                                i14++;
                            }
                            int i66 = i64 + 2;
                            int i67 = i65 - 2;
                            if (i66 >= g10 || i67 < 0) {
                                break;
                            }
                            i64 = i66;
                            i65 = i67;
                        }
                        i15 = i64 + 5;
                        i13 = i65 - 1;
                        z12 = z13;
                        z11 = z16;
                    }
                }
            }
            if (i15 >= g10 && i13 >= j11) {
                break;
            }
            i12 = i11;
            eVar2 = eVar;
            z13 = z12;
            z16 = z11;
        }
        if (i14 == eVar.f()) {
            return bArr;
        }
        throw h.a();
    }
}
