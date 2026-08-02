package org.spongycastle.jcajce.provider.symmetric;

import Zi.h;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$GCM extends BaseBlockCipher {
    public AES$GCM() {
        super(new h(new C5951a()));
    }
}
