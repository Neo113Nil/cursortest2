package defpackage;

import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lyg {
    public final int a;
    public final c73 b;
    public final gv9 c;
    public final ComparisonSeasonInfo d;
    public final Map e;
    public final d73 f;
    public final gv9 g;

    public lyg(int i, c73 c73Var, gv9 gv9Var, ComparisonSeasonInfo comparisonSeasonInfo, int i2) {
        this(i, (i2 & 2) != 0 ? new c73(null, 7) : c73Var, (i2 & 4) != 0 ? rlh.b : gv9Var, (i2 & 8) != 0 ? null : comparisonSeasonInfo, null, null, null);
    }

    public static lyg a(lyg lygVar, c73 c73Var, ComparisonSeasonInfo comparisonSeasonInfo, Map map, d73 d73Var, gv9 gv9Var, int i) {
        int i2 = lygVar.a;
        if ((i & 2) != 0) {
            c73Var = lygVar.b;
        }
        c73 c73Var2 = c73Var;
        gv9 gv9Var2 = lygVar.c;
        if ((i & 8) != 0) {
            comparisonSeasonInfo = lygVar.d;
        }
        ComparisonSeasonInfo comparisonSeasonInfo2 = comparisonSeasonInfo;
        if ((i & 16) != 0) {
            map = lygVar.e;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            d73Var = lygVar.f;
        }
        d73 d73Var2 = d73Var;
        if ((i & 64) != 0) {
            gv9Var = lygVar.g;
        }
        c73Var2.getClass();
        gv9Var2.getClass();
        return new lyg(i2, c73Var2, gv9Var2, comparisonSeasonInfo2, map2, d73Var2, gv9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        lyg lygVar = (lyg) obj;
        return this.a == lygVar.a && Intrinsics.c(this.b, lygVar.b) && Intrinsics.c(this.c, lygVar.c) && Intrinsics.c(this.d, lygVar.d) && Intrinsics.c(this.e, lygVar.e) && Intrinsics.c(this.f, lygVar.f) && Intrinsics.c(this.g, lygVar.g);
    }

    public final int hashCode() {
        int d = ljg.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        ComparisonSeasonInfo comparisonSeasonInfo = this.d;
        int hashCode = (d + (comparisonSeasonInfo == null ? 0 : comparisonSeasonInfo.hashCode())) * 31;
        Map map = this.e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        d73 d73Var = this.f;
        int hashCode3 = (hashCode2 + (d73Var == null ? 0 : d73Var.hashCode())) * 31;
        gv9 gv9Var = this.g;
        return hashCode3 + (gv9Var != null ? gv9Var.hashCode() : 0);
    }

    public final String toString() {
        return "SlotRuntimeState(slotId=" + lnb.k(this.a, "SlotId(raw=", ")") + ", entitySlot=" + this.b + ", tournamentSeasons=" + this.c + ", seasonInfo=" + this.d + ", filterableStatistics=" + this.e + ", filterableDefaultStatistics=" + this.f + ", filterChipItems=" + this.g + ")";
    }

    public lyg(int i, c73 c73Var, gv9 gv9Var, ComparisonSeasonInfo comparisonSeasonInfo, Map map, d73 d73Var, gv9 gv9Var2) {
        c73Var.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = c73Var;
        this.c = gv9Var;
        this.d = comparisonSeasonInfo;
        this.e = map;
        this.f = d73Var;
        this.g = gv9Var2;
    }
}
