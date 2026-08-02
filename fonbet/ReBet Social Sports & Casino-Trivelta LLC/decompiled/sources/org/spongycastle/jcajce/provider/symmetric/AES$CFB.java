package org.spongycastle.jcajce.provider.symmetric;

import Zi.d;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.g;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$CFB extends BaseBlockCipher {
    public AES$CFB() {
        super(new g(new d(new C5951a(), 128)), 128);
    }
}
