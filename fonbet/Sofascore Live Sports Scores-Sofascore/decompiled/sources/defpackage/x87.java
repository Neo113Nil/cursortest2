package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x87 implements c97 {
    public final int a;
    public final FantasyCompetitionType b;

    public x87(int i, FantasyCompetitionType fantasyCompetitionType) {
        fantasyCompetitionType.getClass();
        this.a = i;
        this.b = fantasyCompetitionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x87)) {
            return false;
        }
        x87 x87Var = (x87) obj;
        return this.a == x87Var.a && this.b == x87Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnCreateInfoClick(competitionId=" + this.a + ", competitionType=" + this.b + ")";
    }
}
