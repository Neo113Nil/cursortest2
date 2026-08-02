package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5967q;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class HC128$Base extends BaseStreamCipher {
    public HC128$Base() {
        super(new C5967q(), 16);
    }
}
