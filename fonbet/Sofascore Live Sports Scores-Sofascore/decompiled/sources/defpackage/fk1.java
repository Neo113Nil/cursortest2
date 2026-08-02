package defpackage;

import com.sofascore.model.mvvm.model.Season;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fk1 {
    public final gv9 a;
    public final am1 b;
    public final Season.SubSeasonType c;
    public final gv9 d;
    public final wj1 e;
    public final gv9 f;
    public final boolean g;
    public final vl1 h;

    public fk1(b7 b7Var, am1 am1Var, Season.SubSeasonType subSeasonType, b7 b7Var2, gv9 gv9Var, int i) {
        this((i & 1) != 0 ? rlh.b : b7Var, (i & 2) != 0 ? null : am1Var, (i & 4) != 0 ? null : subSeasonType, (i & 8) != 0 ? null : b7Var2, (i & 16) != 0 ? null : wj1.b, (i & 32) != 0 ? null : gv9Var, true, null);
    }

    public static fk1 a(fk1 fk1Var, gv9 gv9Var, am1 am1Var, Season.SubSeasonType subSeasonType, gv9 gv9Var2, wj1 wj1Var, gv9 gv9Var3, boolean z, vl1 vl1Var, int i) {
        if ((i & 1) != 0) {
            gv9Var = fk1Var.a;
        }
        gv9 gv9Var4 = gv9Var;
        if ((i & 2) != 0) {
            am1Var = fk1Var.b;
        }
        am1 am1Var2 = am1Var;
        if ((i & 4) != 0) {
            subSeasonType = fk1Var.c;
        }
        Season.SubSeasonType subSeasonType2 = subSeasonType;
        if ((i & 8) != 0) {
            gv9Var2 = fk1Var.d;
        }
        gv9 gv9Var5 = gv9Var2;
        if ((i & 16) != 0) {
            wj1Var = fk1Var.e;
        }
        wj1 wj1Var2 = wj1Var;
        if ((i & 32) != 0) {
            gv9Var3 = fk1Var.f;
        }
        gv9 gv9Var6 = gv9Var3;
        boolean z2 = (i & 64) != 0 ? fk1Var.g : z;
        vl1 vl1Var2 = (i & 128) != 0 ? fk1Var.h : vl1Var;
        fk1Var.getClass();
        gv9Var4.getClass();
        return new fk1(gv9Var4, am1Var2, subSeasonType2, gv9Var5, wj1Var2, gv9Var6, z2, vl1Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        return Intrinsics.c(this.a, fk1Var.a) && Intrinsics.c(this.b, fk1Var.b) && this.c == fk1Var.c && Intrinsics.c(this.d, fk1Var.d) && this.e == fk1Var.e && Intrinsics.c(this.f, fk1Var.f) && this.g == fk1Var.g && Intrinsics.c(this.h, fk1Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        am1 am1Var = this.b;
        int hashCode2 = (hashCode + (am1Var == null ? 0 : am1Var.hashCode())) * 31;
        Season.SubSeasonType subSeasonType = this.c;
        int hashCode3 = (hashCode2 + (subSeasonType == null ? 0 : subSeasonType.hashCode())) * 31;
        gv9 gv9Var = this.d;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        wj1 wj1Var = this.e;
        int hashCode5 = (hashCode4 + (wj1Var == null ? 0 : wj1Var.hashCode())) * 31;
        gv9 gv9Var2 = this.f;
        int e = dmi.e((hashCode5 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31, 31, this.g);
        vl1 vl1Var = this.h;
        return e + (vl1Var != null ? vl1Var.hashCode() : 0);
    }

    public final String toString() {
        return "BaseballPlayerSeasonStatisticsState(availableSeasons=" + this.a + ", selectedSeason=" + this.b + ", selectedSubSeason=" + this.c + ", availableStatTypes=" + this.d + ", selectedStatType=" + this.e + ", statsByCategory=" + this.f + ", isRefreshing=" + this.g + ", chartState=" + this.h + ")";
    }

    public fk1(gv9 gv9Var, am1 am1Var, Season.SubSeasonType subSeasonType, gv9 gv9Var2, wj1 wj1Var, gv9 gv9Var3, boolean z, vl1 vl1Var) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = am1Var;
        this.c = subSeasonType;
        this.d = gv9Var2;
        this.e = wj1Var;
        this.f = gv9Var3;
        this.g = z;
        this.h = vl1Var;
    }
}
