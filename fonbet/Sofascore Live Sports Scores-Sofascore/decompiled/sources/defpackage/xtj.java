package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xtj {
    public final gv9 a;
    public final tee b;
    public final tee c;
    public final tee d;

    public xtj(gv9 gv9Var, tee teeVar, tee teeVar2, tee teeVar3, int i) {
        if ((i & 8) != 0) {
            teeVar2 = uee.g;
            teeVar2.getClass();
        }
        if ((i & 16) != 0) {
            teeVar3 = uee.g;
            teeVar3.getClass();
        }
        gv9Var.getClass();
        teeVar.getClass();
        teeVar2.getClass();
        teeVar3.getClass();
        this.a = gv9Var;
        this.b = teeVar;
        this.c = teeVar2;
        this.d = teeVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtj)) {
            return false;
        }
        xtj xtjVar = (xtj) obj;
        return Intrinsics.c(this.a, xtjVar.a) && Intrinsics.c(this.b, xtjVar.b) && this.c.equals(xtjVar.c) && this.d.equals(xtjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false)) * 31);
    }

    public final String toString() {
        return "TrackerGraphData(positions=" + this.a + ", roundEvents=" + this.b + ", isEliminated=false, roundTimeframes=" + this.c + ", roundTypes=" + this.d + ")";
    }
}
