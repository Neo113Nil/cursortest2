package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g4j {
    public final wk2 a;
    public final gv9 b;

    public g4j(wk2 wk2Var, gv9 gv9Var) {
        wk2Var.getClass();
        gv9Var.getClass();
        this.a = wk2Var;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4j)) {
            return false;
        }
        g4j g4jVar = (g4j) obj;
        return this.a == g4jVar.a && Intrinsics.c(this.b, g4jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrophyGroupUiModel(tournamentType=" + this.a + ", combinedTrophies=" + this.b + ")";
    }
}
