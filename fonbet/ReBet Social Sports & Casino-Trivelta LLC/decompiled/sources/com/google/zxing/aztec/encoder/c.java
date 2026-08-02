package com.google.zxing.aztec.encoder;

/* loaded from: classes3.dex */
public abstract class c {
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(Lb.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int g10 = aVar.g() / i10;
        for (int i12 = 0; i12 < g10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.f((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    public static void b(Lb.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.g(i14, i13);
                    bVar.g(i14, i15);
                    bVar.g(i13, i14);
                    bVar.g(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.g(i16, i16);
        int i17 = i16 + 1;
        bVar.g(i17, i16);
        bVar.g(i16, i17);
        int i18 = i10 + i11;
        bVar.g(i18, i16);
        bVar.g(i18, i17);
        bVar.g(i18, i18 - 1);
    }

    public static void c(Lb.b bVar, boolean z10, int i10, Lb.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.f(i12)) {
                    bVar.g(i13, i11 - 5);
                }
                if (aVar.f(i12 + 7)) {
                    bVar.g(i11 + 5, i13);
                }
                if (aVar.f(20 - i12)) {
                    bVar.g(i13, i11 + 5);
                }
                if (aVar.f(27 - i12)) {
                    bVar.g(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.f(i12)) {
                bVar.g(i14, i11 - 7);
            }
            if (aVar.f(i12 + 10)) {
                bVar.g(i11 + 7, i14);
            }
            if (aVar.f(29 - i12)) {
                bVar.g(i14, i11 + 7);
            }
            if (aVar.f(39 - i12)) {
                bVar.g(i11 - 7, i14);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i10, int i11) {
        Lb.a aVar;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        Lb.a a10 = new d(bArr).a();
        int g10 = ((a10.g() * i10) / 100) + 11;
        int g11 = a10.g() + g10;
        int i17 = 1;
        if (i11 == 0) {
            Lb.a aVar2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 <= 32) {
                boolean z11 = i18 <= 3 ? i17 : 0;
                int i20 = z11 != 0 ? i18 + 1 : i18;
                int i21 = i(i20, z11);
                if (g11 <= i21) {
                    if (aVar2 == null || i19 != WORD_SIZE[i20]) {
                        int i22 = WORD_SIZE[i20];
                        i19 = i22;
                        aVar2 = h(a10, i22);
                    }
                    int i23 = i21 - (i21 % i19);
                    if ((z11 == 0 || aVar2.g() <= (i19 << 6)) && aVar2.g() + g10 <= i23) {
                        aVar = aVar2;
                        i12 = i19;
                        z10 = z11;
                        i13 = i20;
                        i14 = i21;
                    }
                }
                i18++;
                i17 = i17;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (i13 > (z10 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i14 = i(i13, z10);
        i12 = WORD_SIZE[i13];
        int i24 = i14 - (i14 % i12);
        aVar = h(a10, i12);
        if (aVar.g() + g10 > i24) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && aVar.g() > (i12 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        Lb.a e10 = e(aVar, i14, i12);
        int g12 = aVar.g() / i12;
        Lb.a f10 = f(z10, i13, g12);
        int i25 = (z10 ? 11 : 14) + (i13 << 2);
        int[] iArr = new int[i25];
        int i26 = 2;
        if (z10) {
            for (int i27 = 0; i27 < i25; i27++) {
                iArr[i27] = i27;
            }
            i15 = i25;
        } else {
            int i28 = i25 / 2;
            i15 = i25 + 1 + (((i28 - 1) / 15) * 2);
            int i29 = i15 / 2;
            for (int i30 = 0; i30 < i28; i30++) {
                iArr[(i28 - i30) - i17] = (i29 - r14) - 1;
                iArr[i28 + i30] = (i30 / 15) + i30 + i29 + i17;
            }
        }
        Lb.b bVar = new Lb.b(i15);
        int i31 = 0;
        for (int i32 = 0; i32 < i13; i32++) {
            int i33 = ((i13 - i32) << i26) + (z10 ? 9 : 12);
            for (int i34 = 0; i34 < i33; i34++) {
                int i35 = i34 << 1;
                int i36 = 0;
                while (i36 < i26) {
                    int i37 = i17;
                    if (e10.f(i31 + i35 + i36)) {
                        int i38 = i32 << 1;
                        i16 = i26;
                        bVar.g(iArr[i38 + i36], iArr[i38 + i34]);
                    } else {
                        i16 = i26;
                    }
                    if (e10.f((i33 << 1) + i31 + i35 + i36)) {
                        int i39 = i32 << 1;
                        bVar.g(iArr[i39 + i34], iArr[((i25 - 1) - i39) - i36]);
                    }
                    if (e10.f((i33 << 2) + i31 + i35 + i36)) {
                        int i40 = (i25 - 1) - (i32 << 1);
                        bVar.g(iArr[i40 - i36], iArr[i40 - i34]);
                    }
                    if (e10.f((i33 * 6) + i31 + i35 + i36)) {
                        int i41 = i32 << 1;
                        bVar.g(iArr[((i25 - 1) - i41) - i34], iArr[i41 + i36]);
                    }
                    i36++;
                    i17 = i37;
                    i26 = i16;
                }
            }
            i31 += i33 << 3;
        }
        c(bVar, z10, i15, f10);
        if (z10) {
            b(bVar, i15 / 2, 5);
        } else {
            int i42 = i15 / 2;
            b(bVar, i42, 7);
            int i43 = 0;
            int i44 = 0;
            while (i44 < (i25 / 2) - 1) {
                for (int i45 = i42 & 1; i45 < i15; i45 += 2) {
                    int i46 = i42 - i43;
                    bVar.g(i46, i45);
                    int i47 = i42 + i43;
                    bVar.g(i47, i45);
                    bVar.g(i45, i46);
                    bVar.g(i45, i47);
                }
                i44 += 15;
                i43 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(g12);
        aVar3.e(bVar);
        return aVar3;
    }

    public static Lb.a e(Lb.a aVar, int i10, int i11) {
        int g10 = aVar.g() / i11;
        Mb.c cVar = new Mb.c(g(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        cVar.b(a10, i12 - g10);
        Lb.a aVar2 = new Lb.a();
        aVar2.c(0, i10 % i11);
        for (int i13 : a10) {
            aVar2.c(i13, i11);
        }
        return aVar2;
    }

    public static Lb.a f(boolean z10, int i10, int i11) {
        Lb.a aVar = new Lb.a();
        if (z10) {
            aVar.c(i10 - 1, 2);
            aVar.c(i11 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.c(i10 - 1, 5);
        aVar.c(i11 - 1, 11);
        return e(aVar, 40, 4);
    }

    public static Mb.a g(int i10) {
        if (i10 == 4) {
            return Mb.a.f7597i;
        }
        if (i10 == 6) {
            return Mb.a.f7596h;
        }
        if (i10 == 8) {
            return Mb.a.f7600l;
        }
        if (i10 == 10) {
            return Mb.a.f7595g;
        }
        if (i10 == 12) {
            return Mb.a.f7594f;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    public static Lb.a h(Lb.a aVar, int i10) {
        Lb.a aVar2 = new Lb.a();
        int g10 = aVar.g();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < g10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= g10 || aVar.f(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.c(i16, i10);
            } else if (i16 == 0) {
                aVar2.c(i13 | 1, i10);
            } else {
                aVar2.c(i13, i10);
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    public static int i(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
