package org.spongycastle.jcajce.provider.symmetric;

import Zi.k;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.g;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$OFB extends BaseBlockCipher {
    public AES$OFB() {
        super(new g(new k(new C5951a(), 128)), 128);
    }
}
