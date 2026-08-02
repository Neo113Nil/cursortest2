package org.spongycastle.jcajce.provider.digest;

import Yi.f;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Keccak$HashMac256 extends BaseMac {
    public Keccak$HashMac256() {
        super(new f(new org.spongycastle.crypto.digests.f(256)));
    }
}
