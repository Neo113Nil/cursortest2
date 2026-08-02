package zj;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f69225a = BigInteger.valueOf(0);

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f69226b = BigInteger.valueOf(1);

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f69227c = BigInteger.valueOf(2);

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f69228d = BigInteger.valueOf(4);
    private static final int[] SMALL_PRIMES = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: e, reason: collision with root package name */
    public static SecureRandom f69229e = null;
    private static final int[] jacobiTable = {0, 1, 0, -1, 0, -1, 0, 1};

    public static BigInteger a(int i10, int i11) {
        BigInteger bigInteger = f69226b;
        if (i10 == 0) {
            return i11 == 0 ? bigInteger : f69225a;
        }
        if (i11 > (i10 >>> 1)) {
            i11 = i10 - i11;
        }
        for (int i12 = 1; i12 <= i11; i12++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i10 - (i12 - 1))).divide(BigInteger.valueOf(i12));
        }
        return bigInteger;
    }
}
