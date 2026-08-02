package com.ironsource;

import com.ironsource.N7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Rd implements N7, N7.a {
    private final Map<String, LevelPlayReward> a = new LinkedHashMap();
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.N7.a
    public void a(String placement, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.a.put(placement, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.N7.a
    public void b(String adUnitId, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.b.put(adUnitId, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.N7
    public LevelPlayReward a(String str, String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward a = a(str);
        if (a != null) {
            return a;
        }
        LevelPlayReward b = b(adUnitId);
        return b == null ? a() : b;
    }

    @Override // com.ironsource.N7
    public LevelPlayReward b(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.b.get(adUnitId);
    }

    @Override // com.ironsource.N7
    public LevelPlayReward a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
