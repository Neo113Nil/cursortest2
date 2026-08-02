package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q22 {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public q22(boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = z;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q22)) {
            return false;
        }
        q22 q22Var = (q22) obj;
        return this.a == q22Var.a && this.b.equals(q22Var.b) && this.c.equals(q22Var.c) && this.d.equals(q22Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vxd.d(this.c, vxd.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "BoxScoreWrapper(confirmed=" + this.a + ", mainList=" + this.b + ", additionalList=" + this.c + ", floatingHeaders=" + this.d + ")";
    }
}
