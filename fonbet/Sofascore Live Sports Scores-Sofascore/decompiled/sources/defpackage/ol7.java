package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ol7 {
    public final fo1 a;
    public final int b;
    public final gv9 c;
    public final pl7 d;
    public final pl7 e;

    public ol7(fo1 fo1Var, int i, gv9 gv9Var, pl7 pl7Var, pl7 pl7Var2) {
        fo1Var.getClass();
        gv9Var.getClass();
        this.a = fo1Var;
        this.b = i;
        this.c = gv9Var;
        this.d = pl7Var;
        this.e = pl7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol7)) {
            return false;
        }
        ol7 ol7Var = (ol7) obj;
        return Intrinsics.c(this.a, ol7Var.a) && this.b == ol7Var.b && Intrinsics.c(this.c, ol7Var.c) && this.d.equals(ol7Var.d) && this.e.equals(ol7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ljg.d(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        return "FantasyTOTGWRoundData(round=" + this.a + ", score=" + this.b + ", squad=" + this.c + ", maxScoreTeam=" + this.d + ", minScoreTeam=" + this.e + ")";
    }
}
