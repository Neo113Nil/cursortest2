package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5953c;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Blowfish$CBC extends BaseBlockCipher {
    public Blowfish$CBC() {
        super(new b(new C5953c()), 64);
    }
}
