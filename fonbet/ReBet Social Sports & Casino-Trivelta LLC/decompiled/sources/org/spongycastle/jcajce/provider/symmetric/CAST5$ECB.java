package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5954d;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class CAST5$ECB extends BaseBlockCipher {
    public CAST5$ECB() {
        super(new C5954d());
    }
}
