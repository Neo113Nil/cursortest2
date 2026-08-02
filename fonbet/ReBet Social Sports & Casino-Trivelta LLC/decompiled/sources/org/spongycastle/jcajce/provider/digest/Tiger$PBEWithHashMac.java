package org.spongycastle.jcajce.provider.digest;

import Yi.f;
import org.spongycastle.crypto.digests.y;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Tiger$PBEWithHashMac extends BaseMac {
    public Tiger$PBEWithHashMac() {
        super(new f(new y()), 2, 3, 192);
    }
}
