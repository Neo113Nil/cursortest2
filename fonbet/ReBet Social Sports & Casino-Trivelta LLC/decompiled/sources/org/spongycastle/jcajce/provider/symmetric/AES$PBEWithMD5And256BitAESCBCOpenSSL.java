package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And256BitAESCBCOpenSSL() {
        super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
    }
}
