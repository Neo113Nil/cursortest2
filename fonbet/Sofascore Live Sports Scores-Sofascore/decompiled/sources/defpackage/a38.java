package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a38 {
    public final nf2 a;
    public final tx7 b;
    public final List c;

    public a38(List list, int i) {
        nf2 nf2Var = new nf2();
        sl6 sl6Var = new sl6(0);
        sl6 sl6Var2 = new sl6(0);
        sl6 sl6Var3 = new sl6(0);
        sl6 sl6Var4 = new sl6(0);
        tx7 tx7Var = new tx7();
        tx7Var.a = sl6Var;
        tx7Var.b = sl6Var2;
        tx7Var.c = sl6Var3;
        tx7Var.d = sl6Var4;
        tx7Var.e = true;
        list = (i & 4) != 0 ? new ArrayList() : list;
        this.a = nf2Var;
        this.b = tx7Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a38)) {
            return false;
        }
        a38 a38Var = (a38) obj;
        return this.a.equals(a38Var.a) && this.b.equals(a38Var.b) && this.c.equals(a38Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterSessionCache(data=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", newPostsCheckerList=");
        return mz1.p(sb, this.c, ")");
    }
}
