package org.spongycastle.jcajce.provider.symmetric;

import Yi.b;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DESede$DESedeCFB8 extends BaseMac {
    public DESede$DESedeCFB8() {
        super(new b(new C5961k()));
    }
}
