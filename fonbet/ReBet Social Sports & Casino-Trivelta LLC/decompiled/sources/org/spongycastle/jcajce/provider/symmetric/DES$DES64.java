package org.spongycastle.jcajce.provider.symmetric;

import Yi.a;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DES$DES64 extends BaseMac {
    public DES$DES64() {
        super(new a(new C5960j(), 64));
    }
}
