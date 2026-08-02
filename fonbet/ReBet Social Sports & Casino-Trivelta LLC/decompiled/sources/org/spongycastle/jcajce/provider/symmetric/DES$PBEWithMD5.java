package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DES$PBEWithMD5 extends BaseBlockCipher {
    public DES$PBEWithMD5() {
        super(new b(new C5960j()), 0, 0, 64, 8);
    }
}
