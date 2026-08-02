package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lm implements mm {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final or5 d;
    public final int e;
    public final int f;
    public final boolean g;

    public lm(b7 b7Var, b7 b7Var2, gv9 gv9Var, or5 or5Var, int i, int i2, boolean z) {
        b7Var.getClass();
        b7Var2.getClass();
        gv9Var.getClass();
        this.a = b7Var;
        this.b = b7Var2;
        this.c = gv9Var;
        this.d = or5Var;
        this.e = i;
        this.f = i2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj;
        return Intrinsics.c(this.a, lmVar.a) && Intrinsics.c(this.b, lmVar.b) && Intrinsics.c(this.c, lmVar.c) && Intrinsics.c(this.d, lmVar.d) && this.e == lmVar.e && this.f == lmVar.f && this.g == lmVar.g;
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        or5 or5Var = this.d;
        return Boolean.hashCode(this.g) + wv8.a(this.f, wv8.a(this.e, (d + (or5Var == null ? 0 : or5Var.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("Tennis(forecastTabs=", this.a, ", setResults=", this.b, ", sections=");
        l.append(this.c);
        l.append(", winningProbability=");
        l.append(this.d);
        l.append(", homeTeamId=");
        me4.q(l, this.e, ", awayTeamId=", this.f, ", wasAiInsightsCorrect=");
        return wt3.p(l, this.g, ")");
    }
}
