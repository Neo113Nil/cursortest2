package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DESede$CMAC extends BaseMac {
    public DESede$CMAC() {
        super(new c(new C5961k()));
    }
}
