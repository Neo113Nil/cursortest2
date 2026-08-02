package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And128BitAESBC() {
        super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
    }
}
