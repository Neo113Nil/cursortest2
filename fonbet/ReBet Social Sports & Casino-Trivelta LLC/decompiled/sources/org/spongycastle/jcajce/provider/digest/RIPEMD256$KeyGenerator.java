package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class RIPEMD256$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD256$KeyGenerator() {
        super("HMACRIPEMD256", 256, new i());
    }
}
