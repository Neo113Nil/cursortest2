package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class ARC4$KeyGen extends BaseKeyGenerator {
    public ARC4$KeyGen() {
        super("RC4", 128, new i());
    }
}
