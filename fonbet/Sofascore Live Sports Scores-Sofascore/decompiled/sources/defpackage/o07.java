package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o07 {
    public final kj7 a;
    public final gv9 b;
    public final boolean c;
    public final boolean d;

    public o07(kj7 kj7Var, gv9 gv9Var, boolean z, boolean z2) {
        this.a = kj7Var;
        this.b = gv9Var;
        this.c = z;
        this.d = z2;
    }

    public static o07 a(o07 o07Var, kj7 kj7Var, gv9 gv9Var, int i) {
        if ((i & 1) != 0) {
            kj7Var = o07Var.a;
        }
        if ((i & 2) != 0) {
            gv9Var = o07Var.b;
        }
        boolean z = o07Var.d;
        o07Var.getClass();
        return new o07(kj7Var, gv9Var, false, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o07)) {
            return false;
        }
        o07 o07Var = (o07) obj;
        return Intrinsics.c(this.a, o07Var.a) && Intrinsics.c(this.b, o07Var.b) && this.c == o07Var.c && this.d == o07Var.d;
    }

    public final int hashCode() {
        kj7 kj7Var = this.a;
        int hashCode = (kj7Var == null ? 0 : kj7Var.hashCode()) * 31;
        gv9 gv9Var = this.b;
        return Boolean.hashCode(this.d) + dmi.e((hashCode + (gv9Var != null ? gv9Var.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyGameweekHighlightsPOTGWState(item=");
        sb.append(this.a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return w1l.i(", assetsRestricted=", ")", sb, this.c, this.d);
    }
}
