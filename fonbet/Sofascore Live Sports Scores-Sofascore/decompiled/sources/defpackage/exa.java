package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class exa {
    public final int a;
    public final gv9 b;

    public exa(int i, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exa)) {
            return false;
        }
        exa exaVar = (exa) obj;
        return this.a == exaVar.a && Intrinsics.c(this.b, exaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LeagueGoatPlayers(totalVotes=" + this.a + ", players=" + this.b + ")";
    }
}
