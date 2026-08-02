package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes5.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f61426N;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f61427g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f61427g.modPow(SRP6Util.calculateX(this.digest, this.f61426N, bArr, bArr2, bArr3), this.f61426N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f61426N = bigInteger;
        this.f61427g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f61426N = sRP6GroupParameters.getN();
        this.f61427g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
