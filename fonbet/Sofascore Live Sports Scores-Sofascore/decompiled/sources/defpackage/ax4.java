package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ax4 implements vg5 {
    public final int a;
    public final int b;

    public ax4(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        s3a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = xl0Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(xl0Var.d((i5 - i4) + (-1))) && Character.isLowSurrogate(xl0Var.d(xl0Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = xl0Var.c;
            j12 j12Var = (j12) xl0Var.f;
            if (i8 + i7 >= j12Var.s()) {
                i6 = j12Var.s() - xl0Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(xl0Var.d((xl0Var.c + i7) + (-1))) && Character.isLowSurrogate(xl0Var.d(xl0Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = xl0Var.c;
        xl0Var.c(i9, i6 + i9);
        int i10 = xl0Var.b;
        xl0Var.c(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax4)) {
            return false;
        }
        ax4 ax4Var = (ax4) obj;
        return this.a == ax4Var.a && this.b == ax4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return wv8.j(sb, this.b, ')');
    }
}
