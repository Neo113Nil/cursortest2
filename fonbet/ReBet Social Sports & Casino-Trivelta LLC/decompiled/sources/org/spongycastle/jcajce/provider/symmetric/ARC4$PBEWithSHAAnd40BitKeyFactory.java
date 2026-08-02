package org.spongycastle.jcajce.provider.symmetric;

import Li.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class ARC4$PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
    public ARC4$PBEWithSHAAnd40BitKeyFactory() {
        super("PBEWithSHAAnd128BitRC4", f.f7244I2, true, 2, 1, 40, 0);
    }
}
