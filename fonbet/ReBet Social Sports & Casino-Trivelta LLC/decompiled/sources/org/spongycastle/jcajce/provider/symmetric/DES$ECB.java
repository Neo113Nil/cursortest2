package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DES$ECB extends BaseBlockCipher {
    public DES$ECB() {
        super(new C5960j());
    }
}
