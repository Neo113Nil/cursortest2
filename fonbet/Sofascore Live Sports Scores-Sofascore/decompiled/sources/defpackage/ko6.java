package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ko6 {
    public final gv9 a;
    public final gv9 b;
    public final boolean c;

    public ko6(gv9 gv9Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko6)) {
            return false;
        }
        ko6 ko6Var = (ko6) obj;
        return Intrinsics.c(this.a, ko6Var.a) && Intrinsics.c(this.b, ko6Var.b) && this.c == ko6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(wv8.l("FantasyChatsState(publicLeagues=", this.a, ", privateLeagues=", this.b, ", isLoading="), this.c, ")");
    }
}
