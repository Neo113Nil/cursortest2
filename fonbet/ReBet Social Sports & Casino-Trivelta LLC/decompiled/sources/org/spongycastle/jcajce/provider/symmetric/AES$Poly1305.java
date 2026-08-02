package org.spongycastle.jcajce.provider.symmetric;

import Yi.j;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class AES$Poly1305 extends BaseMac {
    public AES$Poly1305() {
        super(new j(new C5951a()));
    }
}
