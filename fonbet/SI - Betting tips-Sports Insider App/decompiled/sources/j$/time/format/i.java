package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class i implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f17406f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f17407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17409c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f17410d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17411e;

    public long a(y yVar, long j) {
        return j;
    }

    public i(j$.time.temporal.p pVar, int i5, int i10, f0 f0Var) {
        this.f17407a = pVar;
        this.f17408b = i5;
        this.f17409c = i10;
        this.f17410d = f0Var;
        this.f17411e = 0;
    }

    public i(j$.time.temporal.p pVar, int i5, int i10, f0 f0Var, int i11) {
        this.f17407a = pVar;
        this.f17408b = i5;
        this.f17409c = i10;
        this.f17410d = f0Var;
        this.f17411e = i11;
    }

    public i d() {
        if (this.f17411e == -1) {
            return this;
        }
        return new i(this.f17407a, this.f17408b, this.f17409c, this.f17410d, -1);
    }

    public i e(int i5) {
        return new i(this.f17407a, this.f17408b, this.f17409c, this.f17410d, this.f17411e + i5);
    }

    @Override // j$.time.format.e
    public boolean i(y yVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f17407a;
        Long a7 = yVar.a(pVar);
        if (a7 == null) {
            return false;
        }
        long a10 = a(yVar, a7.longValue());
        c0 c0Var = yVar.f17468b.f17370c;
        String l6 = a10 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a10));
        int length = l6.length();
        int i5 = this.f17409c;
        if (length > i5) {
            throw new j$.time.b("Field " + pVar + " cannot be printed as the value " + a10 + " exceeds the maximum print width of " + i5);
        }
        c0Var.getClass();
        int i10 = this.f17408b;
        f0 f0Var = this.f17410d;
        if (a10 >= 0) {
            int i11 = b.f17376a[f0Var.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && a10 >= f17406f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = b.f17376a[f0Var.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.b("Field " + pVar + " cannot be printed as the value " + a10 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - l6.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(l6);
        return true;
    }

    public boolean b(v vVar) {
        int i5 = this.f17411e;
        if (i5 != -1) {
            return i5 > 0 && this.f17408b == this.f17409c && this.f17410d == f0.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r5 = r12;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int j(v vVar, CharSequence charSequence, int i5) {
        int i10;
        boolean z5;
        boolean z7;
        BigInteger bigInteger;
        boolean z10;
        boolean z11;
        int i11;
        long j;
        DateTimeFormatter dateTimeFormatter;
        boolean z12;
        int length = charSequence.length();
        if (i5 == length) {
            return ~i5;
        }
        char charAt = charSequence.charAt(i5);
        DateTimeFormatter dateTimeFormatter2 = vVar.f17458a;
        dateTimeFormatter2.f17370c.getClass();
        int i12 = this.f17409c;
        f0 f0Var = this.f17410d;
        int i13 = this.f17408b;
        int i14 = 0;
        boolean z13 = true;
        if (charAt == '+') {
            boolean z14 = vVar.f17460c;
            boolean z15 = i13 == i12;
            int ordinal = f0Var.ordinal();
            if (ordinal == 0 ? z14 : !(ordinal == 1 || ordinal == 4 || (!z14 && !z15))) {
                return ~i5;
            }
            i10 = i5 + 1;
            z5 = false;
            z7 = true;
        } else {
            dateTimeFormatter2.f17370c.getClass();
            if (charAt == '-') {
                boolean z16 = vVar.f17460c;
                boolean z17 = i13 == i12;
                int ordinal2 = f0Var.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 4 && (z16 || z17)) {
                    return ~i5;
                }
                i10 = i5 + 1;
                z7 = false;
                z5 = true;
            } else {
                if (f0Var == f0.ALWAYS && vVar.f17460c) {
                    return ~i5;
                }
                i10 = i5;
                z5 = false;
                z7 = false;
            }
        }
        int i15 = (vVar.f17460c || b(vVar)) ? i13 : 1;
        int i16 = i10 + i15;
        if (i16 > length) {
            return ~i10;
        }
        if (!vVar.f17460c && !b(vVar)) {
            i12 = 9;
        }
        int i17 = this.f17411e;
        int max = Math.max(i17, 0) + i12;
        while (true) {
            bigInteger = null;
            if (i14 >= 2) {
                z10 = z5;
                z11 = z7;
                i11 = i10;
                j = 0;
                break;
            }
            int min = Math.min(i10 + max, length);
            boolean z18 = z13;
            long j6 = 0;
            int i18 = i10;
            while (true) {
                if (i18 >= min) {
                    z10 = z5;
                    break;
                }
                int i19 = i18 + 1;
                char charAt2 = charSequence.charAt(i18);
                dateTimeFormatter2.f17370c.getClass();
                int i20 = charAt2 - '0';
                z10 = z5;
                if (i20 < 0 || i20 > 9) {
                    i20 = -1;
                }
                if (i20 >= 0) {
                    if (i19 - i10 > 18) {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j6);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z12 = z7;
                        bigInteger = bigInteger.multiply(BigInteger.TEN).add(BigInteger.valueOf(i20));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z12 = z7;
                        j6 = (j6 * 10) + i20;
                    }
                    i18 = i19;
                    z5 = z10;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z7 = z12;
                } else if (i18 < i16) {
                    return ~i10;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z11 = z7;
            if (i17 <= 0 || i14 != 0) {
                break;
            }
            int max2 = Math.max(i15, (i18 - i10) - i17);
            i14++;
            z13 = z18;
            z5 = z10;
            dateTimeFormatter2 = dateTimeFormatter3;
            z7 = z11;
            max = max2;
        }
        BigInteger bigInteger2 = bigInteger;
        if (z10) {
            if (bigInteger2 == null) {
                if (j != 0 || !vVar.f17460c) {
                    j = -j;
                    if (bigInteger2 == null) {
                    }
                }
                return ~(i10 - 1);
            }
            if (!bigInteger2.equals(BigInteger.ZERO) || !vVar.f17460c) {
                bigInteger2 = bigInteger2.negate();
                if (bigInteger2 == null) {
                    return c(vVar, j, i10, i11);
                }
                if (bigInteger2.bitLength() > 63) {
                    bigInteger2 = bigInteger2.divide(BigInteger.TEN);
                    i11--;
                }
                return c(vVar, bigInteger2.longValue(), i10, i11);
            }
            return ~(i10 - 1);
        }
        if (f0Var == f0.EXCEEDS_PAD && vVar.f17460c) {
            int i21 = i11 - i10;
            if (!z11) {
                if (i21 > i13) {
                    return ~i10;
                }
            }
        }
        if (bigInteger2 == null) {
        }
    }

    public int c(v vVar, long j, int i5, int i10) {
        return vVar.f(this.f17407a, j, i5, i10);
    }

    public String toString() {
        int i5 = this.f17409c;
        j$.time.temporal.p pVar = this.f17407a;
        f0 f0Var = this.f17410d;
        int i10 = this.f17408b;
        if (i10 == 1 && i5 == 19 && f0Var == f0.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i10 == i5 && f0Var == f0.NOT_NEGATIVE) {
            return "Value(" + pVar + StringUtils.COMMA + i10 + ")";
        }
        return "Value(" + pVar + StringUtils.COMMA + i10 + StringUtils.COMMA + i5 + StringUtils.COMMA + f0Var + ")";
    }
}
