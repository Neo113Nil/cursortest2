package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c, reason: collision with root package name */
    private BigInteger f61763c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f61764d;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f61765h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f61763c = bigInteger;
        this.f61764d = bigInteger2;
        this.f61765h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f61763c) && cramerShoupPublicKeyParameters.getD().equals(this.f61764d) && cramerShoupPublicKeyParameters.getH().equals(this.f61765h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f61763c;
    }

    public BigInteger getD() {
        return this.f61764d;
    }

    public BigInteger getH() {
        return this.f61765h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f61763c.hashCode() ^ this.f61764d.hashCode()) ^ this.f61765h.hashCode()) ^ super.hashCode();
    }
}
