package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e67 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final gv9 e;

    public e67(gv9 gv9Var, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = gv9Var;
    }

    public static e67 a(e67 e67Var, String str, boolean z, gv9 gv9Var, int i) {
        String str2 = e67Var.a;
        boolean z2 = e67Var.b;
        if ((i & 4) != 0) {
            str = e67Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = e67Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            gv9Var = e67Var.e;
        }
        gv9 gv9Var2 = gv9Var;
        e67Var.getClass();
        str2.getClass();
        gv9Var2.getClass();
        return new e67(gv9Var2, str2, str3, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e67)) {
            return false;
        }
        e67 e67Var = (e67) obj;
        return Intrinsics.c(this.a, e67Var.a) && this.b == e67Var.b && this.c.equals(e67Var.c) && this.d == e67Var.d && Intrinsics.c(this.e, e67Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.e(dmi.c(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyLeagueTeamsState(userId=");
        sb.append(this.a);
        sb.append(", isAdmin=");
        sb.append(this.b);
        sb.append(", query=");
        dmi.w(sb, this.c, ", kickInProgress=", this.d, ", kickedUsers=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
