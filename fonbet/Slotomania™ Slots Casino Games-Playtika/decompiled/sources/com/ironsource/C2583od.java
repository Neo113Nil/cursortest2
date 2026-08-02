package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2583od {
    private final String a;
    private final LevelPlay.AdFormat b;

    public C2583od(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = placementName;
        this.b = adFormat;
    }

    public final String a() {
        return this.a + "_" + this.b;
    }
}
