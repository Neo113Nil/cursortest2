package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes5.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f61786g;

    /* renamed from: l, reason: collision with root package name */
    private int f61787l;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61788p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f61788p) && elGamalParameters.getG().equals(this.f61786g) && elGamalParameters.getL() == this.f61787l;
    }

    public BigInteger getG() {
        return this.f61786g;
    }

    public int getL() {
        return this.f61787l;
    }

    public BigInteger getP() {
        return this.f61788p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f61787l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f61786g = bigInteger2;
        this.f61788p = bigInteger;
        this.f61787l = i10;
    }
}
