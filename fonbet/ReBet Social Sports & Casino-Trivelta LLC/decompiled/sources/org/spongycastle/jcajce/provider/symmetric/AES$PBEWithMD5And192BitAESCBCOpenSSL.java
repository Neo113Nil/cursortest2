package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And192BitAESCBCOpenSSL() {
        super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
    }
}
