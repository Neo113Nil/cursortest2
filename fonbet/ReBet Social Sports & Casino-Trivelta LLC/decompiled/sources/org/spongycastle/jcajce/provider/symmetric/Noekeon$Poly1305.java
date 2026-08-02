package org.spongycastle.jcajce.provider.symmetric;

import Yi.j;
import org.spongycastle.crypto.engines.C5970u;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Noekeon$Poly1305 extends BaseMac {
    public Noekeon$Poly1305() {
        super(new j(new C5970u()));
    }
}
