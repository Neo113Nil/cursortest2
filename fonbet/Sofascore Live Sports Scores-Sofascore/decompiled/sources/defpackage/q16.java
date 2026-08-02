package defpackage;

import com.sofascore.model.mvvm.model.Inning;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q16 {
    public final Inning a;
    public final ArrayList b;
    public final ArrayList c;

    public q16(Inning inning, ArrayList arrayList, ArrayList arrayList2) {
        this.a = inning;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q16)) {
            return false;
        }
        q16 q16Var = (q16) obj;
        return this.a.equals(q16Var.a) && this.b.equals(q16Var.b) && this.c.equals(q16Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vxd.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventInningWrapper(inning=" + this.a + ", adapterList=" + this.b + ", floatingHeaders=" + this.c + ")";
    }
}
