package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.U;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class VMPC$Base extends BaseStreamCipher {
    public VMPC$Base() {
        super(new U(), 16);
    }
}
