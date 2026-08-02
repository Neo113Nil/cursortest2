package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5973x;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class ARC4$Base extends BaseStreamCipher {
    public ARC4$Base() {
        super(new C5973x(), 0);
    }
}
