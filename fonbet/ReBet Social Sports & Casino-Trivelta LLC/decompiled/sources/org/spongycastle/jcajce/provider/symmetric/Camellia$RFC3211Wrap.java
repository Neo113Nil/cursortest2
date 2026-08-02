package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.B;
import org.spongycastle.crypto.engines.C5956f;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class Camellia$RFC3211Wrap extends BaseWrapCipher {
    public Camellia$RFC3211Wrap() {
        super(new B(new C5956f()), 16);
    }
}
