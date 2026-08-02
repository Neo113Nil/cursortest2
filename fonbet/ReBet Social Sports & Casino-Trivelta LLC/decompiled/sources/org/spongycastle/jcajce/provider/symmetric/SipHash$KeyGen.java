package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.i;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* loaded from: classes5.dex */
public class SipHash$KeyGen extends BaseKeyGenerator {
    public SipHash$KeyGen() {
        super("SipHash", 128, new i());
    }
}
