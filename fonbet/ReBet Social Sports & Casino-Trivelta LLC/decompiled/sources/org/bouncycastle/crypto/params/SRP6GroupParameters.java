package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class SRP6GroupParameters {

    /* renamed from: N, reason: collision with root package name */
    private BigInteger f61810N;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f61811g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f61810N = bigInteger;
        this.f61811g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f61811g;
    }

    public BigInteger getN() {
        return this.f61810N;
    }
}
