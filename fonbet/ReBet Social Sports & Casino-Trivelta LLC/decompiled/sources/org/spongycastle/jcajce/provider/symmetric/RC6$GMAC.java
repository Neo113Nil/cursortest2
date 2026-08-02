package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.A;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class RC6$GMAC extends BaseMac {
    public RC6$GMAC() {
        super(new d(new h(new A())));
    }
}
