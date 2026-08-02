package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u4a {
    public static final u4a e = new u4a(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public u4a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static u4a a(u4a u4aVar, u4a u4aVar2) {
        return c(Math.max(u4aVar.a, u4aVar2.a), Math.max(u4aVar.b, u4aVar2.b), Math.max(u4aVar.c, u4aVar2.c), Math.max(u4aVar.d, u4aVar2.d));
    }

    public static u4a b(u4a u4aVar, u4a u4aVar2) {
        return c(Math.min(u4aVar.a, u4aVar2.a), Math.min(u4aVar.b, u4aVar2.b), Math.min(u4aVar.c, u4aVar2.c), Math.min(u4aVar.d, u4aVar2.d));
    }

    public static u4a c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new u4a(i, i2, i3, i4);
    }

    public static u4a d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return eq3.H(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u4a.class != obj.getClass()) {
            return false;
        }
        u4a u4aVar = (u4a) obj;
        return this.d == u4aVar.d && this.a == u4aVar.a && this.c == u4aVar.c && this.b == u4aVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return wv8.j(sb, this.d, '}');
    }
}
