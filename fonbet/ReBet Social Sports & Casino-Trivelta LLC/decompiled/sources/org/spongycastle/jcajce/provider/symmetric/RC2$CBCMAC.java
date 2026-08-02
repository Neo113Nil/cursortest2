package org.spongycastle.jcajce.provider.symmetric;

import Yi.a;
import org.spongycastle.crypto.engines.C5971v;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class RC2$CBCMAC extends BaseMac {
    public RC2$CBCMAC() {
        super(new a(new C5971v()));
    }
}
