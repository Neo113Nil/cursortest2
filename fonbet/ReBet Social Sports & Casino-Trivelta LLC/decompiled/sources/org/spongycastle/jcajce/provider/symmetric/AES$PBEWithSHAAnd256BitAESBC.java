package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd256BitAESBC() {
        super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
    }
}
