package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class re7 {
    public final boolean a;
    public final gv9 b;
    public final tee c;

    public re7(boolean z, gv9 gv9Var, tee teeVar) {
        gv9Var.getClass();
        this.a = z;
        this.b = gv9Var;
        this.c = teeVar;
    }

    public static re7 a(re7 re7Var, gv9 gv9Var, tee teeVar, int i) {
        boolean z = (i & 1) != 0 ? re7Var.a : false;
        if ((i & 2) != 0) {
            gv9Var = re7Var.b;
        }
        if ((i & 4) != 0) {
            teeVar = re7Var.c;
        }
        re7Var.getClass();
        gv9Var.getClass();
        teeVar.getClass();
        return new re7(z, gv9Var, teeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re7)) {
            return false;
        }
        re7 re7Var = (re7) obj;
        return this.a == re7Var.a && Intrinsics.c(this.b, re7Var.b) && this.c.equals(re7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "FantasyPlayersOfTheRoundState(isLoading=" + this.a + ", players=" + this.b + ", expandedPlayersData=" + this.c + ")";
    }
}
