package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gf7 {
    public final boolean a;
    public final ef7 b;
    public final gv9 c;
    public final gv9 d;
    public final Long e;
    public final boolean f;

    public gf7(boolean z, ef7 ef7Var, gv9 gv9Var, gv9 gv9Var2, Long l, boolean z2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = z;
        this.b = ef7Var;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = l;
        this.f = z2;
    }

    public static gf7 a(gf7 gf7Var, ef7 ef7Var, gv9 gv9Var, gv9 gv9Var2, Long l, int i) {
        boolean z = (i & 1) != 0 ? gf7Var.a : false;
        if ((i & 2) != 0) {
            ef7Var = gf7Var.b;
        }
        ef7 ef7Var2 = ef7Var;
        if ((i & 4) != 0) {
            gv9Var = gf7Var.c;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 8) != 0) {
            gv9Var2 = gf7Var.d;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 16) != 0) {
            l = gf7Var.e;
        }
        boolean z2 = gf7Var.f;
        gf7Var.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new gf7(z, ef7Var2, gv9Var3, gv9Var4, l, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf7)) {
            return false;
        }
        gf7 gf7Var = (gf7) obj;
        return this.a == gf7Var.a && this.b == gf7Var.b && Intrinsics.c(this.c, gf7Var.c) && Intrinsics.c(this.d, gf7Var.d) && Intrinsics.c(this.e, gf7Var.e) && this.f == gf7Var.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        ef7 ef7Var = this.b;
        int d = ljg.d(ljg.d((hashCode + (ef7Var == null ? 0 : ef7Var.hashCode())) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        return Boolean.hashCode(this.f) + ((d + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyPriceTrackerState(isLoading=");
        sb.append(this.a);
        sb.append(", selectedChip=");
        sb.append(this.b);
        sb.append(", chips=");
        vxd.u(sb, this.c, ", displayedPlayers=", this.d, ", updatedTimestamp=");
        sb.append(this.e);
        sb.append(", assetsRestricted=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gf7(boolean z) {
        this(true, null, r3, r3, null, z);
        rlh rlhVar = rlh.b;
    }
}
