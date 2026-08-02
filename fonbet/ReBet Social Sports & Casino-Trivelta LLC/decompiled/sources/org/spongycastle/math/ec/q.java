package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.d;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f62859a;
    public static final w[] alpha0;
    public static final w[] alpha1;

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f62860b;

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f62861c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[][] f62862d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[][] f62863e;

    static {
        BigInteger bigInteger = c.f62725b;
        BigInteger negate = bigInteger.negate();
        f62859a = negate;
        f62860b = c.f62726c.negate();
        BigInteger negate2 = c.f62727d.negate();
        f62861c = negate2;
        BigInteger bigInteger2 = c.f62724a;
        alpha0 = new w[]{null, new w(bigInteger, bigInteger2), null, new w(negate2, negate), null, new w(negate, negate), null, new w(bigInteger, negate), null};
        f62862d = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new w[]{null, new w(bigInteger, bigInteger2), null, new w(negate2, bigInteger), null, new w(negate, bigInteger), null, new w(bigInteger, bigInteger), null};
        f62863e = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static p a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, int i10, int i11) {
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i10 - r0) - 2) + b10));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i10)));
        int i12 = (((i10 + 5) / 2) + i11) - i11;
        BigInteger shiftRight = add.shiftRight(i12);
        if (add.testBit(i12 - 1)) {
            shiftRight = shiftRight.add(c.f62725b);
        }
        return new p(shiftRight, i11);
    }

    public static BigInteger[] b(byte b10, int i10, boolean z10) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z10) {
            bigInteger = c.f62726c;
            bigInteger2 = BigInteger.valueOf(b10);
        } else {
            bigInteger = c.f62724a;
            bigInteger2 = c.f62725b;
        }
        int i11 = 1;
        while (i11 < i10) {
            i11++;
            BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = (b10 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger, bigInteger2};
    }

    public static byte c(int i10) {
        return (byte) (i10 == 0 ? -1 : 1);
    }

    public static g.a[] d(g.a aVar, byte b10) {
        byte[][] bArr = b10 == 0 ? f62862d : f62863e;
        g.a[] aVarArr = new g.a[(bArr.length + 1) >>> 1];
        aVarArr[0] = aVar;
        int length = bArr.length;
        for (int i10 = 3; i10 < length; i10 += 2) {
            aVarArr[i10 >>> 1] = h(aVar, bArr[i10]);
        }
        aVar.h().z(aVarArr);
        return aVarArr;
    }

    public static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(c.f62726c)) {
                return 1;
            }
            if (bigInteger.equals(c.f62728e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(d.a aVar) {
        if (!aVar.H()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int t10 = aVar.t();
        int intValue = aVar.n().t().intValue();
        byte c10 = c(intValue);
        int e10 = e(aVar.p());
        BigInteger[] b10 = b(c10, (t10 + 3) - intValue, false);
        if (c10 == 1) {
            b10[0] = b10[0].negate();
            b10[1] = b10[1].negate();
        }
        BigInteger bigInteger = c.f62725b;
        return new BigInteger[]{bigInteger.add(b10[1]).shiftRight(e10), bigInteger.add(b10[0]).shiftRight(e10).negate()};
    }

    public static BigInteger g(byte b10, int i10) {
        if (i10 == 4) {
            return b10 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] b11 = b(b10, i10, false);
        BigInteger bit = c.f62724a.setBit(i10);
        return c.f62726c.multiply(b11[0]).multiply(b11[1].modInverse(bit)).mod(bit);
    }

    public static g.a h(g.a aVar, byte[] bArr) {
        g.a aVar2 = (g.a) aVar.h().u();
        g.a aVar3 = (g.a) aVar.u();
        int i10 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i10++;
            byte b10 = bArr[length];
            if (b10 != 0) {
                aVar2 = (g.a) aVar2.F(i10).a(b10 > 0 ? aVar : aVar3);
                i10 = 0;
            }
        }
        return i10 > 0 ? aVar2.F(i10) : aVar2;
    }

    public static BigInteger i(byte b10, w wVar) {
        BigInteger bigInteger = wVar.f62865a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = wVar.f62865a.multiply(wVar.f62866b);
        BigInteger bigInteger2 = wVar.f62866b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b10 == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b10 == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static w j(BigInteger bigInteger, int i10, byte b10, BigInteger[] bigIntegerArr, byte b11, byte b12) {
        BigInteger add = b11 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = b(b11, i10, true)[1];
        w k10 = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b10, i10, b12), a(bigInteger, bigIntegerArr[1], bigInteger2, b10, i10, b12), b11);
        return new w(bigInteger.subtract(add.multiply(k10.f62865a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(k10.f62866b)), bigIntegerArr[1].multiply(k10.f62865a).subtract(bigIntegerArr[0].multiply(k10.f62866b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r5.d(org.spongycastle.math.ec.q.f62859a) < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r5.d(r9) >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r8.d(org.spongycastle.math.ec.q.f62860b) < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w k(p pVar, p pVar2, byte b10) {
        p a10;
        p j10;
        if (pVar2.f() != pVar.f()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i10 = -1;
        int i11 = 1;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger h10 = pVar.h();
        BigInteger h11 = pVar2.h();
        p i12 = pVar.i(h10);
        p i13 = pVar2.i(h11);
        p a11 = i12.a(i12);
        p a12 = b10 == 1 ? a11.a(i13) : a11.j(i13);
        p a13 = i13.a(i13).a(i13);
        p a14 = a13.a(i13);
        if (b10 == 1) {
            a10 = i12.j(a13);
            j10 = i12.a(a14);
        } else {
            a10 = i12.a(a13);
            j10 = i12.j(a14);
        }
        BigInteger bigInteger = c.f62725b;
        byte b11 = 0;
        if (a12.d(bigInteger) < 0) {
            if (j10.d(c.f62726c) < 0) {
                i11 = 0;
            }
            i11 = 0;
            b11 = b10;
        }
        if (a12.d(f62859a) < 0) {
        }
        b11 = (byte) (-b10);
        i10 = i11;
        return new w(h10.add(BigInteger.valueOf(i10)), h11.add(BigInteger.valueOf(b11)));
    }

    public static byte[] l(byte b10, w wVar, byte b11, BigInteger bigInteger, BigInteger bigInteger2, w[] wVarArr) {
        boolean z10;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = i(b10, wVar).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b11 : b11 + 34];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = wVar.f62865a;
        BigInteger bigInteger4 = wVar.f62866b;
        int i10 = 0;
        while (true) {
            BigInteger bigInteger5 = c.f62724a;
            if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                byte intValue = (byte) (mod.compareTo(shiftRight) >= 0 ? mod.subtract(bigInteger).intValue() : mod.intValue());
                bArr[i10] = intValue;
                if (intValue < 0) {
                    intValue = (byte) (-intValue);
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    bigInteger3 = bigInteger3.subtract(wVarArr[intValue].f62865a);
                    bigInteger4 = bigInteger4.subtract(wVarArr[intValue].f62866b);
                } else {
                    bigInteger3 = bigInteger3.add(wVarArr[intValue].f62865a);
                    bigInteger4 = bigInteger4.add(wVarArr[intValue].f62866b);
                }
            } else {
                bArr[i10] = 0;
            }
            BigInteger add = b10 == 1 ? bigInteger4.add(bigInteger3.shiftRight(1)) : bigInteger4.subtract(bigInteger3.shiftRight(1));
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i10++;
            bigInteger3 = add;
            bigInteger4 = negate;
        }
    }
}
