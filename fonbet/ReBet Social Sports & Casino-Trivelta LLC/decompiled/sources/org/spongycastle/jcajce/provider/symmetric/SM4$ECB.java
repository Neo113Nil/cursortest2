package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.e;
import org.spongycastle.crypto.engines.J;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class SM4$ECB extends BaseBlockCipher {

    public class a implements org.spongycastle.jcajce.provider.symmetric.util.a {
        @Override // org.spongycastle.jcajce.provider.symmetric.util.a
        public e get() {
            return new J();
        }
    }

    public SM4$ECB() {
        super(new a());
    }
}
