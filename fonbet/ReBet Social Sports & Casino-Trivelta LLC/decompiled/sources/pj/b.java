package pj;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class b {
    public static int a(int i10) {
        int i11 = 0;
        while ((i10 & 1) == 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static void b(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        if (i10 < 0) {
            m.a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static int c(int[] iArr, int[] iArr2, int i10, int[] iArr3, int i11) {
        int i12;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            i12 = iArr2[0];
            if (i12 != 0) {
                break;
            }
            m.B(i10, iArr2, 0);
            i13 += 32;
        }
        int a10 = a(i12);
        if (a10 > 0) {
            m.z(i10, iArr2, a10, 0);
            i13 += a10;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if ((iArr3[0] & 1) != 0) {
                i11 += i11 < 0 ? m.e(length, iArr, iArr3) : m.M(length, iArr, iArr3);
            }
            m.y(length, iArr3, i11);
        }
        return i11;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (m.v(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int i10 = 0;
        if (m.u(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] h10 = m.h(length, iArr2);
        int[] i11 = m.i(length);
        i11[0] = 1;
        int c10 = (1 & h10[0]) == 0 ? c(iArr, h10, length, i11, 0) : 0;
        if (m.u(length, h10)) {
            b(iArr, c10, i11, iArr3);
            return;
        }
        int[] h11 = m.h(length, iArr);
        int[] i12 = m.i(length);
        int i13 = length;
        while (true) {
            int i14 = i13 - 1;
            if (h10[i14] == 0 && h11[i14] == 0) {
                i13--;
            } else if (m.p(i13, h10, h11)) {
                m.M(i13, h11, h10);
                c10 = c(iArr, h10, i13, i11, c10 + (m.M(length, i12, i11) - i10));
                if (m.u(i13, h10)) {
                    b(iArr, c10, i11, iArr3);
                    return;
                }
            } else {
                m.M(i13, h10, h11);
                i10 = c(iArr, h11, i13, i12, i10 + (m.M(length, i11, i12) - c10));
                if (m.u(i13, h11)) {
                    b(iArr, i10, i12, iArr3);
                    return;
                }
            }
        }
    }

    public static int[] e(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] i10 = m.i(length);
        int i11 = length - 1;
        int i12 = iArr[i11];
        int i13 = i12 | (i12 >>> 1);
        int i14 = i13 | (i13 >>> 2);
        int i15 = i14 | (i14 >>> 4);
        int i16 = i15 | (i15 >>> 8);
        int i17 = i16 | (i16 >>> 16);
        do {
            for (int i18 = 0; i18 != length; i18++) {
                i10[i18] = random.nextInt();
            }
            i10[i11] = i10[i11] & i17;
        } while (m.p(length, i10, iArr));
        return i10;
    }
}
