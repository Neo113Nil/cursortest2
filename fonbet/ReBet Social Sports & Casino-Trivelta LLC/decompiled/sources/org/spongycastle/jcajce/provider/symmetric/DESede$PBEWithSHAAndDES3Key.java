package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class DESede$PBEWithSHAAndDES3Key extends BaseBlockCipher {
    public DESede$PBEWithSHAAndDES3Key() {
        super(new b(new C5961k()), 2, 1, 192, 8);
    }
}
