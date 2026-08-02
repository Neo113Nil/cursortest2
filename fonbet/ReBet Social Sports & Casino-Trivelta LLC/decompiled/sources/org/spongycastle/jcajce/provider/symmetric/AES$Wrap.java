package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5952b;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class AES$Wrap extends BaseWrapCipher {
    public AES$Wrap() {
        super(new C5952b());
    }
}
