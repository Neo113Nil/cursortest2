package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import xsna.epx;

/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4226ab implements ImpressionDataListener {
    private final LevelPlayImpressionDataListener a;

    public C4226ab(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        this.a = levelPlayImpressionDataListener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4226ab) {
            return epx.f(this.a, ((C4226ab) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(W8 w8) {
        this.a.onImpressionSuccess(new LevelPlayImpressionData(w8.d()));
    }
}
