package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t02 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new t02(0, 0, 0, 0);
    }

    public t02(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            ogj.h(dmi.k(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        ogj.h(dmi.k(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t02.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t02 t02Var = (t02) obj;
        return this.a == t02Var.a && this.b == t02Var.b && this.c == t02Var.c && this.d == t02Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(t02.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return fc6.h(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t02(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
