package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Q9 {
    public final R9 a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i5 = featureInfo.reqGlEsVersion;
        if (i5 == 0) {
            return b(featureInfo);
        }
        return new R9("openGlFeature", i5, (featureInfo.flags & 1) != 0);
    }

    public abstract R9 b(FeatureInfo featureInfo);
}
