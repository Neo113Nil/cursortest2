package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class E extends AbstractC5975b {

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f62635d = BigInteger.valueOf(1);

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f62636b;

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62637c;

    public E(boolean z10, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z10);
        if (!z10 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        this.f62636b = d(bigInteger);
        this.f62637c = bigInteger2;
    }

    public BigInteger b() {
        return this.f62637c;
    }

    public BigInteger c() {
        return this.f62636b;
    }

    public final BigInteger d(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(f62635d)) {
            return bigInteger;
        }
        throw new IllegalArgumentException("RSA modulus has a small prime factor");
    }
}
