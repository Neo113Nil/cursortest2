package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u97 {
    public final int a;
    public final FantasyCompetitionType b;

    public u97(int i, FantasyCompetitionType fantasyCompetitionType) {
        fantasyCompetitionType.getClass();
        this.a = i;
        this.b = fantasyCompetitionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u97)) {
            return false;
        }
        u97 u97Var = (u97) obj;
        return this.a == u97Var.a && this.b == u97Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TeamCreateSuccess(competitionId=" + this.a + ", competitionType=" + this.b + ")";
    }
}
