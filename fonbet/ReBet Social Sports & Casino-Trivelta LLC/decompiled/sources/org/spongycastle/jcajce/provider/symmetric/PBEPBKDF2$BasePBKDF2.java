package org.spongycastle.jcajce.provider.symmetric;

import Ei.a;
import Li.f;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.spongycastle.jcajce.provider.symmetric.util.b;
import org.spongycastle.jcajce.spec.PBKDF2KeySpec;

/* loaded from: classes5.dex */
public class PBEPBKDF2$BasePBKDF2 extends BaseSecretKeyFactory {
    private int defaultDigest;
    private int scheme;

    public PBEPBKDF2$BasePBKDF2(String str, int i10) {
        this(str, i10, 1);
    }

    private int getDigestCode(C5936n c5936n) {
        if (c5936n.equals(a.f3111c)) {
            return 6;
        }
        if (c5936n.equals(f.f7242I0)) {
            return 1;
        }
        if (c5936n.equals(f.f7248K0)) {
            return 4;
        }
        if (c5936n.equals(f.f7245J0)) {
            return 7;
        }
        if (c5936n.equals(f.f7251L0)) {
            return 8;
        }
        if (c5936n.equals(f.f7254M0)) {
            return 9;
        }
        throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm " + c5936n);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            throw new InvalidKeySpecException("missing required salt");
        }
        if (pBEKeySpec.getIterationCount() <= 0) {
            throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
        }
        if (pBEKeySpec.getKeyLength() <= 0) {
            throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
        }
        if (pBEKeySpec.getPassword().length == 0) {
            throw new IllegalArgumentException("password empty");
        }
        if (pBEKeySpec instanceof PBKDF2KeySpec) {
            int digestCode = getDigestCode(((PBKDF2KeySpec) pBEKeySpec).getPrf().c());
            int keyLength = pBEKeySpec.getKeyLength();
            return new BCPBEKey(this.algName, this.algOid, this.scheme, digestCode, keyLength, -1, pBEKeySpec, b.d(pBEKeySpec, this.scheme, digestCode, keyLength));
        }
        int i10 = this.defaultDigest;
        int keyLength2 = pBEKeySpec.getKeyLength();
        return new BCPBEKey(this.algName, this.algOid, this.scheme, i10, keyLength2, -1, pBEKeySpec, b.d(pBEKeySpec, this.scheme, i10, keyLength2));
    }

    public PBEPBKDF2$BasePBKDF2(String str, int i10, int i11) {
        super(str, f.f7354z0);
        this.scheme = i10;
        this.defaultDigest = i11;
    }
}
