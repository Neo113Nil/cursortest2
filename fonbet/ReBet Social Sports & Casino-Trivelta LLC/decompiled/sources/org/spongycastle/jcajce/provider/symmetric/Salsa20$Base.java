package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.K;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class Salsa20$Base extends BaseStreamCipher {
    public Salsa20$Base() {
        super(new K(), 8);
    }
}
