package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class MD4$KeyGenerator extends BaseKeyGenerator {
    public MD4$KeyGenerator() {
        super("HMACMD4", 128, new i());
    }
}
