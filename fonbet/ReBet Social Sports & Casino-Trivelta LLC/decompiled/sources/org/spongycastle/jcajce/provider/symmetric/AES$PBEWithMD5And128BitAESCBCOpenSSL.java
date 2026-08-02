package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class AES$PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And128BitAESCBCOpenSSL() {
        super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
    }
}
