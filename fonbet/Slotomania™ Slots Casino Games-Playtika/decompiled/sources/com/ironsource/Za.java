package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Za implements ImpressionDataListener {
    private final LevelPlayImpressionDataListener a;

    public Za(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Za) {
            return Intrinsics.areEqual(this.a, ((Za) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(V8 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}
