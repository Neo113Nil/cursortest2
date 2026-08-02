package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class js8 {
    public final boolean a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public js8(boolean z, long j, int i, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js8)) {
            return false;
        }
        js8 js8Var = (js8) obj;
        return this.a == js8Var.a && this.b == js8Var.b && this.c == js8Var.c && this.d == js8Var.d && this.e == js8Var.e && this.f == js8Var.f && this.g == js8Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + wv8.a(this.f, wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, ljg.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullTimerData(isActive=");
        sb.append(this.a);
        sb.append(", currentTimestampSeconds=");
        sb.append(this.b);
        me4.r(sb, ", totalLeftInSeconds=", this.c, ", days=", this.d);
        me4.r(sb, ", hours=", this.e, ", minutes=", this.f);
        return fn0.k(this.g, ", seconds=", ")", sb);
    }
}
