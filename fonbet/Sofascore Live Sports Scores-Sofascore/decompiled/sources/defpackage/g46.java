package defpackage;

import com.sofascore.model.TeamSelection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g46 implements h46 {
    public final TeamSelection a;

    public g46(TeamSelection teamSelection) {
        this.a = teamSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g46) && this.a == ((g46) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectTeam(teamSelection=" + this.a + ")";
    }
}
