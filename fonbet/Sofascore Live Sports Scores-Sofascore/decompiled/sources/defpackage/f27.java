package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f27 {
    public final boolean a;
    public final String b;
    public final j67 c;
    public final ev6 d;

    public f27(boolean z, String str, j67 j67Var, ev6 ev6Var) {
        this.a = z;
        this.b = str;
        this.c = j67Var;
        this.d = ev6Var;
    }

    public static f27 a(f27 f27Var, boolean z, String str, int i) {
        if ((i & 2) != 0) {
            str = f27Var.b;
        }
        j67 j67Var = f27Var.c;
        ev6 ev6Var = f27Var.d;
        f27Var.getClass();
        return new f27(z, str, j67Var, ev6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f27)) {
            return false;
        }
        f27 f27Var = (f27) obj;
        return this.a == f27Var.a && Intrinsics.c(this.b, f27Var.b) && this.c.equals(f27Var.c) && this.d.equals(f27Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "FantasyInviteState(isLoading=" + this.a + ", joinCode=" + this.b + ", league=" + this.c + ", competition=" + this.d + ")";
    }
}
