package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SHA256$KeyGenerator extends BaseKeyGenerator {
    public SHA256$KeyGenerator() {
        super("HMACSHA256", 256, new i());
    }
}
