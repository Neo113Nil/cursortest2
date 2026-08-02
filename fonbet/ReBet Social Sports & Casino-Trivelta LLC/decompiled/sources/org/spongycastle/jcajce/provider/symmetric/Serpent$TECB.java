package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.e;
import org.spongycastle.crypto.engines.S;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* loaded from: classes5.dex */
public class Serpent$TECB extends BaseBlockCipher {

    public class a implements org.spongycastle.jcajce.provider.symmetric.util.a {
        @Override // org.spongycastle.jcajce.provider.symmetric.util.a
        public e get() {
            return new S();
        }
    }

    public Serpent$TECB() {
        super(new a());
    }
}
