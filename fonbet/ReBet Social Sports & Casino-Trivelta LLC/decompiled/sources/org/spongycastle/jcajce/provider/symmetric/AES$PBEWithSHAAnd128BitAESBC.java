package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd128BitAESBC() {
        super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
    }
}
