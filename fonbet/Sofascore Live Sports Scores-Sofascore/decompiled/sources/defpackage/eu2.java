package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eu2 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final Map e;

    public eu2(String str, int i, long j, long j2, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu2)) {
            return false;
        }
        eu2 eu2Var = (eu2) obj;
        return Intrinsics.c(this.a, eu2Var.a) && this.b == eu2Var.b && this.c == eu2Var.c && this.d == eu2Var.d && Intrinsics.c(this.e, eu2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ljg.c(ljg.c(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "ChronologicalPagingInfoHolder(date=", this.a, ", page=", ", minStartDateSeconds=");
        q.append(this.c);
        fn0.t(this.d, ", maxStartDateSeconds=", ", eventFilters=", q);
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
