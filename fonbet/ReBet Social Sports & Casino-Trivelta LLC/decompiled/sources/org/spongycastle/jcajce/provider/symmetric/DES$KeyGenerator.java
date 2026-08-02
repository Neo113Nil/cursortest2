package org.spongycastle.jcajce.provider.symmetric;

import Xi.b;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.t;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class DES$KeyGenerator extends BaseKeyGenerator {
    public DES$KeyGenerator() {
        super("DES", 64, new b());
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.b(new t(new SecureRandom(), this.defaultKeySize));
            this.uninitialised = false;
        }
        return new SecretKeySpec(this.engine.a(), this.algName);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i10, SecureRandom secureRandom) {
        super.engineInit(i10, secureRandom);
    }
}
