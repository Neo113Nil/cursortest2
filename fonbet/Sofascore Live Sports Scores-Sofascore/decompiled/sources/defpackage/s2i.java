package defpackage;

import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s2i implements x2i {
    public final RaceFlowModels$RaceEntrant a;

    public s2i(RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant) {
        this.a = raceFlowModels$RaceEntrant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2i) && this.a.equals(((s2i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnChipClick(entrant=" + this.a + ")";
    }
}
