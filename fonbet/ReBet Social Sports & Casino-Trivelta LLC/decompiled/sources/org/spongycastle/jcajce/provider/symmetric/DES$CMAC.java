package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DES$CMAC extends BaseMac {
    public DES$CMAC() {
        super(new c(new C5960j()));
    }
}
