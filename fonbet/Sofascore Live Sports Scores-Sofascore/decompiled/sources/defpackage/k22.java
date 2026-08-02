package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k22 implements Serializable {
    public final m22 a;
    public final ArrayList b;
    public final zm1 c;

    public k22(m22 m22Var, ArrayList arrayList, zm1 zm1Var) {
        this.a = m22Var;
        this.b = arrayList;
        this.c = zm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k22)) {
            return false;
        }
        k22 k22Var = (k22) obj;
        return this.a.equals(k22Var.a) && this.b.equals(k22Var.b) && Intrinsics.c(this.c, k22Var.c);
    }

    public final int hashCode() {
        int d = vxd.d(this.b, this.a.hashCode() * 31, 31);
        zm1 zm1Var = this.c;
        return (d + (zm1Var == null ? 0 : zm1Var.hashCode())) * 31;
    }

    public final String toString() {
        return "BoxScoreSection(sectionItem=" + this.a + ", playerList=" + this.b + ", baseballTotals=" + this.c + ", baseballAdditional=null)";
    }
}
