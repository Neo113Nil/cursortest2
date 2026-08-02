package org.spongycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* loaded from: classes5.dex */
public class DESede$KeyFactory extends BaseSecretKeyFactory {
    public DESede$KeyFactory() {
        super("DESede", null);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        byte[] encoded = secretKey.getEncoded();
        try {
            if (encoded.length != 16) {
                return new DESedeKeySpec(encoded);
            }
            byte[] bArr = new byte[24];
            System.arraycopy(encoded, 0, bArr, 0, 16);
            System.arraycopy(encoded, 0, bArr, 16, 8);
            return new DESedeKeySpec(bArr);
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }
}
