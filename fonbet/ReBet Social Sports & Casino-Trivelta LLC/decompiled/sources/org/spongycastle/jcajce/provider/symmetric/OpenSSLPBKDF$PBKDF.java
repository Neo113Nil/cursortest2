package org.spongycastle.jcajce.provider.symmetric;

import Aj.h;
import Xi.i;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.params.w;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* loaded from: classes5.dex */
public class OpenSSLPBKDF$PBKDF extends BaseSecretKeyFactory {
    public OpenSSLPBKDF$PBKDF() {
        super("PBKDF-OpenSSL", null);
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
        i iVar = new i();
        iVar.i(h.f(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
        return new SecretKeySpec(((w) iVar.e(pBEKeySpec.getKeyLength())).a(), "OpenSSLPBKDF");
    }
}
