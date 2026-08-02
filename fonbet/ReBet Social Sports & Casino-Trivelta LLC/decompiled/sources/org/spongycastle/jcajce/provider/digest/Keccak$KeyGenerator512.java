package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class Keccak$KeyGenerator512 extends BaseKeyGenerator {
    public Keccak$KeyGenerator512() {
        super("HMACKECCAK512", 512, new i());
    }
}
