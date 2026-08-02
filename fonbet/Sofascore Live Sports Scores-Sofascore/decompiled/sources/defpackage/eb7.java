package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eb7 implements hb7 {
    public final FantasyCompetitionType a;

    public eb7(FantasyCompetitionType fantasyCompetitionType) {
        fantasyCompetitionType.getClass();
        this.a = fantasyCompetitionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb7) && this.a == ((eb7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompetitionTypeInfoClick(type=" + this.a + ")";
    }
}
