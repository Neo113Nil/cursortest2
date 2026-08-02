package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.J;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class SM4$GMAC extends BaseMac {
    public SM4$GMAC() {
        super(new d(new h(new J())));
    }
}
