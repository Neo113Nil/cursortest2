package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.N;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Shacal2$CMAC extends BaseMac {
    public Shacal2$CMAC() {
        super(new c(new N()));
    }
}
