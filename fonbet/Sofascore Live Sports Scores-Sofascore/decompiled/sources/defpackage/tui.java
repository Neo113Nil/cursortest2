package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tui {
    public final gv9 a;
    public final boolean b;

    public tui(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tui)) {
            return false;
        }
        tui tuiVar = (tui) obj;
        return Intrinsics.c(this.a, tuiVar.a) && this.b == tuiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamChartLine(positions=" + this.a + ", isEliminated=" + this.b + ")";
    }
}
