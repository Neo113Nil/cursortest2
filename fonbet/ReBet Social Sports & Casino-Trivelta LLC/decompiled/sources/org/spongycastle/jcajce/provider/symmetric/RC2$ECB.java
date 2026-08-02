package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5971v;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class RC2$ECB extends BaseBlockCipher {
    public RC2$ECB() {
        super(new C5971v());
    }
}
