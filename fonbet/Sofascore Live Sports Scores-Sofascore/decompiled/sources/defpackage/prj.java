package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class prj {
    public final gv9 a;
    public final gv9 b;
    public final int c;
    public final int d;

    public prj(gv9 gv9Var, gv9 gv9Var2, int i, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prj)) {
            return false;
        }
        prj prjVar = (prj) obj;
        return Intrinsics.c(this.a, prjVar.a) && Intrinsics.c(this.b, prjVar.b) && this.c == prjVar.c && this.d == prjVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, ljg.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return me4.i(wv8.l("TournamentPreviousWinnersUIModel(previousWinners=", this.a, ", mostTitles=", this.b, ", titlesRes="), this.c, ", mostTitlesRes=", this.d, ")");
    }
}
