package com.ironsource;

import com.ironsource.O7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class Rd implements O7, O7.a {
    private final Map<String, LevelPlayReward> a = new LinkedHashMap();
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.O7.a
    public void a(String str, String str2, int i) {
        this.a.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.O7.a
    public void b(String str, String str2, int i) {
        this.b.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.O7
    public LevelPlayReward a(String str, String str2) {
        LevelPlayReward a = a(str);
        if (a != null) {
            return a;
        }
        LevelPlayReward b = b(str2);
        return b == null ? a() : b;
    }

    @Override // com.ironsource.O7
    public LevelPlayReward b(String str) {
        return this.b.get(str);
    }

    @Override // com.ironsource.O7
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
