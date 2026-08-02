package org.spongycastle.jcajce.provider.symmetric;

import Yi.b;
import org.spongycastle.crypto.engines.C5968s;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class IDEA$CFB8Mac extends BaseMac {
    public IDEA$CFB8Mac() {
        super(new b(new C5968s()));
    }
}
