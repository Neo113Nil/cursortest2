package net.time4j.history;

import com.plaid.internal.EnumC3631g;
import li.AbstractC5469c;

/* loaded from: classes5.dex */
public abstract class m {
    public static void a(int i10, int i11, int i12) {
        if (i10 < -999999999 || i10 > 999999999) {
            throw new IllegalArgumentException("YEAR out of range: " + i10);
        }
        if (i11 < 1 || i11 > 12) {
            throw new IllegalArgumentException("MONTH out of range: " + i11);
        }
        if (i12 < 1 || i12 > 31) {
            throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i12);
        }
        if (i12 <= b(i10, i11)) {
            return;
        }
        throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + i(i10, i11, i12));
    }

    public static int b(int i10, int i11) {
        switch (i11) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return c(i10) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i11);
        }
    }

    public static boolean c(int i10) {
        return AbstractC5469c.c(i10, 4) == 0;
    }

    public static int d(long j10) {
        return (int) (j10 & 255);
    }

    public static int e(long j10) {
        return (int) ((j10 >> 16) & 255);
    }

    public static int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static long g(int i10, int i11, int i12) {
        a(i10, i11, i12);
        long j10 = i10;
        if (i11 < 3) {
            j10--;
            i11 += 12;
        }
        return (((((365 * j10) + AbstractC5469c.b(j10, 4)) + (((i11 + 1) * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) / 5)) - 123) + i12) - 678883;
    }

    public static long h(long j10) {
        long j11;
        int i10;
        int i11;
        long f10 = AbstractC5469c.f(j10, 678883L);
        long b10 = AbstractC5469c.b(f10, 1461);
        int d10 = AbstractC5469c.d(f10, 1461);
        if (d10 == 1460) {
            j11 = (b10 + 1) * 4;
            i11 = 2;
            i10 = 29;
        } else {
            int i12 = d10 / 365;
            int i13 = d10 % 365;
            j11 = (b10 * 4) + i12;
            int i14 = ((i13 + 31) * 5) / EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
            int i15 = i14 + 2;
            int i16 = (i13 - (((i14 + 3) * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) / 5)) + 123;
            if (i15 > 12) {
                j11++;
                int i17 = i14 - 10;
                i10 = i16;
                i11 = i17;
            } else {
                i10 = i16;
                i11 = i15;
            }
        }
        if (j11 >= -999999999 && j11 <= 999999999) {
            return i10 | (j11 << 32) | (i11 << 16);
        }
        throw new IllegalArgumentException("Year out of range: " + j11);
    }

    public static String i(int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('-');
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
        sb2.append('-');
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        return sb2.toString();
    }

    public static boolean isValid(int i10, int i11, int i12) {
        return i10 >= -999999999 && i10 <= 999999999 && i11 >= 1 && i11 <= 12 && i12 >= 1 && i12 <= b(i10, i11);
    }
}
