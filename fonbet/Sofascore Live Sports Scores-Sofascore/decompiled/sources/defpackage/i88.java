package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i88 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public i88(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i88)) {
            return false;
        }
        i88 i88Var = (i88) obj;
        if (p75.b(this.a, i88Var.a) && p75.b(this.b, i88Var.b) && p75.b(this.c, i88Var.c)) {
            return p75.b(this.d, i88Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
