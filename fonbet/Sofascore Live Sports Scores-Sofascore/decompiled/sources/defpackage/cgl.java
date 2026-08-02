package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cgl {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final n9k e;
    public final double f;

    public cgl(int i, String str, int i2, String str2, n9k n9kVar, double d) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = n9kVar;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgl)) {
            return false;
        }
        cgl cglVar = (cgl) obj;
        return this.a == cglVar.a && Intrinsics.c(this.b, cglVar.b) && this.c == cglVar.c && this.d.equals(cglVar.d) && this.e.equals(cglVar.e) && Double.compare(this.f, cglVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + ((this.e.hashCode() + dmi.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupPlayerOfTheTournamentUiModel(playerId=", ", playerName=", this.b, ", teamId=");
        vxd.p(this.c, ", teamName=", this.d, ", title=", t);
        t.append(this.e);
        t.append(", rating=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
