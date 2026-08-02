package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.Q;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Threefish$ECB_1024 extends BaseBlockCipher {
    public Threefish$ECB_1024() {
        super(new Q(1024));
    }
}
