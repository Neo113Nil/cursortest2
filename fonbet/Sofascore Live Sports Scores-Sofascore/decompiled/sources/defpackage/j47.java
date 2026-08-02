package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j47 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public j47(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public static j47 a(j47 j47Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = j47Var.a;
        }
        if ((i & 2) != 0) {
            z2 = j47Var.b;
        }
        if ((i & 4) != 0) {
            z3 = j47Var.c;
        }
        int i2 = j47Var.d;
        j47Var.getClass();
        return new j47(z, z2, z3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j47)) {
            return false;
        }
        j47 j47Var = (j47) obj;
        return this.a == j47Var.a && this.b == j47Var.b && this.c == j47Var.c && this.d == j47Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder k = w1l.k("FantasyLeagueJoinBottomSheetState(joinPrivateLeagueInProgress=", this.a, ", joinPrivateError=", this.b, ", joinRandomLeagueInProgress=");
        k.append(this.c);
        k.append(", joinedRandomLeaguesCount=");
        k.append(this.d);
        k.append(")");
        return k.toString();
    }
}
