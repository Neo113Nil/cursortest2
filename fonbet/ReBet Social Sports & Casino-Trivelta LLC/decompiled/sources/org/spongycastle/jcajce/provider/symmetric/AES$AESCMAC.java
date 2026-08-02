package org.spongycastle.jcajce.provider.symmetric;

import Yi.c;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class AES$AESCMAC extends BaseMac {
    public AES$AESCMAC() {
        super(new c(new C5951a()));
    }
}
