package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes5.dex */
public class SRP6Client {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f61406A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f61407B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f61408M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f61409M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f61410N;

    /* renamed from: S, reason: collision with root package name */
    protected BigInteger f61411S;

    /* renamed from: a, reason: collision with root package name */
    protected BigInteger f61412a;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f61413g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f61414u;

    /* renamed from: x, reason: collision with root package name */
    protected BigInteger f61415x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f61410N, this.f61413g);
        return this.f61407B.subtract(this.f61413g.modPow(this.f61415x, this.f61410N).multiply(calculateK).mod(this.f61410N)).mod(this.f61410N).modPow(this.f61414u.multiply(this.f61415x).add(this.f61412a), this.f61410N);
    }

    public BigInteger calculateClientEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f61406A;
        if (bigInteger3 == null || (bigInteger = this.f61407B) == null || (bigInteger2 = this.f61411S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f61410N, bigInteger3, bigInteger, bigInteger2);
        this.f61408M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f61410N, bigInteger);
        this.f61407B = validatePublicValue;
        this.f61414u = SRP6Util.calculateU(this.digest, this.f61410N, this.f61406A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.f61411S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.f61411S;
        if (bigInteger == null || this.f61408M1 == null || this.f61409M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f61410N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f61415x = SRP6Util.calculateX(this.digest, this.f61410N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f61412a = selectPrivateValue;
        BigInteger modPow = this.f61413g.modPow(selectPrivateValue, this.f61410N);
        this.f61406A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f61410N = bigInteger;
        this.f61413g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f61410N, this.f61413g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f61406A;
        if (bigInteger4 == null || (bigInteger2 = this.f61408M1) == null || (bigInteger3 = this.f61411S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f61410N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f61409M2 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}
