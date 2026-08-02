package wj;

import java.math.BigInteger;

/* renamed from: wj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6758a {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f67772a = BigInteger.valueOf(0);

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f67773b = BigInteger.valueOf(1);

    public static byte[] a(int i10, int i11, zj.d dVar) {
        if (dVar.a() != i10 || dVar.d() != i11) {
            throw new IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int[] e10 = dVar.e();
        BigInteger a10 = zj.g.a(i10, i11);
        BigInteger bigInteger = f67772a;
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            a10 = a10.multiply(BigInteger.valueOf(i12 - i11)).divide(BigInteger.valueOf(i12));
            i12--;
            if ((e10[i13 >> 5] & (1 << (i13 & 31))) != 0) {
                bigInteger = bigInteger.add(a10);
                int i14 = i11 - 1;
                a10 = i12 == i14 ? f67773b : a10.multiply(BigInteger.valueOf(i11)).divide(BigInteger.valueOf(i12 - i14));
                i11 = i14;
            }
        }
        return zj.a.a(bigInteger);
    }

    public static zj.d b(int i10, int i11, byte[] bArr) {
        if (i10 < i11) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger a10 = zj.g.a(i10, i11);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(a10) >= 0) {
            throw new IllegalArgumentException("Encoded number too large.");
        }
        zj.d dVar = new zj.d(i10);
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            a10 = a10.multiply(BigInteger.valueOf(i12 - i11)).divide(BigInteger.valueOf(i12));
            i12--;
            if (a10.compareTo(bigInteger) <= 0) {
                dVar.f(i13);
                bigInteger = bigInteger.subtract(a10);
                int i14 = i11 - 1;
                a10 = i12 == i14 ? f67773b : a10.multiply(BigInteger.valueOf(i11)).divide(BigInteger.valueOf(i12 - i14));
                i11 = i14;
            }
        }
        return dVar;
    }
}
