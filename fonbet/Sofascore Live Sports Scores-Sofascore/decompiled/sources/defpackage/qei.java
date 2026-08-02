package defpackage;

import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qei implements Serializable {
    public final List a;
    public final gc6 b;
    public final List c;
    public final TeamEventShotmapWrapper d;
    public final List e;

    public qei(List list, gc6 gc6Var, List list2, TeamEventShotmapWrapper teamEventShotmapWrapper, List list3) {
        list.getClass();
        this.a = list;
        this.b = gc6Var;
        this.c = list2;
        this.d = teamEventShotmapWrapper;
        this.e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qei)) {
            return false;
        }
        qei qeiVar = (qei) obj;
        return Intrinsics.c(this.a, qeiVar.a) && Intrinsics.c(this.b, qeiVar.b) && Intrinsics.c(this.c, qeiVar.c) && Intrinsics.c(this.d, qeiVar.d) && Intrinsics.c(this.e, qeiVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gc6 gc6Var = this.b;
        int hashCode2 = (hashCode + (gc6Var == null ? 0 : gc6Var.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TeamEventShotmapWrapper teamEventShotmapWrapper = this.d;
        int hashCode4 = (hashCode3 + (teamEventShotmapWrapper == null ? 0 : teamEventShotmapWrapper.hashCode())) * 31;
        List list2 = this.e;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticsDataWrapper(statisticsList=");
        sb.append(this.a);
        sb.append(", eventTeamHeatmapData=");
        sb.append(this.b);
        sb.append(", footballTeamShotmap=");
        sb.append(this.c);
        sb.append(", basketballTeamShotmap=");
        sb.append(this.d);
        sb.append(", hockeyTeamShotmap=");
        return mz1.p(sb, this.e, ")");
    }
}
