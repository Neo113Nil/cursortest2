package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l22 {
    public final gv5 a;
    public final int b;
    public final r9k c;
    public final int d;

    public l22(gv5 gv5Var, int i, r9k r9kVar, int i2) {
        this.a = gv5Var;
        this.b = i;
        this.c = r9kVar;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l22)) {
            return false;
        }
        l22 l22Var = (l22) obj;
        return this.a.equals(l22Var.a) && this.b == l22Var.b && Intrinsics.c(this.c, l22Var.c) && this.d == l22Var.d;
    }

    public final int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        r9k r9kVar = this.c;
        return Integer.hashCode(this.d) + ((a + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BoxScoreSectionData(data=" + this.a + ", defaultSortColumnIndex=" + this.b + ", translatedName=" + this.c + ", selectedColumnIndex=" + this.d + ")";
    }
}
