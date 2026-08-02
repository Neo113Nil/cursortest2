package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qp9 {
    public final int a;
    public final String b;
    public final Integer c;
    public final pp9 d;

    public qp9(int i, String str, Integer num, pp9 pp9Var) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = pp9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp9)) {
            return false;
        }
        qp9 qp9Var = (qp9) obj;
        return this.a == qp9Var.a && Intrinsics.c(this.b, qp9Var.b) && Intrinsics.c(this.c, qp9Var.c) && this.d == qp9Var.d;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        pp9 pp9Var = this.d;
        return hashCode + (pp9Var != null ? pp9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "IceHockeyDepthChartPlayer(id=", ", name=", this.b, ", depth=");
        t.append(this.c);
        t.append(", absenceStatus=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
