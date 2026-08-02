package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class AES$KeyGen extends BaseKeyGenerator {
    public AES$KeyGen() {
        this(192);
    }

    public AES$KeyGen(int i10) {
        super("AES", i10, new i());
    }
}
