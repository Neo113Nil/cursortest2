package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class O9 extends Q9 {
    @Override // io.appmetrica.analytics.impl.Q9
    @TargetApi(zg.g.FORCEINGEST_FIELD_NUMBER)
    public final R9 b(@NonNull FeatureInfo featureInfo) {
        return new R9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
