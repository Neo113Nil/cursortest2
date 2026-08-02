package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RC2$PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHA1KeyFactory() {
        super("PBEwithSHA1andRC2", f.f7352x0, true, 0, 1, 64, 64);
    }
}
