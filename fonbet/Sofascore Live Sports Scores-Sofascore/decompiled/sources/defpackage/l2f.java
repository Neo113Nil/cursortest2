package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class l2f {

    @NotNull
    public static final i2f Companion = new i2f();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ l2f(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            oea.z(i, 15, h2f.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f)) {
            return false;
        }
        l2f l2fVar = (l2f) obj;
        return this.a == l2fVar.a && this.b == l2fVar.b && this.c == l2fVar.c && this.d == l2fVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", x=");
        sb.append(this.c);
        sb.append(", y=");
        return wv8.j(sb, this.d, ')');
    }

    public l2f(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
