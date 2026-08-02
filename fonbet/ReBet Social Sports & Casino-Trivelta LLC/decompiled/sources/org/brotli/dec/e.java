package org.brotli.dec;

import kotlin.UByte;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class e {
    private static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] FIXED_TABLE = {PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262145, PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262149};

    public static void a(k kVar) {
        a aVar = kVar.f62176c;
        byte[] bArr = kVar.ringBuffer;
        int i10 = kVar.f62177d;
        if (i10 <= 0) {
            a.k(aVar);
            kVar.f62174a = 1;
            return;
        }
        int min = Math.min(kVar.f62166G - kVar.f62184k, i10);
        a.c(aVar, bArr, kVar.f62184k, min);
        kVar.f62177d -= min;
        int i11 = kVar.f62184k + min;
        kVar.f62184k = i11;
        int i12 = kVar.f62166G;
        if (i11 != i12) {
            a.k(aVar);
            kVar.f62174a = 1;
        } else {
            kVar.f62175b = 5;
            kVar.f62173N = i12;
            kVar.f62172M = 0;
            kVar.f62174a = 12;
        }
    }

    public static void b(k kVar, int i10) {
        a aVar = kVar.f62176c;
        int[] iArr = kVar.blockTypeRb;
        int i11 = i10 * 2;
        a.d(aVar);
        int i12 = i10 * 1080;
        int r10 = r(kVar.blockTypeTrees, i12, aVar);
        kVar.blockLength[i10] = m(kVar.blockLenTrees, i12, aVar);
        int i13 = r10 == 1 ? iArr[i11 + 1] + 1 : r10 == 0 ? iArr[i11] : r10 - 2;
        int i14 = kVar.numBlockTypes[i10];
        if (i13 >= i14) {
            i13 -= i14;
        }
        int i15 = i11 + 1;
        iArr[i11] = iArr[i15];
        iArr[i15] = i13;
    }

    public static void c(k kVar) {
        b(kVar, 1);
        kVar.f62196w = kVar.f62182i.trees[kVar.blockTypeRb[3]];
    }

    public static int d(int i10, byte[] bArr, a aVar) {
        a.j(aVar);
        int h10 = h(aVar) + 1;
        if (h10 == 1) {
            m.a(bArr, 0, i10);
            return h10;
        }
        int i11 = a.i(aVar, 1) == 1 ? a.i(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        n(h10 + i11, iArr, 0, aVar);
        int i12 = 0;
        while (i12 < i10) {
            a.j(aVar);
            a.d(aVar);
            int r10 = r(iArr, 0, aVar);
            if (r10 == 0) {
                bArr[i12] = 0;
            } else if (r10 <= i11) {
                for (int i13 = (1 << r10) + a.i(aVar, r10); i13 != 0; i13--) {
                    if (i12 >= i10) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i12] = 0;
                    i12++;
                }
            } else {
                bArr[i12] = (byte) (r10 - i11);
            }
            i12++;
        }
        if (a.i(aVar, 1) == 1) {
            j(bArr, i10);
        }
        return h10;
    }

    public static void e(k kVar) {
        b(kVar, 2);
        kVar.f62193t = kVar.blockTypeRb[5] << 2;
    }

    public static void f(k kVar) {
        b(kVar, 0);
        int i10 = kVar.blockTypeRb[1];
        int i11 = i10 << 6;
        kVar.f62192s = i11;
        int i12 = kVar.contextMap[i11] & UByte.MAX_VALUE;
        kVar.f62188o = i12;
        kVar.f62189p = kVar.f62181h.trees[i12];
        byte b10 = kVar.contextModes[i10];
        int[] iArr = d.LOOKUP_OFFSETS;
        kVar.f62194u = iArr[b10];
        kVar.f62195v = iArr[b10 + 1];
    }

    public static void g(a aVar, k kVar) {
        boolean z10 = a.i(aVar, 1) == 1;
        kVar.f62178e = z10;
        kVar.f62177d = 0;
        kVar.f62179f = false;
        kVar.f62180g = false;
        if (!z10 || a.i(aVar, 1) == 0) {
            int i10 = a.i(aVar, 2) + 4;
            if (i10 == 7) {
                kVar.f62180g = true;
                if (a.i(aVar, 1) != 0) {
                    throw new c("Corrupted reserved bit");
                }
                int i11 = a.i(aVar, 2);
                if (i11 == 0) {
                    return;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a.i(aVar, 8);
                    if (i13 == 0 && i12 + 1 == i11 && i11 > 1) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f62177d = (i13 << (i12 * 8)) | kVar.f62177d;
                }
            } else {
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = a.i(aVar, 4);
                    if (i15 == 0 && i14 + 1 == i10 && i10 > 4) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f62177d = (i15 << (i14 * 4)) | kVar.f62177d;
                }
            }
            kVar.f62177d++;
            if (kVar.f62178e) {
                return;
            }
            kVar.f62179f = a.i(aVar, 1) == 1;
        }
    }

    public static int h(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 0;
        }
        int i10 = a.i(aVar, 3);
        if (i10 == 0) {
            return 1;
        }
        return a.i(aVar, i10) + (1 << i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        throw new org.brotli.dec.c("Invalid backward reference");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139 A[LOOP:4: B:77:0x0139->B:130:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(k kVar) {
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = kVar.f62174a;
        if (i17 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i17 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        a aVar = kVar.f62176c;
        int i18 = 1;
        int i19 = kVar.f62166G - 1;
        byte[] bArr = kVar.ringBuffer;
        while (true) {
            int i20 = kVar.f62174a;
            if (i20 == 10) {
                boolean z10 = i18;
                if (i20 == 10) {
                    if (kVar.f62177d < 0) {
                        throw new c("Invalid metablock length");
                    }
                    a.g(aVar);
                    a.a(kVar.f62176c, z10);
                    return;
                }
                return;
            }
            if (i20 != 12) {
                char c11 = 2;
                int i21 = 0;
                switch (i20) {
                    case 1:
                        i10 = i18;
                        if (kVar.f62177d < 0) {
                            throw new c("Invalid metablock length");
                        }
                        q(kVar);
                        i19 = kVar.f62166G - 1;
                        bArr = kVar.ringBuffer;
                        break;
                    case 2:
                        p(kVar);
                        kVar.f62174a = 3;
                        if (kVar.f62177d > 0) {
                            kVar.f62174a = i18;
                            i10 = i18;
                            break;
                        } else {
                            a.j(aVar);
                            if (kVar.blockLength[i18] == 0) {
                                c(kVar);
                            }
                            int[] iArr = kVar.blockLength;
                            iArr[i18] = iArr[i18] - i18;
                            a.d(aVar);
                            int r10 = r(kVar.f62182i.codes, kVar.f62196w, aVar);
                            int i22 = r10 >>> 6;
                            kVar.f62197x = 0;
                            if (i22 >= 2) {
                                i22 -= 2;
                                kVar.f62197x = -1;
                            }
                            int i23 = j.INSERT_RANGE_LUT[i22] + ((r10 >>> 3) & 7);
                            int i24 = j.COPY_RANGE_LUT[i22] + (r10 & 7);
                            kVar.f62191r = j.INSERT_LENGTH_OFFSET[i23] + a.i(aVar, j.INSERT_LENGTH_N_BITS[i23]);
                            kVar.f62162C = j.COPY_LENGTH_OFFSET[i24] + a.i(aVar, j.COPY_LENGTH_N_BITS[i24]);
                            kVar.f62190q = 0;
                            kVar.f62174a = 6;
                            if (kVar.f62187n) {
                                int i25 = kVar.f62184k;
                                int i26 = bArr[(i25 - 1) & i19] & UByte.MAX_VALUE;
                                int i27 = bArr[(i25 - 2) & i19] & UByte.MAX_VALUE;
                                while (true) {
                                    c10 = c11;
                                    if (kVar.f62190q < kVar.f62191r) {
                                        a.j(aVar);
                                        if (kVar.blockLength[0] == 0) {
                                            f(kVar);
                                        }
                                        byte[] bArr2 = kVar.contextMap;
                                        int i28 = kVar.f62192s;
                                        int[] iArr2 = d.LOOKUP;
                                        i10 = i18;
                                        int i29 = bArr2[i28 + (iArr2[kVar.f62194u + i26] | iArr2[kVar.f62195v + i27])] & UByte.MAX_VALUE;
                                        kVar.blockLength[0] = r5[0] - 1;
                                        a.d(aVar);
                                        h hVar = kVar.f62181h;
                                        int r11 = r(hVar.codes, hVar.trees[i29], aVar);
                                        int i30 = kVar.f62184k;
                                        bArr[i30] = (byte) r11;
                                        kVar.f62190q++;
                                        kVar.f62184k = i30 + 1;
                                        if (i30 == i19) {
                                            kVar.f62175b = 6;
                                            kVar.f62173N = kVar.f62166G;
                                            kVar.f62172M = 0;
                                            kVar.f62174a = 12;
                                        } else {
                                            i27 = i26;
                                            c11 = c10;
                                            i26 = r11;
                                            i18 = i10;
                                        }
                                    } else {
                                        i10 = i18;
                                    }
                                }
                            } else {
                                while (true) {
                                    if (kVar.f62190q < kVar.f62191r) {
                                        a.j(aVar);
                                        if (kVar.blockLength[0] == 0) {
                                            f(kVar);
                                        }
                                        int[] iArr3 = kVar.blockLength;
                                        iArr3[0] = iArr3[0] - i18;
                                        a.d(aVar);
                                        bArr[kVar.f62184k] = (byte) r(kVar.f62181h.codes, kVar.f62189p, aVar);
                                        kVar.f62190q += i18;
                                        int i31 = kVar.f62184k;
                                        kVar.f62184k = i31 + 1;
                                        if (i31 == i19) {
                                            kVar.f62175b = 6;
                                            kVar.f62173N = kVar.f62166G;
                                            kVar.f62172M = 0;
                                            kVar.f62174a = 12;
                                        }
                                    }
                                }
                                i10 = i18;
                                c10 = 2;
                            }
                            if (kVar.f62174a == 6) {
                                continue;
                            } else {
                                int i32 = kVar.f62177d - kVar.f62191r;
                                kVar.f62177d = i32;
                                if (i32 <= 0) {
                                    kVar.f62174a = 3;
                                    break;
                                } else {
                                    if (kVar.f62197x < 0) {
                                        a.j(aVar);
                                        if (kVar.blockLength[c10] == 0) {
                                            e(kVar);
                                        }
                                        kVar.blockLength[c10] = r3[c10] - 1;
                                        a.d(aVar);
                                        h hVar2 = kVar.f62183j;
                                        int[] iArr4 = hVar2.codes;
                                        int[] iArr5 = hVar2.trees;
                                        byte[] bArr3 = kVar.distContextMap;
                                        int i33 = kVar.f62193t;
                                        int i34 = kVar.f62162C;
                                        int r12 = r(iArr4, iArr5[bArr3[i33 + (i34 > 4 ? 3 : i34 - 2)] & UByte.MAX_VALUE], aVar);
                                        kVar.f62197x = r12;
                                        int i35 = kVar.f62198y;
                                        if (r12 >= i35) {
                                            int i36 = r12 - i35;
                                            int i37 = kVar.f62199z & i36;
                                            int i38 = i36 >>> kVar.f62160A;
                                            kVar.f62197x = i38;
                                            int i39 = (i38 >>> 1) + 1;
                                            kVar.f62197x = i35 + i37 + ((((((i38 & 1) + 2) << i39) - 4) + a.i(aVar, i39)) << kVar.f62160A);
                                        }
                                    }
                                    int t10 = t(kVar.f62197x, kVar.distRb, kVar.f62186m);
                                    kVar.f62161B = t10;
                                    if (t10 < 0) {
                                        throw new c("Negative distance");
                                    }
                                    int i40 = kVar.f62185l;
                                    int i41 = kVar.f62164E;
                                    if (i40 == i41 || (i11 = kVar.f62184k) >= i41) {
                                        kVar.f62185l = i41;
                                    } else {
                                        kVar.f62185l = i11;
                                    }
                                    kVar.f62163D = kVar.f62184k;
                                    if (t10 > kVar.f62185l) {
                                        kVar.f62174a = 9;
                                        break;
                                    } else {
                                        if (kVar.f62197x > 0) {
                                            int[] iArr6 = kVar.distRb;
                                            int i42 = kVar.f62186m;
                                            iArr6[i42 & 3] = t10;
                                            kVar.f62186m = i42 + 1;
                                        }
                                        if (kVar.f62162C > kVar.f62177d) {
                                            throw new c("Invalid backward reference");
                                        }
                                        kVar.f62190q = 0;
                                        kVar.f62174a = 7;
                                        int i43 = kVar.f62184k;
                                        i12 = (i43 - kVar.f62161B) & i19;
                                        i13 = kVar.f62162C - kVar.f62190q;
                                        if (i12 + i13 < i19 || i43 + i13 >= i19) {
                                            do {
                                                i14 = kVar.f62190q;
                                                if (i14 >= kVar.f62162C) {
                                                    i15 = kVar.f62184k;
                                                    bArr[i15] = bArr[(i15 - kVar.f62161B) & i19];
                                                    kVar.f62177d--;
                                                    kVar.f62190q = i14 + 1;
                                                    kVar.f62184k = i15 + 1;
                                                }
                                            } while (i15 != i19);
                                            i16 = 7;
                                            kVar.f62175b = 7;
                                            kVar.f62173N = kVar.f62166G;
                                            kVar.f62172M = 0;
                                            kVar.f62174a = 12;
                                            if (kVar.f62174a != i16) {
                                                break;
                                            } else {
                                                kVar.f62174a = 3;
                                                break;
                                            }
                                        } else {
                                            while (i21 < i13) {
                                                bArr[i43] = bArr[i12];
                                                i21++;
                                                i43++;
                                                i12++;
                                            }
                                            kVar.f62190q += i13;
                                            kVar.f62177d -= i13;
                                            kVar.f62184k += i13;
                                        }
                                        i16 = 7;
                                        if (kVar.f62174a != i16) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (kVar.f62177d > 0) {
                        }
                        break;
                    case 4:
                        while (kVar.f62177d > 0) {
                            a.j(aVar);
                            a.i(aVar, 8);
                            kVar.f62177d -= i18;
                        }
                        kVar.f62174a = i18;
                        i10 = i18;
                        break;
                    case 5:
                        a(kVar);
                        i10 = i18;
                        break;
                    case 6:
                        if (kVar.f62187n) {
                        }
                        if (kVar.f62174a == 6) {
                        }
                        break;
                    case 7:
                        i10 = i18;
                        int i432 = kVar.f62184k;
                        i12 = (i432 - kVar.f62161B) & i19;
                        i13 = kVar.f62162C - kVar.f62190q;
                        if (i12 + i13 < i19) {
                            break;
                        }
                        do {
                            i14 = kVar.f62190q;
                            if (i14 >= kVar.f62162C) {
                            }
                        } while (i15 != i19);
                        i16 = 7;
                        kVar.f62175b = 7;
                        kVar.f62173N = kVar.f62166G;
                        kVar.f62172M = 0;
                        kVar.f62174a = 12;
                        if (kVar.f62174a != i16) {
                        }
                        break;
                    case 8:
                        int i44 = kVar.f62166G;
                        System.arraycopy(bArr, i44, bArr, 0, kVar.f62163D - i44);
                        kVar.f62174a = 3;
                        i10 = i18;
                        break;
                    case 9:
                        int i45 = kVar.f62162C;
                        if (i45 >= 4 && i45 <= 24) {
                            int i46 = f.OFFSETS_BY_LENGTH[i45];
                            int i47 = (kVar.f62161B - kVar.f62185l) - i18;
                            int i48 = f.SIZE_BITS_BY_LENGTH[i45];
                            int i49 = ((i18 << i48) - i18) & i47;
                            int i50 = i47 >>> i48;
                            int i51 = i46 + (i49 * i45);
                            l[] lVarArr = l.TRANSFORMS;
                            if (i50 >= lVarArr.length) {
                                throw new c("Invalid backward reference");
                            }
                            int b10 = l.b(bArr, kVar.f62163D, f.a(), i51, kVar.f62162C, lVarArr[i50]);
                            int i52 = kVar.f62163D + b10;
                            kVar.f62163D = i52;
                            kVar.f62184k += b10;
                            kVar.f62177d -= b10;
                            int i53 = kVar.f62166G;
                            if (i52 >= i53) {
                                kVar.f62175b = 8;
                                kVar.f62173N = i53;
                                kVar.f62172M = 0;
                                kVar.f62174a = 12;
                            } else {
                                kVar.f62174a = 3;
                            }
                            i10 = i18;
                            break;
                        }
                        break;
                    default:
                        throw new c("Unexpected state " + kVar.f62174a);
                }
            } else {
                i10 = i18;
                if (!u(kVar)) {
                    return;
                }
                int i54 = kVar.f62184k;
                int i55 = kVar.f62164E;
                if (i54 >= i55) {
                    kVar.f62185l = i55;
                }
                kVar.f62184k = i54 & i19;
                kVar.f62174a = kVar.f62175b;
            }
            i18 = i10;
        }
    }

    public static void j(byte[] bArr, int i10) {
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = bArr[i12] & UByte.MAX_VALUE;
            bArr[i12] = (byte) iArr[i13];
            if (i13 != 0) {
                l(iArr, i13);
            }
        }
    }

    public static void k(k kVar) {
        int i10;
        int i11 = kVar.f62165F;
        long j10 = i11;
        long j11 = kVar.f62167H;
        if (j10 > j11) {
            while (true) {
                int i12 = i11 >> 1;
                if (i12 <= ((int) j11) + kVar.customDictionary.length) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            if (!kVar.f62178e && i11 < 16384 && kVar.f62165F >= 16384) {
                i11 = 16384;
            }
        }
        int i13 = kVar.f62166G;
        if (i11 <= i13) {
            return;
        }
        byte[] bArr = new byte[i11 + 37];
        byte[] bArr2 = kVar.ringBuffer;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i13);
        } else {
            byte[] bArr3 = kVar.customDictionary;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i14 = kVar.f62164E;
                if (length > i14) {
                    i10 = length - i14;
                } else {
                    i14 = length;
                    i10 = 0;
                }
                System.arraycopy(bArr3, i10, bArr, 0, i14);
                kVar.f62184k = i14;
                kVar.f62168I = i14;
            }
        }
        kVar.ringBuffer = bArr;
        kVar.f62166G = i11;
    }

    public static void l(int[] iArr, int i10) {
        int i11 = iArr[i10];
        while (i10 > 0) {
            iArr[i10] = iArr[i10 - 1];
            i10--;
        }
        iArr[0] = i11;
    }

    public static int m(int[] iArr, int i10, a aVar) {
        a.d(aVar);
        int r10 = r(iArr, i10, aVar);
        return j.BLOCK_LENGTH_OFFSET[r10] + a.i(aVar, j.BLOCK_LENGTH_N_BITS[r10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(int i10, int[] iArr, int i11, a aVar) {
        int i12;
        int i13;
        int i14;
        a.j(aVar);
        int[] iArr2 = new int[i10];
        int i15 = a.i(aVar, 2);
        boolean z10 = true;
        if (i15 == 1) {
            int i16 = i10 - 1;
            int[] iArr3 = new int[4];
            int i17 = a.i(aVar, 2) + 1;
            int i18 = 0;
            while (i16 != 0) {
                i16 >>= 1;
                i18++;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                int i20 = a.i(aVar, i18) % i10;
                iArr3[i19] = i20;
                iArr2[i20] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (i17 != 1) {
                if (i17 == 2) {
                    int i21 = iArr3[0];
                    int i22 = iArr3[1];
                    r4 = i21 != i22;
                    iArr2[i22] = 1;
                } else if (i17 != 3) {
                    int i23 = iArr3[0];
                    int i24 = iArr3[1];
                    boolean z11 = (i23 == i24 || i23 == (i13 = iArr3[2]) || i23 == (i14 = iArr3[3]) || i24 == i13 || i24 == i14 || i13 == i14) ? false : true;
                    if (a.i(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z10 = z11;
                } else {
                    int i25 = iArr3[0];
                    int i26 = iArr3[1];
                    if (i25 != i26 && i25 != (i12 = iArr3[2]) && i26 != i12) {
                        r4 = true;
                    }
                }
            }
            if (z10) {
                throw new c("Can't readHuffmanCode");
            }
            g.a(iArr, i11, 8, iArr2, i10);
            return;
        }
        int[] iArr4 = new int[18];
        int i27 = 0;
        int i28 = 32;
        while (i15 < 18 && i28 > 0) {
            int i29 = CODE_LENGTH_CODE_ORDER[i15];
            a.d(aVar);
            long j10 = aVar.f62152d;
            int i30 = aVar.f62153e;
            int i31 = FIXED_TABLE[((int) (j10 >>> i30)) & 15];
            aVar.f62153e = i30 + (i31 >> 16);
            int i32 = i31 & 65535;
            iArr4[i29] = i32;
            if (i32 != 0) {
                i28 -= 32 >> i32;
                i27++;
            }
            i15++;
        }
        r4 = i27 == 1 || i28 == 0;
        o(iArr4, i10, iArr2, aVar);
        z10 = r4;
        if (z10) {
        }
    }

    public static void o(int[] iArr, int i10, int[] iArr2, a aVar) {
        int[] iArr3 = new int[32];
        g.a(iArr3, 0, 5, iArr, 18);
        int i11 = 8;
        int i12 = 32768;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i10 && i12 > 0) {
            a.j(aVar);
            a.d(aVar);
            long j10 = aVar.f62152d;
            int i16 = aVar.f62153e;
            int i17 = iArr3[((int) (j10 >>> i16)) & 31];
            aVar.f62153e = i16 + (i17 >> 16);
            int i18 = i17 & 65535;
            if (i18 < 16) {
                int i19 = i13 + 1;
                iArr2[i13] = i18;
                if (i18 != 0) {
                    i12 -= 32768 >> i18;
                    i13 = i19;
                    i11 = i18;
                } else {
                    i13 = i19;
                }
                i15 = 0;
            } else {
                int i20 = i18 - 14;
                int i21 = i18 == 16 ? i11 : 0;
                if (i14 != i21) {
                    i15 = 0;
                    i14 = i21;
                }
                int i22 = (i15 > 0 ? (i15 - 2) << i20 : i15) + a.i(aVar, i20) + 3;
                int i23 = i22 - i15;
                if (i13 + i23 > i10) {
                    throw new c("symbol + repeatDelta > numSymbols");
                }
                int i24 = 0;
                while (i24 < i23) {
                    iArr2[i13] = i14;
                    i24++;
                    i13++;
                }
                if (i14 != 0) {
                    i12 -= i23 << (15 - i14);
                }
                i15 = i22;
            }
        }
        if (i12 != 0) {
            throw new c("Unused space");
        }
        m.b(iArr2, i13, i10 - i13);
    }

    public static void p(k kVar) {
        int i10;
        int[] iArr;
        a aVar = kVar.f62176c;
        for (int i11 = 0; i11 < 3; i11++) {
            kVar.numBlockTypes[i11] = h(aVar) + 1;
            kVar.blockLength[i11] = 268435456;
            int i12 = kVar.numBlockTypes[i11];
            if (i12 > 1) {
                int i13 = i11 * 1080;
                n(i12 + 2, kVar.blockTypeTrees, i13, aVar);
                n(26, kVar.blockLenTrees, i13, aVar);
                kVar.blockLength[i11] = m(kVar.blockLenTrees, i13, aVar);
            }
        }
        a.j(aVar);
        kVar.f62160A = a.i(aVar, 2);
        int i14 = a.i(aVar, 4);
        int i15 = kVar.f62160A;
        int i16 = (i14 << i15) + 16;
        kVar.f62198y = i16;
        kVar.f62199z = (1 << i15) - 1;
        int i17 = i16 + (48 << i15);
        kVar.contextModes = new byte[kVar.numBlockTypes[0]];
        int i18 = 0;
        while (true) {
            i10 = kVar.numBlockTypes[0];
            if (i18 >= i10) {
                break;
            }
            int min = Math.min(i18 + 96, i10);
            while (i18 < min) {
                kVar.contextModes[i18] = (byte) (a.i(aVar, 2) << 1);
                i18++;
            }
            a.j(aVar);
        }
        byte[] bArr = new byte[i10 << 6];
        kVar.contextMap = bArr;
        int d10 = d(i10 << 6, bArr, aVar);
        kVar.f62187n = true;
        int i19 = 0;
        while (true) {
            iArr = kVar.numBlockTypes;
            if (i19 >= (iArr[0] << 6)) {
                break;
            }
            if (kVar.contextMap[i19] != (i19 >> 6)) {
                kVar.f62187n = false;
                break;
            }
            i19++;
        }
        int i20 = iArr[2];
        byte[] bArr2 = new byte[i20 << 2];
        kVar.distContextMap = bArr2;
        int d11 = d(i20 << 2, bArr2, aVar);
        h.b(kVar.f62181h, 256, d10);
        h.b(kVar.f62182i, 704, kVar.numBlockTypes[1]);
        h.b(kVar.f62183j, i17, d11);
        h.a(kVar.f62181h, aVar);
        h.a(kVar.f62182i, aVar);
        h.a(kVar.f62183j, aVar);
        kVar.f62192s = 0;
        kVar.f62193t = 0;
        int[] iArr2 = d.LOOKUP_OFFSETS;
        byte b10 = kVar.contextModes[0];
        kVar.f62194u = iArr2[b10];
        kVar.f62195v = iArr2[b10 + 1];
        kVar.f62188o = 0;
        kVar.f62189p = kVar.f62181h.trees[0];
        kVar.f62196w = kVar.f62182i.trees[0];
        int[] iArr3 = kVar.blockTypeRb;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    public static void q(k kVar) {
        a aVar = kVar.f62176c;
        if (kVar.f62178e) {
            kVar.f62175b = 10;
            kVar.f62173N = kVar.f62184k;
            kVar.f62172M = 0;
            kVar.f62174a = 12;
            return;
        }
        h hVar = kVar.f62181h;
        hVar.codes = null;
        hVar.trees = null;
        h hVar2 = kVar.f62182i;
        hVar2.codes = null;
        hVar2.trees = null;
        h hVar3 = kVar.f62183j;
        hVar3.codes = null;
        hVar3.trees = null;
        a.j(aVar);
        g(aVar, kVar);
        if (kVar.f62177d != 0 || kVar.f62180g) {
            if (kVar.f62179f || kVar.f62180g) {
                a.g(aVar);
                kVar.f62174a = kVar.f62180g ? 4 : 5;
            } else {
                kVar.f62174a = 2;
            }
            if (kVar.f62180g) {
                return;
            }
            kVar.f62167H += kVar.f62177d;
            if (kVar.f62166G < kVar.f62165F) {
                k(kVar);
            }
        }
    }

    public static int r(int[] iArr, int i10, a aVar) {
        long j10 = aVar.f62152d;
        int i11 = aVar.f62153e;
        int i12 = (int) (j10 >>> i11);
        int i13 = i10 + (i12 & 255);
        int i14 = iArr[i13];
        int i15 = i14 >> 16;
        int i16 = i14 & 65535;
        if (i15 <= 8) {
            aVar.f62153e = i11 + i15;
            return i16;
        }
        int i17 = iArr[i13 + i16 + ((i12 & ((1 << i15) - 1)) >>> 8)];
        aVar.f62153e = i11 + (i17 >> 16) + 8;
        return i17 & 65535;
    }

    public static void s(k kVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        kVar.customDictionary = bArr;
    }

    public static int t(int i10, int[] iArr, int i11) {
        return i10 < 16 ? iArr[(i11 + DISTANCE_SHORT_CODE_INDEX_OFFSET[i10]) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i10] : i10 - 15;
    }

    public static boolean u(k kVar) {
        int i10 = kVar.f62168I;
        if (i10 != 0) {
            kVar.f62172M += i10;
            kVar.f62168I = 0;
        }
        int min = Math.min(kVar.f62170K - kVar.f62171L, kVar.f62173N - kVar.f62172M);
        if (min != 0) {
            System.arraycopy(kVar.ringBuffer, kVar.f62172M, kVar.output, kVar.f62169J + kVar.f62171L, min);
            kVar.f62171L += min;
            kVar.f62172M += min;
        }
        return kVar.f62171L < kVar.f62170K;
    }
}
