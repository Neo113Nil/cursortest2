package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SHA3$KeyGeneratorSHA3 extends BaseKeyGenerator {
    public SHA3$KeyGeneratorSHA3(int i10) {
        super("HMACSHA3-" + i10, i10, new i());
    }
}
