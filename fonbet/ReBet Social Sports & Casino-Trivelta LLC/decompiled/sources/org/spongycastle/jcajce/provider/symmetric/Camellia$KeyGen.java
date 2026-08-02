package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class Camellia$KeyGen extends BaseKeyGenerator {
    public Camellia$KeyGen() {
        this(256);
    }

    public Camellia$KeyGen(int i10) {
        super("Camellia", i10, new i());
    }
}
