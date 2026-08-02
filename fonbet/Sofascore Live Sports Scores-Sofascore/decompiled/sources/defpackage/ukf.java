package defpackage;

import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ukf {
    public final RaceFlowModels$RaceEntrant a;
    public final ykf b;

    public ukf(RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant, ykf ykfVar) {
        this.a = raceFlowModels$RaceEntrant;
        this.b = ykfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukf)) {
            return false;
        }
        ukf ukfVar = (ukf) obj;
        return this.a.equals(ukfVar.a) && this.b.equals(ukfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RaceEntrantLap(entrant=" + this.a + ", lap=" + this.b + ")";
    }
}
