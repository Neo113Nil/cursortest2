package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And192BitAESBC() {
        super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
    }
}
