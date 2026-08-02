package defpackage;

import com.sofascore.model.mvvm.model.Season;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class syi {
    public final int a;
    public final Season b;
    public final List c;

    public syi(int i, Season season, List list) {
        season.getClass();
        list.getClass();
        this.a = i;
        this.b = season;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syi)) {
            return false;
        }
        syi syiVar = (syi) obj;
        return this.a == syiVar.a && Intrinsics.c(this.b, syiVar.b) && Intrinsics.c(this.c, syiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniqueSeasonInfo(uniqueTournamentId=");
        sb.append(this.a);
        sb.append(", season=");
        sb.append(this.b);
        sb.append(", subSeasonTypes=");
        return mz1.p(sb, this.c, ")");
    }
}
