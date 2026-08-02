package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And256BitAESBC() {
        super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
    }
}
