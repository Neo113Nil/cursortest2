package com.unity3d.mediation;

import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayConfiguration {
    private final boolean a;

    @Nullable
    private final String b;

    public LevelPlayConfiguration(boolean z, @Nullable String str) {
        this.a = z;
        this.b = str;
    }

    @Nullable
    public final String getAb() {
        return this.b;
    }

    public final boolean isAdQualityEnabled() {
        return this.a;
    }
}
