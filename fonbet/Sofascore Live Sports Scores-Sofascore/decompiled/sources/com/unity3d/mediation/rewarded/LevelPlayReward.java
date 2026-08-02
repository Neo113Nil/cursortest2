package com.unity3d.mediation.rewarded;

import defpackage.vxd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayReward {

    @NotNull
    private final String a;
    private final int b;

    public LevelPlayReward(@NotNull String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.b;
        }
        return levelPlayReward.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String str, int i) {
        str.getClass();
        return new LevelPlayReward(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.c(this.a, levelPlayReward.a) && this.b == levelPlayReward.b;
    }

    public final int getAmount() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return vxd.k(this.b, "LevelPlayReward(name=", this.a, ", amount=", ")");
    }
}
