package defpackage;

import com.sofascore.model.fantasy.FantasyUserRoundRanking;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c17 {
    public final FantasyUserRoundRanking a;
    public final List b;
    public final boolean c;

    public c17(FantasyUserRoundRanking fantasyUserRoundRanking, List list, boolean z) {
        list.getClass();
        this.a = fantasyUserRoundRanking;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c17)) {
            return false;
        }
        c17 c17Var = (c17) obj;
        return Intrinsics.c(this.a, c17Var.a) && Intrinsics.c(this.b, c17Var.b) && this.c == c17Var.c;
    }

    public final int hashCode() {
        FantasyUserRoundRanking fantasyUserRoundRanking = this.a;
        return Boolean.hashCode(this.c) + dmi.d((fantasyUserRoundRanking == null ? 0 : fantasyUserRoundRanking.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyGameweekHighlightsRankingsState(globalRanking=");
        sb.append(this.a);
        sb.append(", privateLeagueRankings=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return wt3.p(sb, this.c, ")");
    }
}
