package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p9b implements j9b {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final gv9 e;
    public final gv9 f;
    public final k9b g;
    public final q9b h;
    public final n9b i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public p9b(int i, String str, String str2, boolean z, gv9 gv9Var, gv9 gv9Var2, k9b k9bVar, q9b q9bVar, n9b n9bVar, String str3, boolean z2, int i2) {
        str2 = (i2 & 4) != 0 ? null : str2;
        z = (i2 & 8) != 0 ? false : z;
        gv9Var = (i2 & 16) != 0 ? rlh.b : gv9Var;
        gv9Var2 = (i2 & 32) != 0 ? rlh.b : gv9Var2;
        k9bVar = (i2 & 64) != 0 ? null : k9bVar;
        q9bVar = (i2 & 128) != 0 ? null : q9bVar;
        n9bVar = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : n9bVar;
        str3 = (i2 & 512) != 0 ? null : str3;
        boolean z3 = (i2 & 1024) == 0;
        z2 = (i2 & a.o) != 0 ? true : z2;
        str.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = gv9Var;
        this.f = gv9Var2;
        this.g = k9bVar;
        this.h = q9bVar;
        this.i = n9bVar;
        this.j = str3;
        this.k = z3;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9b)) {
            return false;
        }
        p9b p9bVar = (p9b) obj;
        return this.a == p9bVar.a && Intrinsics.c(this.b, p9bVar.b) && Intrinsics.c(this.c, p9bVar.c) && this.d == p9bVar.d && this.e.equals(p9bVar.e) && this.f.equals(p9bVar.f) && Intrinsics.c(this.g, p9bVar.g) && Intrinsics.c(this.h, p9bVar.h) && Intrinsics.c(this.i, p9bVar.i) && Intrinsics.c(this.j, p9bVar.j) && this.k == p9bVar.k && this.l == p9bVar.l;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int d = ljg.d(ljg.d(dmi.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        k9b k9bVar = this.g;
        int hashCode = (d + (k9bVar == null ? 0 : k9bVar.hashCode())) * 31;
        q9b q9bVar = this.h;
        int hashCode2 = (hashCode + (q9bVar == null ? 0 : q9bVar.hashCode())) * 31;
        n9b n9bVar = this.i;
        int hashCode3 = (hashCode2 + (n9bVar == null ? 0 : n9bVar.hashCode())) * 31;
        String str2 = this.j;
        return Boolean.hashCode(this.l) + dmi.e((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "LineupsListPlayerUiModel(playerId=", ", name=", this.b, ", jerseyNumber=");
        dmi.w(t, this.c, ", isTopRated=", this.d, ", incidentIcons=");
        vxd.u(t, this.e, ", substitutions=", this.f, ", chipData=");
        t.append(this.g);
        t.append(", ratingBreakdowns=");
        t.append(this.h);
        t.append(", injuryData=");
        t.append(this.i);
        t.append(", position=");
        t.append(this.j);
        t.append(", hasEndComponent=");
        return w1l.i(", showBottomDivider=", ")", t, this.k, this.l);
    }
}
