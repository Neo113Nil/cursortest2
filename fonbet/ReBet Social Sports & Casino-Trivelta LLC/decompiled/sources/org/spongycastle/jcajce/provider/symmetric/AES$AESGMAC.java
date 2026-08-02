package org.spongycastle.jcajce.provider.symmetric;

import Yi.d;
import Zi.h;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class AES$AESGMAC extends BaseMac {
    public AES$AESGMAC() {
        super(new d(new h(new C5951a())));
    }
}
