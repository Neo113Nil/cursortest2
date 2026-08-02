package org.spongycastle.jcajce.provider.symmetric;

import Yi.j;
import org.spongycastle.crypto.engines.H;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class SEED$Poly1305 extends BaseMac {
    public SEED$Poly1305() {
        super(new j(new H()));
    }
}
