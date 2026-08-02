package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class phh {
    public final String a;
    public final String b;
    public final qyj c;
    public final r9k d;

    public phh(String str, String str2, qyj qyjVar, r9k r9kVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = qyjVar;
        this.d = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phh)) {
            return false;
        }
        phh phhVar = (phh) obj;
        return Intrinsics.c(this.a, phhVar.a) && Intrinsics.c(this.b, phhVar.b) && this.c == phhVar.c && Intrinsics.c(this.d, phhVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        r9k r9kVar = this.d;
        return hashCode + (r9kVar == null ? 0 : r9kVar.hashCode());
    }

    public final String toString() {
        StringBuilder s = mz1.s("SimpleScore(homeTeamScore=", this.a, ", awayTeamScore=", this.b, ", matchOutcome=");
        s.append(this.c);
        s.append(", description=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
