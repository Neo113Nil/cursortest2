package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.B;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class DES$RFC3211 extends BaseWrapCipher {
    public DES$RFC3211() {
        super(new B(new C5960j()), 8);
    }
}
