package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e6j {
    public final c6j a;
    public final d6j b;
    public final d6j c;
    public final d6j d;

    public e6j(c6j c6jVar, d6j d6jVar, d6j d6jVar2, d6j d6jVar3) {
        c6jVar.getClass();
        this.a = c6jVar;
        this.b = d6jVar;
        this.c = d6jVar2;
        this.d = d6jVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6j)) {
            return false;
        }
        e6j e6jVar = (e6j) obj;
        return this.a == e6jVar.a && Intrinsics.c(this.b, e6jVar.b) && Intrinsics.c(this.c, e6jVar.c) && Intrinsics.c(this.d, e6jVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d6j d6jVar = this.c;
        int hashCode2 = (hashCode + (d6jVar == null ? 0 : d6jVar.hashCode())) * 31;
        d6j d6jVar2 = this.d;
        return hashCode2 + (d6jVar2 != null ? d6jVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TennisPlayerRankingUIModel(category=" + this.a + ", currentRanking=" + this.b + ", careerHighRanking=" + this.c + ", previousTournamentResult=" + this.d + ")";
    }
}
