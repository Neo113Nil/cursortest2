package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e9h implements vg5 {
    public final q80 a;
    public final int b;

    public e9h(String str, int i) {
        this.a = new q80(str);
        this.b = i;
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        String str = this.a.b;
        int i = xl0Var.d;
        if (i != -1) {
            xl0Var.h(i, xl0Var.e, str);
            if (str.length() > 0) {
                xl0Var.i(i, str.length() + i);
            }
        } else {
            int i2 = xl0Var.b;
            xl0Var.h(i2, xl0Var.c, str);
            if (str.length() > 0) {
                xl0Var.i(i2, str.length() + i2);
            }
        }
        int i3 = xl0Var.b;
        int i4 = xl0Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int c = llf.c(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, ((j12) xl0Var.f).s());
        xl0Var.j(c, c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9h)) {
            return false;
        }
        e9h e9hVar = (e9h) obj;
        return Intrinsics.c(this.a.b, e9hVar.a.b) && this.b == e9hVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return wv8.j(sb, this.b, ')');
    }
}
