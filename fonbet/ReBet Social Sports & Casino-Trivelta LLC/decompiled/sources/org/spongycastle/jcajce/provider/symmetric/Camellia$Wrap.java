package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5957g;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class Camellia$Wrap extends BaseWrapCipher {
    public Camellia$Wrap() {
        super(new C5957g());
    }
}
