package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.C5962l;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

/* loaded from: classes5.dex */
public class DESede$Wrap extends BaseWrapCipher {
    public DESede$Wrap() {
        super(new C5962l());
    }
}
