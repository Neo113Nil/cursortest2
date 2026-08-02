package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p80 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public p80(Object obj, String str, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        s3a.a("Reversed range is not supported");
    }

    public static p80 a(p80 p80Var, m80 m80Var, int i, int i2, int i3) {
        Object obj = m80Var;
        if ((i3 & 1) != 0) {
            obj = p80Var.a;
        }
        if ((i3 & 2) != 0) {
            i = p80Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = p80Var.c;
        }
        return new p80(obj, p80Var.d, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p80)) {
            return false;
        }
        p80 p80Var = (p80) obj;
        return Intrinsics.c(this.a, p80Var.a) && this.b == p80Var.b && this.c == p80Var.c && Intrinsics.c(this.d, p80Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return lnb.q(sb, this.d, ')');
    }

    public p80(Object obj, int i, int i2) {
        this(obj, "", i, i2);
    }
}
