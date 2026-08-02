package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class Twofish$PBEWithSHAKeyFactory extends PBESecretKeyFactory {
    public Twofish$PBEWithSHAKeyFactory() {
        super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
    }
}
