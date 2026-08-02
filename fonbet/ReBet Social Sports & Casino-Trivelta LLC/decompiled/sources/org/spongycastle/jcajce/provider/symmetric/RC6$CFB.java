package org.spongycastle.jcajce.provider.symmetric;

import Zi.d;
import org.spongycastle.crypto.engines.A;
import org.spongycastle.crypto.g;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class RC6$CFB extends BaseBlockCipher {
    public RC6$CFB() {
        super(new g(new d(new A(), 128)), 128);
    }
}
