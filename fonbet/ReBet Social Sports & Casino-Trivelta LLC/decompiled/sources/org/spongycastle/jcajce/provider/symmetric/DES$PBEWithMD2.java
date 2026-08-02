package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DES$PBEWithMD2 extends BaseBlockCipher {
    public DES$PBEWithMD2() {
        super(new b(new C5960j()), 0, 5, 64, 8);
    }
}
