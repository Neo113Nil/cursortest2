package uf;

import uf.f;

/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f100699a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f100700b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f100701c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f100702d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(k kVar, int i11) {
        C10054a c10054a = kVar.f100746c;
        int i12 = i11 * 2;
        C10054a.d(c10054a);
        int i13 = i11 * 1080;
        int f7 = f(kVar.f100748e, i13, c10054a);
        C10054a.d(c10054a);
        int f11 = f(kVar.f100749f, i13, c10054a);
        kVar.f100757n[i11] = j.f100711a[f11] + C10054a.g(c10054a, j.f100712b[f11]);
        int[] iArr = kVar.f100759p;
        int i14 = f7 == 1 ? iArr[i12 + 1] + 1 : f7 == 0 ? iArr[i12] : f7 - 2;
        int i15 = kVar.f100758o[i11];
        if (i14 >= i15) {
            i14 -= i15;
        }
        int i16 = i12 + 1;
        iArr[i12] = iArr[i16];
        iArr[i16] = i14;
    }

    private static int b(int i11, byte[] bArr, C10054a c10054a) {
        int i12;
        C10054a.h(c10054a);
        if (C10054a.g(c10054a, 1) != 0) {
            int g10 = C10054a.g(c10054a, 3);
            i12 = g10 == 0 ? 1 : C10054a.g(c10054a, g10) + (1 << g10);
        } else {
            i12 = 0;
        }
        int i13 = i12 + 1;
        if (i13 == 1) {
            m.b(i11, bArr);
            return i13;
        }
        int g11 = C10054a.g(c10054a, 1) == 1 ? C10054a.g(c10054a, 4) + 1 : 0;
        int[] iArr = new int[1080];
        e(i13 + g11, iArr, 0, c10054a);
        int i14 = 0;
        while (i14 < i11) {
            C10054a.h(c10054a);
            C10054a.d(c10054a);
            int f7 = f(iArr, 0, c10054a);
            if (f7 == 0) {
                bArr[i14] = 0;
            } else if (f7 <= g11) {
                for (int g12 = (1 << f7) + C10054a.g(c10054a, f7); g12 != 0; g12--) {
                    if (i14 >= i11) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i14] = 0;
                    i14++;
                }
            } else {
                bArr[i14] = (byte) (f7 - g11);
            }
            i14++;
        }
        if (C10054a.g(c10054a, 1) == 1) {
            int[] iArr2 = new int[256];
            for (int i15 = 0; i15 < 256; i15++) {
                iArr2[i15] = i15;
            }
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = bArr[i16] & 255;
                int i18 = iArr2[i17];
                bArr[i16] = (byte) i18;
                if (i17 != 0) {
                    while (i17 > 0) {
                        iArr2[i17] = iArr2[i17 - 1];
                        i17--;
                    }
                    iArr2[0] = i18;
                }
            }
        }
        return i13;
    }

    private static void c(k kVar) {
        a(kVar, 0);
        int i11 = kVar.f100759p[1];
        int i12 = i11 << 6;
        kVar.f100719A = i12;
        kVar.f100765v = kVar.f100754k.f100708c[kVar.f100769z[i12] & 255];
        byte b11 = kVar.f100768y[i11];
        int[] iArr = d.f100698b;
        kVar.f100721C = iArr[b11];
        kVar.f100722D = iArr[b11 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        throw new uf.c("Invalid backward reference");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ca A[LOOP:1: B:38:0x02ca->B:45:0x0311, LOOP_START, PHI: r12
      0x02ca: PHI (r12v36 char) = (r12v29 char), (r12v38 char) binds: [B:37:0x02c8, B:45:0x0311] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(k kVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        char c11;
        int i22;
        int i23;
        char c12;
        int i24;
        int i25;
        int i26 = kVar.f100744a;
        if (i26 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i26 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        int i27 = 1;
        int i28 = kVar.f100734P - 1;
        byte[] bArr = kVar.f100747d;
        while (true) {
            int i29 = kVar.f100744a;
            C10054a c10054a = kVar.f100746c;
            if (i29 == 10) {
                if (i29 == 10) {
                    if (kVar.f100750g < 0) {
                        throw new c("Invalid metablock length");
                    }
                    int i31 = (64 - c10054a.f100690g) & 7;
                    if (i31 != 0 && C10054a.g(c10054a, i31) != 0) {
                        throw new c("Corrupted padding bits");
                    }
                    C10054a.a(c10054a, true);
                    return;
                }
                return;
            }
            int i32 = 0;
            if (i29 != 12) {
                int i33 = 4;
                int[] iArr = kVar.f100759p;
                h hVar = kVar.f100756m;
                int i34 = i27;
                h hVar2 = kVar.f100755l;
                h hVar3 = kVar.f100754k;
                int[] iArr2 = kVar.f100757n;
                switch (i29) {
                    case 1:
                        if (kVar.f100750g < 0) {
                            throw new c("Invalid metablock length");
                        }
                        if (kVar.f100751h) {
                            kVar.f100745b = 10;
                            kVar.f100742X = kVar.f100761r;
                            kVar.f100741W = 0;
                            kVar.f100744a = 12;
                        } else {
                            hVar3.f100707b = null;
                            hVar3.f100708c = null;
                            hVar2.f100707b = null;
                            hVar2.f100708c = null;
                            hVar.f100707b = null;
                            hVar.f100708c = null;
                            C10054a.h(c10054a);
                            boolean z11 = C10054a.g(c10054a, 1) == 1;
                            kVar.f100751h = z11;
                            kVar.f100750g = 0;
                            kVar.f100752i = false;
                            kVar.f100753j = false;
                            if (!z11 || C10054a.g(c10054a, 1) == 0) {
                                int g10 = C10054a.g(c10054a, 2) + 4;
                                if (g10 == 7) {
                                    kVar.f100753j = true;
                                    if (C10054a.g(c10054a, 1) != 0) {
                                        throw new c("Corrupted reserved bit");
                                    }
                                    int g11 = C10054a.g(c10054a, 2);
                                    if (g11 != 0) {
                                        for (int i35 = 0; i35 < g11; i35++) {
                                            int g12 = C10054a.g(c10054a, 8);
                                            if (g12 == 0 && i35 + 1 == g11 && g11 > 1) {
                                                throw new c("Exuberant nibble");
                                            }
                                            kVar.f100750g = (g12 << (i35 * 8)) | kVar.f100750g;
                                        }
                                    }
                                } else {
                                    for (int i36 = 0; i36 < g10; i36++) {
                                        int g13 = C10054a.g(c10054a, 4);
                                        if (g13 == 0 && i36 + 1 == g10 && g10 > 4) {
                                            throw new c("Exuberant nibble");
                                        }
                                        kVar.f100750g = (g13 << (i36 * 4)) | kVar.f100750g;
                                    }
                                }
                                i11 = 4;
                                kVar.f100750g++;
                                if (!kVar.f100751h) {
                                    kVar.f100752i = C10054a.g(c10054a, 1) == 1;
                                }
                                if (kVar.f100750g == 0 || kVar.f100753j) {
                                    if (!kVar.f100752i || kVar.f100753j) {
                                        i12 = (64 - c10054a.f100690g) & 7;
                                        if (i12 == 0 && C10054a.g(c10054a, i12) != 0) {
                                            throw new c("Corrupted padding bits");
                                        }
                                        kVar.f100744a = !kVar.f100753j ? i11 : 5;
                                    } else {
                                        kVar.f100744a = 2;
                                    }
                                    if (!kVar.f100753j) {
                                        long j11 = kVar.f100735Q + kVar.f100750g;
                                        kVar.f100735Q = j11;
                                        int i37 = kVar.f100734P;
                                        int i38 = kVar.f100733O;
                                        if (i37 < i38) {
                                            if (i38 > j11) {
                                                while (true) {
                                                    int i39 = i38 >> 1;
                                                    if (i39 > ((int) j11) + kVar.f100736R.length) {
                                                        i38 = i39;
                                                    } else if (!kVar.f100751h && i38 < 16384 && kVar.f100733O >= 16384) {
                                                        i38 = 16384;
                                                    }
                                                }
                                            }
                                            int i41 = kVar.f100734P;
                                            if (i38 > i41) {
                                                byte[] bArr2 = new byte[i38 + 37];
                                                byte[] bArr3 = kVar.f100747d;
                                                if (bArr3 != null) {
                                                    System.arraycopy(bArr3, 0, bArr2, 0, i41);
                                                } else {
                                                    byte[] bArr4 = kVar.f100736R;
                                                    if (bArr4.length != 0) {
                                                        int length = bArr4.length;
                                                        int i42 = kVar.f100732N;
                                                        if (length > i42) {
                                                            int i43 = length - i42;
                                                            length = i42;
                                                            i13 = i43;
                                                        } else {
                                                            i13 = 0;
                                                        }
                                                        System.arraycopy(bArr4, i13, bArr2, 0, length);
                                                        kVar.f100761r = length;
                                                        kVar.f100737S = length;
                                                    }
                                                }
                                                kVar.f100747d = bArr2;
                                                kVar.f100734P = i38;
                                            }
                                        }
                                    }
                                }
                            }
                            i11 = 4;
                            if (kVar.f100750g == 0) {
                            }
                            if (kVar.f100752i) {
                            }
                            i12 = (64 - c10054a.f100690g) & 7;
                            if (i12 == 0) {
                            }
                            kVar.f100744a = !kVar.f100753j ? i11 : 5;
                            if (!kVar.f100753j) {
                            }
                        }
                        i28 = kVar.f100734P - 1;
                        bArr = kVar.f100747d;
                        break;
                        break;
                    case 2:
                        int i44 = i34;
                        int i45 = 0;
                        while (true) {
                            int[] iArr3 = kVar.f100758o;
                            if (i45 < 3) {
                                if (C10054a.g(c10054a, i44) != 0) {
                                    i22 = i32;
                                    int g14 = C10054a.g(c10054a, 3);
                                    i23 = g14 == 0 ? i44 : C10054a.g(c10054a, g14) + (i44 << g14);
                                } else {
                                    i22 = i32;
                                    i23 = i22;
                                }
                                iArr3[i45] = i23 + 1;
                                iArr2[i45] = 268435456;
                                int i46 = iArr3[i45];
                                if (i46 > i44) {
                                    int i47 = i45 * 1080;
                                    e(i46 + 2, kVar.f100748e, i47, c10054a);
                                    int[] iArr4 = kVar.f100749f;
                                    e(26, iArr4, i47, c10054a);
                                    C10054a.d(c10054a);
                                    int f7 = f(iArr4, i47, c10054a);
                                    iArr2[i45] = j.f100711a[f7] + C10054a.g(c10054a, j.f100712b[f7]);
                                }
                                i45++;
                                i32 = i22;
                                i44 = 1;
                            } else {
                                int i48 = i32;
                                C10054a.h(c10054a);
                                kVar.f100728J = C10054a.g(c10054a, 2);
                                int g15 = C10054a.g(c10054a, 4);
                                int i49 = kVar.f100728J;
                                int i51 = (g15 << i49) + 16;
                                kVar.f100726H = i51;
                                kVar.f100727I = (1 << i49) - 1;
                                int i52 = i51 + (48 << i49);
                                kVar.f100768y = new byte[iArr3[i48]];
                                int i53 = i48;
                                while (true) {
                                    int i54 = iArr3[i48];
                                    if (i53 < i54) {
                                        int min = Math.min(i53 + 96, i54);
                                        while (i53 < min) {
                                            kVar.f100768y[i53] = (byte) (C10054a.g(c10054a, 2) << 1);
                                            i53++;
                                            i33 = i33;
                                        }
                                        C10054a.h(c10054a);
                                    } else {
                                        i19 = i33;
                                        int i55 = i54 << 6;
                                        byte[] bArr5 = new byte[i55];
                                        kVar.f100769z = bArr5;
                                        int b11 = b(i55, bArr5, c10054a);
                                        kVar.f100764u = true;
                                        int i56 = i48;
                                        while (true) {
                                            if (i56 < (iArr3[i48] << 6)) {
                                                if (kVar.f100769z[i56] != (i56 >> 6)) {
                                                    kVar.f100764u = i48;
                                                } else {
                                                    i56++;
                                                    i48 = 0;
                                                }
                                            }
                                        }
                                        int i57 = iArr3[2] << 2;
                                        byte[] bArr6 = new byte[i57];
                                        kVar.f100725G = bArr6;
                                        int b12 = b(i57, bArr6, c10054a);
                                        h.b(hVar3, 256, b11);
                                        h.b(hVar2, 704, iArr3[1]);
                                        h.b(hVar, i52, b12);
                                        h.a(hVar3, c10054a);
                                        h.a(hVar2, c10054a);
                                        h.a(hVar, c10054a);
                                        kVar.f100719A = 0;
                                        kVar.f100720B = 0;
                                        int[] iArr5 = d.f100698b;
                                        byte b13 = kVar.f100768y[0];
                                        kVar.f100721C = iArr5[b13];
                                        i21 = 1;
                                        kVar.f100722D = iArr5[b13 + 1];
                                        kVar.f100765v = hVar3.f100708c[0];
                                        kVar.f100723E = hVar2.f100708c[0];
                                        iArr[i19] = 1;
                                        iArr[2] = 1;
                                        iArr[0] = 1;
                                        iArr[5] = 0;
                                        c11 = 3;
                                        iArr[3] = 0;
                                        iArr[1] = 0;
                                        kVar.f100744a = 3;
                                        if (kVar.f100750g > 0) {
                                            kVar.f100744a = i21;
                                            break;
                                        } else {
                                            C10054a.h(c10054a);
                                            if (iArr2[i21] == 0) {
                                                a(kVar, i21);
                                                kVar.f100723E = hVar2.f100708c[iArr[c11]];
                                            }
                                            iArr2[i21] = iArr2[i21] - i21;
                                            C10054a.d(c10054a);
                                            int f11 = f(hVar2.f100707b, kVar.f100723E, c10054a);
                                            int i58 = f11 >>> 6;
                                            kVar.f100724F = 0;
                                            if (i58 >= 2) {
                                                i58 -= 2;
                                                kVar.f100724F = -1;
                                            }
                                            int i59 = j.f100717g[i58] + ((f11 >>> 3) & 7);
                                            int i61 = j.f100718h[i58] + (f11 & 7);
                                            kVar.f100767x = j.f100713c[i59] + C10054a.g(c10054a, j.f100714d[i59]);
                                            kVar.f100730L = j.f100715e[i61] + C10054a.g(c10054a, j.f100716f[i61]);
                                            c12 = 0;
                                            kVar.f100766w = 0;
                                            kVar.f100744a = 6;
                                            if (kVar.f100764u) {
                                                int i62 = kVar.f100761r;
                                                int i63 = bArr[(i62 - 1) & i28] & 255;
                                                int i64 = bArr[(i62 - 2) & i28] & 255;
                                                while (kVar.f100766w < kVar.f100767x) {
                                                    C10054a.h(c10054a);
                                                    if (iArr2[0] == 0) {
                                                        c(kVar);
                                                    }
                                                    byte[] bArr7 = kVar.f100769z;
                                                    int i65 = kVar.f100719A;
                                                    int[] iArr6 = d.f100697a;
                                                    int i66 = bArr7[i65 + (iArr6[kVar.f100722D + i64] | iArr6[kVar.f100721C + i63])] & 255;
                                                    iArr2[0] = iArr2[0] - 1;
                                                    C10054a.d(c10054a);
                                                    int f12 = f(hVar3.f100707b, hVar3.f100708c[i66], c10054a);
                                                    int i67 = kVar.f100761r;
                                                    bArr[i67] = (byte) f12;
                                                    kVar.f100766w++;
                                                    kVar.f100761r = i67 + 1;
                                                    if (i67 == i28) {
                                                        i24 = 6;
                                                        kVar.f100745b = 6;
                                                        kVar.f100742X = kVar.f100734P;
                                                        kVar.f100741W = 0;
                                                        kVar.f100744a = 12;
                                                        if (kVar.f100744a != i24) {
                                                            continue;
                                                        } else {
                                                            int i68 = kVar.f100750g - kVar.f100767x;
                                                            kVar.f100750g = i68;
                                                            if (i68 <= 0) {
                                                                kVar.f100744a = 3;
                                                                break;
                                                            } else {
                                                                if (kVar.f100724F < 0) {
                                                                    C10054a.h(c10054a);
                                                                    if (iArr2[2] == 0) {
                                                                        a(kVar, 2);
                                                                        kVar.f100720B = iArr[5] << 2;
                                                                    }
                                                                    iArr2[2] = iArr2[2] - 1;
                                                                    C10054a.d(c10054a);
                                                                    int[] iArr7 = hVar.f100707b;
                                                                    int[] iArr8 = hVar.f100708c;
                                                                    byte[] bArr8 = kVar.f100725G;
                                                                    int i69 = kVar.f100720B;
                                                                    int i71 = kVar.f100730L;
                                                                    int f13 = f(iArr7, iArr8[bArr8[i69 + (i71 > i19 ? 3 : i71 - 2)] & 255], c10054a);
                                                                    kVar.f100724F = f13;
                                                                    int i72 = kVar.f100726H;
                                                                    if (f13 >= i72) {
                                                                        int i73 = f13 - i72;
                                                                        int i74 = kVar.f100727I & i73;
                                                                        int i75 = i73 >>> kVar.f100728J;
                                                                        kVar.f100724F = i75;
                                                                        kVar.f100724F = i72 + i74 + ((((((i75 & 1) + 2) << r7) - 4) + C10054a.g(c10054a, (i75 >>> 1) + 1)) << kVar.f100728J);
                                                                    }
                                                                }
                                                                int i76 = kVar.f100724F;
                                                                int i77 = kVar.f100763t;
                                                                int[] iArr9 = kVar.f100760q;
                                                                int i78 = i76 < 16 ? iArr9[(f100700b[i76] + i77) & 3] + f100701c[i76] : i76 - 15;
                                                                kVar.f100729K = i78;
                                                                if (i78 < 0) {
                                                                    throw new c("Negative distance");
                                                                }
                                                                int i79 = kVar.f100762s;
                                                                int i81 = kVar.f100732N;
                                                                if (i79 == i81 || (i25 = kVar.f100761r) >= i81) {
                                                                    kVar.f100762s = i81;
                                                                } else {
                                                                    kVar.f100762s = i25;
                                                                }
                                                                kVar.f100731M = kVar.f100761r;
                                                                if (i78 > kVar.f100762s) {
                                                                    kVar.f100744a = 9;
                                                                    break;
                                                                } else {
                                                                    if (i76 > 0) {
                                                                        iArr9[i77 & 3] = i78;
                                                                        kVar.f100763t = i77 + 1;
                                                                    }
                                                                    if (kVar.f100730L > kVar.f100750g) {
                                                                        throw new c("Invalid backward reference");
                                                                    }
                                                                    kVar.f100766w = 0;
                                                                    kVar.f100744a = 7;
                                                                    int i82 = kVar.f100761r;
                                                                    i14 = (i82 - kVar.f100729K) & i28;
                                                                    i15 = kVar.f100730L - kVar.f100766w;
                                                                    if (i14 + i15 < i28 || i82 + i15 >= i28) {
                                                                        do {
                                                                            i16 = kVar.f100766w;
                                                                            if (i16 >= kVar.f100730L) {
                                                                                i17 = kVar.f100761r;
                                                                                bArr[i17] = bArr[(i17 - kVar.f100729K) & i28];
                                                                                kVar.f100750g--;
                                                                                kVar.f100766w = i16 + 1;
                                                                                kVar.f100761r = i17 + 1;
                                                                            }
                                                                        } while (i17 != i28);
                                                                        i18 = 7;
                                                                        kVar.f100745b = 7;
                                                                        kVar.f100742X = kVar.f100734P;
                                                                        kVar.f100741W = 0;
                                                                        kVar.f100744a = 12;
                                                                        if (kVar.f100744a == i18) {
                                                                            kVar.f100744a = 3;
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        int i83 = 0;
                                                                        while (i83 < i15) {
                                                                            bArr[i82] = bArr[i14];
                                                                            i83++;
                                                                            i82++;
                                                                            i14++;
                                                                        }
                                                                        kVar.f100766w += i15;
                                                                        kVar.f100750g -= i15;
                                                                        kVar.f100761r += i15;
                                                                    }
                                                                    i18 = 7;
                                                                    if (kVar.f100744a == i18) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        int i84 = i63;
                                                        i63 = f12;
                                                        i64 = i84;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (kVar.f100766w < kVar.f100767x) {
                                                        C10054a.h(c10054a);
                                                        if (iArr2[c12] == 0) {
                                                            c(kVar);
                                                        }
                                                        iArr2[c12] = iArr2[c12] - 1;
                                                        C10054a.d(c10054a);
                                                        bArr[kVar.f100761r] = (byte) f(hVar3.f100707b, kVar.f100765v, c10054a);
                                                        kVar.f100766w++;
                                                        int i85 = kVar.f100761r;
                                                        kVar.f100761r = i85 + 1;
                                                        if (i85 == i28) {
                                                            kVar.f100745b = 6;
                                                            kVar.f100742X = kVar.f100734P;
                                                            kVar.f100741W = 0;
                                                            kVar.f100744a = 12;
                                                        } else {
                                                            c12 = 0;
                                                        }
                                                    }
                                                }
                                            }
                                            i24 = 6;
                                            if (kVar.f100744a != i24) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        i19 = 4;
                        i21 = i34;
                        c11 = 3;
                        if (kVar.f100750g > 0) {
                        }
                        break;
                    case 4:
                        while (kVar.f100750g > 0) {
                            C10054a.h(c10054a);
                            C10054a.g(c10054a, 8);
                            kVar.f100750g -= i34;
                        }
                        kVar.f100744a = i34;
                        break;
                    case 5:
                        byte[] bArr9 = kVar.f100747d;
                        int i86 = kVar.f100750g;
                        if (i86 <= 0) {
                            C10054a.i(c10054a);
                            kVar.f100744a = i34;
                            break;
                        } else {
                            int min2 = Math.min(kVar.f100734P - kVar.f100761r, i86);
                            C10054a.c(c10054a, bArr9, kVar.f100761r, min2);
                            kVar.f100750g -= min2;
                            int i87 = kVar.f100761r + min2;
                            kVar.f100761r = i87;
                            int i88 = kVar.f100734P;
                            if (i87 == i88) {
                                kVar.f100745b = 5;
                                kVar.f100742X = i88;
                                kVar.f100741W = 0;
                                kVar.f100744a = 12;
                                break;
                            } else {
                                C10054a.i(c10054a);
                                kVar.f100744a = 1;
                                break;
                            }
                        }
                    case 6:
                        i19 = 4;
                        c12 = 0;
                        if (kVar.f100764u) {
                        }
                        i24 = 6;
                        if (kVar.f100744a != i24) {
                        }
                        break;
                    case 7:
                        int i822 = kVar.f100761r;
                        i14 = (i822 - kVar.f100729K) & i28;
                        i15 = kVar.f100730L - kVar.f100766w;
                        if (i14 + i15 < i28) {
                            break;
                        }
                        do {
                            i16 = kVar.f100766w;
                            if (i16 >= kVar.f100730L) {
                            }
                        } while (i17 != i28);
                        i18 = 7;
                        kVar.f100745b = 7;
                        kVar.f100742X = kVar.f100734P;
                        kVar.f100741W = 0;
                        kVar.f100744a = 12;
                        if (kVar.f100744a == i18) {
                        }
                        break;
                    case 8:
                        int i89 = kVar.f100734P;
                        System.arraycopy(bArr, i89, bArr, 0, kVar.f100731M - i89);
                        kVar.f100744a = 3;
                        break;
                    case 9:
                        int i91 = kVar.f100730L;
                        if (i91 >= 4 && i91 <= 24) {
                            int i92 = f.f100703a[i91];
                            int i93 = (kVar.f100729K - kVar.f100762s) - 1;
                            int i94 = ((i34 << r5) - 1) & i93;
                            int i95 = i93 >>> f.f100704b[i91];
                            int i96 = (i94 * i91) + i92;
                            l[] lVarArr = l.f100770d;
                            if (i95 >= lVarArr.length) {
                                throw new c("Invalid backward reference");
                            }
                            int a11 = l.a(bArr, kVar.f100731M, f.a.f100705a, i96, i91, lVarArr[i95]);
                            int i97 = kVar.f100731M + a11;
                            kVar.f100731M = i97;
                            kVar.f100761r += a11;
                            kVar.f100750g -= a11;
                            int i98 = kVar.f100734P;
                            if (i97 >= i98) {
                                kVar.f100745b = 8;
                                kVar.f100742X = i98;
                                kVar.f100741W = 0;
                                kVar.f100744a = 12;
                                break;
                            } else {
                                kVar.f100744a = 3;
                                break;
                            }
                        }
                        break;
                    default:
                        throw new c("Unexpected state " + kVar.f100744a);
                }
            } else {
                int i99 = kVar.f100737S;
                if (i99 != 0) {
                    kVar.f100741W += i99;
                    kVar.f100737S = 0;
                }
                int min3 = Math.min(kVar.f100739U - kVar.f100740V, kVar.f100742X - kVar.f100741W);
                if (min3 != 0) {
                    System.arraycopy(kVar.f100747d, kVar.f100741W, kVar.f100743Y, kVar.f100738T + kVar.f100740V, min3);
                    kVar.f100740V += min3;
                    kVar.f100741W += min3;
                }
                if (kVar.f100740V >= kVar.f100739U) {
                    return;
                }
                int i100 = kVar.f100761r;
                int i101 = kVar.f100732N;
                if (i100 >= i101) {
                    kVar.f100762s = i101;
                }
                kVar.f100761r = i100 & i28;
                kVar.f100744a = kVar.f100745b;
            }
            i27 = 1;
        }
    }

    static void e(int i11, int[] iArr, int i12, C10054a c10054a) {
        int i13;
        int i14;
        int i15;
        C10054a.h(c10054a);
        int[] iArr2 = new int[i11];
        int g10 = C10054a.g(c10054a, 2);
        char c11 = 3;
        boolean z11 = true;
        if (g10 == 1) {
            int i16 = i11 - 1;
            int[] iArr3 = new int[4];
            int g11 = C10054a.g(c10054a, 2) + 1;
            int i17 = 0;
            while (i16 != 0) {
                i16 >>= 1;
                i17++;
            }
            for (int i18 = 0; i18 < g11; i18++) {
                int g12 = C10054a.g(c10054a, i17) % i11;
                iArr3[i18] = g12;
                iArr2[g12] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (g11 != 1) {
                if (g11 == 2) {
                    int i19 = iArr3[0];
                    int i21 = iArr3[1];
                    r7 = i19 != i21;
                    iArr2[i21] = 1;
                } else if (g11 != 3) {
                    int i22 = iArr3[0];
                    int i23 = iArr3[1];
                    boolean z12 = (i22 == i23 || i22 == (i14 = iArr3[2]) || i22 == (i15 = iArr3[3]) || i23 == i14 || i23 == i15 || i14 == i15) ? false : true;
                    if (C10054a.g(c10054a, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z11 = z12;
                } else {
                    int i24 = iArr3[0];
                    int i25 = iArr3[1];
                    if (i24 != i25 && i24 != (i13 = iArr3[2]) && i25 != i13) {
                        r7 = true;
                    }
                }
                z11 = r7;
            }
        } else {
            int[] iArr4 = new int[18];
            int i26 = 0;
            int i27 = 32;
            while (g10 < 18 && i27 > 0) {
                int i28 = f100699a[g10];
                C10054a.d(c10054a);
                long j11 = c10054a.f100689f;
                char c12 = c11;
                int i29 = c10054a.f100690g;
                int i31 = f100702d[((int) (j11 >>> i29)) & 15];
                c10054a.f100690g = i29 + (i31 >> 16);
                int i32 = i31 & 65535;
                iArr4[i28] = i32;
                if (i32 != 0) {
                    i27 -= 32 >> i32;
                    i26++;
                }
                g10++;
                c11 = c12;
            }
            if (i26 != 1 && i27 != 0) {
                z11 = false;
            }
            int[] iArr5 = new int[32];
            g.a(0, 5, iArr5, iArr4, 18);
            int i33 = 8;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 32768;
            while (i34 < i11 && i37 > 0) {
                C10054a.h(c10054a);
                C10054a.d(c10054a);
                long j12 = c10054a.f100689f;
                int i38 = c10054a.f100690g;
                int i39 = iArr5[((int) (j12 >>> i38)) & 31];
                c10054a.f100690g = i38 + (i39 >> 16);
                int i41 = i39 & 65535;
                if (i41 < 16) {
                    int i42 = i34 + 1;
                    iArr2[i34] = i41;
                    if (i41 != 0) {
                        i37 -= 32768 >> i41;
                        i33 = i41;
                    }
                    i34 = i42;
                    i36 = 0;
                } else {
                    int i43 = i41 - 14;
                    int i44 = i41 == 16 ? i33 : 0;
                    if (i35 != i44) {
                        i35 = i44;
                        i36 = 0;
                    }
                    int g13 = C10054a.g(c10054a, i43) + 3 + (i36 > 0 ? (i36 - 2) << i43 : i36);
                    int i45 = g13 - i36;
                    if (i34 + i45 > i11) {
                        throw new c("symbol + repeatDelta > numSymbols");
                    }
                    int i46 = 0;
                    while (i46 < i45) {
                        iArr2[i34] = i35;
                        i46++;
                        i34++;
                    }
                    if (i35 != 0) {
                        i37 -= i45 << (15 - i35);
                    }
                    i36 = g13;
                }
            }
            if (i37 != 0) {
                throw new c("Unused space");
            }
            m.a(i34, i11 - i34, iArr2);
        }
        if (!z11) {
            throw new c("Can't readHuffmanCode");
        }
        g.a(i12, 8, iArr, iArr2, i11);
    }

    private static int f(int[] iArr, int i11, C10054a c10054a) {
        long j11 = c10054a.f100689f;
        int i12 = c10054a.f100690g;
        int i13 = (int) (j11 >>> i12);
        int i14 = i11 + (i13 & 255);
        int i15 = iArr[i14];
        int i16 = i15 >> 16;
        int i17 = i15 & 65535;
        if (i16 <= 8) {
            c10054a.f100690g = i12 + i16;
            return i17;
        }
        int i18 = iArr[i14 + i17 + ((i13 & ((1 << i16) - 1)) >>> 8)];
        c10054a.f100690g = (i18 >> 16) + 8 + i12;
        return i18 & 65535;
    }
}
