package org.spongycastle.jcajce.provider.symmetric;

import Yi.a;
import org.spongycastle.crypto.engines.C5968s;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class IDEA$Mac extends BaseMac {
    public IDEA$Mac() {
        super(new a(new C5968s()));
    }
}
