package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.B;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class DESede$RFC3211 extends BaseWrapCipher {
    public DESede$RFC3211() {
        super(new B(new C5961k()), 8);
    }
}
