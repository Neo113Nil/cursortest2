package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class GOST3411$KeyGenerator extends BaseKeyGenerator {
    public GOST3411$KeyGenerator() {
        super("HMACGOST3411", 256, new i());
    }
}
