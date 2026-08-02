package defpackage;

import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s2e {
    public final TopPlayersStatisticsItem a;
    public final boolean b;
    public final String c;

    public s2e(TopPlayersStatisticsItem topPlayersStatisticsItem, boolean z, String str) {
        topPlayersStatisticsItem.getClass();
        str.getClass();
        this.a = topPlayersStatisticsItem;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2e)) {
            return false;
        }
        s2e s2eVar = (s2e) obj;
        return Intrinsics.c(this.a, s2eVar.a) && this.b == s2eVar.b && Intrinsics.c(this.c, s2eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("POTSRaceRow(item=");
        sb.append(this.a);
        sb.append(", isIneligible=");
        sb.append(this.b);
        sb.append(", positionLabel=");
        return mz1.o(sb, this.c, ")");
    }
}
