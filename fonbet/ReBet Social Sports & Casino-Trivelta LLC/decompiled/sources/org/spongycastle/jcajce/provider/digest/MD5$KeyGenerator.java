package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class MD5$KeyGenerator extends BaseKeyGenerator {
    public MD5$KeyGenerator() {
        super("HMACMD5", 128, new i());
    }
}
