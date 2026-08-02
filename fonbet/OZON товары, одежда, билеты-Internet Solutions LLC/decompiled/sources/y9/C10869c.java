package y9;

import h9.EnumC6876a;
import java.util.ArrayList;
import java.util.EnumMap;
import o9.C8659a;
import org.maplibre.android.log.Logger;

/* renamed from: y9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10869c extends r {

    /* renamed from: a, reason: collision with root package name */
    static final int[][] f106317a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ac, code lost:
    
        if (r9 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0155, code lost:
    
        if (r9 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0157, code lost:
    
        r3 = r23;
        r9 = r3;
        r10 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015e A[PHI: r9 r20 r25
      0x015e: PHI (r9v11 int) = (r9v7 int), (r9v7 int), (r9v7 int), (r9v7 int), (r9v7 int), (r9v12 int), (r9v7 int), (r9v7 int), (r9v7 int), (r9v7 int) binds: [B:113:0x0189, B:114:0x018d, B:118:0x0199, B:117:0x0195, B:105:0x016e, B:99:0x015c, B:87:0x0136, B:88:0x013a, B:92:0x0146, B:91:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r20v4 int) = 
      (r20v1 int)
      (r20v1 int)
      (r20v1 int)
      (r20v1 int)
      (r20v3 int)
      (r20v1 int)
      (r20v1 int)
      (r20v1 int)
      (r20v1 int)
      (r20v1 int)
     binds: [B:113:0x0189, B:114:0x018d, B:118:0x0199, B:117:0x0195, B:105:0x016e, B:99:0x015c, B:87:0x0136, B:88:0x013a, B:92:0x0146, B:91:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r25v9 int) = 
      (r25v5 int)
      (r25v5 int)
      (r25v5 int)
      (r25v5 int)
      (r25v7 int)
      (r25v10 int)
      (r25v15 int)
      (r25v15 int)
      (r25v15 int)
      (r25v15 int)
     binds: [B:113:0x0189, B:114:0x018d, B:118:0x0199, B:117:0x0195, B:105:0x016e, B:99:0x015c, B:87:0x0136, B:88:0x013a, B:92:0x0146, B:91:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0166 A[PHI: r25
      0x0166: PHI (r25v8 int) = (r25v5 int), (r25v15 int) binds: [B:113:0x0189, B:87:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    @Override // y9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.h, h9.d {
        int i12;
        int[][] iArr;
        float f7;
        char c11;
        char c12;
        int i13;
        int i14 = 1;
        int i15 = 0;
        boolean z11 = enumMap != null && enumMap.containsKey(h9.e.ASSUME_GS1);
        int j11 = c8659a.j();
        int h11 = c8659a.h(0);
        int i16 = 6;
        int[] iArr2 = new int[6];
        boolean z12 = false;
        int i17 = 0;
        int i18 = h11;
        while (h11 < j11) {
            if (c8659a.f(h11) != z12) {
                iArr2[i17] = iArr2[i17] + i14;
                i12 = i14;
            } else {
                if (i17 == 5) {
                    int i19 = 103;
                    int i21 = -1;
                    float f11 = 0.25f;
                    while (true) {
                        iArr = f106317a;
                        i12 = i14;
                        f7 = 0.7f;
                        if (i19 > 105) {
                            break;
                        }
                        float d11 = r.d(iArr2, iArr[i19], 0.7f);
                        if (d11 < f11) {
                            f11 = d11;
                            i21 = i19;
                        }
                        i19++;
                        i14 = i12;
                    }
                    if (i21 >= 0 && c8659a.l(Math.max(i15, i18 - ((h11 - i18) / 2)), i18)) {
                        int[] iArr3 = {i18, h11, i21};
                        int i22 = iArr3[2];
                        ArrayList arrayList = new ArrayList(20);
                        arrayList.add(Byte.valueOf((byte) i22));
                        switch (i22) {
                            case 103:
                                c11 = 'e';
                                break;
                            case 104:
                                c11 = 'd';
                                break;
                            case 105:
                                c11 = 'c';
                                break;
                            default:
                                throw h9.h.a();
                        }
                        StringBuilder sb2 = new StringBuilder(20);
                        int[] iArr4 = new int[i16];
                        char c13 = c11;
                        int i23 = iArr3[i15];
                        int i24 = iArr3[i12];
                        int i25 = i15;
                        int i26 = i25;
                        int i27 = i26;
                        int i28 = i27;
                        int i29 = i28;
                        int i31 = i29;
                        int i32 = i12;
                        while (i27 == 0) {
                            r.e(i24, c8659a, iArr4);
                            int i33 = -1;
                            float f12 = 0.25f;
                            for (int i34 = i31; i34 < 107; i34++) {
                                float d12 = r.d(iArr4, iArr[i34], f7);
                                if (d12 < f12) {
                                    i33 = i34;
                                    f12 = d12;
                                }
                            }
                            if (i33 < 0) {
                                throw h9.m.a();
                            }
                            arrayList.add(Byte.valueOf((byte) i33));
                            if (i33 != 106) {
                                i32 = i12;
                            }
                            if (i33 != 106) {
                                i31++;
                                i22 = (i31 * i33) + i22;
                            }
                            int i35 = i24;
                            for (int i36 = i31; i36 < i16; i36++) {
                                i35 += iArr4[i36];
                            }
                            switch (i33) {
                                case 103:
                                case 104:
                                case 105:
                                    throw h9.h.a();
                                default:
                                    switch (c13) {
                                        case Logger.NONE /* 99 */:
                                            c12 = 'd';
                                            if (i33 < 100) {
                                                if (i33 < 10) {
                                                    sb2.append('0');
                                                }
                                                sb2.append(i33);
                                            } else {
                                                if (i33 != 106) {
                                                    i32 = i31;
                                                }
                                                if (i33 != 106) {
                                                    switch (i33) {
                                                        case 100:
                                                            c13 = 'd';
                                                            break;
                                                        case 101:
                                                            i13 = i31;
                                                            c13 = 'e';
                                                            break;
                                                        case 102:
                                                            if (z11) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                    break;
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    i27 = i12;
                                                }
                                            }
                                            i13 = i31;
                                            break;
                                        case 'd':
                                            if (i33 < 96) {
                                                if (i25 == i26) {
                                                    sb2.append((char) (i33 + 32));
                                                } else {
                                                    sb2.append((char) (i33 + 160));
                                                }
                                                i13 = i31;
                                                i25 = i13;
                                                c12 = 'd';
                                                break;
                                            } else {
                                                if (i33 != 106) {
                                                    i32 = i31;
                                                }
                                                if (i33 != 106) {
                                                    switch (i33) {
                                                        case 96:
                                                        case 97:
                                                        default:
                                                            i13 = i31;
                                                            break;
                                                        case 98:
                                                            i13 = i12;
                                                            c13 = 'e';
                                                            break;
                                                        case Logger.NONE /* 99 */:
                                                            i13 = i31;
                                                            c13 = 'c';
                                                            break;
                                                        case 100:
                                                            if (i26 != 0 || i25 == 0) {
                                                                if (i26 != 0) {
                                                                }
                                                                i25 = i12;
                                                                i13 = i31;
                                                                break;
                                                            }
                                                            i26 = i12;
                                                            i13 = i31;
                                                            i25 = i13;
                                                            break;
                                                        case 101:
                                                            i13 = i31;
                                                            c13 = 'e';
                                                            break;
                                                        case 102:
                                                            if (z11) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                }
                                                            }
                                                            i13 = i31;
                                                            break;
                                                    }
                                                    c12 = 'd';
                                                }
                                                i27 = i12;
                                                i13 = i31;
                                                c12 = 'd';
                                            }
                                            break;
                                        case 'e':
                                            if (i33 < 64) {
                                                if (i25 == i26) {
                                                    sb2.append((char) (i33 + 32));
                                                } else {
                                                    sb2.append((char) (i33 + 160));
                                                }
                                            } else if (i33 >= 96) {
                                                if (i33 != 106) {
                                                    i32 = i31;
                                                }
                                                if (i33 != 106) {
                                                    switch (i33) {
                                                        case 98:
                                                            i13 = i12;
                                                            c13 = 'd';
                                                            break;
                                                        case 100:
                                                            i13 = i31;
                                                            c13 = 'd';
                                                            break;
                                                        case 101:
                                                            if (i26 != 0 || i25 == 0) {
                                                                if (i26 != 0) {
                                                                }
                                                                i25 = i12;
                                                                i13 = i31;
                                                                break;
                                                            }
                                                            i26 = i12;
                                                            break;
                                                        case 102:
                                                            if (z11) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                }
                                                            }
                                                            i13 = i31;
                                                            break;
                                                    }
                                                    c12 = 'd';
                                                    break;
                                                }
                                                i27 = i12;
                                                i13 = i31;
                                                c12 = 'd';
                                            } else if (i25 == i26) {
                                                sb2.append((char) (i33 - 64));
                                            } else {
                                                sb2.append((char) (i33 + 64));
                                            }
                                            i13 = i31;
                                            i25 = i13;
                                            c12 = 'd';
                                            break;
                                        default:
                                            c12 = 'd';
                                            i13 = i31;
                                            break;
                                    }
                                    if (i28 != 0) {
                                        c13 = c13 == 'e' ? c12 : 'e';
                                    }
                                    i28 = i13;
                                    i15 = i29;
                                    i16 = 6;
                                    f7 = 0.7f;
                                    i29 = i33;
                                    i23 = i24;
                                    i24 = i35;
                                    break;
                            }
                            while (i27 == 0) {
                            }
                        }
                        int i37 = i24 - i23;
                        int i38 = c8659a.i(i24);
                        if (!c8659a.l(i38, Math.min(c8659a.j(), ((i38 - i23) / 2) + i38))) {
                            throw h9.m.a();
                        }
                        if ((i22 - (i31 * i15)) % 103 != i15) {
                            throw h9.d.a();
                        }
                        int length = sb2.length();
                        if (length == 0) {
                            throw h9.m.a();
                        }
                        if (length > 0 && i32 != 0) {
                            if (c13 == 'c') {
                                sb2.delete(length - 2, length);
                            } else {
                                sb2.delete(length - 1, length);
                            }
                        }
                        float f13 = (iArr3[i12] + iArr3[i31]) / 2.0f;
                        float f14 = (i37 / 2.0f) + i23;
                        int size = arrayList.size();
                        byte[] bArr = new byte[size];
                        for (int i39 = i31; i39 < size; i39++) {
                            bArr[i39] = ((Byte) arrayList.get(i39)).byteValue();
                        }
                        float f15 = i11;
                        return new h9.q(sb2.toString(), bArr, new h9.s[]{new h9.s(f13, f15), new h9.s(f14, f15)}, EnumC6876a.CODE_128);
                    }
                    int i41 = i15;
                    i18 += iArr2[i41] + iArr2[i12];
                    int i42 = i17 - 1;
                    i15 = i41;
                    System.arraycopy(iArr2, 2, iArr2, i15, i42);
                    iArr2[i42] = i15;
                    iArr2[i17] = i15;
                    i17--;
                } else {
                    i12 = i14;
                    i17++;
                }
                iArr2[i17] = i12;
                z12 = !z12;
            }
            h11++;
            i14 = i12;
            i16 = 6;
        }
        throw h9.m.a();
    }
}
