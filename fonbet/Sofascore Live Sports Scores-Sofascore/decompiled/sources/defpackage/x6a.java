package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x6a {
    public static final x6a e = new x6a(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x6a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6a)) {
            return false;
        }
        x6a x6aVar = (x6a) obj;
        return this.a == x6aVar.a && this.b == x6aVar.b && this.c == x6aVar.c && this.d == x6aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return wv8.j(sb, this.d, ')');
    }
}
