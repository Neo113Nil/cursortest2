package org.spongycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import kj.AbstractC5264c;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class TLSKDF$TLS12 extends TLSKDF$TLSKeyMaterialFactory {
    private final v prf;

    public TLSKDF$TLS12(String str, v vVar) {
        super(str);
        this.prf = vVar;
    }

    private byte[] PRF(AbstractC5264c abstractC5264c, v vVar) {
        throw null;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}
