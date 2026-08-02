package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class GOST3411$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public GOST3411$PBEWithMacKeyFactory() {
        super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
    }
}
