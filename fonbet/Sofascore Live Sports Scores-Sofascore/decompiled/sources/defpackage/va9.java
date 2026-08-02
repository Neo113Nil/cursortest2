package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class va9 implements Serializable {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public final boolean d() {
        return this.g || this.a || this.b || this.c || this.d || this.e || this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va9)) {
            return false;
        }
        va9 va9Var = (va9) obj;
        return this.a == va9Var.a && this.b == va9Var.b && this.c == va9Var.c && this.d == va9Var.d && this.e == va9Var.e && this.f == va9Var.f && this.g == va9Var.g && this.h == va9Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        StringBuilder k = w1l.k("HighlightsWrapper(firstTeamScoreCurrent=", z, ", secondTeamScoreCurrent=", z2, ", firstTeamScoreSet=");
        vxd.t(", secondTeamScoreSet=", ", firstTeamScoreGame=", k, z3, z4);
        vxd.t(", secondTeamScoreGame=", ", status=", k, z5, z6);
        return w1l.i(", schedulePost=", ")", k, z7, z8);
    }
}
