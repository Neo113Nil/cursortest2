package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ypf {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final cqf e;
    public final cqf f;
    public final fgf g;

    public ypf(int i, String str, String str2, String str3, cqf cqfVar, cqf cqfVar2, fgf fgfVar) {
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cqfVar;
        this.f = cqfVar2;
        this.g = fgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return this.a == ypfVar.a && this.b.equals(ypfVar.b) && this.c.equals(ypfVar.c) && Intrinsics.c(this.d, ypfVar.d) && this.e.equals(ypfVar.e) && this.f.equals(ypfVar.f) && this.g.equals(ypfVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + dmi.c(dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "RecommendedOddsEventUIModel(eventId=", ", startTime=", this.b, ", startDate=");
        bf3.v(t, this.c, ", sport=", this.d, ", homeTeam=");
        t.append(this.e);
        t.append(", awayTeam=");
        t.append(this.f);
        t.append(", odds=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
