package com.google.ads.conversiontracking;

import com.google.common.base.Ascii;
import com.ironsource.B5;
import kotlin.io.encoding.Base64;

/* loaded from: classes5.dex */
public final class s {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    private static final byte[] c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    private static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, 63, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    private static char[] a(byte[] bArr, int i, int i2, char[] cArr, int i3, char[] cArr2) {
        int i4 = (i2 > 0 ? (bArr[i] << Ascii.CAN) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << Ascii.CAN) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << Ascii.CAN) >>> 24 : 0);
        if (i2 == 1) {
            cArr[i3] = cArr2[i4 >>> 18];
            cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
            cArr[i3 + 2] = B5.U;
            cArr[i3 + 3] = B5.U;
            return cArr;
        }
        if (i2 == 2) {
            cArr[i3] = cArr2[i4 >>> 18];
            cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
            cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
            cArr[i3 + 3] = B5.U;
            return cArr;
        }
        if (i2 != 3) {
            return cArr;
        }
        cArr[i3] = cArr2[i4 >>> 18];
        cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
        cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
        cArr[i3 + 3] = cArr2[i4 & 63];
        return cArr;
    }

    @Deprecated
    public static String a(byte[] bArr, boolean z) {
        return a(bArr, 0, bArr.length, b, z);
    }

    public static String a(byte[] bArr, int i, int i2, char[] cArr, boolean z) {
        char[] a2 = a(bArr, i, i2, cArr, Integer.MAX_VALUE);
        int length = a2.length;
        while (!z && length > 0 && a2[length - 1] == '=') {
            length--;
        }
        return new String(a2, 0, length);
    }

    static char[] a(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        char[] cArr2 = new char[i4 + (i4 / i3)];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = ((bArr[i6 + i] << Ascii.CAN) >>> 8) | ((bArr[(i6 + 1) + i] << Ascii.CAN) >>> 16) | ((bArr[(i6 + 2) + i] << Ascii.CAN) >>> 24);
            cArr2[i7] = cArr[i9 >>> 18];
            int i10 = i7 + 1;
            cArr2[i10] = cArr[(i9 >>> 12) & 63];
            cArr2[i7 + 2] = cArr[(i9 >>> 6) & 63];
            cArr2[i7 + 3] = cArr[i9 & 63];
            i8 += 4;
            if (i8 == i3) {
                cArr2[i7 + 4] = '\n';
                i8 = 0;
                i7 = i10;
            }
            i6 += 3;
            i7 += 4;
        }
        if (i6 < i2) {
            a(bArr, i + i6, i2 - i6, cArr2, i7, cArr);
            if (i8 + 4 == i3) {
                cArr2[i7 + 4] = '\n';
            }
        }
        return cArr2;
    }
}
