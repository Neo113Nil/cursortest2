package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DESede$ECB extends BaseBlockCipher {
    public DESede$ECB() {
        super(new C5961k());
    }
}
