package org.spongycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public final class TLSKDF$TLS10 extends TLSKDF$TLSKeyMaterialFactory {
    public TLSKDF$TLS10() {
        super("TLS10KDF");
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}
