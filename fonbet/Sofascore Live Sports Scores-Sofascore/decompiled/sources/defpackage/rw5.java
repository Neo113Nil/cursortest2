package defpackage;

import com.sofascore.model.TeamSelection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rw5 implements sw5 {
    public final TeamSelection a;

    public rw5(TeamSelection teamSelection) {
        this.a = teamSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw5) && this.a == ((rw5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectTeam(teamSelection=" + this.a + ")";
    }
}
