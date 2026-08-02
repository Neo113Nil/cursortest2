package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ps5 {
    public final q9k a;
    public final q9k b;
    public final gv9 c;
    public final gv9 d;

    public ps5(q9k q9kVar, q9k q9kVar2, b7 b7Var, gv9 gv9Var) {
        b7Var.getClass();
        gv9Var.getClass();
        this.a = q9kVar;
        this.b = q9kVar2;
        this.c = b7Var;
        this.d = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps5)) {
            return false;
        }
        ps5 ps5Var = (ps5) obj;
        return this.a.equals(ps5Var.a) && this.b.equals(ps5Var.b) && Intrinsics.c(this.c, ps5Var.c) && Intrinsics.c(this.d, ps5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ljg.d(lnb.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "EventAiInsightsTennisForecastData(label=" + this.a + ", generatedAtText=" + this.b + ", rows=" + this.c + ", possibleOutcomes=" + this.d + ")";
    }
}
