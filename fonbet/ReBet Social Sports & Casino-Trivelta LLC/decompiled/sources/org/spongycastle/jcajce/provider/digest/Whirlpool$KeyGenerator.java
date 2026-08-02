package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class Whirlpool$KeyGenerator extends BaseKeyGenerator {
    public Whirlpool$KeyGenerator() {
        super("HMACWHIRLPOOL", 512, new i());
    }
}
