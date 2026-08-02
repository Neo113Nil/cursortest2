package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j17 {
    public final ol7 a;
    public final Float b;
    public final Integer c;
    public final boolean d;
    public final ev6 e;

    public j17(ol7 ol7Var, Float f, Integer num, boolean z, ev6 ev6Var) {
        this.a = ol7Var;
        this.b = f;
        this.c = num;
        this.d = z;
        this.e = ev6Var;
    }

    public static j17 a(j17 j17Var, ol7 ol7Var, Float f, Integer num, int i) {
        if ((i & 1) != 0) {
            ol7Var = j17Var.a;
        }
        ol7 ol7Var2 = ol7Var;
        if ((i & 2) != 0) {
            f = j17Var.b;
        }
        Float f2 = f;
        if ((i & 4) != 0) {
            num = j17Var.c;
        }
        ev6 ev6Var = j17Var.e;
        j17Var.getClass();
        return new j17(ol7Var2, f2, num, false, ev6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j17)) {
            return false;
        }
        j17 j17Var = (j17) obj;
        return Intrinsics.c(this.a, j17Var.a) && Intrinsics.c(this.b, j17Var.b) && Intrinsics.c(this.c, j17Var.c) && this.d == j17Var.d && Intrinsics.c(this.e, j17Var.e);
    }

    public final int hashCode() {
        ol7 ol7Var = this.a;
        int hashCode = (ol7Var == null ? 0 : ol7Var.hashCode()) * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.c;
        int e = dmi.e((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        ev6 ev6Var = this.e;
        return e + (ev6Var != null ? ev6Var.hashCode() : 0);
    }

    public final String toString() {
        return "FantasyGameweekHighlightsTOTGWState(totgw=" + this.a + ", roundAveragePoints=" + this.b + ", roundMaxPoints=" + this.c + ", isLoading=" + this.d + ", competition=" + this.e + ")";
    }
}
