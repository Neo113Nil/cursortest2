package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y9b {
    public final x9b a;
    public final x9b b;
    public final x9b c;
    public final x9b d;
    public final boolean e;
    public final x9b f;

    public y9b(x9b x9bVar, x9b x9bVar2, x9b x9bVar3, x9b x9bVar4, x9b x9bVar5, boolean z) {
        this.a = x9bVar;
        this.b = x9bVar2;
        this.c = x9bVar3;
        this.d = x9bVar4;
        this.e = z;
        this.f = x9bVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9b)) {
            return false;
        }
        y9b y9bVar = (y9b) obj;
        return Intrinsics.c(this.a, y9bVar.a) && Intrinsics.c(this.b, y9bVar.b) && Intrinsics.c(this.c, y9bVar.c) && Intrinsics.c(this.d, y9bVar.d) && this.e == y9bVar.e && Intrinsics.c(this.f, y9bVar.f);
    }

    public final int hashCode() {
        x9b x9bVar = this.a;
        int hashCode = (x9bVar == null ? 0 : x9bVar.hashCode()) * 31;
        x9b x9bVar2 = this.b;
        int hashCode2 = (hashCode + (x9bVar2 == null ? 0 : x9bVar2.hashCode())) * 31;
        x9b x9bVar3 = this.c;
        int hashCode3 = (hashCode2 + (x9bVar3 == null ? 0 : x9bVar3.hashCode())) * 31;
        x9b x9bVar4 = this.d;
        int e = dmi.e((hashCode3 + (x9bVar4 == null ? 0 : x9bVar4.hashCode())) * 31, 31, this.e);
        x9b x9bVar5 = this.f;
        return e + (x9bVar5 != null ? x9bVar5.hashCode() : 0);
    }

    public final String toString() {
        return "RatingBreakdowns(shootingBreakdowns=" + this.a + ", passingBreakdowns=" + this.b + ", dribblingBreakdown=" + this.c + ", defendingBreakdown=" + this.d + ", hasGraphicalData=" + this.e + ", goalkeepingBreakdown=" + this.f + ")";
    }
}
