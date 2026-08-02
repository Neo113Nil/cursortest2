package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5956f;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Camellia$CBC extends BaseBlockCipher {
    public Camellia$CBC() {
        super(new b(new C5956f()), 128);
    }
}
