package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class GOST28147$KeyGen extends BaseKeyGenerator {
    public GOST28147$KeyGen() {
        this(256);
    }

    public GOST28147$KeyGen(int i10) {
        super("GOST28147", i10, new i());
    }
}
