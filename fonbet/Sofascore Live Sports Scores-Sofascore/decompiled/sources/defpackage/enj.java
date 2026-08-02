package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class enj implements fnj {
    public final int a;
    public final int b;

    public enj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enj)) {
            return false;
        }
        enj enjVar = (enj) obj;
        return this.a == enjVar.a && this.b == enjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "TournamentSeasonChanged(tournamentId=", ", seasonId=", ")");
    }
}
