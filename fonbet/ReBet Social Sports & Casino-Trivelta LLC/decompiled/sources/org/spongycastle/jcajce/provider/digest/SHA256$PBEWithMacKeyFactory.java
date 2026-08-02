package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class SHA256$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public SHA256$PBEWithMacKeyFactory() {
        super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
    }
}
