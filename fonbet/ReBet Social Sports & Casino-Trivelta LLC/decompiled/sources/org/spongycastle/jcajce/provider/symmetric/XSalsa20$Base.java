package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.W;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class XSalsa20$Base extends BaseStreamCipher {
    public XSalsa20$Base() {
        super(new W(), 24);
    }
}
