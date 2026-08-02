package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.e;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class AES$ECB extends BaseBlockCipher {

    public class a implements org.spongycastle.jcajce.provider.symmetric.util.a {
        @Override // org.spongycastle.jcajce.provider.symmetric.util.a
        public e get() {
            return new C5951a();
        }
    }

    public AES$ECB() {
        super(new a());
    }
}
