package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes5.dex */
public class SRP6Server {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f61416A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f61417B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f61418M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f61419M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f61420N;

    /* renamed from: S, reason: collision with root package name */
    protected BigInteger f61421S;

    /* renamed from: b, reason: collision with root package name */
    protected BigInteger f61422b;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f61423g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f61424u;

    /* renamed from: v, reason: collision with root package name */
    protected BigInteger f61425v;

    private BigInteger calculateS() {
        return this.f61425v.modPow(this.f61424u, this.f61420N).multiply(this.f61416A).mod(this.f61420N).modPow(this.f61422b, this.f61420N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f61420N, bigInteger);
        this.f61416A = validatePublicValue;
        this.f61424u = SRP6Util.calculateU(this.digest, this.f61420N, validatePublicValue, this.f61417B);
        BigInteger calculateS = calculateS();
        this.f61421S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f61416A;
        if (bigInteger3 == null || (bigInteger = this.f61418M1) == null || (bigInteger2 = this.f61421S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f61420N, bigInteger3, bigInteger, bigInteger2);
        this.f61419M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.f61421S;
        if (bigInteger == null || this.f61418M1 == null || this.f61419M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f61420N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f61420N, this.f61423g);
        this.f61422b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f61425v).mod(this.f61420N).add(this.f61423g.modPow(this.f61422b, this.f61420N)).mod(this.f61420N);
        this.f61417B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f61420N = bigInteger;
        this.f61423g = bigInteger2;
        this.f61425v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f61420N, this.f61423g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f61416A;
        if (bigInteger4 == null || (bigInteger2 = this.f61417B) == null || (bigInteger3 = this.f61421S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f61420N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f61418M1 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}
