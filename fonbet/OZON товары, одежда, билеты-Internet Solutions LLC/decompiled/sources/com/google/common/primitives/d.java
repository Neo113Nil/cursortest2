package com.google.common.primitives;

import Bl0.k0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class d {

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f59166a;

        static {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < 10; i11++) {
                bArr[i11 + 48] = (byte) i11;
            }
            for (int i12 = 0; i12 < 26; i12++) {
                byte b11 = (byte) (i12 + 10);
                bArr[i12 + 65] = b11;
                bArr[i12 + 97] = b11;
            }
            f59166a = bArr;
        }

        static int a(char c11) {
            if (c11 < 128) {
                return f59166a[c11];
            }
            return -1;
        }
    }

    public static long[] a(long[]... jArr) {
        long j11 = 0;
        for (long[] jArr2 : jArr) {
            j11 += jArr2.length;
        }
        int i11 = (int) j11;
        k0.c(j11, "the total number of elements (%s) in the arrays must fit in an int", j11 == ((long) i11));
        long[] jArr3 = new long[i11];
        int i12 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i12, jArr4.length);
            i12 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static long c(long... jArr) {
        k0.e(jArr.length > 0);
        long j11 = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 > j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static Long d(String str) {
        str.getClass();
        if (str.isEmpty()) {
            return null;
        }
        int i11 = str.charAt(0) == '-' ? 1 : 0;
        if (i11 == str.length()) {
            return null;
        }
        int i12 = i11 + 1;
        int a11 = a.a(str.charAt(i11));
        if (a11 < 0 || a11 >= 10) {
            return null;
        }
        long j11 = -a11;
        long j12 = 10;
        long j13 = Long.MIN_VALUE / j12;
        while (i12 < str.length()) {
            int i13 = i12 + 1;
            int a12 = a.a(str.charAt(i12));
            if (a12 < 0 || a12 >= 10 || j11 < j13) {
                return null;
            }
            long j14 = j11 * j12;
            long j15 = a12;
            if (j14 < j15 - Long.MIN_VALUE) {
                return null;
            }
            j11 = j14 - j15;
            i12 = i13;
        }
        if (i11 != 0) {
            return Long.valueOf(j11);
        }
        if (j11 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j11);
    }
}
