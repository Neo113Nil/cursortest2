package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u28 {
    public final String a;
    public final r9k b;
    public final gv9 c;
    public final String d;
    public final boolean e;
    public final gv9 f;
    public final boolean g;

    public u28(String str, r9k r9kVar, gv9 gv9Var, String str2, boolean z, gv9 gv9Var2, boolean z2) {
        str.getClass();
        gv9Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = r9kVar;
        this.c = gv9Var;
        this.d = str2;
        this.e = z;
        this.f = gv9Var2;
        this.g = z2;
    }

    public static u28 a(u28 u28Var, String str, boolean z, boolean z2, int i) {
        String str2 = u28Var.a;
        r9k r9kVar = u28Var.b;
        gv9 gv9Var = u28Var.c;
        if ((i & 8) != 0) {
            str = u28Var.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            z = u28Var.e;
        }
        boolean z3 = z;
        gv9 gv9Var2 = u28Var.f;
        if ((i & 64) != 0) {
            z2 = u28Var.g;
        }
        str2.getClass();
        r9kVar.getClass();
        gv9Var.getClass();
        str3.getClass();
        return new u28(str2, r9kVar, gv9Var, str3, z3, gv9Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u28)) {
            return false;
        }
        u28 u28Var = (u28) obj;
        return Intrinsics.c(this.a, u28Var.a) && Intrinsics.c(this.b, u28Var.b) && Intrinsics.c(this.c, u28Var.c) && Intrinsics.c(this.d, u28Var.d) && this.e == u28Var.e && Intrinsics.c(this.f, u28Var.f) && this.g == u28Var.g;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(ljg.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        gv9 gv9Var = this.f;
        return Boolean.hashCode(this.g) + ((e + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterChipGroupUiModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", options=");
        sb.append(this.c);
        sb.append(", selectedOptionId=");
        sb.append(this.d);
        sb.append(", isDisabled=");
        sb.append(this.e);
        sb.append(", disclaimersList=");
        sb.append(this.f);
        sb.append(", showDisclaimer=");
        return wt3.p(sb, this.g, ")");
    }

    public u28(String str, q9k q9kVar, gv9 gv9Var, String str2, b7 b7Var, boolean z, int i) {
        this(str, (r9k) q9kVar, gv9Var, str2, false, (gv9) ((i & 32) != 0 ? null : b7Var), (i & 64) != 0 ? false : z);
    }
}
