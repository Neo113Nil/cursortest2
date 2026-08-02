package org.spongycastle.jcajce.provider.symmetric;

import Yi.b;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DES$DESCFB8 extends BaseMac {
    public DES$DESCFB8() {
        super(new b(new C5960j()));
    }
}
