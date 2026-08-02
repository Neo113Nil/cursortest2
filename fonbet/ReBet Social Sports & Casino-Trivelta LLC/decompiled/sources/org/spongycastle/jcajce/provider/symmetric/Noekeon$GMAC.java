package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.C5970u;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Noekeon$GMAC extends BaseMac {
    public Noekeon$GMAC() {
        super(new d(new h(new C5970u())));
    }
}
