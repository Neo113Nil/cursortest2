package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.H;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class SEED$GMAC extends BaseMac {
    public SEED$GMAC() {
        super(new d(new h(new H())));
    }
}
