package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DES$PBEWithSHA1 extends BaseBlockCipher {
    public DES$PBEWithSHA1() {
        super(new b(new C5960j()), 0, 1, 64, 8);
    }
}
