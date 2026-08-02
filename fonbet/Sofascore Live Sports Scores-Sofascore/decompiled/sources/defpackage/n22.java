package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n22 {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final boolean d;

    public n22(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n22)) {
            return false;
        }
        n22 n22Var = (n22) obj;
        return Intrinsics.c(this.a, n22Var.a) && Intrinsics.c(this.b, n22Var.b) && Intrinsics.c(this.c, n22Var.c) && this.d == n22Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = wv8.l("BoxScoreSectionsUiModel(homeData=", this.a, ", awayData=", this.b, ", combinedData=");
        l.append(this.c);
        l.append(", hasRating=");
        l.append(this.d);
        l.append(")");
        return l.toString();
    }
}
