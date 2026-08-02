package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5954d;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class CAST5$CBC extends BaseBlockCipher {
    public CAST5$CBC() {
        super(new b(new C5954d()), 64);
    }
}
