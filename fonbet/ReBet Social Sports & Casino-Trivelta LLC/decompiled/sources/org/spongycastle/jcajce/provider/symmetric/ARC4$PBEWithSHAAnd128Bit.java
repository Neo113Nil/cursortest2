package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5973x;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class ARC4$PBEWithSHAAnd128Bit extends BaseStreamCipher {
    public ARC4$PBEWithSHAAnd128Bit() {
        super(new C5973x(), 0, 128, 1);
    }
}
