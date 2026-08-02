package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i68 implements w8l {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i68(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return this.b;
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return this.c;
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return this.d;
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i68)) {
            return false;
        }
        i68 i68Var = (i68) obj;
        return this.a == i68Var.a && this.b == i68Var.b && this.c == i68Var.c && this.d == i68Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return wv8.j(sb, this.d, ')');
    }
}
