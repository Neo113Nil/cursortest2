package org.spongycastle.jcajce.provider.symmetric;

import Zi.c;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$CCM extends BaseBlockCipher {
    public AES$CCM() {
        super(new c(new C5951a()), false, 16);
    }
}
