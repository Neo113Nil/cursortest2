package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DESede$CBC extends BaseBlockCipher {
    public DESede$CBC() {
        super(new b(new C5961k()), 64);
    }
}
