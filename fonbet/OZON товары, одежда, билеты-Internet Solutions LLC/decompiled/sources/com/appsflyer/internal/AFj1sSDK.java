package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1sSDK {
    private static void AFInAppEventParameterName(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }

    public static void valueOf(int i11, int i12, boolean z11, int i13, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z11) {
            AFInAppEventParameterName(iArr);
        }
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i11 ^ iArr[i14];
            int i16 = i12 ^ ((iArr2[2][(i15 >>> 8) & 255] ^ (iArr2[0][i15 >>> 24] + iArr2[1][(i15 >>> 16) & 255])) + iArr2[3][i15 & 255]);
            i14++;
            i12 = i15;
            i11 = i16;
        }
        int i17 = i11 ^ iArr[iArr.length - 2];
        int i18 = i12 ^ iArr[iArr.length - 1];
        if (!z11) {
            AFInAppEventParameterName(iArr);
        }
        iArr3[0] = i18;
        iArr3[1] = i17;
    }
}
