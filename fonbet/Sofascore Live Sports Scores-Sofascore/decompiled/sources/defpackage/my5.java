package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class my5 {
    public final boolean a;
    public final Integer b;
    public final Integer c;

    public my5(boolean z, Integer num, Integer num2) {
        this.a = z;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my5)) {
            return false;
        }
        my5 my5Var = (my5) obj;
        return this.a == my5Var.a && Intrinsics.c(this.b, my5Var.b) && Intrinsics.c(this.c, my5Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviousLegItem(parentTeamOverride=");
        sb.append(this.a);
        sb.append(", teamId=");
        sb.append(this.b);
        sb.append(", previousLegScore=");
        return vxd.n(sb, this.c, ")");
    }
}
