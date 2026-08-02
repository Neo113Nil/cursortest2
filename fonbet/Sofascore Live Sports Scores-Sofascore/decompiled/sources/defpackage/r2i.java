package defpackage;

import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r2i implements x2i {
    public final RaceFlowModels$RaceTeam a;

    public r2i(RaceFlowModels$RaceTeam raceFlowModels$RaceTeam) {
        this.a = raceFlowModels$RaceTeam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2i) && Intrinsics.c(this.a, ((r2i) obj).a);
    }

    public final int hashCode() {
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = this.a;
        if (raceFlowModels$RaceTeam == null) {
            return 0;
        }
        return raceFlowModels$RaceTeam.hashCode();
    }

    public final String toString() {
        return "ChangeTeamFilter(team=" + this.a + ")";
    }
}
