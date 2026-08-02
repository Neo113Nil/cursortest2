package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xmc {
    public final Tournament a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xmc(Tournament tournament, boolean z, boolean z2, boolean z3, boolean z4) {
        tournament.getClass();
        this.a = tournament;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmc)) {
            return false;
        }
        xmc xmcVar = (xmc) obj;
        return Intrinsics.c(this.a, xmcVar.a) && this.b == xmcVar.b && this.c == xmcVar.c && this.d == xmcVar.d && this.e == xmcVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MmaFightNightHeadFlags(tournament=");
        sb.append(this.a);
        sb.append(", mainCard=");
        sb.append(this.b);
        sb.append(", prelims=");
        vxd.t(", earlyPrelims=", ", allFights=", sb, this.c, this.d);
        return wt3.p(sb, this.e, ")");
    }
}
