package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wyg {
    public final AbstractPlayerSeasonStatistics a;
    public final String b;
    public final String c;

    public wyg(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str, String str2) {
        abstractPlayerSeasonStatistics.getClass();
        this.a = abstractPlayerSeasonStatistics;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyg)) {
            return false;
        }
        wyg wygVar = (wyg) obj;
        return Intrinsics.c(this.a, wygVar.a) && Intrinsics.c(this.b, wygVar.b) && this.c.equals(wygVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonPlayerStatistics(statistics=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", sport=");
        return mz1.o(sb, this.c, ")");
    }
}
