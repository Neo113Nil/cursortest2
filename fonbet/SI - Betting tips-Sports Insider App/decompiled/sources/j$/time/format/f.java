package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class f extends i {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17393g;

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        return vVar.f17460c && this.f17408b == this.f17409c && !this.f17393g;
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        boolean z5 = vVar.f17460c;
        DateTimeFormatter dateTimeFormatter = vVar.f17458a;
        int i10 = (z5 || b(vVar)) ? this.f17408b : 0;
        int i11 = (vVar.f17460c || b(vVar)) ? this.f17409c : 9;
        int length = charSequence.length();
        if (i5 != length) {
            if (this.f17393g) {
                char charAt = charSequence.charAt(i5);
                dateTimeFormatter.f17370c.getClass();
                if (charAt == '.') {
                    i5++;
                } else if (i10 > 0) {
                    return ~i5;
                }
            }
            int i12 = i5;
            int i13 = i10 + i12;
            if (i13 > length) {
                return ~i12;
            }
            int min = Math.min(i11 + i12, length);
            int i14 = 0;
            int i15 = i12;
            while (true) {
                if (i15 >= min) {
                    break;
                }
                int i16 = i15 + 1;
                char charAt2 = charSequence.charAt(i15);
                dateTimeFormatter.f17370c.getClass();
                int i17 = charAt2 - '0';
                if (i17 < 0 || i17 > 9) {
                    i17 = -1;
                }
                if (i17 >= 0) {
                    i14 = (i14 * 10) + i17;
                    i15 = i16;
                } else if (i16 < i13) {
                    return ~i12;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i14).movePointLeft(i15 - i12);
            j$.time.temporal.s n9 = this.f17407a.n();
            BigDecimal valueOf = BigDecimal.valueOf(n9.f17537a);
            return vVar.f(this.f17407a, movePointLeft.multiply(BigDecimal.valueOf(n9.f17540d).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i12, i15);
        }
        if (i10 > 0) {
            return ~i5;
        }
        return i5;
    }

    public f(j$.time.temporal.p pVar, int i5, int i10, boolean z5) {
        this(pVar, i5, i10, z5, 0);
        Objects.requireNonNull(pVar, "field");
        j$.time.temporal.s n9 = pVar.n();
        if (n9.f17537a != n9.f17538b || n9.f17539c != n9.f17540d) {
            throw new IllegalArgumentException(j$.time.c.a("Field must have a fixed set of values: ", pVar));
        }
        if (i5 < 0 || i5 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i5);
        }
        if (i10 < 1 || i10 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i10);
        }
        if (i10 >= i5) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i10 + " < " + i5);
    }

    public f(j$.time.temporal.p pVar, int i5, int i10, boolean z5, int i11) {
        super(pVar, i5, i10, f0.NOT_NEGATIVE, i11);
        this.f17393g = z5;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17411e == -1) {
            return this;
        }
        return new f(this.f17407a, this.f17408b, this.f17409c, this.f17393g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i5) {
        return new f(this.f17407a, this.f17408b, this.f17409c, this.f17393g, this.f17411e + i5);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f17407a;
        Long a7 = yVar.a(pVar);
        if (a7 == null) {
            return false;
        }
        c0 c0Var = yVar.f17468b.f17370c;
        long longValue = a7.longValue();
        j$.time.temporal.s n9 = pVar.n();
        n9.b(longValue, pVar);
        BigDecimal valueOf = BigDecimal.valueOf(n9.f17537a);
        BigDecimal add = BigDecimal.valueOf(n9.f17540d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z5 = this.f17393g;
        int i5 = this.f17408b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i5), this.f17409c), roundingMode).toPlainString().substring(2);
            c0Var.getClass();
            if (z5) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        }
        if (i5 > 0) {
            if (z5) {
                c0Var.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < i5; i10++) {
                c0Var.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f17407a + StringUtils.COMMA + this.f17408b + StringUtils.COMMA + this.f17409c + (this.f17393g ? ",DecimalPoint" : "") + ")";
    }
}
