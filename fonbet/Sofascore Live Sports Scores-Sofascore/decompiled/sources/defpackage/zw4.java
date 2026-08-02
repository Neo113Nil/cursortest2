package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zw4 implements vg5 {
    public final int a;
    public final int b;

    public zw4(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        s3a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        int i = xl0Var.c;
        j12 j12Var = (j12) xl0Var.f;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = j12Var.s();
        }
        xl0Var.c(xl0Var.c, Math.min(i3, j12Var.s()));
        int i4 = xl0Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        xl0Var.c(Math.max(0, i6), xl0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw4)) {
            return false;
        }
        zw4 zw4Var = (zw4) obj;
        return this.a == zw4Var.a && this.b == zw4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return wv8.j(sb, this.b, ')');
    }
}
