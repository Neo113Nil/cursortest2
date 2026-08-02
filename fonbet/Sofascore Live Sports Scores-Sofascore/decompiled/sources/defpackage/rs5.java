package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rs5 {
    public final q9k a;
    public final int b;
    public final String c;
    public final float d;

    public rs5(q9k q9kVar, int i, String str, float f) {
        this.a = q9kVar;
        this.b = i;
        this.c = str;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs5)) {
            return false;
        }
        rs5 rs5Var = (rs5) obj;
        return this.a.equals(rs5Var.a) && this.b == rs5Var.b && this.c.equals(rs5Var.c) && Float.compare(this.d, rs5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + dmi.c(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "EventAiInsightsTennisPossibleOutcomeData(result=" + this.a + ", teamId=" + this.b + ", playerName=" + this.c + ", percentage=" + this.d + ")";
    }
}
