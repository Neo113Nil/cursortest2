package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.Q;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Threefish$CMAC_256 extends BaseMac {
    public Threefish$CMAC_256() {
        super(new c(new Q(256)));
    }
}
