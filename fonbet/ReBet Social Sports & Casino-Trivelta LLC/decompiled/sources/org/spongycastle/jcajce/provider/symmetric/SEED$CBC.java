package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.H;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class SEED$CBC extends BaseBlockCipher {
    public SEED$CBC() {
        super(new b(new H()), 128);
    }
}
