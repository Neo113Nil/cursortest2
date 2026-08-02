package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f61873a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61874p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f61875q;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f61876x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f61876x = bigInteger;
        this.f61874p = bigInteger2;
        this.f61875q = bigInteger3;
        this.f61873a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f61873a;
    }

    public BigInteger getP() {
        return this.f61874p;
    }

    public BigInteger getQ() {
        return this.f61875q;
    }

    public BigInteger getX() {
        return this.f61876x;
    }
}
