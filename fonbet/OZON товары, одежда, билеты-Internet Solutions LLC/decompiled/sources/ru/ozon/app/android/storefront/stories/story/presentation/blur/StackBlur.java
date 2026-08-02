package ru.ozon.app.android.storefront.stories.story.presentation.blur;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class StackBlur {
    public static Bitmap blur(Bitmap bitmap, int i11) {
        int i12;
        int i13 = i11;
        if (i13 < 1) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = iArr;
        int i15 = width - 1;
        int i16 = height - 1;
        int i17 = i13 + i13;
        int i18 = i17 + 1;
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[Math.max(width, height)];
        char c11 = 2;
        int i19 = (i17 + 2) >> 1;
        int i21 = i19 * i19;
        int i22 = i21 * 256;
        int[] iArr7 = new int[i22];
        int i23 = 0;
        for (int i24 = 0; i24 < i22; i24++) {
            iArr7[i24] = i24 / i21;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
        int i25 = i13 + 1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < height) {
            char c12 = c11;
            int i29 = -i13;
            int i31 = i23;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            int i39 = i38;
            while (i29 <= i13) {
                int[][] iArr9 = iArr8;
                int[] iArr10 = iArr2;
                int i41 = i23;
                int i42 = iArr10[Math.min(i15, Math.max(i29, i41)) + i27];
                int[] iArr11 = iArr9[i29 + i13];
                iArr11[i41] = (i42 & 16711680) >> 16;
                iArr11[1] = (i42 & 65280) >> 8;
                iArr11[c12] = i42 & 255;
                int abs = i25 - Math.abs(i29);
                int i43 = iArr11[i41];
                i31 = (i43 * abs) + i31;
                int i44 = iArr11[1];
                i32 = (i44 * abs) + i32;
                int i45 = iArr11[c12];
                i33 = (abs * i45) + i33;
                if (i29 > 0) {
                    i37 += i43;
                    i38 += i44;
                    i39 += i45;
                } else {
                    i34 += i43;
                    i35 += i44;
                    i36 += i45;
                }
                i29++;
                iArr8 = iArr9;
                iArr2 = iArr10;
                i23 = 0;
            }
            int[][] iArr12 = iArr8;
            int[] iArr13 = iArr2;
            int i46 = i13;
            int i47 = 0;
            while (i47 < width) {
                iArr3[i27] = iArr7[i31];
                iArr4[i27] = iArr7[i32];
                iArr5[i27] = iArr7[i33];
                int i48 = i31 - i34;
                int i49 = i32 - i35;
                int i51 = i33 - i36;
                int[] iArr14 = iArr12[((i46 - i13) + i18) % i18];
                int i52 = i34 - iArr14[0];
                int i53 = i35 - iArr14[1];
                int i54 = i36 - iArr14[c12];
                if (i26 == 0) {
                    i12 = i47;
                    iArr6[i12] = Math.min(i47 + i13 + 1, i15);
                } else {
                    i12 = i47;
                }
                int i55 = iArr13[i28 + iArr6[i12]];
                int i56 = (i55 & 16711680) >> 16;
                iArr14[0] = i56;
                int i57 = (i55 & 65280) >> 8;
                iArr14[1] = i57;
                int i58 = i55 & 255;
                iArr14[c12] = i58;
                int i59 = i37 + i56;
                int i61 = i38 + i57;
                int i62 = i39 + i58;
                i31 = i48 + i59;
                i32 = i49 + i61;
                i33 = i51 + i62;
                i46 = (i46 + 1) % i18;
                int[] iArr15 = iArr12[i46 % i18];
                int i63 = iArr15[0];
                i34 = i52 + i63;
                int i64 = iArr15[1];
                i35 = i53 + i64;
                int i65 = iArr15[c12];
                i36 = i54 + i65;
                i37 = i59 - i63;
                i38 = i61 - i64;
                i39 = i62 - i65;
                i27++;
                i47 = i12 + 1;
            }
            i28 += width;
            i26++;
            c11 = c12;
            iArr8 = iArr12;
            iArr2 = iArr13;
            i23 = 0;
        }
        int[][] iArr16 = iArr8;
        int[] iArr17 = iArr2;
        char c13 = c11;
        int i66 = 0;
        while (i66 < width) {
            int i67 = -i13;
            int i68 = i67 * width;
            int i69 = 0;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            while (i67 <= i13) {
                int max = Math.max(0, i68) + i66;
                int[] iArr18 = iArr16[i67 + i11];
                iArr18[0] = iArr3[max];
                iArr18[1] = iArr4[max];
                iArr18[c13] = iArr5[max];
                int abs2 = i25 - Math.abs(i67);
                i69 = (iArr3[max] * abs2) + i69;
                i71 = (iArr4[max] * abs2) + i71;
                i72 = (iArr5[max] * abs2) + i72;
                if (i67 > 0) {
                    i76 += iArr18[0];
                    i77 += iArr18[1];
                    i78 += iArr18[c13];
                } else {
                    i73 += iArr18[0];
                    i74 += iArr18[1];
                    i75 += iArr18[c13];
                }
                if (i67 < i16) {
                    i68 += width;
                }
                i67++;
                i13 = i11;
            }
            int i79 = i11;
            int i81 = i66;
            int i82 = 0;
            while (i82 < height) {
                iArr17[i81] = (iArr17[i81] & (-16777216)) | (iArr7[i69] << 16) | (iArr7[i71] << 8) | iArr7[i72];
                int i83 = i69 - i73;
                int i84 = i71 - i74;
                int i85 = i72 - i75;
                int[] iArr19 = iArr16[((i79 - i11) + i18) % i18];
                int i86 = i73 - iArr19[0];
                int i87 = i74 - iArr19[1];
                int i88 = i75 - iArr19[c13];
                int i89 = i82;
                if (i66 == 0) {
                    iArr6[i89] = Math.min(i89 + i25, i16) * width;
                }
                int i91 = iArr6[i89] + i66;
                int i92 = iArr3[i91];
                iArr19[0] = i92;
                int i93 = iArr4[i91];
                iArr19[1] = i93;
                int i94 = iArr5[i91];
                iArr19[c13] = i94;
                int i95 = i76 + i92;
                int i96 = i77 + i93;
                int i97 = i78 + i94;
                i69 = i83 + i95;
                i71 = i84 + i96;
                i72 = i85 + i97;
                i79 = (i79 + 1) % i18;
                int[] iArr20 = iArr16[i79];
                int i98 = iArr20[0];
                i73 = i86 + i98;
                int i99 = iArr20[1];
                i74 = i87 + i99;
                int i100 = iArr20[c13];
                i75 = i88 + i100;
                i76 = i95 - i98;
                i77 = i96 - i99;
                i78 = i97 - i100;
                i81 += width;
                i82 = i89 + 1;
            }
            i66++;
            i13 = i11;
        }
        bitmap.setPixels(iArr17, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
