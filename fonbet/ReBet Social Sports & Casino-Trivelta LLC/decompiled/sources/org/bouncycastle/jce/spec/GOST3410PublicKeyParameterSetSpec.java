package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f61877a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61878p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f61879q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f61878p = bigInteger;
        this.f61879q = bigInteger2;
        this.f61877a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f61877a.equals(gOST3410PublicKeyParameterSetSpec.f61877a) && this.f61878p.equals(gOST3410PublicKeyParameterSetSpec.f61878p) && this.f61879q.equals(gOST3410PublicKeyParameterSetSpec.f61879q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f61877a;
    }

    public BigInteger getP() {
        return this.f61878p;
    }

    public BigInteger getQ() {
        return this.f61879q;
    }

    public int hashCode() {
        return (this.f61877a.hashCode() ^ this.f61878p.hashCode()) ^ this.f61879q.hashCode();
    }
}
