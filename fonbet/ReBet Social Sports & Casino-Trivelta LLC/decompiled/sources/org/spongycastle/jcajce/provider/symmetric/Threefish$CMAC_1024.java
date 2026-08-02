package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.Q;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Threefish$CMAC_1024 extends BaseMac {
    public Threefish$CMAC_1024() {
        super(new c(new Q(1024)));
    }
}
