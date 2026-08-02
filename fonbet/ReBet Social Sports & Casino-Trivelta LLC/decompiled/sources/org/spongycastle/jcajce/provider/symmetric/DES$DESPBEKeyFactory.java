package org.spongycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.AbstractC5976c;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.spongycastle.jcajce.provider.symmetric.util.b;

/* loaded from: classes5.dex */
public class DES$DESPBEKeyFactory extends BaseSecretKeyFactory {
    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    public DES$DESPBEKeyFactory(String str, C5936n c5936n, boolean z10, int i10, int i11, int i12, int i13) {
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
        j f10 = this.forCipher ? b.f(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : b.d(pBEKeySpec, this.scheme, this.digest, this.keySize);
        AbstractC5976c.c((f10 instanceof z ? (w) ((z) f10).b() : (w) f10).a());
        return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, f10);
    }
}
