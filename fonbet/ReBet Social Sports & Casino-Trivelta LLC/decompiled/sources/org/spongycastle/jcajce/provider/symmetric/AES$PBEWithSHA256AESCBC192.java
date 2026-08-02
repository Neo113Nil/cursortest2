package org.spongycastle.jcajce.provider.symmetric;

import Zi.b;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$PBEWithSHA256AESCBC192 extends BaseBlockCipher {
    public AES$PBEWithSHA256AESCBC192() {
        super(new b(new C5951a()), 2, 4, 192, 16);
    }
}
