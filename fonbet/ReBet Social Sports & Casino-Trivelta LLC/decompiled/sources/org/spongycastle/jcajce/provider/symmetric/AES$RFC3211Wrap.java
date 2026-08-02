package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.B;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class AES$RFC3211Wrap extends BaseWrapCipher {
    public AES$RFC3211Wrap() {
        super(new B(new C5951a()), 16);
    }
}
