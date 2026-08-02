package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y83 {
    public final Season a;
    public final gv9 b;
    public final ComparisonSeasonInfo c;
    public final String d;

    public y83(Season season, gv9 gv9Var, ComparisonSeasonInfo comparisonSeasonInfo, String str) {
        gv9Var.getClass();
        str.getClass();
        this.a = season;
        this.b = gv9Var;
        this.c = comparisonSeasonInfo;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y83)) {
            return false;
        }
        y83 y83Var = (y83) obj;
        return this.a.equals(y83Var.a) && Intrinsics.c(this.b, y83Var.b) && this.c.equals(y83Var.c) && Intrinsics.c(this.d, y83Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ComparisonSeason(season=" + this.a + ", subSeasonTypes=" + this.b + ", seasonInfo=" + this.c + ", yearLabel=" + this.d + ")";
    }
}
