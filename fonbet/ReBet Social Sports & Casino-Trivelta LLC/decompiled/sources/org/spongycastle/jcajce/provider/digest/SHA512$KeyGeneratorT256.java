package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SHA512$KeyGeneratorT256 extends BaseKeyGenerator {
    public SHA512$KeyGeneratorT256() {
        super("HMACSHA512/256", 256, new i());
    }
}
