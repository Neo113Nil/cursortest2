package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5953c;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Blowfish$ECB extends BaseBlockCipher {
    public Blowfish$ECB() {
        super(new C5953c());
    }
}
