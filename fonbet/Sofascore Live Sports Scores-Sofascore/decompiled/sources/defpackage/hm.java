package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hm {
    public final Integer a;
    public final Integer b;
    public final Boolean c;
    public final int d;
    public final int e;
    public final or5 f;
    public final gv9 g;

    public hm(Integer num, Integer num2, Boolean bool, int i, int i2, or5 or5Var, gv9 gv9Var) {
        this.a = num;
        this.b = num2;
        this.c = bool;
        this.d = i;
        this.e = i2;
        this.f = or5Var;
        this.g = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        return Intrinsics.c(this.a, hmVar.a) && Intrinsics.c(this.b, hmVar.b) && Intrinsics.c(this.c, hmVar.c) && this.d == hmVar.d && this.e == hmVar.e && Intrinsics.c(this.f, hmVar.f) && Intrinsics.c(this.g, hmVar.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int a = wv8.a(this.e, wv8.a(this.d, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
        or5 or5Var = this.f;
        int hashCode3 = (a + (or5Var == null ? 0 : or5Var.hashCode())) * 31;
        gv9 gv9Var = this.g;
        return hashCode3 + (gv9Var != null ? gv9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = wv8.k(this.a, "AiInsightsPrematchPredictionsWrapper(yellowCards=", ", corners=", ", bothTeamsToScore=", this.b);
        k.append(this.c);
        k.append(", homeNormaltimeScore=");
        k.append(this.d);
        k.append(", awayNormaltimeScore=");
        k.append(this.e);
        k.append(", winningProbability=");
        k.append(this.f);
        k.append(", possibleResultsMatrix=");
        k.append(this.g);
        k.append(")");
        return k.toString();
    }
}
