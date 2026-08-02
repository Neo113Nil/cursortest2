package org.spongycastle.jcajce.provider.symmetric;

import Xi.c;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.t;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class DESede$KeyGenerator extends BaseKeyGenerator {
    private boolean keySizeSet;

    public DESede$KeyGenerator() {
        super("DESede", 192, new c());
        this.keySizeSet = false;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.b(new t(new SecureRandom(), this.defaultKeySize));
            this.uninitialised = false;
        }
        if (this.keySizeSet) {
            return new SecretKeySpec(this.engine.a(), this.algName);
        }
        byte[] a10 = this.engine.a();
        System.arraycopy(a10, 0, a10, 16, 8);
        return new SecretKeySpec(a10, this.algName);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(int i10, SecureRandom secureRandom) {
        super.engineInit(i10, secureRandom);
        this.keySizeSet = true;
    }
}
