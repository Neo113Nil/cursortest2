package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class RC2$PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
    public RC2$PBEWithSHAAnd40BitKeyFactory() {
        super("PBEwithSHAand40BitRC2-CBC", f.f7259N2, true, 2, 1, 40, 64);
    }
}
