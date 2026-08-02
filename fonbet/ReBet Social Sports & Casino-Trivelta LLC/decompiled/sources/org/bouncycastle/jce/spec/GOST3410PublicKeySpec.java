package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f61880a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61881p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f61882q;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f61883y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f61883y = bigInteger;
        this.f61881p = bigInteger2;
        this.f61882q = bigInteger3;
        this.f61880a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f61880a;
    }

    public BigInteger getP() {
        return this.f61881p;
    }

    public BigInteger getQ() {
        return this.f61882q;
    }

    public BigInteger getY() {
        return this.f61883y;
    }
}
