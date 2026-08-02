package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q9b {
    public final boolean a;
    public final x9b b;
    public final x9b c;
    public final x9b d;
    public final x9b e;
    public final x9b f;

    public q9b(x9b x9bVar, x9b x9bVar2, x9b x9bVar3, x9b x9bVar4, x9b x9bVar5, boolean z) {
        this.a = z;
        this.b = x9bVar;
        this.c = x9bVar2;
        this.d = x9bVar3;
        this.e = x9bVar4;
        this.f = x9bVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9b)) {
            return false;
        }
        q9b q9bVar = (q9b) obj;
        return this.a == q9bVar.a && Intrinsics.c(this.b, q9bVar.b) && Intrinsics.c(this.c, q9bVar.c) && Intrinsics.c(this.d, q9bVar.d) && Intrinsics.c(this.e, q9bVar.e) && Intrinsics.c(this.f, q9bVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        x9b x9bVar = this.b;
        int hashCode2 = (hashCode + (x9bVar == null ? 0 : x9bVar.hashCode())) * 31;
        x9b x9bVar2 = this.c;
        int hashCode3 = (hashCode2 + (x9bVar2 == null ? 0 : x9bVar2.hashCode())) * 31;
        x9b x9bVar3 = this.d;
        int hashCode4 = (hashCode3 + (x9bVar3 == null ? 0 : x9bVar3.hashCode())) * 31;
        x9b x9bVar4 = this.e;
        int hashCode5 = (hashCode4 + (x9bVar4 == null ? 0 : x9bVar4.hashCode())) * 31;
        x9b x9bVar5 = this.f;
        return hashCode5 + (x9bVar5 != null ? x9bVar5.hashCode() : 0);
    }

    public final String toString() {
        return "LineupsListRatingBreakdowns(showVisualSlider=" + this.a + ", shootingBreakdowns=" + this.b + ", passingBreakdowns=" + this.c + ", dribblingBreakdown=" + this.d + ", defendingBreakdown=" + this.e + ", goalkeepingBreakdown=" + this.f + ")";
    }
}
