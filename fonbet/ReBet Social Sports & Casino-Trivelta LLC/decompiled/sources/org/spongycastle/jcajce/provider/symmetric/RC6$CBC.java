package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.A;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class RC6$CBC extends BaseBlockCipher {
    public RC6$CBC() {
        super(new b(new A()), 128);
    }
}
