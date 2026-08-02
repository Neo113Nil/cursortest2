package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zx6 {
    public final uj7 a;
    public final tee b;

    public zx6(uj7 uj7Var, tee teeVar) {
        uj7Var.getClass();
        this.a = uj7Var;
        this.b = teeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx6)) {
            return false;
        }
        zx6 zx6Var = (zx6) obj;
        return this.a == zx6Var.a && this.b.equals(zx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyFinishedCompetitionsState(status=" + this.a + ", competitionsBySeason=" + this.b + ")";
    }
}
