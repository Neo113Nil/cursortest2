package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.engines.D;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class AES$RFC5649Wrap extends BaseWrapCipher {
    public AES$RFC5649Wrap() {
        super(new D(new C5951a()));
    }
}
