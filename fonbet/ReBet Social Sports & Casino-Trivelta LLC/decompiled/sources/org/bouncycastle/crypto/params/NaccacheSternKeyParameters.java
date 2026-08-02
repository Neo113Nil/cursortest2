package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f61804g;
    int lowerSigmaBound;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f61805n;

    public NaccacheSternKeyParameters(boolean z10, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        super(z10);
        this.f61804g = bigInteger;
        this.f61805n = bigInteger2;
        this.lowerSigmaBound = i10;
    }

    public BigInteger getG() {
        return this.f61804g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f61805n;
    }
}
