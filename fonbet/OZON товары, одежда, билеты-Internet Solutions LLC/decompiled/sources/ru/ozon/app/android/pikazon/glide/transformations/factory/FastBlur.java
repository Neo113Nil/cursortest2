package ru.ozon.app.android.pikazon.glide.transformations.factory;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* loaded from: classes13.dex */
class FastBlur {
    public static Bitmap blur(Bitmap bitmap, int i11, boolean z11) {
        int i12;
        int i13 = i11;
        Bitmap copy = z11 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i13 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = iArr[i15];
            int i17 = i16 >>> 24;
            if (i17 == 0) {
                iArr[i15] = 0;
            } else {
                iArr[i15] = (i17 << 24) | ((((((i16 >> 16) & 255) * i17) + 127) / 255) << 16) | ((((((i16 >> 8) & 255) * i17) + 127) / 255) << 8) | ((((i16 & 255) * i17) + 127) / 255);
            }
        }
        int i18 = width - 1;
        int i19 = height - 1;
        int i21 = i13 + i13;
        int i22 = i21 + 1;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[Math.max(width, height)];
        int i23 = 0;
        int i24 = (i21 + 2) >> 1;
        int i25 = i24 * i24;
        int i26 = i25 * 256;
        int[] iArr7 = new int[i26];
        for (int i27 = 0; i27 < i26; i27++) {
            iArr7[i27] = i27 / i25;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i22, 4);
        int i28 = i13 + 1;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 < height) {
            int[][] iArr9 = iArr8;
            int i33 = -i13;
            int i34 = i23;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            int i39 = i38;
            int i41 = i39;
            int i42 = i41;
            int i43 = i42;
            int i44 = i43;
            int i45 = i44;
            int i46 = i45;
            while (i33 <= i13) {
                Bitmap bitmap2 = copy;
                int[] iArr10 = iArr;
                int i47 = i23;
                int i48 = iArr10[Math.min(i18, Math.max(i33, i47)) + i31];
                int[] iArr11 = iArr9[i33 + i13];
                iArr11[i47] = i48 >>> 24;
                int i49 = i33;
                iArr11[1] = (i48 >> 16) & 255;
                iArr11[2] = (i48 >> 8) & 255;
                iArr11[3] = i48 & 255;
                int abs = i28 - Math.abs(i49);
                int i51 = iArr11[0];
                i46 = (i51 * abs) + i46;
                int i52 = iArr11[1];
                i34 = (i52 * abs) + i34;
                int i53 = iArr11[2];
                i35 = (i53 * abs) + i35;
                int i54 = iArr11[3];
                i36 = (abs * i54) + i36;
                if (i49 > 0) {
                    i42 += i51;
                    i43 += i52;
                    i44 += i53;
                    i45 += i54;
                } else {
                    i37 += i51;
                    i38 += i52;
                    i39 += i53;
                    i41 += i54;
                }
                i33 = i49 + 1;
                copy = bitmap2;
                iArr = iArr10;
                i23 = 0;
            }
            Bitmap bitmap3 = copy;
            int[] iArr12 = iArr;
            int i55 = i13;
            int i56 = 0;
            while (i56 < width) {
                iArr5[i31] = iArr7[i46];
                iArr2[i31] = iArr7[i34];
                iArr3[i31] = iArr7[i35];
                iArr4[i31] = iArr7[i36];
                int i57 = i46 - i37;
                int i58 = i34 - i38;
                int i59 = i35 - i39;
                int i61 = i36 - i41;
                int[] iArr13 = iArr9[((i55 - i13) + i22) % i22];
                int i62 = i37 - iArr13[0];
                int i63 = i38 - iArr13[1];
                int i64 = i39 - iArr13[2];
                int i65 = i41 - iArr13[3];
                if (i29 == 0) {
                    i12 = i56;
                    iArr6[i12] = Math.min(i56 + i13 + 1, i18);
                } else {
                    i12 = i56;
                }
                int i66 = iArr12[i32 + iArr6[i12]];
                int i67 = i66 >>> 24;
                iArr13[0] = i67;
                int i68 = i55;
                int i69 = (i66 >> 16) & 255;
                iArr13[1] = i69;
                int i71 = (i66 >> 8) & 255;
                iArr13[2] = i71;
                int i72 = i66 & 255;
                iArr13[3] = i72;
                int i73 = i42 + i67;
                int i74 = i43 + i69;
                int i75 = i44 + i71;
                int i76 = i45 + i72;
                i46 = i57 + i73;
                i34 = i58 + i74;
                i35 = i59 + i75;
                i36 = i61 + i76;
                i55 = (i68 + 1) % i22;
                int[] iArr14 = iArr9[i55];
                int i77 = iArr14[0];
                i37 = i62 + i77;
                int i78 = iArr14[1];
                i38 = i63 + i78;
                int i79 = iArr14[2];
                i39 = i64 + i79;
                int i81 = iArr14[3];
                i41 = i65 + i81;
                i42 = i73 - i77;
                i43 = i74 - i78;
                i44 = i75 - i79;
                i45 = i76 - i81;
                i31++;
                i56 = i12 + 1;
            }
            i32 += width;
            i29++;
            iArr8 = iArr9;
            copy = bitmap3;
            iArr = iArr12;
            i23 = 0;
        }
        int[][] iArr15 = iArr8;
        Bitmap bitmap4 = copy;
        int[] iArr16 = iArr;
        int i82 = 0;
        while (i82 < width) {
            int i83 = -i13;
            int i84 = i82;
            int i85 = i83 * width;
            int i86 = 0;
            int i87 = 0;
            int i88 = 0;
            int i89 = 0;
            int i91 = 0;
            int i92 = 0;
            int i93 = 0;
            int i94 = 0;
            int i95 = 0;
            int i96 = 0;
            int i97 = 0;
            int i98 = 0;
            while (i83 <= i13) {
                int max = Math.max(0, i85) + i84;
                int[] iArr17 = iArr15[i83 + i11];
                iArr17[0] = iArr5[max];
                iArr17[1] = iArr2[max];
                iArr17[2] = iArr3[max];
                iArr17[3] = iArr4[max];
                int abs2 = i28 - Math.abs(i83);
                i98 = (iArr5[max] * abs2) + i98;
                i86 = (iArr2[max] * abs2) + i86;
                i87 = (iArr3[max] * abs2) + i87;
                i88 = (iArr4[max] * abs2) + i88;
                if (i83 > 0) {
                    i94 += iArr17[0];
                    i95 += iArr17[1];
                    i96 += iArr17[2];
                    i97 += iArr17[3];
                } else {
                    i89 += iArr17[0];
                    i91 += iArr17[1];
                    i92 += iArr17[2];
                    i93 += iArr17[3];
                }
                if (i83 < i19) {
                    i85 += width;
                }
                i83++;
                i13 = i11;
            }
            int i99 = i98;
            int i100 = i84;
            int i101 = i11;
            for (int i102 = 0; i102 < height; i102++) {
                iArr16[i100] = (iArr7[i99] << 24) | (iArr7[i86] << 16) | (iArr7[i87] << 8) | iArr7[i88];
                int i103 = i99 - i89;
                int i104 = i86 - i91;
                int i105 = i87 - i92;
                int i106 = i88 - i93;
                int[] iArr18 = iArr15[((i101 - i11) + i22) % i22];
                int i107 = i89 - iArr18[0];
                int i108 = i91 - iArr18[1];
                int i109 = i92 - iArr18[2];
                int i110 = i93 - iArr18[3];
                int i111 = i100;
                if (i84 == 0) {
                    iArr6[i102] = Math.min(i102 + i28, i19) * width;
                }
                int i112 = i84 + iArr6[i102];
                int i113 = iArr5[i112];
                iArr18[0] = i113;
                int i114 = iArr2[i112];
                iArr18[1] = i114;
                int i115 = iArr3[i112];
                iArr18[2] = i115;
                int i116 = iArr4[i112];
                iArr18[3] = i116;
                int i117 = i94 + i113;
                int i118 = i95 + i114;
                int i119 = i96 + i115;
                int i120 = i97 + i116;
                i99 = i103 + i117;
                i86 = i104 + i118;
                i87 = i105 + i119;
                i88 = i106 + i120;
                i101 = (i101 + 1) % i22;
                int[] iArr19 = iArr15[i101];
                int i121 = iArr19[0];
                i89 = i107 + i121;
                int i122 = iArr19[1];
                i91 = i108 + i122;
                int i123 = iArr19[2];
                i92 = i109 + i123;
                int i124 = iArr19[3];
                i93 = i110 + i124;
                i94 = i117 - i121;
                i95 = i118 - i122;
                i96 = i119 - i123;
                i97 = i120 - i124;
                i100 = i111 + width;
            }
            i82 = i84 + 1;
            i13 = i11;
        }
        for (int i125 = 0; i125 < i14; i125++) {
            int i126 = iArr16[i125];
            int i127 = i126 >>> 24;
            if (i127 == 0) {
                iArr16[i125] = 0;
            } else {
                int i128 = (i126 >> 16) & 255;
                int i129 = (i126 >> 8) & 255;
                int i130 = i126 & 255;
                int i131 = i126 >>> 25;
                iArr16[i125] = Math.min(255, ((i130 * 255) + i131) / i127) | (i127 << 24) | (Math.min(255, ((i128 * 255) + i131) / i127) << 16) | (Math.min(255, ((i129 * 255) + i131) / i127) << 8);
            }
        }
        bitmap4.setPixels(iArr16, 0, width, 0, 0, width, height);
        return bitmap4;
    }
}
