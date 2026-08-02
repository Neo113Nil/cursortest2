package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {
    private CramerShoupPublicKeyParameters pk;

    /* renamed from: x1, reason: collision with root package name */
    private BigInteger f61758x1;

    /* renamed from: x2, reason: collision with root package name */
    private BigInteger f61759x2;

    /* renamed from: y1, reason: collision with root package name */
    private BigInteger f61760y1;

    /* renamed from: y2, reason: collision with root package name */
    private BigInteger f61761y2;

    /* renamed from: z, reason: collision with root package name */
    private BigInteger f61762z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f61758x1 = bigInteger;
        this.f61759x2 = bigInteger2;
        this.f61760y1 = bigInteger3;
        this.f61761y2 = bigInteger4;
        this.f61762z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f61758x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f61759x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f61760y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f61761y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f61762z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.pk;
    }

    public BigInteger getX1() {
        return this.f61758x1;
    }

    public BigInteger getX2() {
        return this.f61759x2;
    }

    public BigInteger getY1() {
        return this.f61760y1;
    }

    public BigInteger getY2() {
        return this.f61761y2;
    }

    public BigInteger getZ() {
        return this.f61762z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f61758x1.hashCode() ^ this.f61759x2.hashCode()) ^ this.f61760y1.hashCode()) ^ this.f61761y2.hashCode()) ^ this.f61762z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.pk = cramerShoupPublicKeyParameters;
    }
}
