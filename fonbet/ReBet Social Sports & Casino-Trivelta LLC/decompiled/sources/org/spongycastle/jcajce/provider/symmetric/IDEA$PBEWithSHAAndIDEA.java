package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5968s;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class IDEA$PBEWithSHAAndIDEA extends BaseBlockCipher {
    public IDEA$PBEWithSHAAndIDEA() {
        super(new b(new C5968s()));
    }
}
