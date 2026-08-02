package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4519r0 {
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

    public final S0 a(String str, List<? extends NetworkSettings> list, int i) {
        S0 s0 = this.a.get(str);
        if (s0 != null) {
            return s0;
        }
        S0 s02 = new S0(list, i);
        this.a.put(str, s02);
        return s02;
    }
}
