package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zpf {
    public final gv9 a;
    public final gv9 b;
    public final old c;

    public zpf(gv9 gv9Var, gv9 gv9Var2, old oldVar) {
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = oldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpf)) {
            return false;
        }
        zpf zpfVar = (zpf) obj;
        return Intrinsics.c(this.a, zpfVar.a) && Intrinsics.c(this.b, zpfVar.b) && this.c.equals(zpfVar.c);
    }

    public final int hashCode() {
        gv9 gv9Var = this.a;
        int hashCode = (gv9Var == null ? 0 : gv9Var.hashCode()) * 31;
        gv9 gv9Var2 = this.b;
        return this.c.hashCode() + ((hashCode + (gv9Var2 != null ? gv9Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("RecommendedOddsState(tournamentOdds=", this.a, ", topVotedOdds=", this.b, ", countryProvider=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
