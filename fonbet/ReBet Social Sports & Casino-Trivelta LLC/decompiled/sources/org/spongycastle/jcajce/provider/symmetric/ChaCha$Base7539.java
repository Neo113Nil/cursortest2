package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5958h;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class ChaCha$Base7539 extends BaseStreamCipher {
    public ChaCha$Base7539() {
        super(new C5958h(), 12);
    }
}
