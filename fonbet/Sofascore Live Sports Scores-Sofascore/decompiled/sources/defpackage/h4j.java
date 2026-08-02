package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h4j {
    public final wk2 a;
    public final boolean b;
    public final int c;
    public final String d;
    public final boolean e;
    public final int f;

    public h4j(wk2 wk2Var, boolean z, int i, String str, boolean z2, int i2) {
        wk2Var.getClass();
        this.a = wk2Var;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = z2;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4j)) {
            return false;
        }
        h4j h4jVar = (h4j) obj;
        return this.a == h4jVar.a && this.b == h4jVar.b && this.c == h4jVar.c && this.d.equals(h4jVar.d) && this.e == h4jVar.e && this.f == h4jVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dmi.e(dmi.c(wv8.a(this.c, dmi.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrophyUiModel(tournamentType=");
        sb.append(this.a);
        sb.append(", isMajor=");
        sb.append(this.b);
        sb.append(", tournamentId=");
        vxd.p(this.c, ", tournamentName=", this.d, ", tournamentClickable=", sb);
        sb.append(this.e);
        sb.append(", timesWon=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
