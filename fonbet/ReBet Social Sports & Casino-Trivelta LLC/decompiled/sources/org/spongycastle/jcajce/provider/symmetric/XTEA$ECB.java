package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.X;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class XTEA$ECB extends BaseBlockCipher {
    public XTEA$ECB() {
        super(new X());
    }
}
