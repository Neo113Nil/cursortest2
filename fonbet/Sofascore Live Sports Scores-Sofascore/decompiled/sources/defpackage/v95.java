package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v95 {
    public final int a;
    public final boolean b;
    public final Integer c;

    public v95(int i, Integer num, boolean z) {
        this.a = i;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95Var = (v95) obj;
        return this.a == v95Var.a && this.b == v95Var.b && Intrinsics.c(this.c, v95Var.c);
    }

    public final int hashCode() {
        int e = dmi.e(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraggableItem(index=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", constraintIndex=");
        return vxd.n(sb, this.c, ")");
    }
}
