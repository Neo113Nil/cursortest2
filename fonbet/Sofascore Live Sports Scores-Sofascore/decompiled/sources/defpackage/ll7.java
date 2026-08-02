package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ll7 {
    public final ho7 a;
    public final ev6 b;
    public final gv9 c;
    public final uj7 d;
    public final gv9 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ll7(ho7 ho7Var, ev6 ev6Var, gv9 gv9Var, uj7 uj7Var, gv9 gv9Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        ho7Var.getClass();
        ev6Var.getClass();
        gv9Var.getClass();
        uj7Var.getClass();
        gv9Var2.getClass();
        this.a = ho7Var;
        this.b = ev6Var;
        this.c = gv9Var;
        this.d = uj7Var;
        this.e = gv9Var2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static ll7 a(ll7 ll7Var, ho7 ho7Var, gv9 gv9Var, gv9 gv9Var2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        uj7 uj7Var = uj7.c;
        if ((i & 1) != 0) {
            ho7Var = ll7Var.a;
        }
        ho7 ho7Var2 = ho7Var;
        ev6 ev6Var = ll7Var.b;
        if ((i & 4) != 0) {
            gv9Var = ll7Var.c;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 8) != 0) {
            uj7Var = ll7Var.d;
        }
        uj7 uj7Var2 = uj7Var;
        gv9 gv9Var4 = (i & 16) != 0 ? ll7Var.e : gv9Var2;
        boolean z5 = (i & 32) != 0 ? ll7Var.f : z;
        boolean z6 = (i & 64) != 0 ? ll7Var.g : z2;
        boolean z7 = (i & 128) != 0 ? ll7Var.h : z3;
        boolean z8 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? ll7Var.i : z4;
        ll7Var.getClass();
        ho7Var2.getClass();
        ev6Var.getClass();
        gv9Var3.getClass();
        uj7Var2.getClass();
        gv9Var4.getClass();
        return new ll7(ho7Var2, ev6Var, gv9Var3, uj7Var2, gv9Var4, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll7)) {
            return false;
        }
        ll7 ll7Var = (ll7) obj;
        return Intrinsics.c(this.a, ll7Var.a) && Intrinsics.c(this.b, ll7Var.b) && Intrinsics.c(this.c, ll7Var.c) && this.d == ll7Var.d && Intrinsics.c(this.e, ll7Var.e) && this.f == ll7Var.f && this.g == ll7Var.g && this.h == ll7Var.h && this.i == ll7Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + dmi.e(dmi.e(dmi.e(ljg.d((this.d.hashCode() + ljg.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasySubstitutionsState(round=");
        sb.append(this.a);
        sb.append(", competition=");
        sb.append(this.b);
        sb.append(", squad=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", fixtures=");
        sb.append(this.e);
        sb.append(", pendingSubstitution=");
        sb.append(this.f);
        sb.append(", hasChanges=");
        vxd.t(", showSubstitutionsInfoBubble=", ", confirmInProgress=", sb, this.g, this.h);
        return wt3.p(sb, this.i, ")");
    }
}
