package li;

import com.plaid.internal.EnumC3631g;

/* renamed from: li.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5468b {
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
        if (i12 <= d(i10, i11)) {
            return;
        }
        throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + l(i10, i11, i12));
    }

    public static int b(int i10) {
        switch (i10) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException("Month out of range: " + i10);
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i12 < 1 || i12 > 31) {
            throw new IllegalArgumentException("Day out of range: " + i12);
        }
        if (i12 > d(i10, i11)) {
            throw new IllegalArgumentException("Day exceeds month length: " + l(i10, i11, i12));
        }
        int b10 = b(i11);
        int i13 = i10 % 100;
        int a10 = AbstractC5469c.a(i10, 100);
        if (i13 < 0) {
            i13 += 100;
        }
        if (i11 <= 2 && i13 - 1 < 0) {
            a10--;
            i13 = 99;
        }
        int a11 = (((((i12 + b10) + i13) + (i13 / 4)) + AbstractC5469c.a(a10, 4)) - (a10 * 2)) % 7;
        return a11 <= 0 ? a11 + 7 : a11;
    }

    public static int d(int i10, int i11) {
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
                return e(i10) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i11);
        }
    }

    public static boolean e(int i10) {
        return (i10 <= 1900 || i10 >= 2100) ? ((i10 & 3) == 0 && i10 % 100 != 0) || i10 % 400 == 0 : (i10 & 3) == 0;
    }

    public static int f(long j10) {
        return (int) (j10 & 255);
    }

    public static int g(long j10) {
        return (int) ((j10 >> 16) & 255);
    }

    public static int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static long i(int i10, int i11, int i12) {
        a(i10, i11, i12);
        long j10 = i10;
        if (i11 < 3) {
            j10--;
            i11 += 12;
        }
        return (((((((365 * j10) + AbstractC5469c.b(j10, 4)) - AbstractC5469c.b(j10, 100)) + AbstractC5469c.b(j10, 400)) + (((i11 + 1) * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) / 5)) - 123) + i12) - 678881;
    }

    public static boolean isValid(int i10, int i11, int i12) {
        return i10 >= -999999999 && i10 <= 999999999 && i11 >= 1 && i11 <= 12 && i12 >= 1 && i12 <= d(i10, i11);
    }

    public static long j(InterfaceC5467a interfaceC5467a) {
        return i(interfaceC5467a.n(), interfaceC5467a.o(), interfaceC5467a.p());
    }

    public static long k(long j10) {
        long j11;
        long f10 = AbstractC5469c.f(j10, 678881L);
        long b10 = AbstractC5469c.b(f10, 146097);
        int d10 = AbstractC5469c.d(f10, 146097);
        int i10 = 29;
        int i11 = 2;
        if (d10 == 146096) {
            j11 = (b10 + 1) * 400;
        } else {
            int i12 = d10 / 36524;
            int i13 = d10 % 36524;
            int i14 = i13 / 1461;
            int i15 = i13 % 1461;
            if (i15 == 1460) {
                j11 = (b10 * 400) + (i12 * 100) + ((i14 + 1) * 4);
            } else {
                int i16 = i15 / 365;
                int i17 = i15 % 365;
                j11 = (b10 * 400) + (i12 * 100) + (i14 * 4) + i16;
                int i18 = ((i17 + 31) * 5) / EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
                i11 = i18 + 2;
                i10 = (i17 - (((i18 + 3) * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) / 5)) + 123;
                if (i11 > 12) {
                    j11++;
                    i11 = i18 - 10;
                }
            }
        }
        if (j11 >= -999999999 && j11 <= 999999999) {
            return (j11 << 32) | (i11 << 16) | i10;
        }
        throw new IllegalArgumentException("Year out of range: " + j11);
    }

    public static String l(int i10, int i11, int i12) {
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
}
