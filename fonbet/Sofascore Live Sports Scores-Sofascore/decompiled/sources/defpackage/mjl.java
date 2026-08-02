package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mjl {
    public final int a;
    public final String b;
    public final String c;
    public final xjc d;

    public mjl(int i, String str, String str2, xjc xjcVar) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = xjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjl)) {
            return false;
        }
        mjl mjlVar = (mjl) obj;
        return this.a == mjlVar.a && Intrinsics.c(this.b, mjlVar.b) && this.c.equals(mjlVar.c) && this.d.equals(mjlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupTournamentWinnerUiModel(winnerTeamId=", ", winnerTeamName=", this.b, ", winnerTeamAlpha2=");
        t.append(this.c);
        t.append(", miniEvent=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
