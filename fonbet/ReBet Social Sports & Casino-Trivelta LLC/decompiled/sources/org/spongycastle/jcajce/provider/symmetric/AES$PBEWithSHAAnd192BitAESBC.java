package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd192BitAESBC() {
        super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
    }
}
