package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sxg implements uxg {
    public final e93 a;
    public final e73 b;
    public final String c;

    public sxg(e93 e93Var, e73 e73Var, String str) {
        e93Var.getClass();
        e73Var.getClass();
        str.getClass();
        this.a = e93Var;
        this.b = e73Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxg)) {
            return false;
        }
        sxg sxgVar = (sxg) obj;
        return this.a == sxgVar.a && this.b == sxgVar.b && Intrinsics.c(this.c, sxgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenSearchSheet(slotIndex=");
        sb.append(this.a);
        sb.append(", entityType=");
        sb.append(this.b);
        sb.append(", sport=");
        return mz1.o(sb, this.c, ")");
    }
}
