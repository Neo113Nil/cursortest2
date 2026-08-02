package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class Keccak$KeyGenerator256 extends BaseKeyGenerator {
    public Keccak$KeyGenerator256() {
        super("HMACKECCAK256", 256, new i());
    }
}
