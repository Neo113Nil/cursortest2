package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p9k implements r9k {
    public final int a;
    public final int b;
    public final gv9 c;

    public p9k(int i, int i2, b7 b7Var) {
        b7Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9k)) {
            return false;
        }
        p9k p9kVar = (p9k) obj;
        return this.a == p9kVar.a && this.b == p9kVar.b && Intrinsics.c(this.c, p9kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "PluralResource(id=", ", count=", ", args=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
