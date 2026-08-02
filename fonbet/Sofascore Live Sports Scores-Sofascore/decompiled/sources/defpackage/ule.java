package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ule extends zle {
    public final ok2 a;
    public final UniqueTournament b;
    public final String c;
    public final AbstractPlayerSeasonStatistics d;
    public final boolean e;

    public ule(ok2 ok2Var, UniqueTournament uniqueTournament, String str, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, boolean z) {
        uniqueTournament.getClass();
        this.a = ok2Var;
        this.b = uniqueTournament;
        this.c = str;
        this.d = abstractPlayerSeasonStatistics;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ule)) {
            return false;
        }
        ule uleVar = (ule) obj;
        return this.a.equals(uleVar.a) && Intrinsics.c(this.b, uleVar.b) && this.c.equals(uleVar.c) && this.d.equals(uleVar.d) && this.e == uleVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + dmi.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompetitionRow(category=");
        sb.append(this.a);
        sb.append(", uniqueTournament=");
        sb.append(this.b);
        sb.append(", year=");
        sb.append(this.c);
        sb.append(", statistics=");
        sb.append(this.d);
        sb.append(", hasDivider=");
        return wt3.p(sb, this.e, ")");
    }
}
