package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.C5936n;

/* loaded from: classes5.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory {
    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    public PBESecretKeyFactory(String str, C5936n c5936n, boolean z10, int i10, int i11, int i12, int i13) {
        super(str, c5936n);
        this.forCipher = z10;
        this.scheme = i10;
        this.digest = i11;
        this.keySize = i12;
        this.ivSize = i13;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
        }
        return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, this.forCipher ? b.f(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : b.d(pBEKeySpec, this.scheme, this.digest, this.keySize));
    }
}
