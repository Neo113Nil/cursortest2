package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SHA384$KeyGenerator extends BaseKeyGenerator {
    public SHA384$KeyGenerator() {
        super("HMACSHA384", 384, new i());
    }
}
