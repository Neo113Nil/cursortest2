package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5968s;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class IDEA$ECB extends BaseBlockCipher {
    public IDEA$ECB() {
        super(new C5968s());
    }
}
