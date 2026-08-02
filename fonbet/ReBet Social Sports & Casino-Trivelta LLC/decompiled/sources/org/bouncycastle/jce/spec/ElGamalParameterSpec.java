package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f61869g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61870p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f61870p = bigInteger;
        this.f61869g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f61869g;
    }

    public BigInteger getP() {
        return this.f61870p;
    }
}
