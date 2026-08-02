package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class krj implements mrj {
    public final int a;
    public final String b;
    public boolean c = false;
    public pv5 d = null;

    public krj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.mrj
    public final void a(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krj)) {
            return false;
        }
        krj krjVar = (krj) obj;
        return this.a == krjVar.a && this.b.equals(krjVar.b) && this.c == krjVar.c && Intrinsics.c(this.d, krjVar.d);
    }

    @Override // defpackage.mrj
    public final int getTournamentId() {
        return this.a;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        pv5 pv5Var = this.d;
        return e + (pv5Var == null ? 0 : pv5Var.hashCode());
    }

    public final String toString() {
        boolean z = this.c;
        pv5 pv5Var = this.d;
        StringBuilder t = dmi.t(this.a, "TournamentGroupListItem(tournamentId=", ", groupName=", this.b, ", roundTop=");
        t.append(z);
        t.append(", brandColors=");
        t.append(pv5Var);
        t.append(")");
        return t.toString();
    }
}
