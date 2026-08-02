package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DES$CBC extends BaseBlockCipher {
    public DES$CBC() {
        super(new b(new C5960j()), 64);
    }
}
