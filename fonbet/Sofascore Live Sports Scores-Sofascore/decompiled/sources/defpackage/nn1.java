package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nn1 {
    public final int a;
    public final float b;
    public final float c;

    public nn1(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn1)) {
            return false;
        }
        nn1 nn1Var = (nn1) obj;
        return this.a == nn1Var.a && Float.compare(this.b, nn1Var.b) == 0 && Float.compare(this.c, nn1Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + fc6.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BaseballWinProbabilityGraphPoint(inning=" + this.a + ", xFraction=" + this.b + ", diffFromCenter=" + this.c + ")";
    }
}
