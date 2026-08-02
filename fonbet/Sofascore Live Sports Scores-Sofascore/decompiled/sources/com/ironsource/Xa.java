package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xa implements ImpressionDataListener {

    @NotNull
    private final LevelPlayImpressionDataListener a;

    public Xa(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        this.a = levelPlayImpressionDataListener;
    }

    @NotNull
    public final LevelPlayImpressionDataListener a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Xa) {
            return Intrinsics.c(this.a, ((Xa) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@NotNull V8 v8) {
        v8.getClass();
        this.a.onImpressionSuccess(new LevelPlayImpressionData(v8.d()));
    }
}
