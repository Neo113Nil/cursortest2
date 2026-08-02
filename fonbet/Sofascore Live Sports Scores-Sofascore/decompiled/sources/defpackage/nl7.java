package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nl7 {
    public final gv9 a;
    public final ol7 b;
    public final gv9 c;
    public final boolean d;

    public nl7(gv9 gv9Var, ol7 ol7Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = ol7Var;
        this.c = gv9Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl7)) {
            return false;
        }
        nl7 nl7Var = (nl7) obj;
        return Intrinsics.c(this.a, nl7Var.a) && Intrinsics.c(this.b, nl7Var.b) && Intrinsics.c(this.c, nl7Var.c) && this.d == nl7Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gv9 gv9Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31);
    }

    public final String toString() {
        return "FantasyTOTGWData(rounds=" + this.a + ", selectedRoundData=" + this.b + ", fixturesByLeague=" + this.c + ", isLoading=" + this.d + ")";
    }
}
