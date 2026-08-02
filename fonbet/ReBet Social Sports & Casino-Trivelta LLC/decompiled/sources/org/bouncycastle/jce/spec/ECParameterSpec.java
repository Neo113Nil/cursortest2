package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes5.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G, reason: collision with root package name */
    private ECPoint f61864G;
    private ECCurve curve;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f61865h;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f61866n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f61864G = eCPoint.normalize();
        this.f61866n = bigInteger;
        this.f61865h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f61864G;
    }

    public BigInteger getH() {
        return this.f61865h;
    }

    public BigInteger getN() {
        return this.f61866n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f61864G = eCPoint.normalize();
        this.f61866n = bigInteger;
        this.f61865h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f61864G = eCPoint.normalize();
        this.f61866n = bigInteger;
        this.f61865h = bigInteger2;
        this.seed = bArr;
    }
}
