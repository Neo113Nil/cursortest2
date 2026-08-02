package org.spongycastle.jcajce.provider.digest;

import com.plaid.internal.EnumC3631g;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class SHA1$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public SHA1$PBEWithMacKeyFactory() {
        super("PBEwithHmacSHA", null, false, 2, 1, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 0);
    }
}
