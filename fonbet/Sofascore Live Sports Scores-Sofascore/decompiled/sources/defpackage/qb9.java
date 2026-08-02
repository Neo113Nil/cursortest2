package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qb9 extends ub9 {
    public final int b;
    public final int c;
    public final Season d;
    public final SeasonHighlightedComparison e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb9(int i, int i2, Season season, SeasonHighlightedComparison seasonHighlightedComparison) {
        super(i);
        season.getClass();
        seasonHighlightedComparison.getClass();
        this.b = i;
        this.c = i2;
        this.d = season;
        this.e = seasonHighlightedComparison;
    }

    @Override // defpackage.ub9
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb9)) {
            return false;
        }
        qb9 qb9Var = (qb9) obj;
        return this.b == qb9Var.b && this.c == qb9Var.c && Intrinsics.c(this.d, qb9Var.d) && Intrinsics.c(this.e, qb9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + wv8.a(this.c, Integer.hashCode(this.b) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.b, this.c, "ComparisonItem(type=", ", uniqueTournamentId=", ", season=");
        s.append(this.d);
        s.append(", seasonHighlightedComparison=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
