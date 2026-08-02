package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xle extends zle {
    public final ok2 a;
    public final String b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public xle(ok2 ok2Var, String str, List list, List list2, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = ok2Var;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xle)) {
            return false;
        }
        xle xleVar = (xle) obj;
        return this.a.equals(xleVar.a) && Intrinsics.c(this.b, xleVar.b) && Intrinsics.c(this.c, xleVar.c) && Intrinsics.c(this.d, xleVar.d) && this.e == xleVar.e && this.f == xleVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dmi.e(dmi.d(dmi.d(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionRow(category=");
        sb.append(this.a);
        sb.append(", year=");
        sb.append(this.b);
        sb.append(", tournamentStatistics=");
        vxd.w(sb, this.c, ", teamIds=", this.d, ", hasDivider=");
        return w1l.i(", isExpanded=", ")", sb, this.e, this.f);
    }
}
