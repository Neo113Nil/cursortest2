package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.e;
import org.spongycastle.crypto.engines.H;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class SEED$ECB extends BaseBlockCipher {

    public class a implements org.spongycastle.jcajce.provider.symmetric.util.a {
        @Override // org.spongycastle.jcajce.provider.symmetric.util.a
        public e get() {
            return new H();
        }
    }

    public SEED$ECB() {
        super(new a());
    }
}
