package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5972w;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class RC2$Wrap extends BaseWrapCipher {
    public RC2$Wrap() {
        super(new C5972w());
    }
}
