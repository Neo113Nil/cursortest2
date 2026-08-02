package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ofl {
    public final gv9 a;
    public final tee b;

    static {
        ypa.a(ysa.c, new wel(2));
    }

    public ofl(gv9 gv9Var, tee teeVar) {
        gv9Var.getClass();
        teeVar.getClass();
        this.a = gv9Var;
        this.b = teeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofl)) {
            return false;
        }
        ofl oflVar = (ofl) obj;
        return Intrinsics.c(this.a, oflVar.a) && Intrinsics.c(this.b, oflVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorldCupMeetTeamsData(groups=" + this.a + ", teamsInGroup=" + this.b + ")";
    }
}
