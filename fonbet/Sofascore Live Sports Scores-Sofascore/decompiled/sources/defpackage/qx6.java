package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qx6 {
    public final wn1 a;
    public final gv9 b;
    public final int c;
    public final ad7 d;

    public qx6(wn1 wn1Var, gv9 gv9Var, int i, ad7 ad7Var) {
        this.a = wn1Var;
        this.b = gv9Var;
        this.c = i;
        this.d = ad7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx6)) {
            return false;
        }
        qx6 qx6Var = (qx6) obj;
        return this.a.equals(qx6Var.a) && Intrinsics.c(this.b, qx6Var.b) && this.c == qx6Var.c && this.d == qx6Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gv9 gv9Var = this.b;
        int a = wv8.a(this.c, (hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31, 31);
        ad7 ad7Var = this.d;
        return a + (ad7Var != null ? ad7Var.hashCode() : 0);
    }

    public final String toString() {
        return "FantasyEventStatisticsData(event=" + this.a + ", statistics=" + this.b + ", points=" + this.c + ", playerEventStatus=" + this.d + ")";
    }
}
