package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5964n;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class GOST28147$CBC extends BaseBlockCipher {
    public GOST28147$CBC() {
        super(new b(new C5964n()), 64);
    }
}
