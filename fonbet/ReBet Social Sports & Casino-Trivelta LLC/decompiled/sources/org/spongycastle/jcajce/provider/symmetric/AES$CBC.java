package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$CBC extends BaseBlockCipher {
    public AES$CBC() {
        super(new b(new C5951a()), 128);
    }
}
