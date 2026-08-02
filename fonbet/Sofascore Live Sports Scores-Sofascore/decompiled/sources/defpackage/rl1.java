package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rl1 {
    public final int a;
    public final float b;
    public final int c;
    public final gv9 d;

    public rl1(int i, float f, int i2, b7 b7Var) {
        b7Var.getClass();
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl1)) {
            return false;
        }
        rl1 rl1Var = (rl1) obj;
        return this.a == rl1Var.a && Float.compare(this.b, rl1Var.b) == 0 && this.c == rl1Var.c && Intrinsics.c(this.d, rl1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wv8.a(this.c, fc6.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "TableRow(rowLabelResId=" + this.a + ", barPercentage=" + this.b + ", barColorResId=" + this.c + ", columnValues=" + this.d + ")";
    }
}
