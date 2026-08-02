package com.ironsource;

import com.ironsource.L7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qd implements L7, L7.a {

    @NotNull
    private final Map<String, LevelPlayReward> a = new LinkedHashMap();

    @NotNull
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.L7
    @NotNull
    public LevelPlayReward a(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        LevelPlayReward a = a(str);
        return (a == null && (a = b(str2)) == null) ? a() : a;
    }

    @Override // com.ironsource.L7.a
    public void b(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.b.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.L7
    @Nullable
    public LevelPlayReward b(@NotNull String str) {
        str.getClass();
        return this.b.get(str);
    }

    @Override // com.ironsource.L7.a
    public void a(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.L7
    @Nullable
    public LevelPlayReward a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
