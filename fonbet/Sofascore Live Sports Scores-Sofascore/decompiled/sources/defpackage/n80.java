package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n80 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ n80(m80 m80Var, int i, int i2, int i3) {
        this(m80Var, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent", i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2);
    }

    public final p80 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            s3a.c("Item.end should be set first");
        }
        return new p80(this.a, this.d, this.b, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return Intrinsics.c(this.a, n80Var.a) && this.b == n80Var.b && this.c == n80Var.c && Intrinsics.c(this.d, n80Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return lnb.q(sb, this.d, ')');
    }

    public n80(Object obj, String str, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
