package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f62857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62858b;

    public p(BigInteger bigInteger, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f62857a = bigInteger;
        this.f62858b = i10;
    }

    public p a(p pVar) {
        c(pVar);
        return new p(this.f62857a.add(pVar.f62857a), this.f62858b);
    }

    public p b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        int i11 = this.f62858b;
        return i10 == i11 ? this : new p(this.f62857a.shiftLeft(i10 - i11), i10);
    }

    public final void c(p pVar) {
        if (this.f62858b != pVar.f62858b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public int d(BigInteger bigInteger) {
        return this.f62857a.compareTo(bigInteger.shiftLeft(this.f62858b));
    }

    public BigInteger e() {
        return this.f62857a.shiftRight(this.f62858b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f62857a.equals(pVar.f62857a) && this.f62858b == pVar.f62858b;
    }

    public int f() {
        return this.f62858b;
    }

    public p g() {
        return new p(this.f62857a.negate(), this.f62858b);
    }

    public BigInteger h() {
        return a(new p(c.f62725b, 1).b(this.f62858b)).e();
    }

    public int hashCode() {
        return this.f62857a.hashCode() ^ this.f62858b;
    }

    public p i(BigInteger bigInteger) {
        return new p(this.f62857a.subtract(bigInteger.shiftLeft(this.f62858b)), this.f62858b);
    }

    public p j(p pVar) {
        return a(pVar.g());
    }

    public String toString() {
        if (this.f62858b == 0) {
            return this.f62857a.toString();
        }
        BigInteger e10 = e();
        BigInteger subtract = this.f62857a.subtract(e10.shiftLeft(this.f62858b));
        if (this.f62857a.signum() == -1) {
            subtract = c.f62725b.shiftLeft(this.f62858b).subtract(subtract);
        }
        if (e10.signum() == -1 && !subtract.equals(c.f62724a)) {
            e10 = e10.add(c.f62725b);
        }
        String bigInteger = e10.toString();
        char[] cArr = new char[this.f62858b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i10 = this.f62858b - length;
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = '0';
        }
        for (int i12 = 0; i12 < length; i12++) {
            cArr[i10 + i12] = bigInteger2.charAt(i12);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
