package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes5.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f61791a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61792p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f61793q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f61792p = bigInteger;
        this.f61793q = bigInteger2;
        this.f61791a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f61792p) && gOST3410Parameters.getQ().equals(this.f61793q) && gOST3410Parameters.getA().equals(this.f61791a);
    }

    public BigInteger getA() {
        return this.f61791a;
    }

    public BigInteger getP() {
        return this.f61792p;
    }

    public BigInteger getQ() {
        return this.f61793q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f61792p.hashCode() ^ this.f61793q.hashCode()) ^ this.f61791a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f61791a = bigInteger3;
        this.f61792p = bigInteger;
        this.f61793q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
