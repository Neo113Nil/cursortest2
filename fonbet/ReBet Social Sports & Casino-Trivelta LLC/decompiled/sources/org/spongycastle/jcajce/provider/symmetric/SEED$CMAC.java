package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.H;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class SEED$CMAC extends BaseMac {
    public SEED$CMAC() {
        super(new c(new H()));
    }
}
