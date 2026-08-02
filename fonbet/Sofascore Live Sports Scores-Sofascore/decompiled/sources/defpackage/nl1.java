package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nl1 {
    public final int a;
    public final gv9 b;
    public final String c;

    public nl1(int i, gv9 gv9Var, String str) {
        gv9Var.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return this.a == nl1Var.a && Intrinsics.c(this.b, nl1Var.b) && Intrinsics.c(this.c, nl1Var.c);
    }

    public final int hashCode() {
        int d = ljg.d(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterState(labelResId=");
        sb.append(this.a);
        sb.append(", availableOptions=");
        sb.append(this.b);
        sb.append(", selectedOptionInternalName=");
        return mz1.o(sb, this.c, ")");
    }
}
