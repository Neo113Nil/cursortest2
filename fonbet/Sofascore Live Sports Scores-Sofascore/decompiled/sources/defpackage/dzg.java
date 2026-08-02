package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dzg {
    public final int a;
    public final List b;
    public final List c;

    public dzg(int i, List list, List list2) {
        list.getClass();
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzg)) {
            return false;
        }
        dzg dzgVar = (dzg) obj;
        return this.a == dzgVar.a && Intrinsics.c(this.b, dzgVar.b) && Intrinsics.c(this.c, dzgVar.c);
    }

    public final int hashCode() {
        int d = dmi.d(Integer.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        return d + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonShotMapData(appearances=");
        sb.append(this.a);
        sb.append(", shotActionList=");
        sb.append(this.b);
        sb.append(", shotActionAreaList=");
        return mz1.p(sb, this.c, ")");
    }
}
