package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q78 {
    public final float a;
    public final float b;
    public final long c;

    public q78(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q78)) {
            return false;
        }
        q78 q78Var = (q78) obj;
        return Float.compare(this.a, q78Var.a) == 0 && Float.compare(this.b, q78Var.b) == 0 && this.c == q78Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fc6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", duration=");
        return fn0.n(sb, this.c, ')');
    }
}
