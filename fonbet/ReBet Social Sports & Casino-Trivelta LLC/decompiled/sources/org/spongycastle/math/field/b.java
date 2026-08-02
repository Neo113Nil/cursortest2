package org.spongycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62867a = new g(BigInteger.valueOf(2));

    /* renamed from: b, reason: collision with root package name */
    public static final a f62868b = new g(BigInteger.valueOf(3));

    public static f a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10] <= iArr[i10 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new d(f62867a, new c(iArr));
    }

    public static a b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f62867a;
            }
            if (intValue == 3) {
                return f62868b;
            }
        }
        return new g(bigInteger);
    }
}
