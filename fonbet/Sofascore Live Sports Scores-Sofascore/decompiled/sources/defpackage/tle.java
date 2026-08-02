package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tle extends zle {
    public final ok2 a;
    public final AbstractPlayerSeasonStatistics b;

    public tle(ok2 ok2Var, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics) {
        this.a = ok2Var;
        this.b = abstractPlayerSeasonStatistics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tle)) {
            return false;
        }
        tle tleVar = (tle) obj;
        return this.a.equals(tleVar.a) && this.b.equals(tleVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AllTimeStatsRow(category=" + this.a + ", statistics=" + this.b + ")";
    }
}
