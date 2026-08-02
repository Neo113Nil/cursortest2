package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes5.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H, reason: collision with root package name */
    private Digest f61754H;

    /* renamed from: g1, reason: collision with root package name */
    private BigInteger f61755g1;

    /* renamed from: g2, reason: collision with root package name */
    private BigInteger f61756g2;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f61757p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f61757p = bigInteger;
        this.f61755g1 = bigInteger2;
        this.f61756g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f61754H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f61757p) && cramerShoupParameters.getG1().equals(this.f61755g1) && cramerShoupParameters.getG2().equals(this.f61756g2);
    }

    public BigInteger getG1() {
        return this.f61755g1;
    }

    public BigInteger getG2() {
        return this.f61756g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f61754H).copy();
    }

    public BigInteger getP() {
        return this.f61757p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
