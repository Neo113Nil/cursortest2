package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aoj implements c71, Serializable {
    public final znj a;
    public final umj b;

    public aoj(znj znjVar, umj umjVar) {
        this.a = znjVar;
        this.b = umjVar;
    }

    @Override // defpackage.c71
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoj)) {
            return false;
        }
        aoj aojVar = (aoj) obj;
        return this.a.equals(aojVar.a) && this.b.equals(aojVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopStatsTeamItem(team=" + this.a + ", statisticItem=" + this.b + ")";
    }
}
