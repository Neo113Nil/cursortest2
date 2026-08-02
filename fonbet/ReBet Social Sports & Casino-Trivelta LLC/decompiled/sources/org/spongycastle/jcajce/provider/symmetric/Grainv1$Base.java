package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5966p;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class Grainv1$Base extends BaseStreamCipher {
    public Grainv1$Base() {
        super(new C5966p(), 8);
    }
}
