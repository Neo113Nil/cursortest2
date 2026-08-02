package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class RIPEMD128$KeyGenerator extends BaseKeyGenerator {
    public RIPEMD128$KeyGenerator() {
        super("HMACRIPEMD128", 128, new i());
    }
}
