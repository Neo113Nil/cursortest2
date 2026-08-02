package com.unity3d.mediation.rewarded;

import xsna.epx;
import xsna.iq;

/* loaded from: classes14.dex */
public final class LevelPlayReward {
    private final String a;
    private final int b;

    public LevelPlayReward(String str, int i) {
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

    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final LevelPlayReward copy(String str, int i) {
        return new LevelPlayReward(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return epx.f(this.a, levelPlayReward.a) && this.b == levelPlayReward.b;
    }

    public final int getAmount() {
        return this.b;
    }

    public final String getName() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        return iq.a(this.b, "LevelPlayReward(name=", this.a, ", amount=", ")");
    }
}
