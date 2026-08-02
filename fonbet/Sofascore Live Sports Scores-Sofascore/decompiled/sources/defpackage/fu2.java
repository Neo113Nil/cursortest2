package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fu2 {
    public final List a;
    public final List b;
    public final long c;
    public final long d;

    public fu2(List list, List list2, long j, long j2) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2)) {
            return false;
        }
        fu2 fu2Var = (fu2) obj;
        return this.a.equals(fu2Var.a) && this.b.equals(fu2Var.b) && this.c == fu2Var.c && this.d == fu2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ljg.c(dmi.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = fc6.s("PagedData(pagesContained=", ", mappedUIItems=", ", minStartDateSeconds=", this.a, this.b);
        s.append(this.c);
        return fn0.l(this.d, ", maxStartDateSeconds=", ")", s);
    }
}
