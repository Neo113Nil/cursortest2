package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.N;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Shacal2$CBC extends BaseBlockCipher {
    public Shacal2$CBC() {
        super(new b(new N()), 256);
    }
}
