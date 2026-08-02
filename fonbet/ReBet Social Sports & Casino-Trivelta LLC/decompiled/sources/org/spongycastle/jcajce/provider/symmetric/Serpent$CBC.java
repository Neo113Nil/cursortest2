package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.L;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Serpent$CBC extends BaseBlockCipher {
    public Serpent$CBC() {
        super(new b(new L()), 128);
    }
}
