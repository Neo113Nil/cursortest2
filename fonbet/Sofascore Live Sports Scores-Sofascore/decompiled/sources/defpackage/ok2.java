package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ok2 {
    public final int a;
    public final ArrayList b;

    public ok2(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok2)) {
            return false;
        }
        ok2 ok2Var = (ok2) obj;
        return this.a == ok2Var.a && this.b.equals(ok2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CareerStatisticsDisplayCategory(labelResId=" + this.a + ", stats=" + this.b + ")";
    }
}
