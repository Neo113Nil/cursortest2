package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n2j {
    public final xmd a;
    public final xmd b;
    public final boolean c;

    public n2j(xmd xmdVar, xmd xmdVar2, boolean z) {
        this.a = xmdVar;
        this.b = xmdVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2j)) {
            return false;
        }
        n2j n2jVar = (n2j) obj;
        return Intrinsics.c(this.a, n2jVar.a) && Intrinsics.c(this.b, n2jVar.b) && this.c == n2jVar.c;
    }

    public final int hashCode() {
        xmd xmdVar = this.a;
        int hashCode = (xmdVar == null ? 0 : xmdVar.hashCode()) * 31;
        xmd xmdVar2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (xmdVar2 != null ? xmdVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamStreakOddsState(general=");
        sb.append(this.a);
        sb.append(", head2head=");
        sb.append(this.b);
        sb.append(", oddsMayDiffer=");
        return wt3.p(sb, this.c, ")");
    }
}
