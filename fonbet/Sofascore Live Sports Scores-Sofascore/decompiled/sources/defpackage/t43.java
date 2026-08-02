package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t43 implements vg5 {
    public final q80 a;
    public final int b;

    public t43(String str, int i) {
        this(new q80(str), i);
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        int i = xl0Var.d;
        q80 q80Var = this.a;
        if (i != -1) {
            xl0Var.h(i, xl0Var.e, q80Var.b);
        } else {
            xl0Var.h(xl0Var.b, xl0Var.c, q80Var.b);
        }
        int i2 = xl0Var.b;
        int i3 = xl0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int c = llf.c(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - q80Var.b.length(), 0, ((j12) xl0Var.f).s());
        xl0Var.j(c, c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t43)) {
            return false;
        }
        t43 t43Var = (t43) obj;
        return Intrinsics.c(this.a.b, t43Var.a.b) && this.b == t43Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return wv8.j(sb, this.b, ')');
    }

    public t43(q80 q80Var, int i) {
        this.a = q80Var;
        this.b = i;
    }
}
