package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class or5 {
    public final int a;
    public final Integer b;
    public final int c;
    public final r9k d;

    public or5(int i, Integer num, int i2, r9k r9kVar) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        or5 or5Var = (or5) obj;
        return this.a == or5Var.a && Intrinsics.c(this.b, or5Var.b) && this.c == or5Var.c && Intrinsics.c(this.d, or5Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int a = wv8.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        r9k r9kVar = this.d;
        return a + (r9kVar != null ? r9kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = fc6.r("EventAiInsightWinProbability(home=", ", draw=", ", away=", this.b, this.a);
        r.append(this.c);
        r.append(", text=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
