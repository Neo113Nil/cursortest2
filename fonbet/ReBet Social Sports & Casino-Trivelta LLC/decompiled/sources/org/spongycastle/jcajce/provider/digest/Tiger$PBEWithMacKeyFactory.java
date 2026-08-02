package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class Tiger$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public Tiger$PBEWithMacKeyFactory() {
        super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
    }
}
