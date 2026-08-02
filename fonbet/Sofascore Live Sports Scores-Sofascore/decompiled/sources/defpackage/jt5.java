package defpackage;

import com.sofascore.model.TeamSelection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jt5 implements lt5 {
    public final TeamSelection a;

    public jt5(TeamSelection teamSelection) {
        this.a = teamSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt5) && this.a == ((jt5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnTeamChanged(teamType=" + this.a + ")";
    }
}
