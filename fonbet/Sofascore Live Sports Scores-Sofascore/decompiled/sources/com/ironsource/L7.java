package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface L7 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void a(@NotNull String str, @NotNull String str2, int i);

        void b(@NotNull String str, @NotNull String str2, int i);
    }

    @Nullable
    LevelPlayReward a(@Nullable String str);

    @NotNull
    LevelPlayReward a(@Nullable String str, @NotNull String str2);

    @Nullable
    LevelPlayReward b(@NotNull String str);
}
