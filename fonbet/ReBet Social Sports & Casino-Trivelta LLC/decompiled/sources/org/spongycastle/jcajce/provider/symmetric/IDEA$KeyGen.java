package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class IDEA$KeyGen extends BaseKeyGenerator {
    public IDEA$KeyGen() {
        super("IDEA", 128, new i());
    }
}
