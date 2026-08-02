package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z16 {
    public final boolean a;
    public final boolean b;

    public z16(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 4) == 0;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z16)) {
            return false;
        }
        z16 z16Var = (z16) obj;
        return this.a == z16Var.a && this.b == z16Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + dmi.e(Boolean.hashCode(this.a) * 31, 31, true);
    }

    public final String toString() {
        return "TournamentGroupLogic(shouldGroup=" + this.a + ", showGroups=true, showTournamentsAndGroups=" + this.b + ")";
    }
}
