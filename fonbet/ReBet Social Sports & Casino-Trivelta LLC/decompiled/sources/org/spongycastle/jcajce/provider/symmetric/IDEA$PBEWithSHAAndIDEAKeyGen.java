package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class IDEA$PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
    public IDEA$PBEWithSHAAndIDEAKeyGen() {
        super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
    }
}
