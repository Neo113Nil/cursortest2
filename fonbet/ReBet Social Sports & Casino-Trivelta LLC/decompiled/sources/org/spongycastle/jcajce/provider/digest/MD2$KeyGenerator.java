package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class MD2$KeyGenerator extends BaseKeyGenerator {
    public MD2$KeyGenerator() {
        super("HMACMD2", 128, new i());
    }
}
