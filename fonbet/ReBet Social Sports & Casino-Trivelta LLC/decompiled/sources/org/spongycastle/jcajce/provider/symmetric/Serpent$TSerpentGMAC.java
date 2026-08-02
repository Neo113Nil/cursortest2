package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.S;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class Serpent$TSerpentGMAC extends BaseMac {
    public Serpent$TSerpentGMAC() {
        super(new d(new h(new S())));
    }
}
