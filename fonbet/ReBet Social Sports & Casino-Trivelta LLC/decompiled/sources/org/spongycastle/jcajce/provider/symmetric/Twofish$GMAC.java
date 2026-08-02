package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.T;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Twofish$GMAC extends BaseMac {
    public Twofish$GMAC() {
        super(new d(new h(new T())));
    }
}
