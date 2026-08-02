package org.spongycastle.jcajce.provider.symmetric;

import Yi.b;
import org.spongycastle.crypto.engines.C5971v;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class RC2$CFB8MAC extends BaseMac {
    public RC2$CFB8MAC() {
        super(new b(new C5971v()));
    }
}
