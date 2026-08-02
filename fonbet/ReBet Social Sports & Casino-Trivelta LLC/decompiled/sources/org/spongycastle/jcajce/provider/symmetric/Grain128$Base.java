package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5965o;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

/* loaded from: classes5.dex */
public class Grain128$Base extends BaseStreamCipher {
    public Grain128$Base() {
        super(new C5965o(), 12);
    }
}
