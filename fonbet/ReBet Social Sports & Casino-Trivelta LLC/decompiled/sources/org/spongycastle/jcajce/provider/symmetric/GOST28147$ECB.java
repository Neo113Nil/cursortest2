package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5964n;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class GOST28147$ECB extends BaseBlockCipher {
    public GOST28147$ECB() {
        super(new C5964n());
    }
}
