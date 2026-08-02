package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.T;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Twofish$PBEWithSHA extends BaseBlockCipher {
    public Twofish$PBEWithSHA() {
        super(new b(new T()), 2, 1, 256, 16);
    }
}
