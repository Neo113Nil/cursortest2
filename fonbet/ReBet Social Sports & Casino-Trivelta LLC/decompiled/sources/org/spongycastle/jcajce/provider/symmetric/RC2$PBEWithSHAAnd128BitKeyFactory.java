package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RC2$PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHAAnd128BitKeyFactory() {
        super("PBEwithSHAand128BitRC2-CBC", f.f7256M2, true, 2, 1, 128, 64);
    }
}
