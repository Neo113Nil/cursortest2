package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yle extends zle {
    public final ok2 a;
    public final String b;
    public final AbstractPlayerSeasonStatistics c;
    public final List d;
    public final boolean e;
    public final Integer f;

    public yle(ok2 ok2Var, String str, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, List list, boolean z, Integer num) {
        str.getClass();
        list.getClass();
        this.a = ok2Var;
        this.b = str;
        this.c = abstractPlayerSeasonStatistics;
        this.d = list;
        this.e = z;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yle)) {
            return false;
        }
        yle yleVar = (yle) obj;
        return this.a.equals(yleVar.a) && Intrinsics.c(this.b, yleVar.b) && this.c.equals(yleVar.c) && Intrinsics.c(this.d, yleVar.d) && this.e == yleVar.e && Intrinsics.c(this.f, yleVar.f);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.d((this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "StatsRow(category=" + this.a + ", year=" + this.b + ", statistics=" + this.c + ", teamIds=" + this.d + ", hasDivider=" + this.e + ", seasonId=" + this.f + ")";
    }
}
