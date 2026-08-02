package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5959i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class ChaCha$Base extends BaseStreamCipher {
    public ChaCha$Base() {
        super(new C5959i(), 8);
    }
}
