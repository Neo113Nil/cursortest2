package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gwf {
    public final Event a;
    public final TeamShirtColors b;
    public final TeamShirtColors c;

    public gwf(Event event, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2) {
        this.a = event;
        this.b = teamShirtColors;
        this.c = teamShirtColors2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwf)) {
            return false;
        }
        gwf gwfVar = (gwf) obj;
        return this.a.equals(gwfVar.a) && this.b.equals(gwfVar.b) && this.c.equals(gwfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncidentMetaData(event=" + this.a + ", homeShirtColors=" + this.b + ", awayShirtColors=" + this.c + ")";
    }
}
