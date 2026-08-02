package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i4j {
    public final e4j a;
    public final e4j b;
    public final gv9 c;
    public final boolean d;
    public final d4j e;

    public i4j(e4j e4jVar, e4j e4jVar2, gv9 gv9Var, boolean z, d4j d4jVar) {
        this.a = e4jVar;
        this.b = e4jVar2;
        this.c = gv9Var;
        this.d = z;
        this.e = d4jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4j)) {
            return false;
        }
        i4j i4jVar = (i4j) obj;
        return Intrinsics.c(this.a, i4jVar.a) && Intrinsics.c(this.b, i4jVar.b) && Intrinsics.c(this.c, i4jVar.c) && this.d == i4jVar.d && this.e == i4jVar.e;
    }

    public final int hashCode() {
        e4j e4jVar = this.a;
        int hashCode = (e4jVar == null ? 0 : e4jVar.hashCode()) * 31;
        e4j e4jVar2 = this.b;
        int hashCode2 = (hashCode + (e4jVar2 == null ? 0 : e4jVar2.hashCode())) * 31;
        gv9 gv9Var = this.c;
        int e = dmi.e((hashCode2 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31, 31, this.d);
        d4j d4jVar = this.e;
        return e + (d4jVar != null ? d4jVar.hashCode() : 0);
    }

    public final String toString() {
        return "TeamTrophyCompareState(firstTeam=" + this.a + ", secondTeam=" + this.b + ", combinedTrophies=" + this.c + ", majorTrophiesSelected=" + this.d + ", emptyState=" + this.e + ")";
    }
}
