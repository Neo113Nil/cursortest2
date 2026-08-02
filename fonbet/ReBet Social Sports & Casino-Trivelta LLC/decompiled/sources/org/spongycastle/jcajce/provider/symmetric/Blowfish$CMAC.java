package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.C5953c;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Blowfish$CMAC extends BaseMac {
    public Blowfish$CMAC() {
        super(new c(new C5953c()));
    }
}
