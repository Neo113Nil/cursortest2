package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ad5 {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;

    public ad5(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5)) {
            return false;
        }
        ad5 ad5Var = (ad5) obj;
        return this.a == ad5Var.a && this.b == ad5Var.b && this.c == ad5Var.c && this.d == ad5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropdownLayoutInfo(dropdownXOffset=");
        sb.append(this.a);
        sb.append(", isDropdownBelow=");
        sb.append(this.b);
        sb.append(", maxHeight=");
        return me4.i(sb, this.c, ", maxWidth=", this.d, ")");
    }
}
