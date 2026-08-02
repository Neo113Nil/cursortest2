package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5964n;
import org.spongycastle.crypto.g;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class GOST28147$GCFB extends BaseBlockCipher {
    public GOST28147$GCFB() {
        super(new g(new Zi.g(new C5964n())), 64);
    }
}
