package com.ironsource;

import com.ironsource.X0;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Z0 {
    public final X0 a(String adUnitId, LevelPlay.AdFormat adFormat, H8 sdkConfigService) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(sdkConfigService, "sdkConfigService");
        if (adUnitId.length() == 0) {
            return new X0.a(Y0.a);
        }
        if (!sdkConfigService.c()) {
            return new X0.a(Y0.b);
        }
        Ua a = sdkConfigService.a();
        return (a == null || !a.a(adUnitId, adFormat)) ? new X0.a(Y0.c) : X0.b.a;
    }
}
