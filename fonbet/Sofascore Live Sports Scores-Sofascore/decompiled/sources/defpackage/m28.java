package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m28 {
    public final String a;
    public final Object b;
    public final gv9 c;
    public final q9k d;
    public final boolean e;

    public m28(String str, Object obj, gv9 gv9Var, q9k q9kVar, boolean z) {
        gv9Var.getClass();
        this.a = str;
        this.b = obj;
        this.c = gv9Var;
        this.d = q9kVar;
        this.e = z;
    }

    public static m28 a(m28 m28Var, Object obj, gv9 gv9Var, int i) {
        String str = m28Var.a;
        if ((i & 2) != 0) {
            obj = m28Var.b;
        }
        Object obj2 = obj;
        if ((i & 4) != 0) {
            gv9Var = m28Var.c;
        }
        gv9 gv9Var2 = gv9Var;
        q9k q9kVar = m28Var.d;
        boolean z = m28Var.e;
        gv9Var2.getClass();
        return new m28(str, obj2, gv9Var2, q9kVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m28)) {
            return false;
        }
        m28 m28Var = (m28) obj;
        return this.a.equals(m28Var.a) && Intrinsics.c(this.b, m28Var.b) && Intrinsics.c(this.c, m28Var.c) && this.d.equals(m28Var.d) && this.e == m28Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return Boolean.hashCode(this.e) + lnb.e(ljg.d((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterAutocompleteUiModel(id=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", suggestions=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", hasDropdownIcon=");
        return wt3.p(sb, this.e, ")");
    }
}
