package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class js5 {
    public final q9k a;
    public final float b;
    public final float c;

    public js5(q9k q9kVar, float f, float f2) {
        this.a = q9kVar;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js5)) {
            return false;
        }
        js5 js5Var = (js5) obj;
        return this.a.equals(js5Var.a) && Float.compare(this.b, js5Var.b) == 0 && Float.compare(this.c, js5Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + fc6.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventAiInsightsSetResult(label=" + this.a + ", percentage=" + this.b + ", alpha=" + this.c + ")";
    }
}
