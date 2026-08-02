package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ol1 {
    public final String a;
    public final gv9 b;
    public final int c;
    public final boolean d;

    public ol1(String str, gv9 gv9Var, int i, boolean z) {
        str.getClass();
        gv9Var.getClass();
        this.a = str;
        this.b = gv9Var;
        this.c = i;
        this.d = z;
    }

    public static ol1 a(ol1 ol1Var) {
        String str = ol1Var.a;
        gv9 gv9Var = ol1Var.b;
        int i = ol1Var.c;
        ol1Var.getClass();
        str.getClass();
        gv9Var.getClass();
        return new ol1(str, gv9Var, i, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return Intrinsics.c(this.a, ol1Var.a) && Intrinsics.c(this.b, ol1Var.b) && this.c == ol1Var.c && this.d == ol1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + wv8.a(this.c, ljg.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "GraphPointGroup(type=" + this.a + ", points=" + this.b + ", colorResId=" + this.c + ", enabled=" + this.d + ")";
    }
}
