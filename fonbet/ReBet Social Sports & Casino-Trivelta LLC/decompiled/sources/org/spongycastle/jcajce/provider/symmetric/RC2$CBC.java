package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5971v;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class RC2$CBC extends BaseBlockCipher {
    public RC2$CBC() {
        super(new b(new C5971v()), 64);
    }
}
