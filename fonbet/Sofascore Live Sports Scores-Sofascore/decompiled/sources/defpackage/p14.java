package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p14 {
    public final int a;
    public final i14 b;
    public final ArrayList c;

    public p14(int i, i14 i14Var, ArrayList arrayList) {
        i14Var.getClass();
        this.a = i;
        this.b = i14Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14)) {
            return false;
        }
        p14 p14Var = (p14) obj;
        return this.a == p14Var.a && this.b == p14Var.b && this.c.equals(p14Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "WagonWheelGraphData(runs=" + this.a + ", zone=" + this.b + ", hits=" + this.c + ")";
    }
}
