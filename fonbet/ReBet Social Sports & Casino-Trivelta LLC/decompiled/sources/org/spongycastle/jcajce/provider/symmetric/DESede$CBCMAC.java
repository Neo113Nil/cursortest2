package org.spongycastle.jcajce.provider.symmetric;

import Yi.a;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DESede$CBCMAC extends BaseMac {
    public DESede$CBCMAC() {
        super(new a(new C5961k()));
    }
}
