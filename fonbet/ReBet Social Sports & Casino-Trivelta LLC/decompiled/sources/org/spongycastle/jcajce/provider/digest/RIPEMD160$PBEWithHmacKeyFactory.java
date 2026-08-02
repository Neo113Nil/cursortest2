package org.spongycastle.jcajce.provider.digest;

import com.plaid.internal.EnumC3631g;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RIPEMD160$PBEWithHmacKeyFactory extends PBESecretKeyFactory {
    public RIPEMD160$PBEWithHmacKeyFactory() {
        super("PBEwithHmacRIPEMD160", null, false, 2, 2, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 0);
    }
}
