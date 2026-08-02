package defpackage;

import com.sofascore.model.mvvm.model.Season;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ca1 implements fa1 {
    public final int a;
    public final Season.SubSeasonType b;
    public final wj1 c;

    public ca1(int i, Season.SubSeasonType subSeasonType, wj1 wj1Var) {
        this.a = i;
        this.b = subSeasonType;
        this.c = wj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca1)) {
            return false;
        }
        ca1 ca1Var = (ca1) obj;
        return this.a == ca1Var.a && this.b == ca1Var.b && this.c == ca1Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Season.SubSeasonType subSeasonType = this.b;
        int hashCode2 = (hashCode + (subSeasonType == null ? 0 : subSeasonType.hashCode())) * 31;
        wj1 wj1Var = this.c;
        return hashCode2 + (wj1Var != null ? wj1Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectSeason(seasonId=" + this.a + ", subSeasonType=" + this.b + ", statType=" + this.c + ")";
    }
}
