package uf;

/* loaded from: classes6.dex */
final class g {
    static void a(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        int i14;
        int i15;
        int i16;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i17 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = iArr2[i18];
            iArr4[i19] = iArr4[i19] + 1;
        }
        iArr5[1] = 0;
        int i21 = 1;
        while (i21 < 15) {
            int i22 = i21 + 1;
            iArr5[i22] = iArr5[i21] + iArr4[i21];
            i21 = i22;
        }
        for (int i23 = 0; i23 < i13; i23++) {
            int i24 = iArr2[i23];
            if (i24 != 0) {
                int i25 = iArr5[i24];
                iArr5[i24] = i25 + 1;
                iArr3[i25] = i23;
            }
        }
        int i26 = 1 << i12;
        if (iArr5[15] == 1) {
            for (int i27 = 0; i27 < i26; i27++) {
                iArr[i11 + i27] = iArr3[0];
            }
            return;
        }
        int i28 = 2;
        int i29 = 2;
        int i31 = 0;
        int i32 = 1;
        while (i32 <= i12) {
            while (iArr4[i32] > 0) {
                int i33 = i11 + i17;
                int i34 = i31 + 1;
                int i35 = (i32 << 16) | iArr3[i31];
                int i36 = i26;
                do {
                    i36 -= i29;
                    iArr[i33 + i36] = i35;
                } while (i36 > 0);
                int i37 = 1 << (i32 - 1);
                while ((i17 & i37) != 0) {
                    i37 >>= 1;
                }
                i17 = (i17 & (i37 - 1)) + i37;
                iArr4[i32] = iArr4[i32] - 1;
                i31 = i34;
            }
            i32++;
            i29 <<= 1;
        }
        int i38 = i26 - 1;
        int i39 = i12 + 1;
        int i41 = -1;
        int i42 = i11;
        while (i39 <= 15) {
            while (iArr4[i39] > 0) {
                int i43 = i17 & i38;
                if (i43 != i41) {
                    int i44 = i42 + i26;
                    int i45 = 1 << (i39 - i12);
                    int i46 = i39;
                    while (i46 < 15) {
                        int i47 = i45 - iArr4[i46];
                        if (i47 <= 0) {
                            break;
                        }
                        i46++;
                        i45 = i47 << 1;
                    }
                    int i48 = i46 - i12;
                    iArr[i11 + i43] = ((i48 + i12) << 16) | ((i44 - i11) - i43);
                    i14 = i43;
                    i16 = i44;
                    i15 = 1 << i48;
                } else {
                    i14 = i41;
                    i15 = i26;
                    i16 = i42;
                }
                int i49 = i16 + (i17 >> i12);
                int i51 = i31 + 1;
                int i52 = ((i39 - i12) << 16) | iArr3[i31];
                int i53 = i15;
                do {
                    i53 -= i28;
                    iArr[i49 + i53] = i52;
                } while (i53 > 0);
                int i54 = 1 << (i39 - 1);
                while ((i17 & i54) != 0) {
                    i54 >>= 1;
                }
                i17 = (i17 & (i54 - 1)) + i54;
                iArr4[i39] = iArr4[i39] - 1;
                i26 = i15;
                i42 = i16;
                i41 = i14;
                i31 = i51;
            }
            i39++;
            i28 <<= 1;
        }
    }
}
