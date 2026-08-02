package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RC2$PBEWithMD5KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithMD5KeyFactory() {
        super("PBEwithMD5andRC2", f.f7346v0, true, 0, 0, 64, 64);
    }
}
