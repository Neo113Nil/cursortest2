package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2623r0 {
    private final HashMap<String, S0> a = new HashMap<>();

    /* renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final S0 a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        S0 s0 = this.a.get(adUnitId);
        if (s0 != null) {
            return s0;
        }
        S0 s02 = new S0(providers, i);
        this.a.put(adUnitId, s02);
        return s02;
    }
}
