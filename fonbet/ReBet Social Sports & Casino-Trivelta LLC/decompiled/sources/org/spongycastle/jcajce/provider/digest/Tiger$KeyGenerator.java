package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class Tiger$KeyGenerator extends BaseKeyGenerator {
    public Tiger$KeyGenerator() {
        super("HMACTIGER", 192, new i());
    }
}
