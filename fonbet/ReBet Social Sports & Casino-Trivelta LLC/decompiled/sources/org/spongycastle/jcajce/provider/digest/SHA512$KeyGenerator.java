package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SHA512$KeyGenerator extends BaseKeyGenerator {
    public SHA512$KeyGenerator() {
        super("HMACSHA512", 512, new i());
    }
}
