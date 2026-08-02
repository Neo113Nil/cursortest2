package org.spongycastle.jcajce.provider.symmetric;

import Yi.j;
import org.spongycastle.crypto.engines.T;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Twofish$Poly1305 extends BaseMac {
    public Twofish$Poly1305() {
        super(new j(new T()));
    }
}
