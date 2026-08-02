package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RC2$PBEWithMD2KeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithMD2KeyFactory() {
        super("PBEwithMD2andRC2", f.f7340t0, true, 0, 5, 64, 64);
    }
}
